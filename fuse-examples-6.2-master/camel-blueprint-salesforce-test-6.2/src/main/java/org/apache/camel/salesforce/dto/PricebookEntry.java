/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject PricebookEntry
 */
@XStreamAlias("PricebookEntry")
public class PricebookEntry extends AbstractSObjectBase {

    // Pricebook2Id
    private String Pricebook2Id;

    @JsonProperty("Pricebook2Id")
    public String getPricebook2Id() {
        return this.Pricebook2Id;
    }

    @JsonProperty("Pricebook2Id")
    public void setPricebook2Id(String Pricebook2Id) {
        this.Pricebook2Id = Pricebook2Id;
    }

    // Product2Id
    private String Product2Id;

    @JsonProperty("Product2Id")
    public String getProduct2Id() {
        return this.Product2Id;
    }

    @JsonProperty("Product2Id")
    public void setProduct2Id(String Product2Id) {
        this.Product2Id = Product2Id;
    }

    // UnitPrice
    private Double UnitPrice;

    @JsonProperty("UnitPrice")
    public Double getUnitPrice() {
        return this.UnitPrice;
    }

    @JsonProperty("UnitPrice")
    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // UseStandardPrice
    private Boolean UseStandardPrice;

    @JsonProperty("UseStandardPrice")
    public Boolean getUseStandardPrice() {
        return this.UseStandardPrice;
    }

    @JsonProperty("UseStandardPrice")
    public void setUseStandardPrice(Boolean UseStandardPrice) {
        this.UseStandardPrice = UseStandardPrice;
    }

    // ProductCode
    private String ProductCode;

    @JsonProperty("ProductCode")
    public String getProductCode() {
        return this.ProductCode;
    }

    @JsonProperty("ProductCode")
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

}
