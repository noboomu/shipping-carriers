
package com.ups.xmlschema.xoltws.freightrate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandlingUnitsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandlingUnitsInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}RateCodeDescriptionType"/&gt;
 *         &lt;element name="Dimensions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}HandlingUnitsDimensionsType"/&gt;
 *         &lt;element name="AdjustedHeight" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}AdjustedHeightType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandlingUnitsInfoType", propOrder = {
    "quantity",
    "type",
    "dimensions",
    "adjustedHeight"
})
public class HandlingUnitsInfoType {

    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "Type", required = true)
    protected RateCodeDescriptionType type;
    @XmlElement(name = "Dimensions", required = true)
    protected HandlingUnitsDimensionsType dimensions;
    @XmlElement(name = "AdjustedHeight", required = true)
    protected AdjustedHeightType adjustedHeight;

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
     *     {@link RateCodeDescriptionType }
     *     
     */
    public RateCodeDescriptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCodeDescriptionType }
     *     
     */
    public void setType(RateCodeDescriptionType value) {
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

    /**
     * Gets the value of the adjustedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustedHeightType }
     *     
     */
    public AdjustedHeightType getAdjustedHeight() {
        return adjustedHeight;
    }

    /**
     * Sets the value of the adjustedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustedHeightType }
     *     
     */
    public void setAdjustedHeight(AdjustedHeightType value) {
        this.adjustedHeight = value;
    }

}
