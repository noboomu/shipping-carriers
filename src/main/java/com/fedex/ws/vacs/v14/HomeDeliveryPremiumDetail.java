
package com.fedex.ws.vacs.v14;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeDeliveryPremiumDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HomeDeliveryPremiumDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HomeDeliveryPremiumType" type="{http://fedex.com/ws/vacs/v14}HomeDeliveryPremiumType" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomeDeliveryPremiumDetail", propOrder = {
    "homeDeliveryPremiumType",
    "date",
    "phoneNumber"
})
public class HomeDeliveryPremiumDetail {

    @XmlElement(name = "HomeDeliveryPremiumType")
    @XmlSchemaType(name = "string")
    protected HomeDeliveryPremiumType homeDeliveryPremiumType;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;

    /**
     * Gets the value of the homeDeliveryPremiumType property.
     * 
     * @return
     *     possible object is
     *     {@link HomeDeliveryPremiumType }
     *     
     */
    public HomeDeliveryPremiumType getHomeDeliveryPremiumType() {
        return homeDeliveryPremiumType;
    }

    /**
     * Sets the value of the homeDeliveryPremiumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeDeliveryPremiumType }
     *     
     */
    public void setHomeDeliveryPremiumType(HomeDeliveryPremiumType value) {
        this.homeDeliveryPremiumType = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
