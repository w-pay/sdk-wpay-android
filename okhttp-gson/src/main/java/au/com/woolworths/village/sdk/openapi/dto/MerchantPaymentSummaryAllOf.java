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
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchantPaymentSummaryAllOf
 */

public class MerchantPaymentSummaryAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USES_REMAINING = "usesRemaining";
  @SerializedName(SERIALIZED_NAME_USES_REMAINING)
  private Integer usesRemaining;

  public static final String SERIALIZED_NAME_EXPIRY_TIME = "expiryTime";
  @SerializedName(SERIALIZED_NAME_EXPIRY_TIME)
  private OffsetDateTime expiryTime;

  public static final String SERIALIZED_NAME_SPECIFIC_WALLET_ID = "specificWalletId";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_WALLET_ID)
  private String specificWalletId;


  public MerchantPaymentSummaryAllOf usesRemaining(Integer usesRemaining) {
    
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


  public MerchantPaymentSummaryAllOf expiryTime(OffsetDateTime expiryTime) {
    
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


  public MerchantPaymentSummaryAllOf specificWalletId(String specificWalletId) {
    
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
    MerchantPaymentSummaryAllOf merchantPaymentSummaryAllOf = (MerchantPaymentSummaryAllOf) o;
    return Objects.equals(this.usesRemaining, merchantPaymentSummaryAllOf.usesRemaining) &&
        Objects.equals(this.expiryTime, merchantPaymentSummaryAllOf.expiryTime) &&
        Objects.equals(this.specificWalletId, merchantPaymentSummaryAllOf.specificWalletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usesRemaining, expiryTime, specificWalletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPaymentSummaryAllOf {\n");
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

