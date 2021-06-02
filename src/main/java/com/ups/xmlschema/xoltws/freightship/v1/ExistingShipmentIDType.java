
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExistingShipmentIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExistingShipmentIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ConfirmationNumberType" minOccurs="0"/&gt;
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExistingShipmentIDType", propOrder = {
    "shipmentNumber",
    "confirmationNumber",
    "creationDate"
})
public class ExistingShipmentIDType {

    @XmlElement(name = "ShipmentNumber", required = true)
    protected String shipmentNumber;
    @XmlElement(name = "ConfirmationNumber")
    protected ConfirmationNumberType confirmationNumber;
    @XmlElement(name = "CreationDate")
    protected String creationDate;

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Sets the value of the shipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNumber(String value) {
        this.shipmentNumber = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationNumberType }
     *     
     */
    public ConfirmationNumberType getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationNumberType }
     *     
     */
    public void setConfirmationNumber(ConfirmationNumberType value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

}
