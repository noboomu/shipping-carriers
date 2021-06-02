
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentRatingOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentRatingOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NegotiatedRatesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FRSShipmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateChartIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserLevelDiscountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentRatingOptionsType", propOrder = {
    "negotiatedRatesIndicator",
    "frsShipmentIndicator",
    "rateChartIndicator",
    "userLevelDiscountIndicator"
})
public class ShipmentRatingOptionsType {

    @XmlElement(name = "NegotiatedRatesIndicator")
    protected String negotiatedRatesIndicator;
    @XmlElement(name = "FRSShipmentIndicator")
    protected String frsShipmentIndicator;
    @XmlElement(name = "RateChartIndicator")
    protected String rateChartIndicator;
    @XmlElement(name = "UserLevelDiscountIndicator")
    protected String userLevelDiscountIndicator;

    /**
     * Gets the value of the negotiatedRatesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedRatesIndicator() {
        return negotiatedRatesIndicator;
    }

    /**
     * Sets the value of the negotiatedRatesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedRatesIndicator(String value) {
        this.negotiatedRatesIndicator = value;
    }

    /**
     * Gets the value of the frsShipmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRSShipmentIndicator() {
        return frsShipmentIndicator;
    }

    /**
     * Sets the value of the frsShipmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRSShipmentIndicator(String value) {
        this.frsShipmentIndicator = value;
    }

    /**
     * Gets the value of the rateChartIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateChartIndicator() {
        return rateChartIndicator;
    }

    /**
     * Sets the value of the rateChartIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateChartIndicator(String value) {
        this.rateChartIndicator = value;
    }

    /**
     * Gets the value of the userLevelDiscountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLevelDiscountIndicator() {
        return userLevelDiscountIndicator;
    }

    /**
     * Sets the value of the userLevelDiscountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLevelDiscountIndicator(String value) {
        this.userLevelDiscountIndicator = value;
    }

}
