
package com.fedex.ws.vacs.v14;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This definition of variable handling charge detail is intended for use in Jan 2011 corp load.
 * 
 * <p>Java class for VariableHandlingChargeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableHandlingChargeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FixedValue" type="{http://fedex.com/ws/vacs/v14}Money" minOccurs="0"/&gt;
 *         &lt;element name="PercentValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RateElementBasis" type="{http://fedex.com/ws/vacs/v14}RateElementBasisType" minOccurs="0"/&gt;
 *         &lt;element name="RateTypeBasis" type="{http://fedex.com/ws/vacs/v14}RateTypeBasisType" minOccurs="0"/&gt;
 *         &lt;element name="RateLevelBasis" type="{http://fedex.com/ws/vacs/v14}RateLevelBasisType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableHandlingChargeDetail", propOrder = {
    "fixedValue",
    "percentValue",
    "rateElementBasis",
    "rateTypeBasis",
    "rateLevelBasis"
})
public class VariableHandlingChargeDetail {

    @XmlElement(name = "FixedValue")
    protected Money fixedValue;
    @XmlElement(name = "PercentValue")
    protected BigDecimal percentValue;
    @XmlElement(name = "RateElementBasis")
    @XmlSchemaType(name = "string")
    protected RateElementBasisType rateElementBasis;
    @XmlElement(name = "RateTypeBasis")
    @XmlSchemaType(name = "string")
    protected RateTypeBasisType rateTypeBasis;
    @XmlElement(name = "RateLevelBasis")
    @XmlSchemaType(name = "string")
    protected RateLevelBasisType rateLevelBasis;

    /**
     * Gets the value of the fixedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFixedValue() {
        return fixedValue;
    }

    /**
     * Sets the value of the fixedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFixedValue(Money value) {
        this.fixedValue = value;
    }

    /**
     * Gets the value of the percentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentValue() {
        return percentValue;
    }

    /**
     * Sets the value of the percentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentValue(BigDecimal value) {
        this.percentValue = value;
    }

    /**
     * Gets the value of the rateElementBasis property.
     * 
     * @return
     *     possible object is
     *     {@link RateElementBasisType }
     *     
     */
    public RateElementBasisType getRateElementBasis() {
        return rateElementBasis;
    }

    /**
     * Sets the value of the rateElementBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateElementBasisType }
     *     
     */
    public void setRateElementBasis(RateElementBasisType value) {
        this.rateElementBasis = value;
    }

    /**
     * Gets the value of the rateTypeBasis property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeBasisType }
     *     
     */
    public RateTypeBasisType getRateTypeBasis() {
        return rateTypeBasis;
    }

    /**
     * Sets the value of the rateTypeBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeBasisType }
     *     
     */
    public void setRateTypeBasis(RateTypeBasisType value) {
        this.rateTypeBasis = value;
    }

    /**
     * Gets the value of the rateLevelBasis property.
     * 
     * @return
     *     possible object is
     *     {@link RateLevelBasisType }
     *     
     */
    public RateLevelBasisType getRateLevelBasis() {
        return rateLevelBasis;
    }

    /**
     * Sets the value of the rateLevelBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLevelBasisType }
     *     
     */
    public void setRateLevelBasis(RateLevelBasisType value) {
        this.rateLevelBasis = value;
    }

}
