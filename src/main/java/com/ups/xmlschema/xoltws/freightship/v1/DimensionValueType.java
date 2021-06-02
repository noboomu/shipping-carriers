
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DimensionValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cube" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}CubeType" minOccurs="0"/&gt;
 *         &lt;element name="CWT" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}CWTType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionValueType", propOrder = {
    "cube",
    "cwt"
})
public class DimensionValueType {

    @XmlElement(name = "Cube")
    protected CubeType cube;
    @XmlElement(name = "CWT")
    protected CWTType cwt;

    /**
     * Gets the value of the cube property.
     * 
     * @return
     *     possible object is
     *     {@link CubeType }
     *     
     */
    public CubeType getCube() {
        return cube;
    }

    /**
     * Sets the value of the cube property.
     * 
     * @param value
     *     allowed object is
     *     {@link CubeType }
     *     
     */
    public void setCube(CubeType value) {
        this.cube = value;
    }

    /**
     * Gets the value of the cwt property.
     * 
     * @return
     *     possible object is
     *     {@link CWTType }
     *     
     */
    public CWTType getCWT() {
        return cwt;
    }

    /**
     * Sets the value of the cwt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CWTType }
     *     
     */
    public void setCWT(CWTType value) {
        this.cwt = value;
    }

}
