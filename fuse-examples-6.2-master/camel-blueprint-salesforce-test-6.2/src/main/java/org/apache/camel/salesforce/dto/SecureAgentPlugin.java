/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject SecureAgentPlugin
 */
@XStreamAlias("SecureAgentPlugin")
public class SecureAgentPlugin extends AbstractSObjectBase {

    // SecureAgentId
    private String SecureAgentId;

    @JsonProperty("SecureAgentId")
    public String getSecureAgentId() {
        return this.SecureAgentId;
    }

    @JsonProperty("SecureAgentId")
    public void setSecureAgentId(String SecureAgentId) {
        this.SecureAgentId = SecureAgentId;
    }

    // PluginName
    private String PluginName;

    @JsonProperty("PluginName")
    public String getPluginName() {
        return this.PluginName;
    }

    @JsonProperty("PluginName")
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    // PluginType
    private String PluginType;

    @JsonProperty("PluginType")
    public String getPluginType() {
        return this.PluginType;
    }

    @JsonProperty("PluginType")
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    // RequestedVersion
    private String RequestedVersion;

    @JsonProperty("RequestedVersion")
    public String getRequestedVersion() {
        return this.RequestedVersion;
    }

    @JsonProperty("RequestedVersion")
    public void setRequestedVersion(String RequestedVersion) {
        this.RequestedVersion = RequestedVersion;
    }

    // UpdateWindowStart
    private org.joda.time.DateTime UpdateWindowStart;

    @JsonProperty("UpdateWindowStart")
    public org.joda.time.DateTime getUpdateWindowStart() {
        return this.UpdateWindowStart;
    }

    @JsonProperty("UpdateWindowStart")
    public void setUpdateWindowStart(org.joda.time.DateTime UpdateWindowStart) {
        this.UpdateWindowStart = UpdateWindowStart;
    }

    // UpdateWindowEnd
    private org.joda.time.DateTime UpdateWindowEnd;

    @JsonProperty("UpdateWindowEnd")
    public org.joda.time.DateTime getUpdateWindowEnd() {
        return this.UpdateWindowEnd;
    }

    @JsonProperty("UpdateWindowEnd")
    public void setUpdateWindowEnd(org.joda.time.DateTime UpdateWindowEnd) {
        this.UpdateWindowEnd = UpdateWindowEnd;
    }

}
