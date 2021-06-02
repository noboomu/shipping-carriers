
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiabilityCoverageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiabilityCoverageDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoverageType" type="{http://fedex.com/ws/vacs/v14}LiabilityCoverageType" minOccurs="0"/&gt;
 *         &lt;element name="CoverageAmount" type="{http://fedex.com/ws/vacs/v14}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiabilityCoverageDetail", propOrder = {
    "coverageType",
    "coverageAmount"
})
public class LiabilityCoverageDetail {

    @XmlElement(name = "CoverageType")
    @XmlSchemaType(name = "string")
    protected LiabilityCoverageType coverageType;
    @XmlElement(name = "CoverageAmount")
    protected Money coverageAmount;

    /**
     * Gets the value of the coverageType property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityCoverageType }
     *     
     */
    public LiabilityCoverageType getCoverageType() {
        return coverageType;
    }

    /**
     * Sets the value of the coverageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityCoverageType }
     *     
     */
    public void setCoverageType(LiabilityCoverageType value) {
        this.coverageType = value;
    }

    /**
     * Gets the value of the coverageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCoverageAmount() {
        return coverageAmount;
    }

    /**
     * Sets the value of the coverageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCoverageAmount(Money value) {
        this.coverageAmount = value;
    }

}
