
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingIdType" type="{http://fedex.com/ws/ship/v26}TrackingIdType" minOccurs="0"/&gt;
 *         &lt;element name="FormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UspsApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingId", propOrder = {
    "trackingIdType",
    "formId",
    "uspsApplicationId",
    "trackingNumber"
})
public class TrackingId {

    @XmlElement(name = "TrackingIdType")
    @XmlSchemaType(name = "string")
    protected TrackingIdType trackingIdType;
    @XmlElement(name = "FormId")
    protected String formId;
    @XmlElement(name = "UspsApplicationId")
    protected String uspsApplicationId;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;

    /**
     * Gets the value of the trackingIdType property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingIdType }
     *     
     */
    public TrackingIdType getTrackingIdType() {
        return trackingIdType;
    }

    /**
     * Sets the value of the trackingIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingIdType }
     *     
     */
    public void setTrackingIdType(TrackingIdType value) {
        this.trackingIdType = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * Gets the value of the uspsApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUspsApplicationId() {
        return uspsApplicationId;
    }

    /**
     * Sets the value of the uspsApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUspsApplicationId(String value) {
        this.uspsApplicationId = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

}
