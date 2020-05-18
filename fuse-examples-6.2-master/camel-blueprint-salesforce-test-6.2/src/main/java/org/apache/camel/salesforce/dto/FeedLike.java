/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject FeedLike
 */
@XStreamAlias("FeedLike")
public class FeedLike extends AbstractSObjectBase {

    // FeedItemId
    private String FeedItemId;

    @JsonProperty("FeedItemId")
    public String getFeedItemId() {
        return this.FeedItemId;
    }

    @JsonProperty("FeedItemId")
    public void setFeedItemId(String FeedItemId) {
        this.FeedItemId = FeedItemId;
    }

    // FeedEntityId
    private String FeedEntityId;

    @JsonProperty("FeedEntityId")
    public String getFeedEntityId() {
        return this.FeedEntityId;
    }

    @JsonProperty("FeedEntityId")
    public void setFeedEntityId(String FeedEntityId) {
        this.FeedEntityId = FeedEntityId;
    }

    // InsertedById
    private String InsertedById;

    @JsonProperty("InsertedById")
    public String getInsertedById() {
        return this.InsertedById;
    }

    @JsonProperty("InsertedById")
    public void setInsertedById(String InsertedById) {
        this.InsertedById = InsertedById;
    }

}
