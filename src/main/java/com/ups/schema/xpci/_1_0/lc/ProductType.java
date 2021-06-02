
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductCountryCodeOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TariffInfo" type="{http://www.ups.com/schema/xpci/1.0/lc}TariffInfoType"/&gt;
 *         &lt;element name="Quantity" type="{http://www.ups.com/schema/xpci/1.0/lc}ValueWithUnitsType"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.ups.com/schema/xpci/1.0/lc}ChargesType"/&gt;
 *         &lt;element name="Weight" type="{http://www.ups.com/schema/xpci/1.0/lc}ValueWithUnitsType" minOccurs="0"/&gt;
 *         &lt;element name="TariffCodeAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "productName",
    "productDescription",
    "productCountryCodeOfOrigin",
    "tariffInfo",
    "quantity",
    "unitPrice",
    "weight",
    "tariffCodeAlert"
})
public class ProductType {

    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductCountryCodeOfOrigin")
    protected String productCountryCodeOfOrigin;
    @XmlElement(name = "TariffInfo", required = true)
    protected TariffInfoType tariffInfo;
    @XmlElement(name = "Quantity", required = true)
    protected ValueWithUnitsType quantity;
    @XmlElement(name = "UnitPrice", required = true)
    protected ChargesType unitPrice;
    @XmlElement(name = "Weight")
    protected ValueWithUnitsType weight;
    @XmlElement(name = "TariffCodeAlert")
    protected String tariffCodeAlert;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productCountryCodeOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCountryCodeOfOrigin() {
        return productCountryCodeOfOrigin;
    }

    /**
     * Sets the value of the productCountryCodeOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCountryCodeOfOrigin(String value) {
        this.productCountryCodeOfOrigin = value;
    }

    /**
     * Gets the value of the tariffInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInfoType }
     *     
     */
    public TariffInfoType getTariffInfo() {
        return tariffInfo;
    }

    /**
     * Sets the value of the tariffInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInfoType }
     *     
     */
    public void setTariffInfo(TariffInfoType value) {
        this.tariffInfo = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link ValueWithUnitsType }
     *     
     */
    public ValueWithUnitsType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueWithUnitsType }
     *     
     */
    public void setQuantity(ValueWithUnitsType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setUnitPrice(ChargesType value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link ValueWithUnitsType }
     *     
     */
    public ValueWithUnitsType getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueWithUnitsType }
     *     
     */
    public void setWeight(ValueWithUnitsType value) {
        this.weight = value;
    }

    /**
     * Gets the value of the tariffCodeAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCodeAlert() {
        return tariffCodeAlert;
    }

    /**
     * Sets the value of the tariffCodeAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCodeAlert(String value) {
        this.tariffCodeAlert = value;
    }

}
