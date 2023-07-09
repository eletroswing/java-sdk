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


package br.com.openpix.sdk.api;

import br.com.openpix.sdk.ApiException;
import br.com.openpix.sdk.model.ApiV1AccountAccountIdGet400Response;
import br.com.openpix.sdk.model.ApiV1PartnerApplicationPost200Response;
import br.com.openpix.sdk.model.ApiV1PartnerApplicationPostRequest;
import br.com.openpix.sdk.model.ApiV1PartnerCompanyGet200Response;
import br.com.openpix.sdk.model.ApiV1PartnerCompanyTaxIDGet200Response;
import br.com.openpix.sdk.model.PreRegistrationPayloadObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartnerRequestAccessApi
 */
@Disabled
public class PartnerRequestAccessApiTest {

    private final PartnerRequestAccessApi api = new PartnerRequestAccessApi();

    /**
     * Create a new application to some of your preregistration&#39;s company.
     *
     * As a partner company, you can create a new application to some of your companies. The application should give access to our API to this companies, so they can use it too. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PartnerApplicationPostTest() throws ApiException {
        ApiV1PartnerApplicationPostRequest apiV1PartnerApplicationPostRequest = null;
        ApiV1PartnerApplicationPost200Response response = api.apiV1PartnerApplicationPost(apiV1PartnerApplicationPostRequest);
        // TODO: test validations
    }

    /**
     * Get every preregistration that is managed by you.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PartnerCompanyGetTest() throws ApiException {
        ApiV1PartnerCompanyGet200Response response = api.apiV1PartnerCompanyGet();
        // TODO: test validations
    }

    /**
     * Create a pre registration with a partner reference (your company)
     *
     * As a partner company, you can create a new pre registration referencing your company as a partner. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PartnerCompanyPostTest() throws ApiException {
        PreRegistrationPayloadObject preRegistrationPayloadObject = null;
        PreRegistrationPayloadObject response = api.apiV1PartnerCompanyPost(preRegistrationPayloadObject);
        // TODO: test validations
    }

    /**
     * Get an specific preregistration via taxID param.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PartnerCompanyTaxIDGetTest() throws ApiException {
        String taxID = null;
        ApiV1PartnerCompanyTaxIDGet200Response response = api.apiV1PartnerCompanyTaxIDGet(taxID);
        // TODO: test validations
    }

}