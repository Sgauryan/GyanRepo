/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MobileSessionTimeout
 */
public enum MobileSessionTimeoutEnum {

    // 1
    _1("1"),
    // 10
    _10("10"),
    // 30
    _30("30"),
    // 5
    _5("5");

    final String value;

    private MobileSessionTimeoutEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MobileSessionTimeoutEnum fromValue(String value) {
        for (MobileSessionTimeoutEnum e : MobileSessionTimeoutEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
