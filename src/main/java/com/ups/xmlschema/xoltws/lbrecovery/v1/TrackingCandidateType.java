
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingCandidateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingCandidateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupDateRange" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}PickupDateRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingCandidateType", propOrder = {
    "trackingNumber",
    "destinationPostalCode",
    "destinationCountryCode",
    "pickupDateRange"
})
public class TrackingCandidateType {

    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "DestinationPostalCode")
    protected String destinationPostalCode;
    @XmlElement(name = "DestinationCountryCode")
    protected String destinationCountryCode;
    @XmlElement(name = "PickupDateRange")
    protected PickupDateRangeType pickupDateRange;

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

    /**
     * Gets the value of the destinationPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    /**
     * Sets the value of the destinationPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPostalCode(String value) {
        this.destinationPostalCode = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the pickupDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link PickupDateRangeType }
     *     
     */
    public PickupDateRangeType getPickupDateRange() {
        return pickupDateRange;
    }

    /**
     * Sets the value of the pickupDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDateRangeType }
     *     
     */
    public void setPickupDateRange(PickupDateRangeType value) {
        this.pickupDateRange = value;
    }

}
