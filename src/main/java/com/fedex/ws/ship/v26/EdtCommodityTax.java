
package com.fedex.ws.ship.v26;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EdtCommodityTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EdtCommodityTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HarmonizedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Taxes" type="{http://fedex.com/ws/ship/v26}EdtTaxDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://fedex.com/ws/ship/v26}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdtCommodityTax", propOrder = {
    "harmonizedCode",
    "taxes",
    "total"
})
public class EdtCommodityTax {

    @XmlElement(name = "HarmonizedCode")
    protected String harmonizedCode;
    @XmlElement(name = "Taxes")
    protected List<EdtTaxDetail> taxes;
    @XmlElement(name = "Total")
    protected Money total;

    /**
     * Gets the value of the harmonizedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /**
     * Sets the value of the harmonizedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedCode(String value) {
        this.harmonizedCode = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdtTaxDetail }
     * 
     * 
     */
    public List<EdtTaxDetail> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<EdtTaxDetail>();
        }
        return this.taxes;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotal(Money value) {
        this.total = value;
    }

}
