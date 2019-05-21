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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Operation status extended info for the job list.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationStatusJobsExtendedInfo")
public class OperationStatusJobsExtendedInfo extends OperationStatusExtendedInfo {
    /**
     * IDs of the jobs created for the backup item.
     */
    @JsonProperty(value = "jobIds")
    private List<String> jobIds;

    /**
     * Stores all the failed jobs along with the corresponding error codes.
     */
    @JsonProperty(value = "failedJobsError")
    private Map<String, String> failedJobsError;

    /**
     * Get iDs of the jobs created for the backup item.
     *
     * @return the jobIds value
     */
    public List<String> jobIds() {
        return this.jobIds;
    }

    /**
     * Set iDs of the jobs created for the backup item.
     *
     * @param jobIds the jobIds value to set
     * @return the OperationStatusJobsExtendedInfo object itself.
     */
    public OperationStatusJobsExtendedInfo withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    /**
     * Get stores all the failed jobs along with the corresponding error codes.
     *
     * @return the failedJobsError value
     */
    public Map<String, String> failedJobsError() {
        return this.failedJobsError;
    }

    /**
     * Set stores all the failed jobs along with the corresponding error codes.
     *
     * @param failedJobsError the failedJobsError value to set
     * @return the OperationStatusJobsExtendedInfo object itself.
     */
    public OperationStatusJobsExtendedInfo withFailedJobsError(Map<String, String> failedJobsError) {
        this.failedJobsError = failedJobsError;
        return this;
    }

}
