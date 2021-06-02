
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipToAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipToAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}AddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResidentialAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipToAddressType", propOrder = {
    "residentialAddressIndicator"
})
public class ShipToAddressType
    extends AddressType
{

    @XmlElement(name = "ResidentialAddressIndicator")
    protected String residentialAddressIndicator;

    /**
     * Gets the value of the residentialAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialAddressIndicator() {
        return residentialAddressIndicator;
    }

    /**
     * Sets the value of the residentialAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialAddressIndicator(String value) {
        this.residentialAddressIndicator = value;
    }

}
