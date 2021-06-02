
package com.ups.schema.xpci._1_0.lc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductsChargesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductsChargesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product" type="{http://www.ups.com/schema/xpci/1.0/lc}ProductEstimateType" maxOccurs="99"/&gt;
 *         &lt;element name="ProductsSubTotal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductsChargesType", propOrder = {
    "product",
    "productsSubTotal"
})
public class ProductsChargesType {

    @XmlElement(name = "Product", required = true)
    protected List<ProductEstimateType> product;
    @XmlElement(name = "ProductsSubTotal", required = true)
    protected String productsSubTotal;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductEstimateType }
     * 
     * 
     */
    public List<ProductEstimateType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductEstimateType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the productsSubTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductsSubTotal() {
        return productsSubTotal;
    }

    /**
     * Sets the value of the productsSubTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductsSubTotal(String value) {
        this.productsSubTotal = value;
    }

}
