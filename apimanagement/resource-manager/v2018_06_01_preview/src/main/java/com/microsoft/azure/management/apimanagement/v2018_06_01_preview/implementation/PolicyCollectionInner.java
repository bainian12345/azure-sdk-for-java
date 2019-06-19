/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response of the list policy operation.
 */
public class PolicyCollectionInner {
    /**
     * Policy Contract value.
     */
    @JsonProperty(value = "value")
    private List<PolicyContractInner> value;

    /**
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get policy Contract value.
     *
     * @return the value value
     */
    public List<PolicyContractInner> value() {
        return this.value;
    }

    /**
     * Set policy Contract value.
     *
     * @param value the value value to set
     * @return the PolicyCollectionInner object itself.
     */
    public PolicyCollectionInner withValue(List<PolicyContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get next page link if any.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set next page link if any.
     *
     * @param nextLink the nextLink value to set
     * @return the PolicyCollectionInner object itself.
     */
    public PolicyCollectionInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
