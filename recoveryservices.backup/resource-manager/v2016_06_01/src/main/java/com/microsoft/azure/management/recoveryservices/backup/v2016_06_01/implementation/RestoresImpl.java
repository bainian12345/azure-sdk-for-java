/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.Restores;
import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.RestoreRequestResource;

class RestoresImpl extends WrapperImpl<RestoresInner> implements Restores {
    private final RecoveryServicesManager manager;

    RestoresImpl(RecoveryServicesManager manager) {
        super(manager.inner().restores());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Completable triggerAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, RestoreRequestResource resourceRestoreRequest) {
        RestoresInner client = this.inner();
        return client.triggerAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, resourceRestoreRequest).toCompletable();
    }

}
