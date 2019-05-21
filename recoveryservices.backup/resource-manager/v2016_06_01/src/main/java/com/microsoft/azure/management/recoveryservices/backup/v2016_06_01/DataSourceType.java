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
 * Defines values for DataSourceType.
 */
public enum DataSourceType {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value VM. */
    VM("VM"),

    /** Enum value FileFolder. */
    FILE_FOLDER("FileFolder"),

    /** Enum value AzureSqlDb. */
    AZURE_SQL_DB("AzureSqlDb"),

    /** Enum value SQLDB. */
    SQLDB("SQLDB"),

    /** Enum value Exchange. */
    EXCHANGE("Exchange"),

    /** Enum value Sharepoint. */
    SHAREPOINT("Sharepoint"),

    /** Enum value DPMUnknown. */
    DPMUNKNOWN("DPMUnknown");

    /** The actual serialized value for a DataSourceType instance. */
    private String value;

    DataSourceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataSourceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataSourceType object, or null if unable to parse.
     */
    @JsonCreator
    public static DataSourceType fromString(String value) {
        DataSourceType[] items = DataSourceType.values();
        for (DataSourceType item : items) {
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
