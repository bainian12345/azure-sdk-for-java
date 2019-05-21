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
 * Input for command that completes online migration for an Azure SQL Database
 * Managed Instance.
 */
public class MigrateMISyncCompleteCommandInput {
    /**
     * Name of managed instance database.
     */
    @JsonProperty(value = "sourceDatabaseName", required = true)
    private String sourceDatabaseName;

    /**
     * Get name of managed instance database.
     *
     * @return the sourceDatabaseName value
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Set name of managed instance database.
     *
     * @param sourceDatabaseName the sourceDatabaseName value to set
     * @return the MigrateMISyncCompleteCommandInput object itself.
     */
    public MigrateMISyncCompleteCommandInput withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

}
