
package com.ups.xmlschema.xoltws.freightrate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HolidayPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsidePickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidentialPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeekendPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiftGateRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldAtAirportForPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupFromDoorIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimitedAccessPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupOptionsType", propOrder = {
    "holidayPickupIndicator",
    "insidePickupIndicator",
    "residentialPickupIndicator",
    "weekendPickupIndicator",
    "liftGateRequiredIndicator",
    "holdAtAirportForPickupIndicator",
    "pickupFromDoorIndicator",
    "limitedAccessPickupIndicator"
})
public class PickupOptionsType {

    @XmlElement(name = "HolidayPickupIndicator")
    protected String holidayPickupIndicator;
    @XmlElement(name = "InsidePickupIndicator")
    protected String insidePickupIndicator;
    @XmlElement(name = "ResidentialPickupIndicator")
    protected String residentialPickupIndicator;
    @XmlElement(name = "WeekendPickupIndicator")
    protected String weekendPickupIndicator;
    @XmlElement(name = "LiftGateRequiredIndicator")
    protected String liftGateRequiredIndicator;
    @XmlElement(name = "HoldAtAirportForPickupIndicator")
    protected String holdAtAirportForPickupIndicator;
    @XmlElement(name = "PickupFromDoorIndicator")
    protected String pickupFromDoorIndicator;
    @XmlElement(name = "LimitedAccessPickupIndicator")
    protected String limitedAccessPickupIndicator;

    /**
     * Gets the value of the holidayPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayPickupIndicator() {
        return holidayPickupIndicator;
    }

    /**
     * Sets the value of the holidayPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayPickupIndicator(String value) {
        this.holidayPickupIndicator = value;
    }

    /**
     * Gets the value of the insidePickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsidePickupIndicator() {
        return insidePickupIndicator;
    }

    /**
     * Sets the value of the insidePickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsidePickupIndicator(String value) {
        this.insidePickupIndicator = value;
    }

    /**
     * Gets the value of the residentialPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialPickupIndicator() {
        return residentialPickupIndicator;
    }

    /**
     * Sets the value of the residentialPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialPickupIndicator(String value) {
        this.residentialPickupIndicator = value;
    }

    /**
     * Gets the value of the weekendPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekendPickupIndicator() {
        return weekendPickupIndicator;
    }

    /**
     * Sets the value of the weekendPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekendPickupIndicator(String value) {
        this.weekendPickupIndicator = value;
    }

    /**
     * Gets the value of the liftGateRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiftGateRequiredIndicator() {
        return liftGateRequiredIndicator;
    }

    /**
     * Sets the value of the liftGateRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiftGateRequiredIndicator(String value) {
        this.liftGateRequiredIndicator = value;
    }

    /**
     * Gets the value of the holdAtAirportForPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldAtAirportForPickupIndicator() {
        return holdAtAirportForPickupIndicator;
    }

    /**
     * Sets the value of the holdAtAirportForPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldAtAirportForPickupIndicator(String value) {
        this.holdAtAirportForPickupIndicator = value;
    }

    /**
     * Gets the value of the pickupFromDoorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupFromDoorIndicator() {
        return pickupFromDoorIndicator;
    }

    /**
     * Sets the value of the pickupFromDoorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupFromDoorIndicator(String value) {
        this.pickupFromDoorIndicator = value;
    }

    /**
     * Gets the value of the limitedAccessPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedAccessPickupIndicator() {
        return limitedAccessPickupIndicator;
    }

    /**
     * Sets the value of the limitedAccessPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedAccessPickupIndicator(String value) {
        this.limitedAccessPickupIndicator = value;
    }

}
