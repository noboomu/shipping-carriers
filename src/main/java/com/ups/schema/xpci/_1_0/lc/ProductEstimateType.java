
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductEstimateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductEstimateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Charges" type="{http://www.ups.com/schema/xpci/1.0/lc}ProductChargesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductEstimateType", propOrder = {
    "tariffCode",
    "charges"
})
public class ProductEstimateType {

    @XmlElement(name = "TariffCode", required = true)
    protected String tariffCode;
    @XmlElement(name = "Charges")
    protected ProductChargesType charges;

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link ProductChargesType }
     *     
     */
    public ProductChargesType getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductChargesType }
     *     
     */
    public void setCharges(ProductChargesType value) {
        this.charges = value;
    }

}
