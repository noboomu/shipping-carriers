
package com.ups.xmlschema.xoltws.tnt.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseShipToType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseShipToType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}ResponseShipToAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseShipToType", propOrder = {
    "address"
})
public class ResponseShipToType {

    @XmlElement(name = "Address", required = true)
    protected ResponseShipToAddressType address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseShipToAddressType }
     *     
     */
    public ResponseShipToAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseShipToAddressType }
     *     
     */
    public void setAddress(ResponseShipToAddressType value) {
        this.address = value;
    }

}
