
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemizedCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}TaxChargeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType"/&gt;
 *         &lt;element name="TotalChargesWithTaxes" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalChargeType", propOrder = {
    "itemizedCharges",
    "taxCharges",
    "totalCharge",
    "totalChargesWithTaxes"
})
public class TotalChargeType {

    @XmlElement(name = "ItemizedCharges")
    protected List<ChargesType> itemizedCharges;
    @XmlElement(name = "TaxCharges")
    protected List<TaxChargeType> taxCharges;
    @XmlElement(name = "TotalCharge", required = true)
    protected ChargesType totalCharge;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected ChargesType totalChargesWithTaxes;

    /**
     * Gets the value of the itemizedCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesType }
     * 
     * 
     */
    public List<ChargesType> getItemizedCharges() {
        if (itemizedCharges == null) {
            itemizedCharges = new ArrayList<ChargesType>();
        }
        return this.itemizedCharges;
    }

    /**
     * Gets the value of the taxCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxChargeType }
     * 
     * 
     */
    public List<TaxChargeType> getTaxCharges() {
        if (taxCharges == null) {
            taxCharges = new ArrayList<TaxChargeType>();
        }
        return this.taxCharges;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTotalCharge(ChargesType value) {
        this.totalCharge = value;
    }

    /**
     * Gets the value of the totalChargesWithTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * Sets the value of the totalChargesWithTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTotalChargesWithTaxes(ChargesType value) {
        this.totalChargesWithTaxes = value;
    }

}
