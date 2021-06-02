
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightShipmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightDensityInfo" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}FreightDensityInfoType" minOccurs="0"/&gt;
 *         &lt;element name="DensityEligibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightShipmentInformationType", propOrder = {
    "freightDensityInfo",
    "densityEligibleIndicator"
})
public class FreightShipmentInformationType {

    @XmlElement(name = "FreightDensityInfo")
    protected FreightDensityInfoType freightDensityInfo;
    @XmlElement(name = "DensityEligibleIndicator")
    protected String densityEligibleIndicator;

    /**
     * Gets the value of the freightDensityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FreightDensityInfoType }
     *     
     */
    public FreightDensityInfoType getFreightDensityInfo() {
        return freightDensityInfo;
    }

    /**
     * Sets the value of the freightDensityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightDensityInfoType }
     *     
     */
    public void setFreightDensityInfo(FreightDensityInfoType value) {
        this.freightDensityInfo = value;
    }

    /**
     * Gets the value of the densityEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensityEligibleIndicator() {
        return densityEligibleIndicator;
    }

    /**
     * Sets the value of the densityEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensityEligibleIndicator(String value) {
        this.densityEligibleIndicator = value;
    }

}
