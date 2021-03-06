package au.com.woolworths.village.sdk.auth

import au.com.woolworths.village.sdk.ApiResult

/**
 * Abstracts how the SDK authenticates with the API.
 *
 * If an application has an existing authentication/authorisation workflow then an Adapter class
 * can be used to integrate that workflow into the SDK to provide the necessary authentication
 *
 * @param T The type of authentication details
 */
interface ApiAuthenticator<T : Any> {
    /**
     * Called by the SDK to obtain authentication details eg: an access token
     *
     * @return Credentials representing a successful authentication.
     */
    fun authenticate(): ApiResult<T>
}