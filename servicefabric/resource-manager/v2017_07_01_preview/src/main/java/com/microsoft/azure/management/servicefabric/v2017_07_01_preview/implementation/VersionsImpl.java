/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.Versions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.VersionResourceList;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.VersionResource;

class VersionsImpl extends WrapperImpl<VersionsInner> implements Versions {
    private final ServiceFabricManager manager;

    VersionsImpl(ServiceFabricManager manager) {
        super(manager.inner().versions());
        this.manager = manager;
    }

    public ServiceFabricManager manager() {
        return this.manager;
    }

    @Override
    public VersionResourceImpl define(String name) {
        return wrapModel(name);
    }

    private VersionResourceImpl wrapModel(VersionResourceInner inner) {
        return  new VersionResourceImpl(inner, manager());
    }

    private VersionResourceImpl wrapModel(String name) {
        return new VersionResourceImpl(name, this.manager());
    }

    @Override
    public Observable<VersionResourceList> listAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName, String apiVersion) {
        VersionsInner client = this.inner();
        return client.listAsync(subscriptionId, resourceGroupName, clusterName, applicationTypeName, apiVersion)
        .map(new Func1<VersionResourceListInner, VersionResourceList>() {
            @Override
            public VersionResourceList call(VersionResourceListInner inner) {
                return new VersionResourceListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VersionResource> getAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName, String version, String apiVersion) {
        VersionsInner client = this.inner();
        return client.getAsync(subscriptionId, resourceGroupName, clusterName, applicationTypeName, version, apiVersion)
        .map(new Func1<VersionResourceInner, VersionResource>() {
            @Override
            public VersionResource call(VersionResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName, String version, String apiVersion) {
        VersionsInner client = this.inner();
        return client.deleteAsync(subscriptionId, resourceGroupName, clusterName, applicationTypeName, version, apiVersion).toCompletable();
    }

}
