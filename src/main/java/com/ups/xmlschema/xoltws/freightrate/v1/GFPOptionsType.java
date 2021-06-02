
package com.ups.xmlschema.xoltws.freightrate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GFPOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GFPOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GPFAccesorialRateIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnCallInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}OnCallInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GFPOptionsType", propOrder = {
    "gpfAccesorialRateIndicator",
    "onCallInformation"
})
public class GFPOptionsType {

    @XmlElement(name = "GPFAccesorialRateIndicator")
    protected String gpfAccesorialRateIndicator;
    @XmlElement(name = "OnCallInformation")
    protected OnCallInformationType onCallInformation;

    /**
     * Gets the value of the gpfAccesorialRateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPFAccesorialRateIndicator() {
        return gpfAccesorialRateIndicator;
    }

    /**
     * Sets the value of the gpfAccesorialRateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPFAccesorialRateIndicator(String value) {
        this.gpfAccesorialRateIndicator = value;
    }

    /**
     * Gets the value of the onCallInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OnCallInformationType }
     *     
     */
    public OnCallInformationType getOnCallInformation() {
        return onCallInformation;
    }

    /**
     * Sets the value of the onCallInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCallInformationType }
     *     
     */
    public void setOnCallInformation(OnCallInformationType value) {
        this.onCallInformation = value;
    }

}
