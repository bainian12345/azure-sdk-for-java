/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EventDeliverySchema.
 */
public final class EventDeliverySchema extends ExpandableStringEnum<EventDeliverySchema> {
    /** Static value EventGridSchema for EventDeliverySchema. */
    public static final EventDeliverySchema EVENT_GRID_SCHEMA = fromString("EventGridSchema");

    /** Static value InputEventSchema for EventDeliverySchema. */
    public static final EventDeliverySchema INPUT_EVENT_SCHEMA = fromString("InputEventSchema");

    /** Static value CloudEventV01Schema for EventDeliverySchema. */
    public static final EventDeliverySchema CLOUD_EVENT_V01SCHEMA = fromString("CloudEventV01Schema");

    /**
     * Creates or finds a EventDeliverySchema from its string representation.
     * @param name a name to look for
     * @return the corresponding EventDeliverySchema
     */
    @JsonCreator
    public static EventDeliverySchema fromString(String name) {
        return fromString(name, EventDeliverySchema.class);
    }

    /**
     * @return known EventDeliverySchema values
     */
    public static Collection<EventDeliverySchema> values() {
        return values(EventDeliverySchema.class);
    }
}