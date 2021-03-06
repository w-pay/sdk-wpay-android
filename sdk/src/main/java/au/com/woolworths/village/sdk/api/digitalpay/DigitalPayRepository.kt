package au.com.woolworths.village.sdk.api.digitalpay

import au.com.woolworths.village.sdk.api.walletmanagement.*

interface DigitalPayRepository {
    val androidPay: AndroidPayApiRepository
    val applePay: ApplePayApiRepository
    val cards: CardsApiRepository
    val giftcards: GiftcardsApiRepository
    val gifting: GiftingRepository
    val googlePay: GooglePayApiRepository
    val instruments: InstrumentsApiRepository
    val merchants: MerchantsApiRepository
    val openPay: OpenPayApiRepository
    val paymentAgreements: PaymentAgreementApiRepository
    val payments: PaymentApiRepository
    val paypal: PayPalApiRepository
    val transactions: TransactionsApiRepository
    val wallet: WalletApiRepository
}