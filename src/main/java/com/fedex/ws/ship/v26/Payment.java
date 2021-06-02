
package com.fedex.ws.ship.v26;

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
 *         &lt;element name="PaymentType" type="{http://fedex.com/ws/ship/v26}PaymentType"/&gt;
 *         &lt;element name="Payor" type="{http://fedex.com/ws/ship/v26}Payor" minOccurs="0"/&gt;
 *         &lt;element name="CreditCard" type="{http://fedex.com/ws/ship/v26}CreditCard" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardTransactionDetail" type="{http://fedex.com/ws/ship/v26}CreditCardTransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://fedex.com/ws/ship/v26}Money" minOccurs="0"/&gt;
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
    "payor",
    "creditCard",
    "creditCardTransactionDetail",
    "amount"
})
public class Payment {

    @XmlElement(name = "PaymentType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;
    @XmlElement(name = "Payor")
    protected Payor payor;
    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "CreditCardTransactionDetail")
    protected CreditCardTransactionDetail creditCardTransactionDetail;
    @XmlElement(name = "Amount")
    protected Money amount;

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

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the creditCardTransactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTransactionDetail }
     *     
     */
    public CreditCardTransactionDetail getCreditCardTransactionDetail() {
        return creditCardTransactionDetail;
    }

    /**
     * Sets the value of the creditCardTransactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTransactionDetail }
     *     
     */
    public void setCreditCardTransactionDetail(CreditCardTransactionDetail value) {
        this.creditCardTransactionDetail = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

}
