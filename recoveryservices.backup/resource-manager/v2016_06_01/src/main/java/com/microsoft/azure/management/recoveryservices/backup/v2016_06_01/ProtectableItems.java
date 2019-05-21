/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectableItemsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectableItems.
 */
public interface ProtectableItems extends HasInner<ProtectableItemsInner> {
    /**
     * Based on the query filter and the pagination parameters, this operation provides a pageable list of objects within the subscription that can be protected.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkloadProtectableItemResource> listAsync(final String vaultName, final String resourceGroupName);

}
