/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.implementation;

import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.OperationDisplay;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final OperationsManagementManager manager;
    OperationImpl(OperationInner inner, OperationsManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public OperationsManagementManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
