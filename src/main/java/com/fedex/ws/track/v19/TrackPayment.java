
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classification" type="{http://fedex.com/ws/track/v19}TrackChargesPaymentClassificationType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v19}TrackPaymentType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackPayment", propOrder = {
    "classification",
    "type",
    "description"
})
public class TrackPayment {

    @XmlElement(name = "Classification")
    @XmlSchemaType(name = "string")
    protected TrackChargesPaymentClassificationType classification;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected TrackPaymentType type;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link TrackChargesPaymentClassificationType }
     *     
     */
    public TrackChargesPaymentClassificationType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackChargesPaymentClassificationType }
     *     
     */
    public void setClassification(TrackChargesPaymentClassificationType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TrackPaymentType }
     *     
     */
    public TrackPaymentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPaymentType }
     *     
     */
    public void setType(TrackPaymentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
