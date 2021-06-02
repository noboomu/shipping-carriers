
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSOCODType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSOCODType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODFundsCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODAmount" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}CurrencyMonetaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSOCODType", propOrder = {
    "codFundsCode",
    "codAmount"
})
public class PSOCODType {

    @XmlElement(name = "CODFundsCode", required = true)
    protected String codFundsCode;
    @XmlElement(name = "CODAmount", required = true)
    protected CurrencyMonetaryType codAmount;

    /**
     * Gets the value of the codFundsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFundsCode() {
        return codFundsCode;
    }

    /**
     * Sets the value of the codFundsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFundsCode(String value) {
        this.codFundsCode = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyMonetaryType }
     *     
     */
    public CurrencyMonetaryType getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyMonetaryType }
     *     
     */
    public void setCODAmount(CurrencyMonetaryType value) {
        this.codAmount = value;
    }

}
