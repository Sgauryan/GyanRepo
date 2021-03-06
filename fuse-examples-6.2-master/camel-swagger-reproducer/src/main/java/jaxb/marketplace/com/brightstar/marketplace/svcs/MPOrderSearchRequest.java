
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderSearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestObject" type="{http://svcs.marketplace.brightstar.com/}MPOrderSearch" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderSearchRequest", propOrder = {
    "requestObject"
})
public class MPOrderSearchRequest
    extends MPGenericRequest
{

    @XmlElement(name = "RequestObject")
    protected MPOrderSearch requestObject;

    /**
     * Gets the value of the requestObject property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrderSearch }
     *     
     */
    public MPOrderSearch getRequestObject() {
        return requestObject;
    }

    /**
     * Sets the value of the requestObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrderSearch }
     *     
     */
    public void setRequestObject(MPOrderSearch value) {
        this.requestObject = value;
    }

}
