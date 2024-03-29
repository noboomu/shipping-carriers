
package com.fedex.ws.rate.v28;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This class describes the pickup characteristics of a shipment (e.g. for use in a tag request).
 * 
 * <p>Java class for PickupDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LatestPickupDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CourierInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestType" type="{http://fedex.com/ws/rate/v28}PickupRequestType" minOccurs="0"/&gt;
 *         &lt;element name="RequestSource" type="{http://fedex.com/ws/rate/v28}PickupRequestSourceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupDetail", propOrder = {
    "readyDateTime",
    "latestPickupDateTime",
    "courierInstructions",
    "requestType",
    "requestSource"
})
public class PickupDetail {

    @XmlElement(name = "ReadyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readyDateTime;
    @XmlElement(name = "LatestPickupDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestPickupDateTime;
    @XmlElement(name = "CourierInstructions")
    protected String courierInstructions;
    @XmlElement(name = "RequestType")
    @XmlSchemaType(name = "string")
    protected PickupRequestType requestType;
    @XmlElement(name = "RequestSource")
    @XmlSchemaType(name = "string")
    protected PickupRequestSourceType requestSource;

    /**
     * Gets the value of the readyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadyDateTime() {
        return readyDateTime;
    }

    /**
     * Sets the value of the readyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadyDateTime(XMLGregorianCalendar value) {
        this.readyDateTime = value;
    }

    /**
     * Gets the value of the latestPickupDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestPickupDateTime() {
        return latestPickupDateTime;
    }

    /**
     * Sets the value of the latestPickupDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestPickupDateTime(XMLGregorianCalendar value) {
        this.latestPickupDateTime = value;
    }

    /**
     * Gets the value of the courierInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierInstructions() {
        return courierInstructions;
    }

    /**
     * Sets the value of the courierInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierInstructions(String value) {
        this.courierInstructions = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link PickupRequestType }
     *     
     */
    public PickupRequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupRequestType }
     *     
     */
    public void setRequestType(PickupRequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestSource property.
     * 
     * @return
     *     possible object is
     *     {@link PickupRequestSourceType }
     *     
     */
    public PickupRequestSourceType getRequestSource() {
        return requestSource;
    }

    /**
     * Sets the value of the requestSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupRequestSourceType }
     *     
     */
    public void setRequestSource(PickupRequestSourceType value) {
        this.requestSource = value;
    }

}
