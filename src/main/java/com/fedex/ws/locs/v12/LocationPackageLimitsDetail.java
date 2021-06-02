
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationPackageLimitsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationPackageLimitsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Weight" type="{http://fedex.com/ws/locs/v12}Weight" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://fedex.com/ws/locs/v12}Dimensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationPackageLimitsDetail", propOrder = {
    "weight",
    "dimensions"
})
public class LocationPackageLimitsDetail {

    @XmlElement(name = "Weight")
    protected Weight weight;
    @XmlElement(name = "Dimensions")
    protected Dimensions dimensions;

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

}
