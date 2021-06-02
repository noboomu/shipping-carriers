
package com.ups.xmlschema.xoltws.freightrate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverSeasLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverSeasLegType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dimensions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}DimensionType"/&gt;
 *         &lt;element name="Value" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}DimensionValueType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverSeasLegType", propOrder = {
    "dimensions",
    "value"
})
public class OverSeasLegType {

    @XmlElement(name = "Dimensions", required = true)
    protected DimensionType dimensions;
    @XmlElement(name = "Value", required = true)
    protected DimensionValueType value;

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setDimensions(DimensionType value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionValueType }
     *     
     */
    public DimensionValueType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionValueType }
     *     
     */
    public void setValue(DimensionValueType value) {
        this.value = value;
    }

}
