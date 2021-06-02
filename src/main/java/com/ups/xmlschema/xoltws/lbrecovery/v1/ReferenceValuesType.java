
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}ReferenceNumberType"/&gt;
 *         &lt;element name="ShipperNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceValuesType", propOrder = {
    "referenceNumber",
    "shipperNumber"
})
public class ReferenceValuesType {

    @XmlElement(name = "ReferenceNumber", required = true)
    protected ReferenceNumberType referenceNumber;
    @XmlElement(name = "ShipperNumber", required = true)
    protected String shipperNumber;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceNumberType }
     *     
     */
    public ReferenceNumberType getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceNumberType }
     *     
     */
    public void setReferenceNumber(ReferenceNumberType value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the shipperNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperNumber() {
        return shipperNumber;
    }

    /**
     * Sets the value of the shipperNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperNumber(String value) {
        this.shipperNumber = value;
    }

}
