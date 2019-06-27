/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A user Account for RDP or SSH access on a Compute Node.
 */
public class ComputeNodeUser {
    /**
     * The user name of the Account.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Whether the Account should be an administrator on the Compute Node.
     * The default value is false.
     */
    @JsonProperty(value = "isAdmin")
    private Boolean isAdmin;

    /**
     * The time at which the Account should expire.
     * If omitted, the default is 1 day from the current time. For Linux
     * Compute Nodes, the expiryTime has a precision up to a day.
     */
    @JsonProperty(value = "expiryTime")
    private DateTime expiryTime;

    /**
     * The password of the Account.
     * The password is required for Windows Compute Nodes (those created with
     * 'cloudServiceConfiguration', or created with
     * 'virtualMachineConfiguration' using a Windows Image reference). For
     * Linux Compute Nodes, the password can optionally be specified along with
     * the sshPublicKey property.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * The SSH public key that can be used for remote login to the Compute
     * Node.
     * The public key should be compatible with OpenSSH encoding and should be
     * base 64 encoded. This property can be specified only for Linux Compute
     * Nodes. If this is specified for a Windows Compute Node, then the Batch
     * service rejects the request; if you are calling the REST API directly,
     * the HTTP status code is 400 (Bad Request).
     */
    @JsonProperty(value = "sshPublicKey")
    private String sshPublicKey;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the default value is false.
     *
     * @return the isAdmin value
     */
    public Boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Set the default value is false.
     *
     * @param isAdmin the isAdmin value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * Get if omitted, the default is 1 day from the current time. For Linux Compute Nodes, the expiryTime has a precision up to a day.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set if omitted, the default is 1 day from the current time. For Linux Compute Nodes, the expiryTime has a precision up to a day.
     *
     * @param expiryTime the expiryTime value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withExpiryTime(DateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the password is required for Windows Compute Nodes (those created with 'cloudServiceConfiguration', or created with 'virtualMachineConfiguration' using a Windows Image reference). For Linux Compute Nodes, the password can optionally be specified along with the sshPublicKey property.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password is required for Windows Compute Nodes (those created with 'cloudServiceConfiguration', or created with 'virtualMachineConfiguration' using a Windows Image reference). For Linux Compute Nodes, the password can optionally be specified along with the sshPublicKey property.
     *
     * @param password the password value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the public key should be compatible with OpenSSH encoding and should be base 64 encoded. This property can be specified only for Linux Compute Nodes. If this is specified for a Windows Compute Node, then the Batch service rejects the request; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the sshPublicKey value
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the public key should be compatible with OpenSSH encoding and should be base 64 encoded. This property can be specified only for Linux Compute Nodes. If this is specified for a Windows Compute Node, then the Batch service rejects the request; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param sshPublicKey the sshPublicKey value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

}
