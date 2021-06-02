
package com.ups.xmlschema.xoltws.tnt.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestShipFromType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestShipFromType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}RequestShipFromAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestShipFromType", propOrder = {
    "address"
})
public class RequestShipFromType {

    @XmlElement(name = "Address", required = true)
    protected RequestShipFromAddressType address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link RequestShipFromAddressType }
     *     
     */
    public RequestShipFromAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShipFromAddressType }
     *     
     */
    public void setAddress(RequestShipFromAddressType value) {
        this.address = value;
    }

}
