
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPEmailQueueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPEmailQueueRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestObject" type="{http://svcs.marketplace.brightstar.com/}MPEmailQueue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPEmailQueueRequest", propOrder = {
    "requestObject"
})
public class MPEmailQueueRequest
    extends MPGenericRequest
{

    @XmlElement(name = "RequestObject")
    protected MPEmailQueue requestObject;

    /**
     * Gets the value of the requestObject property.
     * 
     * @return
     *     possible object is
     *     {@link MPEmailQueue }
     *     
     */
    public MPEmailQueue getRequestObject() {
        return requestObject;
    }

    /**
     * Sets the value of the requestObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEmailQueue }
     *     
     */
    public void setRequestObject(MPEmailQueue value) {
        this.requestObject = value;
    }

}
