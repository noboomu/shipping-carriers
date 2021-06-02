
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies payment for a single aspect of a shipment.
 * 
 * <p>Java class for SplitPaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitPaymentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/vacs/v14}SplitPaymentType" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://fedex.com/ws/vacs/v14}Payment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitPaymentDetail", propOrder = {
    "type",
    "payment"
})
public class SplitPaymentDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected SplitPaymentType type;
    @XmlElement(name = "Payment")
    protected Payment payment;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SplitPaymentType }
     *     
     */
    public SplitPaymentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPaymentType }
     *     
     */
    public void setType(SplitPaymentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

}
