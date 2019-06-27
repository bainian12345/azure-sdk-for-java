/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for removing Compute Nodes from a Pool.
 */
public class NodeRemoveParameter {
    /**
     * A list containing the IDs of the Compute Nodes to be removed from the
     * specified Pool.
     */
    @JsonProperty(value = "nodeList", required = true)
    private List<String> nodeList;

    /**
     * The timeout for removal of Compute Nodes to the Pool.
     * The default value is 15 minutes. The minimum value is 5 minutes. If you
     * specify a value less than 5 minutes, the Batch service returns an error;
     * if you are calling the REST API directly, the HTTP status code is 400
     * (Bad Request).
     */
    @JsonProperty(value = "resizeTimeout")
    private Period resizeTimeout;

    /**
     * Determines what to do with a Compute Node and its running task(s) after
     * it has been selected for deallocation.
     * The default value is requeue. Possible values include: 'requeue',
     * 'terminate', 'taskCompletion', 'retainedData'.
     */
    @JsonProperty(value = "nodeDeallocationOption")
    private ComputeNodeDeallocationOption nodeDeallocationOption;

    /**
     * Get the nodeList value.
     *
     * @return the nodeList value
     */
    public List<String> nodeList() {
        return this.nodeList;
    }

    /**
     * Set the nodeList value.
     *
     * @param nodeList the nodeList value to set
     * @return the NodeRemoveParameter object itself.
     */
    public NodeRemoveParameter withNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    /**
     * Get the default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value
     */
    public Period resizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set
     * @return the NodeRemoveParameter object itself.
     */
    public NodeRemoveParameter withResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion', 'retainedData'.
     *
     * @return the nodeDeallocationOption value
     */
    public ComputeNodeDeallocationOption nodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion', 'retainedData'.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set
     * @return the NodeRemoveParameter object itself.
     */
    public NodeRemoveParameter withNodeDeallocationOption(ComputeNodeDeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        return this;
    }

}
