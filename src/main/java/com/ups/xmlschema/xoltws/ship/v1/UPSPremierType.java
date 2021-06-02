
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UPSPremierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPSPremierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SensorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HandlingInstructions" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}HandlingInstructionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPSPremierType", propOrder = {
    "category",
    "sensorID",
    "handlingInstructions"
})
public class UPSPremierType {

    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "SensorID")
    protected String sensorID;
    @XmlElement(name = "HandlingInstructions")
    protected HandlingInstructionsType handlingInstructions;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the sensorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorID() {
        return sensorID;
    }

    /**
     * Sets the value of the sensorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorID(String value) {
        this.sensorID = value;
    }

    /**
     * Gets the value of the handlingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingInstructionsType }
     *     
     */
    public HandlingInstructionsType getHandlingInstructions() {
        return handlingInstructions;
    }

    /**
     * Sets the value of the handlingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingInstructionsType }
     *     
     */
    public void setHandlingInstructions(HandlingInstructionsType value) {
        this.handlingInstructions = value;
    }

}
