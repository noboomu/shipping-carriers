
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DimensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnitOfMeasurement" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CodeDescriptionType"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionsType", propOrder = {
    "unitOfMeasurement",
    "length",
    "width",
    "height"
})
public class DimensionsType {

    @XmlElement(name = "UnitOfMeasurement", required = true)
    protected CodeDescriptionType unitOfMeasurement;
    @XmlElement(name = "Length")
    protected String length;
    @XmlElement(name = "Width")
    protected String width;
    @XmlElement(name = "Height")
    protected String height;

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setUnitOfMeasurement(CodeDescriptionType value) {
        this.unitOfMeasurement = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

}
