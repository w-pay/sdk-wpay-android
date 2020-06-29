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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

/**
 * CustomerPreferences
 */

public class CustomerPreferences implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, Object> meta = new HashMap<String, Object>();


  public CustomerPreferences data(Map<String, Map<String, String>> data) {
    
    this.data = data;
    return this;
  }

  public CustomerPreferences putDataItem(String key, Map<String, String> dataItem) {
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * A set of groups of key/value based preferences
   * @return data
  **/
  @ApiModelProperty(required = true, value = "A set of groups of key/value based preferences")

  public Map<String, Map<String, String>> getData() {
    return data;
  }


  public void setData(Map<String, Map<String, String>> data) {
    this.data = data;
  }


  public CustomerPreferences meta(Map<String, Object> meta) {
    
    this.meta = meta;
    return this;
  }

  public CustomerPreferences putMetaItem(String key, Object metaItem) {
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Object to contain any metadata
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "Object to contain any metadata")

  public Map<String, Object> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPreferences customerPreferences = (CustomerPreferences) o;
    return Objects.equals(this.data, customerPreferences.data) &&
        Objects.equals(this.meta, customerPreferences.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPreferences {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
