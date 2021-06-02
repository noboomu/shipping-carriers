
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentNotificationFormatSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentNotificationFormatSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/uploaddocument/v17}NotificationFormatType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentNotificationFormatSpecification", propOrder = {
    "type"
})
public class ShipmentNotificationFormatSpecification {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected NotificationFormatType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationFormatType }
     *     
     */
    public NotificationFormatType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationFormatType }
     *     
     */
    public void setType(NotificationFormatType value) {
        this.type = value;
    }

}
