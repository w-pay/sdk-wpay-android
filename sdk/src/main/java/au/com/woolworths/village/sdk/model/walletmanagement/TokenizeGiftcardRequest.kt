package au.com.woolworths.village.sdk.model.walletmanagement

import java.io.Serializable

interface TokenizeGiftcardRequest : Serializable {
    /* The gift card number. */
    val cardNumber: String

    /* The gift card pin code. */
    val pinCode: String

    /* A flag to indicate if this payment instrument has to be set as the primary instrument. */
    val primary: Boolean?

    /* A flag to indicate if this payment instrument has to be saved in the container or tokenized for one-off use. */
    val save: Boolean?
}
