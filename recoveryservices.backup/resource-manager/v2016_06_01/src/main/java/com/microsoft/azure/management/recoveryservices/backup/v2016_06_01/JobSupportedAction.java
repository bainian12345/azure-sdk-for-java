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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobSupportedAction.
 */
public enum JobSupportedAction {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value Cancellable. */
    CANCELLABLE("Cancellable"),

    /** Enum value Retriable. */
    RETRIABLE("Retriable");

    /** The actual serialized value for a JobSupportedAction instance. */
    private String value;

    JobSupportedAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobSupportedAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobSupportedAction object, or null if unable to parse.
     */
    @JsonCreator
    public static JobSupportedAction fromString(String value) {
        JobSupportedAction[] items = JobSupportedAction.values();
        for (JobSupportedAction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
