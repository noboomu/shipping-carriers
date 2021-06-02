
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductChargesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductChargesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Duties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxesAndFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostOfGoods" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ProductChargesType", propOrder = {
    "duties",
    "taxesAndFees",
    "vat",
    "costOfGoods",
    "subTotal"
})
public class ProductChargesType {

    @XmlElement(name = "Duties")
    protected String duties;
    @XmlElement(name = "TaxesAndFees")
    protected String taxesAndFees;
    @XmlElement(name = "VAT")
    protected String vat;
    @XmlElement(name = "CostOfGoods", required = true)
    protected String costOfGoods;
    @XmlElement(name = "SubTotal", required = true)
    protected String subTotal;

    /**
     * Gets the value of the duties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuties() {
        return duties;
    }

    /**
     * Sets the value of the duties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuties(String value) {
        this.duties = value;
    }

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
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAT(String value) {
        this.vat = value;
    }

    /**
     * Gets the value of the costOfGoods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostOfGoods() {
        return costOfGoods;
    }

    /**
     * Sets the value of the costOfGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostOfGoods(String value) {
        this.costOfGoods = value;
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
