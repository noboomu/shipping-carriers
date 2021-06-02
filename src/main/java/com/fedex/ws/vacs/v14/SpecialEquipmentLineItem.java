
package com.fedex.ws.vacs.v14;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the usage of a single type of special equipment while loading/unloading a shipment
 * 
 * <p>Java class for SpecialEquipmentLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialEquipmentLineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/vacs/v14}SpecialEquipmentType" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialEquipmentLineItem", propOrder = {
    "type",
    "duration"
})
public class SpecialEquipmentLineItem {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected SpecialEquipmentType type;
    @XmlElement(name = "Duration")
    protected Duration duration;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialEquipmentType }
     *     
     */
    public SpecialEquipmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialEquipmentType }
     *     
     */
    public void setType(SpecialEquipmentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}
