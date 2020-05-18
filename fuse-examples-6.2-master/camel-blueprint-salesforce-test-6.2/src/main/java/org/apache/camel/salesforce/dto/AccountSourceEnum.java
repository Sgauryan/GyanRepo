/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccountSource
 */
public enum AccountSourceEnum {

    // Other
    OTHER("Other"),
    // Partner Referral
    PARTNER_REFERRAL("Partner Referral"),
    // Phone Inquiry
    PHONE_INQUIRY("Phone Inquiry"),
    // Purchased List
    PURCHASED_LIST("Purchased List"),
    // Web
    WEB("Web");

    final String value;

    private AccountSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccountSourceEnum fromValue(String value) {
        for (AccountSourceEnum e : AccountSourceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
