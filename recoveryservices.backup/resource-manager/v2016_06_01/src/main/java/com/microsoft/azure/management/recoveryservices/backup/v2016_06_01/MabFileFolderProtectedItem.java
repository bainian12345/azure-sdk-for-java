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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectedItemInner;

/**
 * This is a file or folder workload-specific backup item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("MabFileFolderProtectedItem")
public class MabFileFolderProtectedItem extends ProtectedItemInner {
    /**
     * The friendly name of this backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The name of the computer associated with this backup item.
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /**
     * The status of last backup operation.
     */
    @JsonProperty(value = "lastBackupStatus")
    private String lastBackupStatus;

    /**
     * The states for this property are: Protected, ProtectionStopped,
     * IRPending, or ProtectionError.
     */
    @JsonProperty(value = "protectionState")
    private String protectionState;

    /**
     * The isScheduledForDeferredDelete property.
     */
    @JsonProperty(value = "isScheduledForDeferredDelete")
    private Boolean isScheduledForDeferredDelete;

    /**
     * Additional information for this backup item.
     */
    @JsonProperty(value = "extendedInfo")
    private MabFileFolderProtectedItemExtendedInfo extendedInfo;

    /**
     * Get the friendly name of this backup item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name of this backup item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the name of the computer associated with this backup item.
     *
     * @return the computerName value
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set the name of the computer associated with this backup item.
     *
     * @param computerName the computerName value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get the status of last backup operation.
     *
     * @return the lastBackupStatus value
     */
    public String lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set the status of last backup operation.
     *
     * @param lastBackupStatus the lastBackupStatus value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withLastBackupStatus(String lastBackupStatus) {
        this.lastBackupStatus = lastBackupStatus;
        return this;
    }

    /**
     * Get the states for this property are: Protected, ProtectionStopped, IRPending, or ProtectionError.
     *
     * @return the protectionState value
     */
    public String protectionState() {
        return this.protectionState;
    }

    /**
     * Set the states for this property are: Protected, ProtectionStopped, IRPending, or ProtectionError.
     *
     * @param protectionState the protectionState value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withProtectionState(String protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get the isScheduledForDeferredDelete value.
     *
     * @return the isScheduledForDeferredDelete value
     */
    public Boolean isScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete;
    }

    /**
     * Set the isScheduledForDeferredDelete value.
     *
     * @param isScheduledForDeferredDelete the isScheduledForDeferredDelete value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        return this;
    }

    /**
     * Get additional information for this backup item.
     *
     * @return the extendedInfo value
     */
    public MabFileFolderProtectedItemExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information for this backup item.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withExtendedInfo(MabFileFolderProtectedItemExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
