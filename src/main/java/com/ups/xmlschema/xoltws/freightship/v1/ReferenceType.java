
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ReferenceNumberType"/&gt;
 *         &lt;element name="BarCodeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfCartons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}WeightType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceType", propOrder = {
    "number",
    "barCodeIndicator",
    "numberOfCartons",
    "weight"
})
public class ReferenceType {

    @XmlElement(name = "Number", required = true)
    protected ReferenceNumberType number;
    @XmlElement(name = "BarCodeIndicator")
    protected String barCodeIndicator;
    @XmlElement(name = "NumberOfCartons")
    protected String numberOfCartons;
    @XmlElement(name = "Weight")
    protected WeightType weight;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceNumberType }
     *     
     */
    public ReferenceNumberType getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceNumberType }
     *     
     */
    public void setNumber(ReferenceNumberType value) {
        this.number = value;
    }

    /**
     * Gets the value of the barCodeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeIndicator() {
        return barCodeIndicator;
    }

    /**
     * Sets the value of the barCodeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeIndicator(String value) {
        this.barCodeIndicator = value;
    }

    /**
     * Gets the value of the numberOfCartons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfCartons() {
        return numberOfCartons;
    }

    /**
     * Sets the value of the numberOfCartons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfCartons(String value) {
        this.numberOfCartons = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setWeight(WeightType value) {
        this.weight = value;
    }

}
