
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies a single type of weighing performed on a shipment
 * 
 * <p>Java class for WeighingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeighingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/vacs/v14}WeighingScaleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeighingDetail", propOrder = {
    "type"
})
public class WeighingDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected WeighingScaleType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WeighingScaleType }
     *     
     */
    public WeighingScaleType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingScaleType }
     *     
     */
    public void setType(WeighingScaleType value) {
        this.type = value;
    }

}
