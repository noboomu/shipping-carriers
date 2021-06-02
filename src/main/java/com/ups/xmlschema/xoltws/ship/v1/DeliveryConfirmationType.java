
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DCISType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DCISNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryConfirmationType", propOrder = {
    "dcisType",
    "dcisNumber"
})
public class DeliveryConfirmationType {

    @XmlElement(name = "DCISType", required = true)
    protected String dcisType;
    @XmlElement(name = "DCISNumber")
    protected String dcisNumber;

    /**
     * Gets the value of the dcisType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCISType() {
        return dcisType;
    }

    /**
     * Sets the value of the dcisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCISType(String value) {
        this.dcisType = value;
    }

    /**
     * Gets the value of the dcisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCISNumber() {
        return dcisNumber;
    }

    /**
     * Sets the value of the dcisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCISNumber(String value) {
        this.dcisNumber = value;
    }

}
