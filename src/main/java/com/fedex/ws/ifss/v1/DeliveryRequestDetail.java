
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryRequestDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/ifss/v1}DeliveryOptionType" minOccurs="0"/&gt;
 *         &lt;element name="RedirectToHoldAtLocationDetail" type="{http://fedex.com/ws/ifss/v1}RedirectToHoldAtLocationRequestDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryRequestDetail", propOrder = {
    "type",
    "redirectToHoldAtLocationDetail"
})
public class DeliveryRequestDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected DeliveryOptionType type;
    @XmlElement(name = "RedirectToHoldAtLocationDetail")
    protected RedirectToHoldAtLocationRequestDetail redirectToHoldAtLocationDetail;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOptionType }
     *     
     */
    public DeliveryOptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOptionType }
     *     
     */
    public void setType(DeliveryOptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the redirectToHoldAtLocationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectToHoldAtLocationRequestDetail }
     *     
     */
    public RedirectToHoldAtLocationRequestDetail getRedirectToHoldAtLocationDetail() {
        return redirectToHoldAtLocationDetail;
    }

    /**
     * Sets the value of the redirectToHoldAtLocationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectToHoldAtLocationRequestDetail }
     *     
     */
    public void setRedirectToHoldAtLocationDetail(RedirectToHoldAtLocationRequestDetail value) {
        this.redirectToHoldAtLocationDetail = value;
    }

}
