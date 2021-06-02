
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ShipCodeDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidServiceType", propOrder = {
    "service"
})
public class ValidServiceType {

    @XmlElement(name = "Service", required = true)
    protected ShipCodeDescriptionType service;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public ShipCodeDescriptionType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public void setService(ShipCodeDescriptionType value) {
        this.service = value;
    }

}
