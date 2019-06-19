/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.CertificateInformationInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Custom hostname configuration.
 */
public class HostnameConfigurationOld {
    /**
     * Hostname type. Possible values include: 'Proxy', 'Portal', 'Management',
     * 'Scm'.
     */
    @JsonProperty(value = "type", required = true)
    private HostnameType type;

    /**
     * Hostname to configure.
     */
    @JsonProperty(value = "hostname", required = true)
    private String hostname;

    /**
     * Certificate information.
     */
    @JsonProperty(value = "certificate", required = true)
    private CertificateInformationInner certificate;

    /**
     * Get hostname type. Possible values include: 'Proxy', 'Portal', 'Management', 'Scm'.
     *
     * @return the type value
     */
    public HostnameType type() {
        return this.type;
    }

    /**
     * Set hostname type. Possible values include: 'Proxy', 'Portal', 'Management', 'Scm'.
     *
     * @param type the type value to set
     * @return the HostnameConfigurationOld object itself.
     */
    public HostnameConfigurationOld withType(HostnameType type) {
        this.type = type;
        return this;
    }

    /**
     * Get hostname to configure.
     *
     * @return the hostname value
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set hostname to configure.
     *
     * @param hostname the hostname value to set
     * @return the HostnameConfigurationOld object itself.
     */
    public HostnameConfigurationOld withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get certificate information.
     *
     * @return the certificate value
     */
    public CertificateInformationInner certificate() {
        return this.certificate;
    }

    /**
     * Set certificate information.
     *
     * @param certificate the certificate value to set
     * @return the HostnameConfigurationOld object itself.
     */
    public HostnameConfigurationOld withCertificate(CertificateInformationInner certificate) {
        this.certificate = certificate;
        return this;
    }

}
