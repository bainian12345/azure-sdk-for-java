/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Dynamics AX linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsAX")
@JsonFlatten
public class DynamicsAXLinkedService extends LinkedServiceInner {
    /**
     * The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData
     * endpoint.
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId", required = true)
    private Object servicePrincipalId;

    /**
     * Specify the application's key. Mark this field as a SecureString to
     * store it securely in Data Factory, or reference a secret stored in Azure
     * Key Vault. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey", required = true)
    private SecretBase servicePrincipalKey;

    /**
     * Specify the tenant information (domain name or tenant ID) under which
     * your application resides. Retrieve it by hovering the mouse in the
     * top-right corner of the Azure portal. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant", required = true)
    private Object tenant;

    /**
     * Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.aadResourceId", required = true)
    private Object aadResourceId;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     *
     * @param url the url value to set
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get specify the application's client ID. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set specify the application's client ID. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get specify the application's key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set specify the application's key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
     *
     * @param tenant the tenant value to set
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     *
     * @return the aadResourceId value
     */
    public Object aadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     *
     * @param aadResourceId the aadResourceId value to set
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
