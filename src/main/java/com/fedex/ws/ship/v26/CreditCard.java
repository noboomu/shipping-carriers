
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreditCardType" type="{http://fedex.com/ws/ship/v26}CreditCardType"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VerificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardHolder" type="{http://fedex.com/ws/ship/v26}ParsedContactAndAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCard", propOrder = {
    "number",
    "creditCardType",
    "expirationDate",
    "verificationCode",
    "creditCardHolder"
})
public class CreditCard {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "CreditCardType", required = true)
    @XmlSchemaType(name = "string")
    protected CreditCardType creditCardType;
    @XmlElement(name = "ExpirationDate", required = true)
    protected String expirationDate;
    @XmlElement(name = "VerificationCode")
    protected String verificationCode;
    @XmlElement(name = "CreditCardHolder")
    protected ParsedContactAndAddress creditCardHolder;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCardType(CreditCardType value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the verificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Sets the value of the verificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationCode(String value) {
        this.verificationCode = value;
    }

    /**
     * Gets the value of the creditCardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link ParsedContactAndAddress }
     *     
     */
    public ParsedContactAndAddress getCreditCardHolder() {
        return creditCardHolder;
    }

    /**
     * Sets the value of the creditCardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParsedContactAndAddress }
     *     
     */
    public void setCreditCardHolder(ParsedContactAndAddress value) {
        this.creditCardHolder = value;
    }

}
