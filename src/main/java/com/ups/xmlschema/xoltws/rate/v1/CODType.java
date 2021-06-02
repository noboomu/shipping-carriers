
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODFundsCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODAmount" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CODAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODType", propOrder = {
    "codFundsCode",
    "codAmount"
})
public class CODType {

    @XmlElement(name = "CODFundsCode", required = true)
    protected String codFundsCode;
    @XmlElement(name = "CODAmount", required = true)
    protected CODAmountType codAmount;

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
     *     {@link CODAmountType }
     *     
     */
    public CODAmountType getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODAmountType }
     *     
     */
    public void setCODAmount(CODAmountType value) {
        this.codAmount = value;
    }

}
