
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentType" type="{http://fedex.com/ws/rate/v28}PaymentType" minOccurs="0"/&gt;
 *         &lt;element name="Payor" type="{http://fedex.com/ws/rate/v28}Payor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "paymentType",
    "payor"
})
public class Payment {

    @XmlElement(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;
    @XmlElement(name = "Payor")
    protected Payor payor;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the payor property.
     * 
     * @return
     *     possible object is
     *     {@link Payor }
     *     
     */
    public Payor getPayor() {
        return payor;
    }

    /**
     * Sets the value of the payor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payor }
     *     
     */
    public void setPayor(Payor value) {
        this.payor = value;
    }

}
