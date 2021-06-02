
package com.ups.schema.xpci._1_0.lc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginStateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationStateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreightCharges" type="{http://www.ups.com/schema/xpci/1.0/lc}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInsurance" type="{http://www.ups.com/schema/xpci/1.0/lc}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://www.ups.com/schema/xpci/1.0/lc}ProductType" maxOccurs="99"/&gt;
 *         &lt;element name="ResultCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentType", propOrder = {
    "originCountryCode",
    "originStateProvinceCode",
    "destinationCountryCode",
    "destinationStateProvinceCode",
    "transportationMode",
    "freightCharges",
    "additionalInsurance",
    "product",
    "resultCurrencyCode",
    "tariffCodeAlert"
})
public class ShipmentType {

    @XmlElement(name = "OriginCountryCode", required = true)
    protected String originCountryCode;
    @XmlElement(name = "OriginStateProvinceCode")
    protected String originStateProvinceCode;
    @XmlElement(name = "DestinationCountryCode", required = true)
    protected String destinationCountryCode;
    @XmlElement(name = "DestinationStateProvinceCode")
    protected String destinationStateProvinceCode;
    @XmlElement(name = "TransportationMode")
    protected String transportationMode;
    @XmlElement(name = "FreightCharges")
    protected ChargesType freightCharges;
    @XmlElement(name = "AdditionalInsurance")
    protected ChargesType additionalInsurance;
    @XmlElement(name = "Product", required = true)
    protected List<ProductType> product;
    @XmlElement(name = "ResultCurrencyCode")
    protected String resultCurrencyCode;
    @XmlElement(name = "TariffCodeAlert")
    protected String tariffCodeAlert;

    /**
     * Gets the value of the originCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * Sets the value of the originCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * Gets the value of the originStateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStateProvinceCode() {
        return originStateProvinceCode;
    }

    /**
     * Sets the value of the originStateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStateProvinceCode(String value) {
        this.originStateProvinceCode = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the destinationStateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStateProvinceCode() {
        return destinationStateProvinceCode;
    }

    /**
     * Sets the value of the destinationStateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStateProvinceCode(String value) {
        this.destinationStateProvinceCode = value;
    }

    /**
     * Gets the value of the transportationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationMode() {
        return transportationMode;
    }

    /**
     * Sets the value of the transportationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationMode(String value) {
        this.transportationMode = value;
    }

    /**
     * Gets the value of the freightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getFreightCharges() {
        return freightCharges;
    }

    /**
     * Sets the value of the freightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setFreightCharges(ChargesType value) {
        this.freightCharges = value;
    }

    /**
     * Gets the value of the additionalInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getAdditionalInsurance() {
        return additionalInsurance;
    }

    /**
     * Sets the value of the additionalInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setAdditionalInsurance(ChargesType value) {
        this.additionalInsurance = value;
    }

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
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the resultCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCurrencyCode() {
        return resultCurrencyCode;
    }

    /**
     * Sets the value of the resultCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCurrencyCode(String value) {
        this.resultCurrencyCode = value;
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
