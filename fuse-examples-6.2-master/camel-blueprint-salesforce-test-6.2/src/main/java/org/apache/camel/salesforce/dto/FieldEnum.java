/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
public enum FieldEnum {

    // Account
    ACCOUNT("Account"),
    // Amount
    AMOUNT("Amount"),
    // Campaign
    CAMPAIGN("Campaign"),
    // CloseDate
    CLOSEDATE("CloseDate"),
    // Contract
    CONTRACT("Contract"),
    // CurrentGenerators__c
    CURRENTGENERATORS__C("CurrentGenerators__c"),
    // DeliveryInstallationStatus__c
    DELIVERYINSTALLATIONSTATUS__C("DeliveryInstallationStatus__c"),
    // Description
    DESCRIPTION("Description"),
    // ForecastCategoryName
    FORECASTCATEGORYNAME("ForecastCategoryName"),
    // IsPrivate
    ISPRIVATE("IsPrivate"),
    // LeadSource
    LEADSOURCE("LeadSource"),
    // MainCompetitors__c
    MAINCOMPETITORS__C("MainCompetitors__c"),
    // Name
    NAME("Name"),
    // NextStep
    NEXTSTEP("NextStep"),
    // OrderNumber__c
    ORDERNUMBER__C("OrderNumber__c"),
    // Owner
    OWNER("Owner"),
    // Probability
    PROBABILITY("Probability"),
    // StageName
    STAGENAME("StageName"),
    // TotalOpportunityQuantity
    TOTALOPPORTUNITYQUANTITY("TotalOpportunityQuantity"),
    // TrackingNumber__c
    TRACKINGNUMBER__C("TrackingNumber__c"),
    // Type
    TYPE("Type"),
    // created
    CREATED("created"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // locked
    LOCKED("locked"),
    // opportunityCreatedFromLead
    OPPORTUNITYCREATEDFROMLEAD("opportunityCreatedFromLead"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FieldEnum fromValue(String value) {
        for (FieldEnum e : FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
