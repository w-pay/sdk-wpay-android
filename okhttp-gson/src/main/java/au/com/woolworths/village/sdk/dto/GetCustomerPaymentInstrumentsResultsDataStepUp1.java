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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetCustomerPaymentInstrumentsResultsDataStepUp1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-30T10:56:50.564+10:00[Australia/Melbourne]")
public class GetCustomerPaymentInstrumentsResultsDataStepUp1 {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
  @SerializedName(SERIALIZED_NAME_MANDATORY)
  private Boolean mandatory;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public GetCustomerPaymentInstrumentsResultsDataStepUp1 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the step up action. For gift cards this will be REQUIRE_PASSCODE which identifies that the consumer must capture the PIN prior to payment.
   * @return type
  **/
  @ApiModelProperty(example = "REQUIRE_PASSCODE", required = true, value = "The type of the step up action. For gift cards this will be REQUIRE_PASSCODE which identifies that the consumer must capture the PIN prior to payment.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetCustomerPaymentInstrumentsResultsDataStepUp1 mandatory(Boolean mandatory) {
    
    this.mandatory = mandatory;
    return this;
  }

   /**
   * A flag to indicate if this step up (action) is mandatory.
   * @return mandatory
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if this step up (action) is mandatory.")

  public Boolean getMandatory() {
    return mandatory;
  }


  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public GetCustomerPaymentInstrumentsResultsDataStepUp1 url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * TBD
   * @return url
  **/
  @ApiModelProperty(example = "https://uat.woolworthspay.com.au/container-ws/tbd", required = true, value = "TBD")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerPaymentInstrumentsResultsDataStepUp1 getCustomerPaymentInstrumentsResultsDataStepUp1 = (GetCustomerPaymentInstrumentsResultsDataStepUp1) o;
    return Objects.equals(this.type, getCustomerPaymentInstrumentsResultsDataStepUp1.type) &&
        Objects.equals(this.mandatory, getCustomerPaymentInstrumentsResultsDataStepUp1.mandatory) &&
        Objects.equals(this.url, getCustomerPaymentInstrumentsResultsDataStepUp1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mandatory, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerPaymentInstrumentsResultsDataStepUp1 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

