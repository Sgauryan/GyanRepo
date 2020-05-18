/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
public enum StatusEnum {

    // Aborted
    ABORTED("Aborted"),
    // Completed
    COMPLETED("Completed"),
    // Failed
    FAILED("Failed"),
    // Holding
    HOLDING("Holding"),
    // Preparing
    PREPARING("Preparing"),
    // Processing
    PROCESSING("Processing"),
    // Queued
    QUEUED("Queued");

    final String value;

    private StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum e : StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
