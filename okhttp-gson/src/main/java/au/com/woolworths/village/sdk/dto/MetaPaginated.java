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
 * Object to contain any metadata
 */
@ApiModel(description = "Object to contain any metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-30T10:56:50.564+10:00[Australia/Melbourne]")
public class MetaPaginated {
  public static final String SERIALIZED_NAME_RECORD_COUNT = "recordCount";
  @SerializedName(SERIALIZED_NAME_RECORD_COUNT)
  private Integer recordCount;

  public static final String SERIALIZED_NAME_TOTAL_RECORDS = "totalRecords";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORDS)
  private Integer totalRecords;


  public MetaPaginated recordCount(Integer recordCount) {
    
    this.recordCount = recordCount;
    return this;
  }

   /**
   * The number of records returned in the result set
   * minimum: 0
   * @return recordCount
  **/
  @ApiModelProperty(required = true, value = "The number of records returned in the result set")

  public Integer getRecordCount() {
    return recordCount;
  }


  public void setRecordCount(Integer recordCount) {
    this.recordCount = recordCount;
  }


  public MetaPaginated totalRecords(Integer totalRecords) {
    
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * The number of records in total in the full query set
   * minimum: 0
   * @return totalRecords
  **/
  @ApiModelProperty(required = true, value = "The number of records in total in the full query set")

  public Integer getTotalRecords() {
    return totalRecords;
  }


  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaPaginated metaPaginated = (MetaPaginated) o;
    return Objects.equals(this.recordCount, metaPaginated.recordCount) &&
        Objects.equals(this.totalRecords, metaPaginated.totalRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordCount, totalRecords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaPaginated {\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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

