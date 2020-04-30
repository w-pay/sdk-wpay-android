/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.dto.MerchantTransactionSummary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-30T10:56:50.564+10:00[Australia/Melbourne]")
public class GetMerchantTransactionsResultsData {
  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<MerchantTransactionSummary> transactions = new ArrayList<MerchantTransactionSummary>();


  public GetMerchantTransactionsResultsData transactions(List<MerchantTransactionSummary> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public GetMerchantTransactionsResultsData addTransactionsItem(MerchantTransactionSummary transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * The resulting list of transactions.  If no results match the request then an empty array will be returned
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "The resulting list of transactions.  If no results match the request then an empty array will be returned")

  public List<MerchantTransactionSummary> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<MerchantTransactionSummary> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMerchantTransactionsResultsData getMerchantTransactionsResultsData = (GetMerchantTransactionsResultsData) o;
    return Objects.equals(this.transactions, getMerchantTransactionsResultsData.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMerchantTransactionsResultsData {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

