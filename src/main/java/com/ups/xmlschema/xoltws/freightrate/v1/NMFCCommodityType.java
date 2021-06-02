
package com.ups.xmlschema.xoltws.freightrate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NMFCCommodityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NMFCCommodityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMFCCommodityType", propOrder = {
    "primeCode",
    "subCode"
})
public class NMFCCommodityType {

    @XmlElement(name = "PrimeCode", required = true)
    protected String primeCode;
    @XmlElement(name = "SubCode")
    protected String subCode;

    /**
     * Gets the value of the primeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeCode() {
        return primeCode;
    }

    /**
     * Sets the value of the primeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeCode(String value) {
        this.primeCode = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

}
