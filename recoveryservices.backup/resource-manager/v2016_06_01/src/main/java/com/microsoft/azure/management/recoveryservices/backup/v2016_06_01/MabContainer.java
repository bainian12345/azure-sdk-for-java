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
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectionContainerInner;

/**
 * The container associated with items backed up using Azure Backup Server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableObjectType")
@JsonTypeName("MABWindowsContainer")
public class MabContainer extends ProtectionContainerInner {
    /**
     * The container can be registered one more time.
     */
    @JsonProperty(value = "canReRegister")
    private Boolean canReRegister;

    /**
     * The ID for the container.
     */
    @JsonProperty(value = "containerId")
    private Long containerId;

    /**
     * The number of backup items in the container.
     */
    @JsonProperty(value = "protectedItemCount")
    private Long protectedItemCount;

    /**
     * The version of the agent used with this container.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /**
     * Additional information for the container.
     */
    @JsonProperty(value = "extendedInfo")
    private MabContainerExtendedInfo extendedInfo;

    /**
     * Get the container can be registered one more time.
     *
     * @return the canReRegister value
     */
    public Boolean canReRegister() {
        return this.canReRegister;
    }

    /**
     * Set the container can be registered one more time.
     *
     * @param canReRegister the canReRegister value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withCanReRegister(Boolean canReRegister) {
        this.canReRegister = canReRegister;
        return this;
    }

    /**
     * Get the ID for the container.
     *
     * @return the containerId value
     */
    public Long containerId() {
        return this.containerId;
    }

    /**
     * Set the ID for the container.
     *
     * @param containerId the containerId value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withContainerId(Long containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get the number of backup items in the container.
     *
     * @return the protectedItemCount value
     */
    public Long protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set the number of backup items in the container.
     *
     * @param protectedItemCount the protectedItemCount value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withProtectedItemCount(Long protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

    /**
     * Get the version of the agent used with this container.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the version of the agent used with this container.
     *
     * @param agentVersion the agentVersion value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get additional information for the container.
     *
     * @return the extendedInfo value
     */
    public MabContainerExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information for the container.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the MabContainer object itself.
     */
    public MabContainer withExtendedInfo(MabContainerExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
