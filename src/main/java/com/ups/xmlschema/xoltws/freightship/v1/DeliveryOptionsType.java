
package com.ups.xmlschema.xoltws.freightship.v1;

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
 *         &lt;element name="CallBeforeDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HolidayDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsideDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidentialDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeekendDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiftGateRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryToDoorIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimitedAccessDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "callBeforeDeliveryIndicator",
    "holidayDeliveryIndicator",
    "insideDeliveryIndicator",
    "residentialDeliveryIndicator",
    "weekendDeliveryIndicator",
    "liftGateRequiredIndicator",
    "saturdayDeliveryIndicator",
    "deliveryToDoorIndicator",
    "limitedAccessDeliveryIndicator"
})
public class DeliveryOptionsType {

    @XmlElement(name = "CallBeforeDeliveryIndicator")
    protected String callBeforeDeliveryIndicator;
    @XmlElement(name = "HolidayDeliveryIndicator")
    protected String holidayDeliveryIndicator;
    @XmlElement(name = "InsideDeliveryIndicator")
    protected String insideDeliveryIndicator;
    @XmlElement(name = "ResidentialDeliveryIndicator")
    protected String residentialDeliveryIndicator;
    @XmlElement(name = "WeekendDeliveryIndicator")
    protected String weekendDeliveryIndicator;
    @XmlElement(name = "LiftGateRequiredIndicator")
    protected String liftGateRequiredIndicator;
    @XmlElement(name = "SaturdayDeliveryIndicator")
    protected String saturdayDeliveryIndicator;
    @XmlElement(name = "DeliveryToDoorIndicator")
    protected String deliveryToDoorIndicator;
    @XmlElement(name = "LimitedAccessDeliveryIndicator")
    protected String limitedAccessDeliveryIndicator;

    /**
     * Gets the value of the callBeforeDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBeforeDeliveryIndicator() {
        return callBeforeDeliveryIndicator;
    }

    /**
     * Sets the value of the callBeforeDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBeforeDeliveryIndicator(String value) {
        this.callBeforeDeliveryIndicator = value;
    }

    /**
     * Gets the value of the holidayDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayDeliveryIndicator() {
        return holidayDeliveryIndicator;
    }

    /**
     * Sets the value of the holidayDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayDeliveryIndicator(String value) {
        this.holidayDeliveryIndicator = value;
    }

    /**
     * Gets the value of the insideDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDeliveryIndicator() {
        return insideDeliveryIndicator;
    }

    /**
     * Sets the value of the insideDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDeliveryIndicator(String value) {
        this.insideDeliveryIndicator = value;
    }

    /**
     * Gets the value of the residentialDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialDeliveryIndicator() {
        return residentialDeliveryIndicator;
    }

    /**
     * Sets the value of the residentialDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialDeliveryIndicator(String value) {
        this.residentialDeliveryIndicator = value;
    }

    /**
     * Gets the value of the weekendDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekendDeliveryIndicator() {
        return weekendDeliveryIndicator;
    }

    /**
     * Sets the value of the weekendDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekendDeliveryIndicator(String value) {
        this.weekendDeliveryIndicator = value;
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
     * Gets the value of the saturdayDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayDeliveryIndicator() {
        return saturdayDeliveryIndicator;
    }

    /**
     * Sets the value of the saturdayDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayDeliveryIndicator(String value) {
        this.saturdayDeliveryIndicator = value;
    }

    /**
     * Gets the value of the deliveryToDoorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryToDoorIndicator() {
        return deliveryToDoorIndicator;
    }

    /**
     * Sets the value of the deliveryToDoorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryToDoorIndicator(String value) {
        this.deliveryToDoorIndicator = value;
    }

    /**
     * Gets the value of the limitedAccessDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedAccessDeliveryIndicator() {
        return limitedAccessDeliveryIndicator;
    }

    /**
     * Sets the value of the limitedAccessDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedAccessDeliveryIndicator(String value) {
        this.limitedAccessDeliveryIndicator = value;
    }

}
