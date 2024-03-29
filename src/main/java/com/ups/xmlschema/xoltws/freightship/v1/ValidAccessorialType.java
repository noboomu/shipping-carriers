
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidAccessorialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidAccessorialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accessorial" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ShipCodeDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidAccessorialType", propOrder = {
    "accessorial"
})
public class ValidAccessorialType {

    @XmlElement(name = "Accessorial", required = true)
    protected ShipCodeDescriptionType accessorial;

    /**
     * Gets the value of the accessorial property.
     * 
     * @return
     *     possible object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public ShipCodeDescriptionType getAccessorial() {
        return accessorial;
    }

    /**
     * Sets the value of the accessorial property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public void setAccessorial(ShipCodeDescriptionType value) {
        this.accessorial = value;
    }

}
