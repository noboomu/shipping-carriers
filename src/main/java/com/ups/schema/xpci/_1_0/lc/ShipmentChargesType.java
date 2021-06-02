
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentChargesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentChargesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxesAndFees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdditionalInsuranceCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportationCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentChargesType", propOrder = {
    "taxesAndFees",
    "additionalInsuranceCost",
    "transportationCost",
    "subTotal"
})
public class ShipmentChargesType {

    @XmlElement(name = "TaxesAndFees", required = true)
    protected String taxesAndFees;
    @XmlElement(name = "AdditionalInsuranceCost")
    protected String additionalInsuranceCost;
    @XmlElement(name = "TransportationCost")
    protected String transportationCost;
    @XmlElement(name = "SubTotal", required = true)
    protected String subTotal;

    /**
     * Gets the value of the taxesAndFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxesAndFees() {
        return taxesAndFees;
    }

    /**
     * Sets the value of the taxesAndFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxesAndFees(String value) {
        this.taxesAndFees = value;
    }

    /**
     * Gets the value of the additionalInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInsuranceCost() {
        return additionalInsuranceCost;
    }

    /**
     * Sets the value of the additionalInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInsuranceCost(String value) {
        this.additionalInsuranceCost = value;
    }

    /**
     * Gets the value of the transportationCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationCost() {
        return transportationCost;
    }

    /**
     * Sets the value of the transportationCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationCost(String value) {
        this.transportationCost = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTotal(String value) {
        this.subTotal = value;
    }

}
