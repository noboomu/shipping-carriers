
package com.fedex.ws.uploaddocument.v17;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateDiscountType" type="{http://fedex.com/ws/uploaddocument/v17}RateDiscountType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDiscount", propOrder = {
    "rateDiscountType",
    "description",
    "amount",
    "percent"
})
public class RateDiscount {

    @XmlElement(name = "RateDiscountType")
    @XmlSchemaType(name = "string")
    protected RateDiscountType rateDiscountType;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Amount")
    protected Money amount;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;

    /**
     * Gets the value of the rateDiscountType property.
     * 
     * @return
     *     possible object is
     *     {@link RateDiscountType }
     *     
     */
    public RateDiscountType getRateDiscountType() {
        return rateDiscountType;
    }

    /**
     * Sets the value of the rateDiscountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDiscountType }
     *     
     */
    public void setRateDiscountType(RateDiscountType value) {
        this.rateDiscountType = value;
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

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}
