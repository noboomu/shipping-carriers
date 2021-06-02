
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Provides reply information specific to SmartPost shipments.
 * 
 * <p>Java class for CompletedSmartPostDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedSmartPostDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickUpCarrier" type="{http://fedex.com/ws/uploaddocument/v17}CarrierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Machinable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedSmartPostDetail", propOrder = {
    "pickUpCarrier",
    "machinable"
})
public class CompletedSmartPostDetail {

    @XmlElement(name = "PickUpCarrier")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType pickUpCarrier;
    @XmlElement(name = "Machinable")
    protected Boolean machinable;

    /**
     * Gets the value of the pickUpCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getPickUpCarrier() {
        return pickUpCarrier;
    }

    /**
     * Sets the value of the pickUpCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setPickUpCarrier(CarrierCodeType value) {
        this.pickUpCarrier = value;
    }

    /**
     * Gets the value of the machinable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMachinable() {
        return machinable;
    }

    /**
     * Sets the value of the machinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMachinable(Boolean value) {
        this.machinable = value;
    }

}
