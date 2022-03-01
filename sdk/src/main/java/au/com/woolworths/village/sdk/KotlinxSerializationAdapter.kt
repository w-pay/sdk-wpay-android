package au.com.woolworths.village.sdk

import arrow.core.Either
import arrow.core.identity
import arrow.core.left
import arrow.core.right
import au.com.redcrew.apisdkcreator.httpclient.*
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.serializer
import kotlin.reflect.KClass
import kotlin.reflect.full.createType

/**
 * The shape of the data returned from the API doesn't match the shape of the types returned from
 * SDK operations. This is because the SDK types are designed to make integrating with a client
 * app easier (taking into account language and platform requirements) where as the API response
 * is a representation of the data in the server system.
 *
 * For example, let's suppose the SDK has a `Person` type
 *
 * ```
 * data class Person(val name: String, val address: String)
 * ```
 *
 * The API response data may look like:
 * ```
 * {
 *   "data": {
 *     "name": "Bruce Wayne",
 *     "address": "Wayne Manor"
 *   },
 *   "meta": {}
 * }
 * ```
 *
 * Or there may be props in the meta block that need to be part of the SDK type as well.
 * For example:
 * ```
 * {
 *   "data": {
 *     "name": "Bruce Wayne"
 *   },
 *   "meta": {
 *     "address": "Wayne Manor"
 *   }
 * }
 * ```
 *
 * Due to the misalignment between the shape of the API data and the SDK model types, we need to
 * preprocess the JSON data before getting kotlinx-serialization to unmarshall (deserialise) the
 * JSON into a Kotlin object instance.
 *
 * Due to kotlinx-serialization's transformation features being dependent on compile time binding
 * through the use of generics and annotations, there is no easy way to bind a type to a
 * transformation via annotations without having to replicate the same process for every type in
 * the SDK. This is unwieldy given the amount of types in the SDK.
 *
 * Therefore we have a transformer type that can, at runtime process the JSON data and give the data
 * to kotlinx-serialisation when ready.
 *
 * Being a function type, complex transformations can be built if required. If identity is required,
 * the `jsonPassthrough` function can be used.
 */
typealias JsonTransformer = (JsonObject) -> Either<SdkError, JsonObject>

/**
 * An SDK JSON Unmarshaller transforms then unmarshalls the JSON response into a known type.
 */
// SdkJsonUnmarshaller :: (JsonTransformer) -> KClass<T> -> Unmarshaller<T>
interface SdkJsonUnmarshaller {
    operator fun invoke(p1: JsonTransformer): GenericClassUnmarshaller
}

fun kotlinxSerialisationUnmarshaller(): SdkJsonUnmarshaller =
    object: SdkJsonUnmarshaller {
        override fun invoke(p1: JsonTransformer): GenericClassUnmarshaller =
            object: UnstructuredDataToGenericClassUnmarshaller() {
                @Suppress("UNCHECKED_CAST")
                override fun <T : Any> unmarshallString(cls: KClass<T>, data: String): Either<SdkError, T> {
                    val parser = Json {
                        ignoreUnknownKeys = true
                    }

                    return try {
                        // TODO: As this uses reflection it might not be portable.
                        // TODO: Might have to replace with a compiler plugin.
                        val deserializer: KSerializer<T> =
                            parser.serializersModule.serializer(cls.createType()) as KSerializer<T>
                        val json = parser.parseToJsonElement(data)

                        p1(json.jsonObject)
                            .map { parser.decodeFromJsonElement(deserializer, it) }
                    }
                    catch (e: Exception) {
                        SdkError(UNMARSHALLING_ERROR_TYPE, e.message!!, e).left()
                    }
                }
            }
    }


fun jsonPassthrough(json: JsonObject): Either<SdkError, JsonObject> =
    json.right()

fun fromData(json: JsonObject): Either<SdkError, JsonObject> =
    Either
        .fromNullable(json["data"]?.jsonObject)
        .bimap({ missingProp("data") }, ::identity)