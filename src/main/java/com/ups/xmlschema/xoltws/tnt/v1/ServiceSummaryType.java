
package com.ups.xmlschema.xoltws.tnt.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}CodeDescriptionType"/&gt;
 *         &lt;element name="GuaranteedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedArrival" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}EstimatedArrivalType"/&gt;
 *         &lt;element name="SaturdayDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayDeliveryDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSummaryType", propOrder = {
    "service",
    "guaranteedIndicator",
    "disclaimer",
    "estimatedArrival",
    "saturdayDelivery",
    "saturdayDeliveryDisclaimer"
})
public class ServiceSummaryType {

    @XmlElement(name = "Service", required = true)
    protected CodeDescriptionType service;
    @XmlElement(name = "GuaranteedIndicator")
    protected String guaranteedIndicator;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;
    @XmlElement(name = "EstimatedArrival", required = true)
    protected EstimatedArrivalType estimatedArrival;
    @XmlElement(name = "SaturdayDelivery")
    protected String saturdayDelivery;
    @XmlElement(name = "SaturdayDeliveryDisclaimer")
    protected String saturdayDeliveryDisclaimer;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setService(CodeDescriptionType value) {
        this.service = value;
    }

    /**
     * Gets the value of the guaranteedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteedIndicator() {
        return guaranteedIndicator;
    }

    /**
     * Sets the value of the guaranteedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteedIndicator(String value) {
        this.guaranteedIndicator = value;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

    /**
     * Gets the value of the estimatedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedArrivalType }
     *     
     */
    public EstimatedArrivalType getEstimatedArrival() {
        return estimatedArrival;
    }

    /**
     * Sets the value of the estimatedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedArrivalType }
     *     
     */
    public void setEstimatedArrival(EstimatedArrivalType value) {
        this.estimatedArrival = value;
    }

    /**
     * Gets the value of the saturdayDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayDelivery() {
        return saturdayDelivery;
    }

    /**
     * Sets the value of the saturdayDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayDelivery(String value) {
        this.saturdayDelivery = value;
    }

    /**
     * Gets the value of the saturdayDeliveryDisclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayDeliveryDisclaimer() {
        return saturdayDeliveryDisclaimer;
    }

    /**
     * Sets the value of the saturdayDeliveryDisclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayDeliveryDisclaimer(String value) {
        this.saturdayDeliveryDisclaimer = value;
    }

}
