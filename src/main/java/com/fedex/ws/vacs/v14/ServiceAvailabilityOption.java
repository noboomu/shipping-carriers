
package com.fedex.ws.vacs.v14;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAvailabilityOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAvailabilityOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDay" type="{http://fedex.com/ws/vacs/v14}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="DestinationStationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationAirportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransitTime" type="{http://fedex.com/ws/vacs/v14}TransitTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAvailabilityOption", propOrder = {
    "service",
    "deliveryDate",
    "deliveryDay",
    "destinationStationId",
    "destinationAirportId",
    "transitTime"
})
public class ServiceAvailabilityOption {

    @XmlElement(name = "Service")
    protected String service;
    @XmlElement(name = "DeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryDay")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType deliveryDay;
    @XmlElement(name = "DestinationStationId")
    protected String destinationStationId;
    @XmlElement(name = "DestinationAirportId")
    protected String destinationAirportId;
    @XmlElement(name = "TransitTime")
    @XmlSchemaType(name = "string")
    protected TransitTimeType transitTime;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryDay property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDeliveryDay() {
        return deliveryDay;
    }

    /**
     * Sets the value of the deliveryDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDeliveryDay(DayOfWeekType value) {
        this.deliveryDay = value;
    }

    /**
     * Gets the value of the destinationStationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationId() {
        return destinationStationId;
    }

    /**
     * Sets the value of the destinationStationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationId(String value) {
        this.destinationStationId = value;
    }

    /**
     * Gets the value of the destinationAirportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirportId() {
        return destinationAirportId;
    }

    /**
     * Sets the value of the destinationAirportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirportId(String value) {
        this.destinationAirportId = value;
    }

    /**
     * Gets the value of the transitTime property.
     * 
     * @return
     *     possible object is
     *     {@link TransitTimeType }
     *     
     */
    public TransitTimeType getTransitTime() {
        return transitTime;
    }

    /**
     * Sets the value of the transitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitTimeType }
     *     
     */
    public void setTransitTime(TransitTimeType value) {
        this.transitTime = value;
    }

}
