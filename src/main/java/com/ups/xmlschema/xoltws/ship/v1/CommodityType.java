
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NMFC" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}NMFCType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityType", propOrder = {
    "freightClass",
    "nmfc"
})
public class CommodityType {

    @XmlElement(name = "FreightClass", required = true)
    protected String freightClass;
    @XmlElement(name = "NMFC")
    protected NMFCType nmfc;

    /**
     * Gets the value of the freightClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightClass() {
        return freightClass;
    }

    /**
     * Sets the value of the freightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightClass(String value) {
        this.freightClass = value;
    }

    /**
     * Gets the value of the nmfc property.
     * 
     * @return
     *     possible object is
     *     {@link NMFCType }
     *     
     */
    public NMFCType getNMFC() {
        return nmfc;
    }

    /**
     * Sets the value of the nmfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMFCType }
     *     
     */
    public void setNMFC(NMFCType value) {
        this.nmfc = value;
    }

}
