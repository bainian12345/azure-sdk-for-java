/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.IotHubResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.IotHubDescription;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.EndpointHealthData;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.SharedAccessSignatureAuthorizationRule;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.JobResponse;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.IotHubNameAvailabilityInfo;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.ExportDevicesRequest;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.ImportDevicesRequest;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.RegistryStatistics;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.IotHubSkuDescription;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.EventHubConsumerGroupInfo;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.IotHubQuotaMetricInfo;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.TestAllRoutesResult;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.TestRouteResult;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.TestAllRoutesInput;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.TestRouteInput;

class IotHubResourcesImpl extends WrapperImpl<IotHubResourcesInner> implements IotHubResources {
    private final IoTHubManager manager;

    IotHubResourcesImpl(IoTHubManager manager) {
        super(manager.inner().iotHubResources());
        this.manager = manager;
    }

    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public IotHubDescriptionImpl defineIotHub(String name) {
        return wrapIotHubModel(name);
    }

    @Override
    public EventHubConsumerGroupInfoImpl defineConsumerGroup(String name) {
        return wrapConsumerGroupModel(name);
    }

    private IotHubDescriptionImpl wrapIotHubModel(String name) {
        return new IotHubDescriptionImpl(name, new IotHubDescriptionInner(), this.manager());
    }

    private EventHubConsumerGroupInfoImpl wrapConsumerGroupModel(String name) {
        return new EventHubConsumerGroupInfoImpl(name, this.manager());
    }

    private IotHubDescriptionImpl wrapIotHubDescriptionModel(IotHubDescriptionInner inner) {
        return  new IotHubDescriptionImpl(inner.name(), inner, manager());
    }

    private IotHubSkuDescriptionImpl wrapIotHubSkuDescriptionModel(IotHubSkuDescriptionInner inner) {
        return  new IotHubSkuDescriptionImpl(inner, manager());
    }

    private EventHubConsumerGroupInfoImpl wrapEventHubConsumerGroupInfoModel(EventHubConsumerGroupInfoInner inner) {
        return  new EventHubConsumerGroupInfoImpl(inner, manager());
    }

    private JobResponseImpl wrapJobResponseModel(JobResponseInner inner) {
        return  new JobResponseImpl(inner, manager());
    }

    private IotHubQuotaMetricInfoImpl wrapIotHubQuotaMetricInfoModel(IotHubQuotaMetricInfoInner inner) {
        return  new IotHubQuotaMetricInfoImpl(inner, manager());
    }

    private Observable<IotHubDescriptionInner> getIotHubDescriptionInnerUsingIotHubResourcesInnerAsync(String resourceGroupName, String name) {
        IotHubResourcesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    private Observable<EventHubConsumerGroupInfoInner> getEventHubConsumerGroupInfoInnerUsingIotHubResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String resourceName = IdParsingUtils.getValueFromIdByName(id, "IotHubs");
        String eventHubEndpointName = IdParsingUtils.getValueFromIdByName(id, "eventHubEndpoints");
        String name = IdParsingUtils.getValueFromIdByName(id, "ConsumerGroups");
        IotHubResourcesInner client = this.inner();
        return client.getEventHubConsumerGroupAsync(resourceGroupName, resourceName, eventHubEndpointName, name);
    }

    private Observable<JobResponseInner> getJobResponseInnerUsingIotHubResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String resourceName = IdParsingUtils.getValueFromIdByName(id, "IotHubs");
        String jobId = IdParsingUtils.getValueFromIdByName(id, "jobs");
        IotHubResourcesInner client = this.inner();
        return client.getJobAsync(resourceGroupName, resourceName, jobId);
    }

    @Override
    public Observable<IotHubDescription> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getIotHubDescriptionInnerUsingIotHubResourcesInnerAsync(resourceGroupName, name).map(new Func1<IotHubDescriptionInner, IotHubDescription> () {
            @Override
            public IotHubDescription call(IotHubDescriptionInner inner) {
                return wrapIotHubDescriptionModel(inner);
            }
        });
    }

    @Override
    public Observable<IotHubDescription> listByResourceGroupAsync(String resourceGroupName) {
        IotHubResourcesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<IotHubDescriptionInner>, Iterable<IotHubDescriptionInner>>() {
            @Override
            public Iterable<IotHubDescriptionInner> call(Page<IotHubDescriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IotHubDescriptionInner, IotHubDescription>() {
            @Override
            public IotHubDescription call(IotHubDescriptionInner inner) {
                return wrapIotHubDescriptionModel(inner);
            }
        });
    }

    @Override
    public Observable<IotHubDescription> listAsync() {
        IotHubResourcesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<IotHubDescriptionInner>, Iterable<IotHubDescriptionInner>>() {
            @Override
            public Iterable<IotHubDescriptionInner> call(Page<IotHubDescriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IotHubDescriptionInner, IotHubDescription>() {
            @Override
            public IotHubDescription call(IotHubDescriptionInner inner) {
                return wrapIotHubDescriptionModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<EndpointHealthData> getEndpointHealthAsync(final String resourceGroupName, final String iotHubName) {
        IotHubResourcesInner client = this.inner();
        return client.getEndpointHealthAsync(resourceGroupName, iotHubName)
        .flatMapIterable(new Func1<Page<EndpointHealthDataInner>, Iterable<EndpointHealthDataInner>>() {
            @Override
            public Iterable<EndpointHealthDataInner> call(Page<EndpointHealthDataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EndpointHealthDataInner, EndpointHealthData>() {
            @Override
            public EndpointHealthData call(EndpointHealthDataInner inner) {
                return new EndpointHealthDataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SharedAccessSignatureAuthorizationRule> listKeysAsync(final String resourceGroupName, final String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, resourceName)
        .flatMapIterable(new Func1<Page<SharedAccessSignatureAuthorizationRuleInner>, Iterable<SharedAccessSignatureAuthorizationRuleInner>>() {
            @Override
            public Iterable<SharedAccessSignatureAuthorizationRuleInner> call(Page<SharedAccessSignatureAuthorizationRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SharedAccessSignatureAuthorizationRuleInner, SharedAccessSignatureAuthorizationRule>() {
            @Override
            public SharedAccessSignatureAuthorizationRule call(SharedAccessSignatureAuthorizationRuleInner inner) {
                return new SharedAccessSignatureAuthorizationRuleImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<JobResponse> exportDevicesAsync(String resourceGroupName, String resourceName, ExportDevicesRequest exportDevicesParameters) {
        IotHubResourcesInner client = this.inner();
        return client.exportDevicesAsync(resourceGroupName, resourceName, exportDevicesParameters)
        .map(new Func1<JobResponseInner, JobResponse>() {
            @Override
            public JobResponse call(JobResponseInner inner) {
                return new JobResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<JobResponse> importDevicesAsync(String resourceGroupName, String resourceName, ImportDevicesRequest importDevicesParameters) {
        IotHubResourcesInner client = this.inner();
        return client.importDevicesAsync(resourceGroupName, resourceName, importDevicesParameters)
        .map(new Func1<JobResponseInner, JobResponse>() {
            @Override
            public JobResponse call(JobResponseInner inner) {
                return new JobResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IotHubNameAvailabilityInfo> checkNameAvailabilityAsync(String name) {
        IotHubResourcesInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<IotHubNameAvailabilityInfoInner, IotHubNameAvailabilityInfo>() {
            @Override
            public IotHubNameAvailabilityInfo call(IotHubNameAvailabilityInfoInner inner) {
                return new IotHubNameAvailabilityInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RegistryStatistics> getStatsAsync(String resourceGroupName, String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.getStatsAsync(resourceGroupName, resourceName)
        .map(new Func1<RegistryStatisticsInner, RegistryStatistics>() {
            @Override
            public RegistryStatistics call(RegistryStatisticsInner inner) {
                return new RegistryStatisticsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IotHubSkuDescription> getValidSkusAsync(final String resourceGroupName, final String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.getValidSkusAsync(resourceGroupName, resourceName)
        .flatMapIterable(new Func1<Page<IotHubSkuDescriptionInner>, Iterable<IotHubSkuDescriptionInner>>() {
            @Override
            public Iterable<IotHubSkuDescriptionInner> call(Page<IotHubSkuDescriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IotHubSkuDescriptionInner, IotHubSkuDescription>() {
            @Override
            public IotHubSkuDescription call(IotHubSkuDescriptionInner inner) {
                return wrapIotHubSkuDescriptionModel(inner);
            }
        });
    }

    @Override
    public Observable<EventHubConsumerGroupInfo> getEventHubConsumerGroupAsync(String resourceGroupName, String resourceName, String eventHubEndpointName, String name) {
        IotHubResourcesInner client = this.inner();
        return client.getEventHubConsumerGroupAsync(resourceGroupName, resourceName, eventHubEndpointName, name)
        .map(new Func1<EventHubConsumerGroupInfoInner, EventHubConsumerGroupInfo>() {
            @Override
            public EventHubConsumerGroupInfo call(EventHubConsumerGroupInfoInner inner) {
                return wrapEventHubConsumerGroupInfoModel(inner);
            }
       });
    }

    @Override
    public Observable<EventHubConsumerGroupInfo> listEventHubConsumerGroupsAsync(final String resourceGroupName, final String resourceName, final String eventHubEndpointName) {
        IotHubResourcesInner client = this.inner();
        return client.listEventHubConsumerGroupsAsync(resourceGroupName, resourceName, eventHubEndpointName)
        .flatMapIterable(new Func1<Page<EventHubConsumerGroupInfoInner>, Iterable<EventHubConsumerGroupInfoInner>>() {
            @Override
            public Iterable<EventHubConsumerGroupInfoInner> call(Page<EventHubConsumerGroupInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventHubConsumerGroupInfoInner, EventHubConsumerGroupInfo>() {
            @Override
            public EventHubConsumerGroupInfo call(EventHubConsumerGroupInfoInner inner) {
                return wrapEventHubConsumerGroupInfoModel(inner);
            }
        });
    }

    @Override
    public Completable deleteEventHubConsumerGroupAsync(String resourceGroupName, String resourceName, String eventHubEndpointName, String name) {
        IotHubResourcesInner client = this.inner();
        return client.deleteEventHubConsumerGroupAsync(resourceGroupName, resourceName, eventHubEndpointName, name).toCompletable();
    }

    @Override
    public Observable<JobResponse> getJobAsync(String resourceGroupName, String resourceName, String jobId) {
        IotHubResourcesInner client = this.inner();
        return client.getJobAsync(resourceGroupName, resourceName, jobId)
        .map(new Func1<JobResponseInner, JobResponse>() {
            @Override
            public JobResponse call(JobResponseInner inner) {
                return wrapJobResponseModel(inner);
            }
       });
    }

    @Override
    public Observable<JobResponse> listJobsAsync(final String resourceGroupName, final String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.listJobsAsync(resourceGroupName, resourceName)
        .flatMapIterable(new Func1<Page<JobResponseInner>, Iterable<JobResponseInner>>() {
            @Override
            public Iterable<JobResponseInner> call(Page<JobResponseInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobResponseInner, JobResponse>() {
            @Override
            public JobResponse call(JobResponseInner inner) {
                return wrapJobResponseModel(inner);
            }
        });
    }

    @Override
    public Observable<IotHubQuotaMetricInfo> getQuotaMetricsAsync(final String resourceGroupName, final String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.getQuotaMetricsAsync(resourceGroupName, resourceName)
        .flatMapIterable(new Func1<Page<IotHubQuotaMetricInfoInner>, Iterable<IotHubQuotaMetricInfoInner>>() {
            @Override
            public Iterable<IotHubQuotaMetricInfoInner> call(Page<IotHubQuotaMetricInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IotHubQuotaMetricInfoInner, IotHubQuotaMetricInfo>() {
            @Override
            public IotHubQuotaMetricInfo call(IotHubQuotaMetricInfoInner inner) {
                return wrapIotHubQuotaMetricInfoModel(inner);
            }
        });
    }

    @Override
    public Observable<TestAllRoutesResult> testAllRoutesAsync(String iotHubName, String resourceGroupName, TestAllRoutesInput input) {
        IotHubResourcesInner client = this.inner();
        return client.testAllRoutesAsync(iotHubName, resourceGroupName, input)
        .map(new Func1<TestAllRoutesResultInner, TestAllRoutesResult>() {
            @Override
            public TestAllRoutesResult call(TestAllRoutesResultInner inner) {
                return new TestAllRoutesResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TestRouteResult> testRouteAsync(String iotHubName, String resourceGroupName, TestRouteInput input) {
        IotHubResourcesInner client = this.inner();
        return client.testRouteAsync(iotHubName, resourceGroupName, input)
        .map(new Func1<TestRouteResultInner, TestRouteResult>() {
            @Override
            public TestRouteResult call(TestRouteResultInner inner) {
                return new TestRouteResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SharedAccessSignatureAuthorizationRule> getKeysForKeyNameAsync(String resourceGroupName, String resourceName, String keyName) {
        IotHubResourcesInner client = this.inner();
        return client.getKeysForKeyNameAsync(resourceGroupName, resourceName, keyName)
        .map(new Func1<SharedAccessSignatureAuthorizationRuleInner, SharedAccessSignatureAuthorizationRule>() {
            @Override
            public SharedAccessSignatureAuthorizationRule call(SharedAccessSignatureAuthorizationRuleInner inner) {
                return new SharedAccessSignatureAuthorizationRuleImpl(inner, manager());
            }
        });
    }

}
