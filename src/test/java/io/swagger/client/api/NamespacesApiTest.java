/*
 * OpenWhisk REST API
 * API for OpenWhisk
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorMessage;
import io.swagger.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NamespacesApi
 */
@Ignore
public class NamespacesApiTest {

    private final NamespacesApi api = new NamespacesApi();

    
    /**
     * Get all entities in a namespace
     *
     * Get all entities in a namespace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEntitiesInNamespaceTest() throws ApiException {
        String namespace = null;
        InlineResponse200 response = api.getAllEntitiesInNamespace(namespace);

        // TODO: test validations
    }
    
    /**
     * Get all namespaces for authenticated user
     *
     * Get all namespaces for authenticated user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNamespacesTest() throws ApiException {
        List<String> response = api.getAllNamespaces();

        // TODO: test validations
    }
    
}