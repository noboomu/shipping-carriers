
package com.ups.xmlschema.xoltws.error.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationElementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XPathOfElement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "locationElementName",
    "xPathOfElement",
    "originalValue"
})
public class LocationType {

    @XmlElement(name = "LocationElementName")
    protected String locationElementName;
    @XmlElement(name = "XPathOfElement")
    protected String xPathOfElement;
    @XmlElement(name = "OriginalValue")
    protected String originalValue;

    /**
     * Gets the value of the locationElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationElementName() {
        return locationElementName;
    }

    /**
     * Sets the value of the locationElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationElementName(String value) {
        this.locationElementName = value;
    }

    /**
     * Gets the value of the xPathOfElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathOfElement() {
        return xPathOfElement;
    }

    /**
     * Sets the value of the xPathOfElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathOfElement(String value) {
        this.xPathOfElement = value;
    }

    /**
     * Gets the value of the originalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * Sets the value of the originalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalValue(String value) {
        this.originalValue = value;
    }

}
