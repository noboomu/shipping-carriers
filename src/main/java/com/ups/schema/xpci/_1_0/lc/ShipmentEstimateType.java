
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentEstimateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentEstimateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShipmentCharges" type="{http://www.ups.com/schema/xpci/1.0/lc}ShipmentChargesType"/&gt;
 *         &lt;element name="ProductsCharges" type="{http://www.ups.com/schema/xpci/1.0/lc}ProductsChargesType"/&gt;
 *         &lt;element name="TotalLandedCost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentEstimateType", propOrder = {
    "currencyCode",
    "shipmentCharges",
    "productsCharges",
    "totalLandedCost"
})
public class ShipmentEstimateType {

    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "ShipmentCharges", required = true)
    protected ShipmentChargesType shipmentCharges;
    @XmlElement(name = "ProductsCharges", required = true)
    protected ProductsChargesType productsCharges;
    @XmlElement(name = "TotalLandedCost", required = true)
    protected String totalLandedCost;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the shipmentCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentChargesType }
     *     
     */
    public ShipmentChargesType getShipmentCharges() {
        return shipmentCharges;
    }

    /**
     * Sets the value of the shipmentCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentChargesType }
     *     
     */
    public void setShipmentCharges(ShipmentChargesType value) {
        this.shipmentCharges = value;
    }

    /**
     * Gets the value of the productsCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsChargesType }
     *     
     */
    public ProductsChargesType getProductsCharges() {
        return productsCharges;
    }

    /**
     * Sets the value of the productsCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsChargesType }
     *     
     */
    public void setProductsCharges(ProductsChargesType value) {
        this.productsCharges = value;
    }

    /**
     * Gets the value of the totalLandedCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLandedCost() {
        return totalLandedCost;
    }

    /**
     * Sets the value of the totalLandedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLandedCost(String value) {
        this.totalLandedCost = value;
    }

}
