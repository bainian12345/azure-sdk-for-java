/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is used to express the source of an input schema mapping for a single
 * target field in the Event Grid Event schema. This is currently used in the
 * mappings for the 'id','topic' and 'eventTime' properties. This represents a
 * field in the input event schema.
 */
public class JsonField {
    /**
     * Name of a field in the input event schema that's to be used as the
     * source of a mapping.
     */
    @JsonProperty(value = "sourceField")
    private String sourceField;

    /**
     * Get name of a field in the input event schema that's to be used as the source of a mapping.
     *
     * @return the sourceField value
     */
    public String sourceField() {
        return this.sourceField;
    }

    /**
     * Set name of a field in the input event schema that's to be used as the source of a mapping.
     *
     * @param sourceField the sourceField value to set
     * @return the JsonField object itself.
     */
    public JsonField withSourceField(String sourceField) {
        this.sourceField = sourceField;
        return this;
    }

}
