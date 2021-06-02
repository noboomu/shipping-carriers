
package com.ups.xmlschema.xoltws.tnt.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestShipToType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestShipToType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}RequestShipToAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestShipToType", propOrder = {
    "address"
})
public class RequestShipToType {

    @XmlElement(name = "Address", required = true)
    protected RequestShipToAddressType address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link RequestShipToAddressType }
     *     
     */
    public RequestShipToAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShipToAddressType }
     *     
     */
    public void setAddress(RequestShipToAddressType value) {
        this.address = value;
    }

}
