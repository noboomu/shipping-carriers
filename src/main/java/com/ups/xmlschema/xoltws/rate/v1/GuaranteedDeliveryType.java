
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuaranteedDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuaranteedDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessDaysInTransit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryByTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteedDeliveryType", propOrder = {
    "businessDaysInTransit",
    "deliveryByTime"
})
public class GuaranteedDeliveryType {

    @XmlElement(name = "BusinessDaysInTransit")
    protected String businessDaysInTransit;
    @XmlElement(name = "DeliveryByTime")
    protected String deliveryByTime;

    /**
     * Gets the value of the businessDaysInTransit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDaysInTransit() {
        return businessDaysInTransit;
    }

    /**
     * Sets the value of the businessDaysInTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDaysInTransit(String value) {
        this.businessDaysInTransit = value;
    }

    /**
     * Gets the value of the deliveryByTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryByTime() {
        return deliveryByTime;
    }

    /**
     * Sets the value of the deliveryByTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryByTime(String value) {
        this.deliveryByTime = value;
    }

}
