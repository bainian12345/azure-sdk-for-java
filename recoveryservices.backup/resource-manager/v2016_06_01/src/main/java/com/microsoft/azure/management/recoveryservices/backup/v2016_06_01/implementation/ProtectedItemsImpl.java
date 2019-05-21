/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectedItems;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectedItemResource;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.VaultProtectedItemResource;

class ProtectedItemsImpl extends WrapperImpl<ProtectedItemsInner> implements ProtectedItems {
    private final RecoveryServicesManager manager;

    ProtectedItemsImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectedItems());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private ProtectedItemResourceImpl wrapModel(ProtectedItemResourceInner inner) {
        return  new ProtectedItemResourceImpl(inner, manager());
    }

    @Override
    public Observable<ProtectedItemResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName) {
        ProtectedItemsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName)
        .map(new Func1<ProtectedItemResourceInner, ProtectedItemResource>() {
            @Override
            public ProtectedItemResource call(ProtectedItemResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName) {
        ProtectedItemsInner client = this.inner();
        return client.deleteAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName).toCompletable();
    }

    private VaultProtectedItemResourceImpl wrapVaultProtectedItemResourceModel(ProtectedItemResourceInner inner) {
        return  new VaultProtectedItemResourceImpl(inner, manager());
    }

    @Override
    public Observable<VaultProtectedItemResource> listAsync(final String vaultName, final String resourceGroupName) {
        ProtectedItemsInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName)
        .flatMapIterable(new Func1<Page<ProtectedItemResourceInner>, Iterable<ProtectedItemResourceInner>>() {
            @Override
            public Iterable<ProtectedItemResourceInner> call(Page<ProtectedItemResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectedItemResourceInner, VaultProtectedItemResource>() {
            @Override
            public VaultProtectedItemResource call(ProtectedItemResourceInner inner) {
                return wrapVaultProtectedItemResourceModel(inner);
            }
        });
    }

    @Override
    public Completable createOrUpdateAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, ProtectedItemResourceInner resourceProtectedItem) {
        ProtectedItemsInner client = this.inner();
        return client.createOrUpdateAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, resourceProtectedItem).toCompletable();
    }

}
