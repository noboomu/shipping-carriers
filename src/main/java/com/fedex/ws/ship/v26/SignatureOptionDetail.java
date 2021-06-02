
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureOptionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureOptionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptionType" type="{http://fedex.com/ws/ship/v26}SignatureOptionType"/&gt;
 *         &lt;element name="SignatureReleaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureOptionDetail", propOrder = {
    "optionType",
    "signatureReleaseNumber"
})
public class SignatureOptionDetail {

    @XmlElement(name = "OptionType", required = true)
    @XmlSchemaType(name = "string")
    protected SignatureOptionType optionType;
    @XmlElement(name = "SignatureReleaseNumber")
    protected String signatureReleaseNumber;

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureOptionType }
     *     
     */
    public SignatureOptionType getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureOptionType }
     *     
     */
    public void setOptionType(SignatureOptionType value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the signatureReleaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureReleaseNumber() {
        return signatureReleaseNumber;
    }

    /**
     * Sets the value of the signatureReleaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureReleaseNumber(String value) {
        this.signatureReleaseNumber = value;
    }

}
