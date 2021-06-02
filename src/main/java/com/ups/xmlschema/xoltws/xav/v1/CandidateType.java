
package com.ups.xmlschema.xoltws.xav.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CandidateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CandidateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressClassification" type="{http://www.ups.com/XMLSchema/XOLTWS/xav/v1.0}AddressClassificationType" minOccurs="0"/&gt;
 *         &lt;element name="AddressKeyFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/xav/v1.0}AddressKeyFormatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateType", propOrder = {
    "addressClassification",
    "addressKeyFormat"
})
public class CandidateType {

    @XmlElement(name = "AddressClassification")
    protected AddressClassificationType addressClassification;
    @XmlElement(name = "AddressKeyFormat", required = true)
    protected AddressKeyFormatType addressKeyFormat;

    /**
     * Gets the value of the addressClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AddressClassificationType }
     *     
     */
    public AddressClassificationType getAddressClassification() {
        return addressClassification;
    }

    /**
     * Sets the value of the addressClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressClassificationType }
     *     
     */
    public void setAddressClassification(AddressClassificationType value) {
        this.addressClassification = value;
    }

    /**
     * Gets the value of the addressKeyFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AddressKeyFormatType }
     *     
     */
    public AddressKeyFormatType getAddressKeyFormat() {
        return addressKeyFormat;
    }

    /**
     * Sets the value of the addressKeyFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressKeyFormatType }
     *     
     */
    public void setAddressKeyFormat(AddressKeyFormatType value) {
        this.addressKeyFormat = value;
    }

}
