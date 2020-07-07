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


package au.com.woolworths.village.sdk.openapi.dto;

import com.google.gson.annotations.SerializedName;

import org.threeten.bp.OffsetDateTime;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Summary information for a single payment request
 */
@ApiModel(description = "Summary information for a single payment request")

public class MerchantPaymentSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST_ID = "paymentRequestId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST_ID)
  private String paymentRequestId;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE_ID = "merchantReferenceId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE_ID)
  private String merchantReferenceId;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "grossAmount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private BigDecimal grossAmount;

  public static final String SERIALIZED_NAME_USES_REMAINING = "usesRemaining";
  @SerializedName(SERIALIZED_NAME_USES_REMAINING)
  private Integer usesRemaining;

  public static final String SERIALIZED_NAME_EXPIRY_TIME = "expiryTime";
  @SerializedName(SERIALIZED_NAME_EXPIRY_TIME)
  private OffsetDateTime expiryTime;

  public static final String SERIALIZED_NAME_SPECIFIC_WALLET_ID = "specificWalletId";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_WALLET_ID)
  private String specificWalletId;


  public MerchantPaymentSummary paymentRequestId(String paymentRequestId) {
    
    this.paymentRequestId = paymentRequestId;
    return this;
  }

   /**
   * The ID of this payment request
   * @return paymentRequestId
  **/
  @ApiModelProperty(example = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5", required = true, value = "The ID of this payment request")

  public String getPaymentRequestId() {
    return paymentRequestId;
  }


  public void setPaymentRequestId(String paymentRequestId) {
    this.paymentRequestId = paymentRequestId;
  }


  public MerchantPaymentSummary merchantReferenceId(String merchantReferenceId) {
    
    this.merchantReferenceId = merchantReferenceId;
    return this;
  }

   /**
   * The unique reference for the payment as defined by the Merchant
   * @return merchantReferenceId
  **/
  @ApiModelProperty(example = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5", required = true, value = "The unique reference for the payment as defined by the Merchant")

  public String getMerchantReferenceId() {
    return merchantReferenceId;
  }


  public void setMerchantReferenceId(String merchantReferenceId) {
    this.merchantReferenceId = merchantReferenceId;
  }


  public MerchantPaymentSummary grossAmount(BigDecimal grossAmount) {
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * The gross amount to be paid.  Must be positive except for refunds
   * @return grossAmount
  **/
  @ApiModelProperty(required = true, value = "The gross amount to be paid.  Must be positive except for refunds")

  public BigDecimal getGrossAmount() {
    return grossAmount;
  }


  public void setGrossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
  }


  public MerchantPaymentSummary usesRemaining(Integer usesRemaining) {
    
    this.usesRemaining = usesRemaining;
    return this;
  }

   /**
   * The number of times that the payment request can be used to create a payment. If basent then request can be used an unlimited number of times
   * minimum: 0
   * @return usesRemaining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times that the payment request can be used to create a payment. If basent then request can be used an unlimited number of times")

  public Integer getUsesRemaining() {
    return usesRemaining;
  }


  public void setUsesRemaining(Integer usesRemaining) {
    this.usesRemaining = usesRemaining;
  }


  public MerchantPaymentSummary expiryTime(OffsetDateTime expiryTime) {
    
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * The ISO date/time for when the payment request will expire and become unusable for payments.  If absent then the payment request will not expire until it is deleted
   * @return expiryTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", value = "The ISO date/time for when the payment request will expire and become unusable for payments.  If absent then the payment request will not expire until it is deleted")

  public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }


  public void setExpiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }


  public MerchantPaymentSummary specificWalletId(String specificWalletId) {
    
    this.specificWalletId = specificWalletId;
    return this;
  }

   /**
   * The ID of a specific wallet for which the payment is intended.  If present then the payment can only be used by the intended wallet.  If absent then any wallet can create a payment against the payment request
   * @return specificWalletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of a specific wallet for which the payment is intended.  If present then the payment can only be used by the intended wallet.  If absent then any wallet can create a payment against the payment request")

  public String getSpecificWalletId() {
    return specificWalletId;
  }


  public void setSpecificWalletId(String specificWalletId) {
    this.specificWalletId = specificWalletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantPaymentSummary merchantPaymentSummary = (MerchantPaymentSummary) o;
    return Objects.equals(this.paymentRequestId, merchantPaymentSummary.paymentRequestId) &&
        Objects.equals(this.merchantReferenceId, merchantPaymentSummary.merchantReferenceId) &&
        Objects.equals(this.grossAmount, merchantPaymentSummary.grossAmount) &&
        Objects.equals(this.usesRemaining, merchantPaymentSummary.usesRemaining) &&
        Objects.equals(this.expiryTime, merchantPaymentSummary.expiryTime) &&
        Objects.equals(this.specificWalletId, merchantPaymentSummary.specificWalletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentRequestId, merchantReferenceId, grossAmount, usesRemaining, expiryTime, specificWalletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPaymentSummary {\n");
    sb.append("    paymentRequestId: ").append(toIndentedString(paymentRequestId)).append("\n");
    sb.append("    merchantReferenceId: ").append(toIndentedString(merchantReferenceId)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    usesRemaining: ").append(toIndentedString(usesRemaining)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    specificWalletId: ").append(toIndentedString(specificWalletId)).append("\n");
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

