/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist JobType
 */
public enum JobTypeEnum {

    // ApexToken
    APEXTOKEN("ApexToken"),
    // BatchApex
    BATCHAPEX("BatchApex"),
    // BatchApexWorker
    BATCHAPEXWORKER("BatchApexWorker"),
    // Future
    FUTURE("Future"),
    // Queueable
    QUEUEABLE("Queueable"),
    // ScheduledApex
    SCHEDULEDAPEX("ScheduledApex"),
    // SharingRecalculation
    SHARINGRECALCULATION("SharingRecalculation"),
    // TestRequest
    TESTREQUEST("TestRequest"),
    // TestWorker
    TESTWORKER("TestWorker");

    final String value;

    private JobTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static JobTypeEnum fromValue(String value) {
        for (JobTypeEnum e : JobTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
