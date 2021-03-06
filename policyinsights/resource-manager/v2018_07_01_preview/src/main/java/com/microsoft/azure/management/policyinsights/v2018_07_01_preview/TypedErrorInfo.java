/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scenario specific error details.
 */
public class TypedErrorInfo {
    /**
     * The type of included error details.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The scenario specific error details.
     */
    @JsonProperty(value = "info", access = JsonProperty.Access.WRITE_ONLY)
    private Object info;

    /**
     * Get the type of included error details.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the scenario specific error details.
     *
     * @return the info value
     */
    public Object info() {
        return this.info;
    }

}
