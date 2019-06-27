/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query results.
 */
public class PolicyStatesQueryResultsInner {
    /**
     * OData context string; used by OData clients to resolve type information
     * based on metadata.
     */
    @JsonProperty(value = "@odata\\.context")
    private String odatacontext;

    /**
     * OData entity count; represents the number of policy state records
     * returned.
     */
    @JsonProperty(value = "@odata\\.count")
    private Integer odatacount;

    /**
     * Query results.
     */
    @JsonProperty(value = "value")
    private List<PolicyStateInner> value;

    /**
     * Get oData context string; used by OData clients to resolve type information based on metadata.
     *
     * @return the odatacontext value
     */
    public String odatacontext() {
        return this.odatacontext;
    }

    /**
     * Set oData context string; used by OData clients to resolve type information based on metadata.
     *
     * @param odatacontext the odatacontext value to set
     * @return the PolicyStatesQueryResultsInner object itself.
     */
    public PolicyStatesQueryResultsInner withOdatacontext(String odatacontext) {
        this.odatacontext = odatacontext;
        return this;
    }

    /**
     * Get oData entity count; represents the number of policy state records returned.
     *
     * @return the odatacount value
     */
    public Integer odatacount() {
        return this.odatacount;
    }

    /**
     * Set oData entity count; represents the number of policy state records returned.
     *
     * @param odatacount the odatacount value to set
     * @return the PolicyStatesQueryResultsInner object itself.
     */
    public PolicyStatesQueryResultsInner withOdatacount(Integer odatacount) {
        this.odatacount = odatacount;
        return this;
    }

    /**
     * Get query results.
     *
     * @return the value value
     */
    public List<PolicyStateInner> value() {
        return this.value;
    }

    /**
     * Set query results.
     *
     * @param value the value value to set
     * @return the PolicyStatesQueryResultsInner object itself.
     */
    public PolicyStatesQueryResultsInner withValue(List<PolicyStateInner> value) {
        this.value = value;
        return this;
    }

}
