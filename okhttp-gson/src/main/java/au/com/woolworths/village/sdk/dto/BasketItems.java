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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BasketItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-30T10:56:50.564+10:00[Australia/Melbourne]")
public class BasketItems {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_UNIT_MEASURE = "unitMeasure";
  @SerializedName(SERIALIZED_NAME_UNIT_MEASURE)
  private String unitMeasure;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private BigDecimal totalPrice;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;


  public BasketItems label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Short label for the basket item
   * @return label
  **/
  @ApiModelProperty(required = true, value = "Short label for the basket item")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public BasketItems description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Longer description of the basket item
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Longer description of the basket item")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BasketItems quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the item in the basket if multiple is possible.  Is a number to accommodate items charged by weight or length
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of units of the item in the basket if multiple is possible.  Is a number to accommodate items charged by weight or length")

  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public BasketItems unitPrice(BigDecimal unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The unit price of the item.  May be positive or negative
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit price of the item.  May be positive or negative")

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public BasketItems unitMeasure(String unitMeasure) {
    
    this.unitMeasure = unitMeasure;
    return this;
  }

   /**
   * Optional display string for the measure of the unit
   * @return unitMeasure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional display string for the measure of the unit")

  public String getUnitMeasure() {
    return unitMeasure;
  }


  public void setUnitMeasure(String unitMeasure) {
    this.unitMeasure = unitMeasure;
  }


  public BasketItems totalPrice(BigDecimal totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * The total price of the item.  May be positive or negative
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total price of the item.  May be positive or negative")

  public BigDecimal getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }


  public BasketItems tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public BasketItems putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Additional string/string key/value pairs for the item defined by the merchant
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional string/string key/value pairs for the item defined by the merchant")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketItems basketItems = (BasketItems) o;
    return Objects.equals(this.label, basketItems.label) &&
        Objects.equals(this.description, basketItems.description) &&
        Objects.equals(this.quantity, basketItems.quantity) &&
        Objects.equals(this.unitPrice, basketItems.unitPrice) &&
        Objects.equals(this.unitMeasure, basketItems.unitMeasure) &&
        Objects.equals(this.totalPrice, basketItems.totalPrice) &&
        Objects.equals(this.tags, basketItems.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description, quantity, unitPrice, unitMeasure, totalPrice, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasketItems {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitMeasure: ").append(toIndentedString(unitMeasure)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

