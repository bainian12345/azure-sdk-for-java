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
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Notifications;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationContract;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationName;

class NotificationsImpl extends WrapperImpl<NotificationsInner> implements Notifications {
    private final ApiManagementManager manager;

    NotificationsImpl(ApiManagementManager manager) {
        super(manager.inner().notifications());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public NotificationContractImpl define(String name) {
        return wrapModel(name);
    }

    private NotificationContractImpl wrapModel(NotificationContractInner inner) {
        return  new NotificationContractImpl(inner, manager());
    }

    private NotificationContractImpl wrapModel(String name) {
        return new NotificationContractImpl(name, this.manager());
    }

    @Override
    public Observable<NotificationContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        NotificationsInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<NotificationContractInner>, Iterable<NotificationContractInner>>() {
            @Override
            public Iterable<NotificationContractInner> call(Page<NotificationContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NotificationContractInner, NotificationContract>() {
            @Override
            public NotificationContract call(NotificationContractInner inner) {
                return new NotificationContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NotificationContract> getAsync(String resourceGroupName, String serviceName, NotificationName notificationName) {
        NotificationsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, notificationName)
        .map(new Func1<NotificationContractInner, NotificationContract>() {
            @Override
            public NotificationContract call(NotificationContractInner inner) {
                return new NotificationContractImpl(inner, manager());
            }
        });
    }

}
