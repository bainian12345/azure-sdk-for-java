/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database migration errors for online migration.
 */
public class SyncMigrationDatabaseErrorEvent {
    /**
     * String value of timestamp.
     */
    @JsonProperty(value = "timestampString", access = JsonProperty.Access.WRITE_ONLY)
    private String timestampString;

    /**
     * Event type.
     */
    @JsonProperty(value = "eventTypeString", access = JsonProperty.Access.WRITE_ONLY)
    private String eventTypeString;

    /**
     * Event text.
     */
    @JsonProperty(value = "eventText", access = JsonProperty.Access.WRITE_ONLY)
    private String eventText;

    /**
     * Get string value of timestamp.
     *
     * @return the timestampString value
     */
    public String timestampString() {
        return this.timestampString;
    }

    /**
     * Get event type.
     *
     * @return the eventTypeString value
     */
    public String eventTypeString() {
        return this.eventTypeString;
    }

    /**
     * Get event text.
     *
     * @return the eventText value
     */
    public String eventText() {
        return this.eventText;
    }

}
