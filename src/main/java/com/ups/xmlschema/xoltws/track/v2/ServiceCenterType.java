
package com.ups.xmlschema.xoltws.track.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCenterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0}CommonCodeDescriptionType"/&gt;
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0}AddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCenterType", propOrder = {
    "type",
    "address"
})
public class ServiceCenterType {

    @XmlElement(name = "Type", required = true)
    protected CommonCodeDescriptionType type;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CommonCodeDescriptionType }
     *     
     */
    public CommonCodeDescriptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonCodeDescriptionType }
     *     
     */
    public void setType(CommonCodeDescriptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

}
