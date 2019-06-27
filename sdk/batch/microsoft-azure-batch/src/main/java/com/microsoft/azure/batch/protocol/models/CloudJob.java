/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Azure Batch Job.
 */
public class CloudJob {
    /**
     * A string that uniquely identifies the Job within the Account.
     * The ID is case-preserving and case-insensitive (that is, you may not
     * have two IDs within an Account that differ only by case).
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The display name for the Job.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Whether Tasks in the Job can define dependencies on each other. The
     * default is false.
     */
    @JsonProperty(value = "usesTaskDependencies")
    private Boolean usesTaskDependencies;

    /**
     * The URL of the Job.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The ETag of the Job.
     * This is an opaque string. You can use it to detect whether the Job has
     * changed between requests. In particular, you can be pass the ETag when
     * updating a Job to specify that your changes should take effect only if
     * nobody else has modified the Job in the meantime.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The last modified time of the Job.
     * This is the last time at which the Job level data, such as the Job state
     * or priority, changed. It does not factor in task-level changes such as
     * adding new Tasks or Tasks changing state.
     */
    @JsonProperty(value = "lastModified")
    private DateTime lastModified;

    /**
     * The creation time of the Job.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * The current state of the Job.
     * Possible values include: 'active', 'disabling', 'disabled', 'enabling',
     * 'terminating', 'completed', 'deleting'.
     */
    @JsonProperty(value = "state")
    private JobState state;

    /**
     * The time at which the Job entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private DateTime stateTransitionTime;

    /**
     * The previous state of the Job.
     * This property is not set if the Job is in its initial Active state.
     * Possible values include: 'active', 'disabling', 'disabled', 'enabling',
     * 'terminating', 'completed', 'deleting'.
     */
    @JsonProperty(value = "previousState")
    private JobState previousState;

    /**
     * The time at which the Job entered its previous state.
     * This property is not set if the Job is in its initial Active state.
     */
    @JsonProperty(value = "previousStateTransitionTime")
    private DateTime previousStateTransitionTime;

    /**
     * The priority of the Job.
     * Priority values can range from -1000 to 1000, with -1000 being the
     * lowest priority and 1000 being the highest priority. The default value
     * is 0.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * The execution constraints for the Job.
     */
    @JsonProperty(value = "constraints")
    private JobConstraints constraints;

    /**
     * Details of a Job Manager Task to be launched when the Job is started.
     */
    @JsonProperty(value = "jobManagerTask")
    private JobManagerTask jobManagerTask;

    /**
     * The Job Preparation Task.
     * The Job Preparation Task is a special Task run on each Compute Node
     * before any other Task of the Job.
     */
    @JsonProperty(value = "jobPreparationTask")
    private JobPreparationTask jobPreparationTask;

    /**
     * The Job Release Task.
     * The Job Release Task is a special Task run at the end of the Job on each
     * Compute Node that has run any other Task of the Job.
     */
    @JsonProperty(value = "jobReleaseTask")
    private JobReleaseTask jobReleaseTask;

    /**
     * The list of common environment variable settings. These environment
     * variables are set for all Tasks in the Job (including the Job Manager,
     * Job Preparation and Job Release Tasks).
     * Individual Tasks can override an environment setting specified here by
     * specifying the same setting name with a different value.
     */
    @JsonProperty(value = "commonEnvironmentSettings")
    private List<EnvironmentSetting> commonEnvironmentSettings;

    /**
     * The Pool settings associated with the Job.
     */
    @JsonProperty(value = "poolInfo")
    private PoolInformation poolInfo;

    /**
     * The action the Batch service should take when all Tasks in the Job are
     * in the completed state.
     * The default is noaction. Possible values include: 'noAction',
     * 'terminateJob'.
     */
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllTasksComplete onAllTasksComplete;

    /**
     * The action the Batch service should take when any Task in the Job fails.
     * A Task is considered to have failed if has a failureInfo. A failureInfo
     * is set if the Task completes with a non-zero exit code after exhausting
     * its retry count, or if there was an error starting the Task, for example
     * due to a resource file download error. The default is noaction. Possible
     * values include: 'noAction', 'performExitOptionsJobAction'.
     */
    @JsonProperty(value = "onTaskFailure")
    private OnTaskFailure onTaskFailure;

    /**
     * The network configuration for the Job.
     */
    @JsonProperty(value = "networkConfiguration")
    private JobNetworkConfiguration networkConfiguration;

    /**
     * A list of name-value pairs associated with the Job as metadata.
     * The Batch service does not assign any meaning to metadata; it is solely
     * for the use of user code.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * The execution information for the Job.
     */
    @JsonProperty(value = "executionInfo")
    private JobExecutionInformation executionInfo;

    /**
     * Resource usage statistics for the entire lifetime of the Job.
     * This property is populated only if the CloudJob was retrieved with an
     * expand clause including the 'stats' attribute; otherwise it is null. The
     * statistics may not be immediately available. The Batch service performs
     * periodic roll-up of statistics. The typical delay is about 30 minutes.
     */
    @JsonProperty(value = "stats")
    private JobStatistics stats;

    /**
     * Get the ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account that differ only by case).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account that differ only by case).
     *
     * @param id the id value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the usesTaskDependencies value.
     *
     * @return the usesTaskDependencies value
     */
    public Boolean usesTaskDependencies() {
        return this.usesTaskDependencies;
    }

    /**
     * Set the usesTaskDependencies value.
     *
     * @param usesTaskDependencies the usesTaskDependencies value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withUsesTaskDependencies(Boolean usesTaskDependencies) {
        this.usesTaskDependencies = usesTaskDependencies;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get this is an opaque string. You can use it to detect whether the Job has changed between requests. In particular, you can be pass the ETag when updating a Job to specify that your changes should take effect only if nobody else has modified the Job in the meantime.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set this is an opaque string. You can use it to detect whether the Job has changed between requests. In particular, you can be pass the ETag when updating a Job to specify that your changes should take effect only if nobody else has modified the Job in the meantime.
     *
     * @param eTag the eTag value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get this is the last time at which the Job level data, such as the Job state or priority, changed. It does not factor in task-level changes such as adding new Tasks or Tasks changing state.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set this is the last time at which the Job level data, such as the Job state or priority, changed. It does not factor in task-level changes such as adding new Tasks or Tasks changing state.
     *
     * @param lastModified the lastModified value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get possible values include: 'active', 'disabling', 'disabled', 'enabling', 'terminating', 'completed', 'deleting'.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Set possible values include: 'active', 'disabling', 'disabled', 'enabling', 'terminating', 'completed', 'deleting'.
     *
     * @param state the state value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withState(JobState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get this property is not set if the Job is in its initial Active state. Possible values include: 'active', 'disabling', 'disabled', 'enabling', 'terminating', 'completed', 'deleting'.
     *
     * @return the previousState value
     */
    public JobState previousState() {
        return this.previousState;
    }

    /**
     * Set this property is not set if the Job is in its initial Active state. Possible values include: 'active', 'disabling', 'disabled', 'enabling', 'terminating', 'completed', 'deleting'.
     *
     * @param previousState the previousState value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withPreviousState(JobState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get this property is not set if the Job is in its initial Active state.
     *
     * @return the previousStateTransitionTime value
     */
    public DateTime previousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Set this property is not set if the Job is in its initial Active state.
     *
     * @param previousStateTransitionTime the previousStateTransitionTime value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withPreviousStateTransitionTime(DateTime previousStateTransitionTime) {
        this.previousStateTransitionTime = previousStateTransitionTime;
        return this;
    }

    /**
     * Get priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @param priority the priority value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public JobConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the jobManagerTask value.
     *
     * @return the jobManagerTask value
     */
    public JobManagerTask jobManagerTask() {
        return this.jobManagerTask;
    }

    /**
     * Set the jobManagerTask value.
     *
     * @param jobManagerTask the jobManagerTask value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withJobManagerTask(JobManagerTask jobManagerTask) {
        this.jobManagerTask = jobManagerTask;
        return this;
    }

    /**
     * Get the Job Preparation Task is a special Task run on each Compute Node before any other Task of the Job.
     *
     * @return the jobPreparationTask value
     */
    public JobPreparationTask jobPreparationTask() {
        return this.jobPreparationTask;
    }

    /**
     * Set the Job Preparation Task is a special Task run on each Compute Node before any other Task of the Job.
     *
     * @param jobPreparationTask the jobPreparationTask value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withJobPreparationTask(JobPreparationTask jobPreparationTask) {
        this.jobPreparationTask = jobPreparationTask;
        return this;
    }

    /**
     * Get the Job Release Task is a special Task run at the end of the Job on each Compute Node that has run any other Task of the Job.
     *
     * @return the jobReleaseTask value
     */
    public JobReleaseTask jobReleaseTask() {
        return this.jobReleaseTask;
    }

    /**
     * Set the Job Release Task is a special Task run at the end of the Job on each Compute Node that has run any other Task of the Job.
     *
     * @param jobReleaseTask the jobReleaseTask value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withJobReleaseTask(JobReleaseTask jobReleaseTask) {
        this.jobReleaseTask = jobReleaseTask;
        return this;
    }

    /**
     * Get individual Tasks can override an environment setting specified here by specifying the same setting name with a different value.
     *
     * @return the commonEnvironmentSettings value
     */
    public List<EnvironmentSetting> commonEnvironmentSettings() {
        return this.commonEnvironmentSettings;
    }

    /**
     * Set individual Tasks can override an environment setting specified here by specifying the same setting name with a different value.
     *
     * @param commonEnvironmentSettings the commonEnvironmentSettings value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withCommonEnvironmentSettings(List<EnvironmentSetting> commonEnvironmentSettings) {
        this.commonEnvironmentSettings = commonEnvironmentSettings;
        return this;
    }

    /**
     * Get the poolInfo value.
     *
     * @return the poolInfo value
     */
    public PoolInformation poolInfo() {
        return this.poolInfo;
    }

    /**
     * Set the poolInfo value.
     *
     * @param poolInfo the poolInfo value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withPoolInfo(PoolInformation poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get the default is noaction. Possible values include: 'noAction', 'terminateJob'.
     *
     * @return the onAllTasksComplete value
     */
    public OnAllTasksComplete onAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set the default is noaction. Possible values include: 'noAction', 'terminateJob'.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withOnAllTasksComplete(OnAllTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

    /**
     * Get a Task is considered to have failed if has a failureInfo. A failureInfo is set if the Task completes with a non-zero exit code after exhausting its retry count, or if there was an error starting the Task, for example due to a resource file download error. The default is noaction. Possible values include: 'noAction', 'performExitOptionsJobAction'.
     *
     * @return the onTaskFailure value
     */
    public OnTaskFailure onTaskFailure() {
        return this.onTaskFailure;
    }

    /**
     * Set a Task is considered to have failed if has a failureInfo. A failureInfo is set if the Task completes with a non-zero exit code after exhausting its retry count, or if there was an error starting the Task, for example due to a resource file download error. The default is noaction. Possible values include: 'noAction', 'performExitOptionsJobAction'.
     *
     * @param onTaskFailure the onTaskFailure value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withOnTaskFailure(OnTaskFailure onTaskFailure) {
        this.onTaskFailure = onTaskFailure;
        return this;
    }

    /**
     * Get the networkConfiguration value.
     *
     * @return the networkConfiguration value
     */
    public JobNetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration value.
     *
     * @param networkConfiguration the networkConfiguration value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withNetworkConfiguration(JobNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the executionInfo value.
     *
     * @return the executionInfo value
     */
    public JobExecutionInformation executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set the executionInfo value.
     *
     * @param executionInfo the executionInfo value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withExecutionInfo(JobExecutionInformation executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

    /**
     * Get this property is populated only if the CloudJob was retrieved with an expand clause including the 'stats' attribute; otherwise it is null. The statistics may not be immediately available. The Batch service performs periodic roll-up of statistics. The typical delay is about 30 minutes.
     *
     * @return the stats value
     */
    public JobStatistics stats() {
        return this.stats;
    }

    /**
     * Set this property is populated only if the CloudJob was retrieved with an expand clause including the 'stats' attribute; otherwise it is null. The statistics may not be immediately available. The Batch service performs periodic roll-up of statistics. The typical delay is about 30 minutes.
     *
     * @param stats the stats value to set
     * @return the CloudJob object itself.
     */
    public CloudJob withStats(JobStatistics stats) {
        this.stats = stats;
        return this;
    }

}
