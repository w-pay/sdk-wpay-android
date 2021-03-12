package au.com.woolworths.village.sdk.api

import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.ApiResult

/**
 * @category API
 */
interface PayPalApiRepository {
	/**
	 * Create a paymment intrument id for a provided paypal account.
	 *
	 * @param tokenizePaypalRequest Detail of the paypal account to be tokenized.
	 */
	fun tokenize(tokenizePaypalRequest: TokenizePaypalRequest): ApiResult<TokenizePaypalResponse>

	/**
	 * 	Create a paymment intrument id for a provided paypal account of a guest user.
	 *
	 * @param tokenizePaypalRequest Detail of the paypal account to be tokenized.
	 */
	fun guestTokenize(tokenizePaypalRequest: TokenizePaypalRequest): ApiResult<TokenizePaypalResponse>
}
