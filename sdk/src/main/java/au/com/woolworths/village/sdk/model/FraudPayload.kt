package au.com.woolworths.village.sdk.model

import java.io.Serializable

/**
 * Digital Pay Fraud Payload, set to null to skip the fraud check.
 */
interface FraudPayload : Serializable {
    /** The fraud check message */
    val message: String

    /** The fraud check provider. */
    val provider: String

    /** The fraud check message format */
    val format: FraudPayloadFormat

    /** The fraud check response message format */
    val responseFormat: FraudPayloadFormat

    /** The fraud check version */
    val version: String
}

/**
 * Possible fraud payload formats
 */
enum class FraudPayloadFormat {
    /** ZIP BASE64 Formatting */
    ZIP_BASE_64_ENCODED,

    /** XML Formatting */
    XML
}