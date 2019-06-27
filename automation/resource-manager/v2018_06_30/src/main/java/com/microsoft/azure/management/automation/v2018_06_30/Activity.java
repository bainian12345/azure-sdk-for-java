/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Definition of the activity.
 */
@JsonFlatten
public class Activity {
    /**
     * Gets or sets the id of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Gets the name of the activity.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets or sets the user name of the activity.
     */
    @JsonProperty(value = "properties.definition")
    private String definition;

    /**
     * Gets or sets the parameter sets of the activity.
     */
    @JsonProperty(value = "properties.parameterSets")
    private List<ActivityParameterSet> parameterSets;

    /**
     * Gets or sets the output types of the activity.
     */
    @JsonProperty(value = "properties.outputTypes")
    private List<ActivityOutputType> outputTypes;

    /**
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get gets or sets the id of the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set gets or sets the id of the resource.
     *
     * @param id the id value to set
     * @return the Activity object itself.
     */
    public Activity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get gets the name of the activity.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get gets or sets the user name of the activity.
     *
     * @return the definition value
     */
    public String definition() {
        return this.definition;
    }

    /**
     * Set gets or sets the user name of the activity.
     *
     * @param definition the definition value to set
     * @return the Activity object itself.
     */
    public Activity withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get gets or sets the parameter sets of the activity.
     *
     * @return the parameterSets value
     */
    public List<ActivityParameterSet> parameterSets() {
        return this.parameterSets;
    }

    /**
     * Set gets or sets the parameter sets of the activity.
     *
     * @param parameterSets the parameterSets value to set
     * @return the Activity object itself.
     */
    public Activity withParameterSets(List<ActivityParameterSet> parameterSets) {
        this.parameterSets = parameterSets;
        return this;
    }

    /**
     * Get gets or sets the output types of the activity.
     *
     * @return the outputTypes value
     */
    public List<ActivityOutputType> outputTypes() {
        return this.outputTypes;
    }

    /**
     * Set gets or sets the output types of the activity.
     *
     * @param outputTypes the outputTypes value to set
     * @return the Activity object itself.
     */
    public Activity withOutputTypes(List<ActivityOutputType> outputTypes) {
        this.outputTypes = outputTypes;
        return this;
    }

    /**
     * Get gets or sets the creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set
     * @return the Activity object itself.
     */
    public Activity withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get gets or sets the last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the Activity object itself.
     */
    public Activity withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get gets or sets the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description.
     *
     * @param description the description value to set
     * @return the Activity object itself.
     */
    public Activity withDescription(String description) {
        this.description = description;
        return this;
    }

}
