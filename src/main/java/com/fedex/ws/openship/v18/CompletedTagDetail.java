
package com.fedex.ws.openship.v18;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Provides reply information specific to a tag request.
 * 
 * <p>Java class for CompletedTagDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedTagDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="CutoffTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCommitment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DispatchDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedTagDetail", propOrder = {
    "confirmationNumber",
    "accessTime",
    "cutoffTime",
    "location",
    "deliveryCommitment",
    "dispatchDate"
})
public class CompletedTagDetail {

    @XmlElement(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @XmlElement(name = "AccessTime")
    protected Duration accessTime;
    @XmlElement(name = "CutoffTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cutoffTime;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "DeliveryCommitment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryCommitment;
    @XmlElement(name = "DispatchDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dispatchDate;

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the accessTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAccessTime() {
        return accessTime;
    }

    /**
     * Sets the value of the accessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAccessTime(Duration value) {
        this.accessTime = value;
    }

    /**
     * Gets the value of the cutoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutoffTime() {
        return cutoffTime;
    }

    /**
     * Sets the value of the cutoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutoffTime(XMLGregorianCalendar value) {
        this.cutoffTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the deliveryCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryCommitment() {
        return deliveryCommitment;
    }

    /**
     * Sets the value of the deliveryCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryCommitment(XMLGregorianCalendar value) {
        this.deliveryCommitment = value;
    }

    /**
     * Gets the value of the dispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchDate() {
        return dispatchDate;
    }

    /**
     * Sets the value of the dispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchDate(XMLGregorianCalendar value) {
        this.dispatchDate = value;
    }

}
