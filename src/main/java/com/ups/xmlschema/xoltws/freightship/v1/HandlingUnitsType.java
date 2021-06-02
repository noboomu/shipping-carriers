
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandlingUnitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandlingUnitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ShipCodeDescriptionType"/&gt;
 *         &lt;element name="Dimensions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}HandlingUnitsDimensionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandlingUnitsType", propOrder = {
    "quantity",
    "type",
    "dimensions"
})
public class HandlingUnitsType {

    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "Type", required = true)
    protected ShipCodeDescriptionType type;
    @XmlElement(name = "Dimensions", required = true)
    protected HandlingUnitsDimensionsType dimensions;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

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
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingUnitsDimensionsType }
     *     
     */
    public HandlingUnitsDimensionsType getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingUnitsDimensionsType }
     *     
     */
    public void setDimensions(HandlingUnitsDimensionsType value) {
        this.dimensions = value;
    }

}
