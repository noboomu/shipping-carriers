
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Surcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Surcharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SurchargeType" type="{http://fedex.com/ws/uploaddocument/v17}SurchargeType" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://fedex.com/ws/uploaddocument/v17}SurchargeLevelType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Surcharge", propOrder = {
    "surchargeType",
    "level",
    "description",
    "amount"
})
public class Surcharge {

    @XmlElement(name = "SurchargeType")
    @XmlSchemaType(name = "string")
    protected SurchargeType surchargeType;
    @XmlElement(name = "Level")
    @XmlSchemaType(name = "string")
    protected SurchargeLevelType level;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Amount")
    protected Money amount;

    /**
     * Gets the value of the surchargeType property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeType }
     *     
     */
    public SurchargeType getSurchargeType() {
        return surchargeType;
    }

    /**
     * Sets the value of the surchargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeType }
     *     
     */
    public void setSurchargeType(SurchargeType value) {
        this.surchargeType = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeLevelType }
     *     
     */
    public SurchargeLevelType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeLevelType }
     *     
     */
    public void setLevel(SurchargeLevelType value) {
        this.level = value;
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
