/*
 * Woovi
 * A Woovi é uma Plataforma de Gestão de Pagamentos. Para utilizar nossa API você deve acessar  __[https://api.woovi.com/](https://api.woovi.com/)__ e somente o mesmo. A Woovi não aceita subdominios para a API.  Veja como configurar seu acesso a nossa API [aqui](https://developers.woovi.com/docs/apis/api-getting-started).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package br.com.openpix.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import br.com.openpix.sdk.model.ApiV1WebhookPostRequestPix;
import br.com.openpix.sdk.model.PixQrCode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.openpix.sdk.JSON;

/**
 * ApiV1WebhookPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-09T10:01:02.014525-03:00[America/Sao_Paulo]")
public class ApiV1WebhookPostRequest {
  public static final String SERIALIZED_NAME_CHARGE = "charge";
  @SerializedName(SERIALIZED_NAME_CHARGE)
  private Object charge;

  public static final String SERIALIZED_NAME_PIX = "pix";
  @SerializedName(SERIALIZED_NAME_PIX)
  private ApiV1WebhookPostRequestPix pix;

  public static final String SERIALIZED_NAME_PIX_QR_CODE = "pixQrCode";
  @SerializedName(SERIALIZED_NAME_PIX_QR_CODE)
  private PixQrCode pixQrCode;

  public ApiV1WebhookPostRequest() {
  }

  public ApiV1WebhookPostRequest charge(Object charge) {
    
    this.charge = charge;
    return this;
  }

   /**
   * Get charge
   * @return charge
  **/
  @javax.annotation.Nullable
  public Object getCharge() {
    return charge;
  }


  public void setCharge(Object charge) {
    this.charge = charge;
  }


  public ApiV1WebhookPostRequest pix(ApiV1WebhookPostRequestPix pix) {
    
    this.pix = pix;
    return this;
  }

   /**
   * Get pix
   * @return pix
  **/
  @javax.annotation.Nullable
  public ApiV1WebhookPostRequestPix getPix() {
    return pix;
  }


  public void setPix(ApiV1WebhookPostRequestPix pix) {
    this.pix = pix;
  }


  public ApiV1WebhookPostRequest pixQrCode(PixQrCode pixQrCode) {
    
    this.pixQrCode = pixQrCode;
    return this;
  }

   /**
   * Get pixQrCode
   * @return pixQrCode
  **/
  @javax.annotation.Nullable
  public PixQrCode getPixQrCode() {
    return pixQrCode;
  }


  public void setPixQrCode(PixQrCode pixQrCode) {
    this.pixQrCode = pixQrCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1WebhookPostRequest apiV1WebhookPostRequest = (ApiV1WebhookPostRequest) o;
    return Objects.equals(this.charge, apiV1WebhookPostRequest.charge) &&
        Objects.equals(this.pix, apiV1WebhookPostRequest.pix) &&
        Objects.equals(this.pixQrCode, apiV1WebhookPostRequest.pixQrCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charge, pix, pixQrCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1WebhookPostRequest {\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    pix: ").append(toIndentedString(pix)).append("\n");
    sb.append("    pixQrCode: ").append(toIndentedString(pixQrCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("charge");
    openapiFields.add("pix");
    openapiFields.add("pixQrCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiV1WebhookPostRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1WebhookPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1WebhookPostRequest is not found in the empty JSON string", ApiV1WebhookPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV1WebhookPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1WebhookPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `pix`
      if (jsonObj.get("pix") != null && !jsonObj.get("pix").isJsonNull()) {
        ApiV1WebhookPostRequestPix.validateJsonElement(jsonObj.get("pix"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1WebhookPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1WebhookPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1WebhookPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1WebhookPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1WebhookPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV1WebhookPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1WebhookPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV1WebhookPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV1WebhookPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV1WebhookPostRequest
  */
  public static ApiV1WebhookPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1WebhookPostRequest.class);
  }

 /**
  * Convert an instance of ApiV1WebhookPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
