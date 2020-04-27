package au.com.woolworths.village.sdk.api.matchers

import au.com.woolworths.village.sdk.dto.CustomerTransactionSummary
import au.com.woolworths.village.sdk.dto.GetCustomerTransactionsResultData
import org.hamcrest.Description
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*

import org.hamcrest.TypeSafeMatcher
import org.hamcrest.text.IsBlankString.blankOrNullString

fun hasCustomerTransactions(): CustomerTransactionsMatcher {
    return CustomerTransactionsMatcher()
}

fun hasCustomerTransactionSummary(): CustomerTransactionMatcher {
    return CustomerTransactionMatcher()
}

class CustomerTransactionsMatcher: TypeSafeMatcher<GetCustomerTransactionsResultData>() {
    override fun matchesSafely(item: GetCustomerTransactionsResultData): Boolean {
        val transactionMatcher = CustomerTransactionMatcher()

        assertThat(item.transactions.size, greaterThan(0))

        return item.transactions.fold(true, { result, it ->
            return result && transactionMatcher.matches(it)
        })
    }

    override fun describeTo(description: Description) {
        description.appendText("A list of customer transactions")
    }
}

class CustomerTransactionMatcher: TypeSafeMatcher<CustomerTransactionSummary>() {
    override fun matchesSafely(item: CustomerTransactionSummary): Boolean {
        assertThat(item.merchantId, not(blankOrNullString()))
        assertThat(item.merchantReferenceId, not(blankOrNullString()))
        assertThat(item.paymentRequestId, not(blankOrNullString()))
        assertThat(item.type, not(nullValue()))
        assertThat(item.grossAmount, not(nullValue()))

        // TODO: assertThat(item.executionTime, not(blankOrNullString()))
        // TODO: assertThat(item.status, not(blankOrNullString()))
        /* TODO: "instruments": [
        {
            "paymentInstrumentId": "123456",
            "amount": 12000
        }
        ]*/

        assertThat(item.transactionId, not(blankOrNullString()))

        return true
    }

    override fun describeTo(description: Description) {
        description.appendText("A Customer Transaction")
    }
}