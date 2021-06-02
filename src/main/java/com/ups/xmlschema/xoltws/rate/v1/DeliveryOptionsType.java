
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LiftGateAtDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DropOffAtUPSFacilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryOptionsType", propOrder = {
    "liftGateAtDeliveryIndicator",
    "dropOffAtUPSFacilityIndicator"
})
public class DeliveryOptionsType {

    @XmlElement(name = "LiftGateAtDeliveryIndicator")
    protected String liftGateAtDeliveryIndicator;
    @XmlElement(name = "DropOffAtUPSFacilityIndicator")
    protected String dropOffAtUPSFacilityIndicator;

    /**
     * Gets the value of the liftGateAtDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiftGateAtDeliveryIndicator() {
        return liftGateAtDeliveryIndicator;
    }

    /**
     * Sets the value of the liftGateAtDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiftGateAtDeliveryIndicator(String value) {
        this.liftGateAtDeliveryIndicator = value;
    }

    /**
     * Gets the value of the dropOffAtUPSFacilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffAtUPSFacilityIndicator() {
        return dropOffAtUPSFacilityIndicator;
    }

    /**
     * Sets the value of the dropOffAtUPSFacilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffAtUPSFacilityIndicator(String value) {
        this.dropOffAtUPSFacilityIndicator = value;
    }

}
