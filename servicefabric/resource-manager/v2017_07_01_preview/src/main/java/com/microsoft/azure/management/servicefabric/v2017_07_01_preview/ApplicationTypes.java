/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation.ApplicationTypesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApplicationTypes.
 */
public interface ApplicationTypes extends SupportsCreating<ApplicationTypeResource.DefinitionStages.Blank>, HasInner<ApplicationTypesInner> {
    /**
     * Returns all application type names in the specified cluster.
     *
     * @param subscriptionId The customer subscription identifier
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationTypeResourceList> listAsync(String subscriptionId, String resourceGroupName, String clusterName, String apiVersion);

    /**
     * Returns an application type name resource.
     *
     * @param subscriptionId The customer subscription identifier
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param applicationTypeName The name of the application type name resource
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationTypeResource> getAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName, String apiVersion);

    /**
     * Deletes the application type name resource.
     *
     * @param subscriptionId The customer subscription identifier
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param applicationTypeName The name of the application type name resource
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName, String apiVersion);

}
