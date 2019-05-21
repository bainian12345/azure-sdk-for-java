/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Output for the task that migrates MySQL databases to Azure Database for
 * MySQL for online migrations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrateMySqlAzureDbForMySqlSyncTaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DatabaseLevelErrorOutput", value = MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError.class),
    @JsonSubTypes.Type(name = "ErrorOutput", value = MigrateMySqlAzureDbForMySqlSyncTaskOutputError.class),
    @JsonSubTypes.Type(name = "TableLevelOutput", value = MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevel.class),
    @JsonSubTypes.Type(name = "DatabaseLevelOutput", value = MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "MigrationLevelOutput", value = MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel.class)
})
public class MigrateMySqlAzureDbForMySqlSyncTaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
