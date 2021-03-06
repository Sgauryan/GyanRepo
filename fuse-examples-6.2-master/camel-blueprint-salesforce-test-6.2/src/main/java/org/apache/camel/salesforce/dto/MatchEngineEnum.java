/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MatchEngine
 */
public enum MatchEngineEnum {

    // ExactMatchEngine
    EXACTMATCHENGINE("ExactMatchEngine"),
    // FuzzyMatchEngine
    FUZZYMATCHENGINE("FuzzyMatchEngine");

    final String value;

    private MatchEngineEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MatchEngineEnum fromValue(String value) {
        for (MatchEngineEnum e : MatchEngineEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
