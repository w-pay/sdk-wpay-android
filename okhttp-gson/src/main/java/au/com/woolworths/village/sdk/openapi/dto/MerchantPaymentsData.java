/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class MerchantPaymentsData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE_ID = "merchantReferenceId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE_ID)
  private String merchantReferenceId;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "grossAmount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private BigDecimal grossAmount;

  public static final String SERIALIZED_NAME_GENERATE_Q_R = "generateQR";
  @SerializedName(SERIALIZED_NAME_GENERATE_Q_R)
  private Boolean generateQR = false;

  public static final String SERIALIZED_NAME_MAX_USES = "maxUses";
  @SerializedName(SERIALIZED_NAME_MAX_USES)
  private Integer maxUses = 1;

  public static final String SERIALIZED_NAME_TIME_TO_LIVE_PAYMENT = "timeToLivePayment";
  @SerializedName(SERIALIZED_NAME_TIME_TO_LIVE_PAYMENT)
  private Integer timeToLivePayment = 0;

  public static final String SERIALIZED_NAME_TIME_TO_LIVE_Q_R = "timeToLiveQR";
  @SerializedName(SERIALIZED_NAME_TIME_TO_LIVE_Q_R)
  private Integer timeToLiveQR = 0;

  public static final String SERIALIZED_NAME_SPECIFIC_WALLET_ID = "specificWalletId";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_WALLET_ID)
  private String specificWalletId;

  public static final String SERIALIZED_NAME_BASKET = "basket";
  @SerializedName(SERIALIZED_NAME_BASKET)
  private Basket basket;

  public static final String SERIALIZED_NAME_POS_PAYLOAD = "posPayload";
  @SerializedName(SERIALIZED_NAME_POS_PAYLOAD)
  private PosPayload posPayload;

  public static final String SERIALIZED_NAME_MERCHANT_PAYLOAD = "merchantPayload";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PAYLOAD)
  private MerchantPayload merchantPayload;


  public MerchantPaymentsData merchantReferenceId(String merchantReferenceId) {
    
    this.merchantReferenceId = merchantReferenceId;
    return this;
  }

   /**
   * The unique reference for the payment as defined by the Merchant
   * @return merchantReferenceId
  **/
  @ApiModelProperty(required = true, value = "The unique reference for the payment as defined by the Merchant")

  public String getMerchantReferenceId() {
    return merchantReferenceId;
  }


  public void setMerchantReferenceId(String merchantReferenceId) {
    this.merchantReferenceId = merchantReferenceId;
  }


  public MerchantPaymentsData grossAmount(BigDecimal grossAmount) {
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * The gross amount to be paid.  Must be positive
   * minimum: 0
   * @return grossAmount
  **/
  @ApiModelProperty(required = true, value = "The gross amount to be paid.  Must be positive")

  public BigDecimal getGrossAmount() {
    return grossAmount;
  }


  public void setGrossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
  }


  public MerchantPaymentsData generateQR(Boolean generateQR) {
    
    this.generateQR = generateQR;
    return this;
  }

   /**
   * Flag indicating whether a QR code should be created and returned in the response
   * @return generateQR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag indicating whether a QR code should be created and returned in the response")

  public Boolean getGenerateQR() {
    return generateQR;
  }


  public void setGenerateQR(Boolean generateQR) {
    this.generateQR = generateQR;
  }


  public MerchantPaymentsData maxUses(Integer maxUses) {
    
    this.maxUses = maxUses;
    return this;
  }

   /**
   * The number of times that the payment request can be used to create a payment.  Defaults to 1 if absent.  If set to 0 then the request can be used an unlimited number of times
   * minimum: 0
   * @return maxUses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times that the payment request can be used to create a payment.  Defaults to 1 if absent.  If set to 0 then the request can be used an unlimited number of times")

  public Integer getMaxUses() {
    return maxUses;
  }


  public void setMaxUses(Integer maxUses) {
    this.maxUses = maxUses;
  }


  public MerchantPaymentsData timeToLivePayment(Integer timeToLivePayment) {
    
    this.timeToLivePayment = timeToLivePayment;
    return this;
  }

   /**
   * The time in seconds that the payment request should remain valid.  After this time any use of the request to create a payment will fail. Default value is 0 which indicates that the code will not expire until it is deleted
   * minimum: 0
   * @return timeToLivePayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time in seconds that the payment request should remain valid.  After this time any use of the request to create a payment will fail. Default value is 0 which indicates that the code will not expire until it is deleted")

  public Integer getTimeToLivePayment() {
    return timeToLivePayment;
  }


  public void setTimeToLivePayment(Integer timeToLivePayment) {
    this.timeToLivePayment = timeToLivePayment;
  }


  public MerchantPaymentsData timeToLiveQR(Integer timeToLiveQR) {
    
    this.timeToLiveQR = timeToLiveQR;
    return this;
  }

   /**
   * The time in seconds that the QR code should remain valid.  After this time any use of the request to create a payment will fail. Default value is 0 which indicates that the code will not expire until it is deleted
   * minimum: 0
   * @return timeToLiveQR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time in seconds that the QR code should remain valid.  After this time any use of the request to create a payment will fail. Default value is 0 which indicates that the code will not expire until it is deleted")

  public Integer getTimeToLiveQR() {
    return timeToLiveQR;
  }


  public void setTimeToLiveQR(Integer timeToLiveQR) {
    this.timeToLiveQR = timeToLiveQR;
  }


  public MerchantPaymentsData specificWalletId(String specificWalletId) {
    
    this.specificWalletId = specificWalletId;
    return this;
  }

   /**
   * The ID of a specific wallet for which the payment is intended.  Can be used in scenarios where a customer has previously requested that their wallet ID is retained for repeat purchase.  If supplied the payment can only be used by the intended wallet.  If absent then any wallet can create a payment against the payment request
   * @return specificWalletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of a specific wallet for which the payment is intended.  Can be used in scenarios where a customer has previously requested that their wallet ID is retained for repeat purchase.  If supplied the payment can only be used by the intended wallet.  If absent then any wallet can create a payment against the payment request")

  public String getSpecificWalletId() {
    return specificWalletId;
  }


  public void setSpecificWalletId(String specificWalletId) {
    this.specificWalletId = specificWalletId;
  }


  public MerchantPaymentsData basket(Basket basket) {
    
    this.basket = basket;
    return this;
  }

   /**
   * Get basket
   * @return basket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Basket getBasket() {
    return basket;
  }


  public void setBasket(Basket basket) {
    this.basket = basket;
  }


  public MerchantPaymentsData posPayload(PosPayload posPayload) {
    
    this.posPayload = posPayload;
    return this;
  }

   /**
   * Get posPayload
   * @return posPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PosPayload getPosPayload() {
    return posPayload;
  }


  public void setPosPayload(PosPayload posPayload) {
    this.posPayload = posPayload;
  }


  public MerchantPaymentsData merchantPayload(MerchantPayload merchantPayload) {
    
    this.merchantPayload = merchantPayload;
    return this;
  }

   /**
   * Get merchantPayload
   * @return merchantPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantPayload getMerchantPayload() {
    return merchantPayload;
  }


  public void setMerchantPayload(MerchantPayload merchantPayload) {
    this.merchantPayload = merchantPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantPaymentsData merchantPaymentsData = (MerchantPaymentsData) o;
    return Objects.equals(this.merchantReferenceId, merchantPaymentsData.merchantReferenceId) &&
        Objects.equals(this.grossAmount, merchantPaymentsData.grossAmount) &&
        Objects.equals(this.generateQR, merchantPaymentsData.generateQR) &&
        Objects.equals(this.maxUses, merchantPaymentsData.maxUses) &&
        Objects.equals(this.timeToLivePayment, merchantPaymentsData.timeToLivePayment) &&
        Objects.equals(this.timeToLiveQR, merchantPaymentsData.timeToLiveQR) &&
        Objects.equals(this.specificWalletId, merchantPaymentsData.specificWalletId) &&
        Objects.equals(this.basket, merchantPaymentsData.basket) &&
        Objects.equals(this.posPayload, merchantPaymentsData.posPayload) &&
        Objects.equals(this.merchantPayload, merchantPaymentsData.merchantPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReferenceId, grossAmount, generateQR, maxUses, timeToLivePayment, timeToLiveQR, specificWalletId, basket, posPayload, merchantPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPaymentsData {\n");
    sb.append("    merchantReferenceId: ").append(toIndentedString(merchantReferenceId)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    generateQR: ").append(toIndentedString(generateQR)).append("\n");
    sb.append("    maxUses: ").append(toIndentedString(maxUses)).append("\n");
    sb.append("    timeToLivePayment: ").append(toIndentedString(timeToLivePayment)).append("\n");
    sb.append("    timeToLiveQR: ").append(toIndentedString(timeToLiveQR)).append("\n");
    sb.append("    specificWalletId: ").append(toIndentedString(specificWalletId)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    posPayload: ").append(toIndentedString(posPayload)).append("\n");
    sb.append("    merchantPayload: ").append(toIndentedString(merchantPayload)).append("\n");
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

