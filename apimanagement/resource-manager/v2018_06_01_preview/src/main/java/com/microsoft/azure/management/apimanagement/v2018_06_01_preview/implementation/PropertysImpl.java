/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Propertys;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PropertyContract;

class PropertysImpl extends WrapperImpl<PropertysInner> implements Propertys {
    private final ApiManagementManager manager;

    PropertysImpl(ApiManagementManager manager) {
        super(manager.inner().propertys());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public PropertyContractImpl define(String name) {
        return wrapModel(name);
    }

    private PropertyContractImpl wrapModel(PropertyContractInner inner) {
        return  new PropertyContractImpl(inner, manager());
    }

    private PropertyContractImpl wrapModel(String name) {
        return new PropertyContractImpl(name, this.manager());
    }

    @Override
    public Observable<PropertyContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        PropertysInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<PropertyContractInner>, Iterable<PropertyContractInner>>() {
            @Override
            public Iterable<PropertyContractInner> call(Page<PropertyContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PropertyContractInner, PropertyContract>() {
            @Override
            public PropertyContract call(PropertyContractInner inner) {
                return new PropertyContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String propId) {
        PropertysInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, propId).toCompletable();
    }

    @Override
    public Observable<PropertyContract> getAsync(String resourceGroupName, String serviceName, String propId) {
        PropertysInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, propId)
        .map(new Func1<PropertyContractInner, PropertyContract>() {
            @Override
            public PropertyContract call(PropertyContractInner inner) {
                return new PropertyContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String propId, String ifMatch) {
        PropertysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, propId, ifMatch).toCompletable();
    }

}
