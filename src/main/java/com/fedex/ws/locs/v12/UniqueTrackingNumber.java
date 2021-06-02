
package com.fedex.ws.locs.v12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueTrackingNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueTrackingNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumberUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueTrackingNumber", propOrder = {
    "trackingNumber",
    "trackingNumberUniqueIdentifier",
    "shipDate"
})
public class UniqueTrackingNumber {

    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "TrackingNumberUniqueIdentifier")
    protected String trackingNumberUniqueIdentifier;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;

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
     * Gets the value of the trackingNumberUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberUniqueIdentifier() {
        return trackingNumberUniqueIdentifier;
    }

    /**
     * Sets the value of the trackingNumberUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberUniqueIdentifier(String value) {
        this.trackingNumberUniqueIdentifier = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

}
