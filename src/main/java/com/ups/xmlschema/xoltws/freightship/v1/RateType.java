
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ShipCodeDescriptionType"/&gt;
 *         &lt;element name="Factor" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}FactorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateType", propOrder = {
    "type",
    "factor"
})
public class RateType {

    @XmlElement(name = "Type", required = true)
    protected ShipCodeDescriptionType type;
    @XmlElement(name = "Factor", required = true)
    protected FactorType factor;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public ShipCodeDescriptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public void setType(ShipCodeDescriptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return
     *     possible object is
     *     {@link FactorType }
     *     
     */
    public FactorType getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactorType }
     *     
     */
    public void setFactor(FactorType value) {
        this.factor = value;
    }

}
