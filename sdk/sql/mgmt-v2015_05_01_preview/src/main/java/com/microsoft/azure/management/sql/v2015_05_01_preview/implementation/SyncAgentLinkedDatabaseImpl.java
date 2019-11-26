/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncAgentLinkedDatabase;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncMemberDbType;

class SyncAgentLinkedDatabaseImpl extends WrapperImpl<SyncAgentLinkedDatabaseInner> implements SyncAgentLinkedDatabase {
    private final SqlManager manager;

    SyncAgentLinkedDatabaseImpl(SyncAgentLinkedDatabaseInner inner,  SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }



    @Override
    public String databaseId() {
        return this.inner().databaseId();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public SyncMemberDbType databaseType() {
        return this.inner().databaseType();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String serverName() {
        return this.inner().serverName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userName() {
        return this.inner().userName();
    }

}