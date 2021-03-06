/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents a task which is actually a workflow so that one can
 * navigate to its individual drill down.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("JobTaskDetails")
public class JobTaskDetails extends TaskTypeDetails {
    /**
     * The job entity.
     */
    @JsonProperty(value = "jobTask")
    private JobEntity jobTask;

    /**
     * Get the job entity.
     *
     * @return the jobTask value
     */
    public JobEntity jobTask() {
        return this.jobTask;
    }

    /**
     * Set the job entity.
     *
     * @param jobTask the jobTask value to set
     * @return the JobTaskDetails object itself.
     */
    public JobTaskDetails withJobTask(JobEntity jobTask) {
        this.jobTask = jobTask;
        return this;
    }

}
