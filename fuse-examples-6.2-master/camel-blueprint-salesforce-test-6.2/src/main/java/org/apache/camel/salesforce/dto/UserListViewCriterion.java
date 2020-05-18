/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject UserListViewCriterion
 */
@XStreamAlias("UserListViewCriterion")
public class UserListViewCriterion extends AbstractSObjectBase {

    // UserListViewId
    private String UserListViewId;

    @JsonProperty("UserListViewId")
    public String getUserListViewId() {
        return this.UserListViewId;
    }

    @JsonProperty("UserListViewId")
    public void setUserListViewId(String UserListViewId) {
        this.UserListViewId = UserListViewId;
    }

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // ColumnName
    private String ColumnName;

    @JsonProperty("ColumnName")
    public String getColumnName() {
        return this.ColumnName;
    }

    @JsonProperty("ColumnName")
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    // Operation
    @XStreamConverter(PicklistEnumConverter.class)
    private OperationEnum Operation;

    @JsonProperty("Operation")
    public OperationEnum getOperation() {
        return this.Operation;
    }

    @JsonProperty("Operation")
    public void setOperation(OperationEnum Operation) {
        this.Operation = Operation;
    }

    // Value
    private String Value;

    @JsonProperty("Value")
    public String getValue() {
        return this.Value;
    }

    @JsonProperty("Value")
    public void setValue(String Value) {
        this.Value = Value;
    }

}
