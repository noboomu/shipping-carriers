
package com.fedex.ws.ifss.v1;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the details about rerouting a shipment for delivery.
 * 
 * <p>Java class for RerouteDeliveryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RerouteDeliveryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/ifss/v1}RerouteDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="TransitTime" type="{http://fedex.com/ws/ifss/v1}TransitTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CommitmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CommitmentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RerouteDeliveryDetail", propOrder = {
    "type",
    "transitTime",
    "commitmentDate",
    "commitmentTime"
})
public class RerouteDeliveryDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected RerouteDeliveryType type;
    @XmlElement(name = "TransitTime")
    @XmlSchemaType(name = "string")
    protected TransitTimeType transitTime;
    @XmlElement(name = "CommitmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commitmentDate;
    @XmlElement(name = "CommitmentTime")
    protected String commitmentTime;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteDeliveryType }
     *     
     */
    public RerouteDeliveryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteDeliveryType }
     *     
     */
    public void setType(RerouteDeliveryType value) {
        this.type = value;
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

    /**
     * Gets the value of the commitmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitmentDate() {
        return commitmentDate;
    }

    /**
     * Sets the value of the commitmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitmentDate(XMLGregorianCalendar value) {
        this.commitmentDate = value;
    }

    /**
     * Gets the value of the commitmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentTime() {
        return commitmentTime;
    }

    /**
     * Sets the value of the commitmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentTime(String value) {
        this.commitmentTime = value;
    }

}
