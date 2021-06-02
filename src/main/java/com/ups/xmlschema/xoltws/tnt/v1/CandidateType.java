
package com.ups.xmlschema.xoltws.tnt.v1;

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
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}ResponseShipListAddressType"/&gt;
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
    "address"
})
public class CandidateType {

    @XmlElement(name = "Address", required = true)
    protected ResponseShipListAddressType address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseShipListAddressType }
     *     
     */
    public ResponseShipListAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseShipListAddressType }
     *     
     */
    public void setAddress(ResponseShipListAddressType value) {
        this.address = value;
    }

}
