
package com.fedex.ws.addressvalidation.v4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParsedPostalCodeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParsedPostalCodeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParsedPostalCodeDetail", propOrder = {
    "base",
    "addOn",
    "deliveryPoint"
})
public class ParsedPostalCodeDetail {

    @XmlElement(name = "Base")
    protected String base;
    @XmlElement(name = "AddOn")
    protected String addOn;
    @XmlElement(name = "DeliveryPoint")
    protected String deliveryPoint;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the addOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddOn() {
        return addOn;
    }

    /**
     * Sets the value of the addOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddOn(String value) {
        this.addOn = value;
    }

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPoint(String value) {
        this.deliveryPoint = value;
    }

}
