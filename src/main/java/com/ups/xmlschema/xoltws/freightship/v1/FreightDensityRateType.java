
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightDensityRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightDensityRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Density" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCubicFeet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightDensityRateType", propOrder = {
    "density",
    "totalCubicFeet"
})
public class FreightDensityRateType {

    @XmlElement(name = "Density")
    protected String density;
    @XmlElement(name = "TotalCubicFeet")
    protected String totalCubicFeet;

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensity(String value) {
        this.density = value;
    }

    /**
     * Gets the value of the totalCubicFeet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCubicFeet() {
        return totalCubicFeet;
    }

    /**
     * Sets the value of the totalCubicFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCubicFeet(String value) {
        this.totalCubicFeet = value;
    }

}
