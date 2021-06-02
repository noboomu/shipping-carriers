
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipFromType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipFromType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxIDType" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}TaxIDCodeDescType" minOccurs="0"/&gt;
 *         &lt;element name="TariffPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}FreightShipAddressType"/&gt;
 *         &lt;element name="AttentionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}FreightShipPhoneType"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipFromType", propOrder = {
    "name",
    "taxIdentificationNumber",
    "taxIDType",
    "tariffPoint",
    "address",
    "attentionName",
    "phone",
    "faxNumber",
    "eMailAddress"
})
public class ShipFromType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "TaxIdentificationNumber")
    protected String taxIdentificationNumber;
    @XmlElement(name = "TaxIDType")
    protected TaxIDCodeDescType taxIDType;
    @XmlElement(name = "TariffPoint")
    protected String tariffPoint;
    @XmlElement(name = "Address", required = true)
    protected FreightShipAddressType address;
    @XmlElement(name = "AttentionName")
    protected String attentionName;
    @XmlElement(name = "Phone", required = true)
    protected FreightShipPhoneType phone;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "EMailAddress")
    protected String eMailAddress;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the taxIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Sets the value of the taxIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

    /**
     * Gets the value of the taxIDType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIDCodeDescType }
     *     
     */
    public TaxIDCodeDescType getTaxIDType() {
        return taxIDType;
    }

    /**
     * Sets the value of the taxIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIDCodeDescType }
     *     
     */
    public void setTaxIDType(TaxIDCodeDescType value) {
        this.taxIDType = value;
    }

    /**
     * Gets the value of the tariffPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPoint() {
        return tariffPoint;
    }

    /**
     * Sets the value of the tariffPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPoint(String value) {
        this.tariffPoint = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link FreightShipAddressType }
     *     
     */
    public FreightShipAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipAddressType }
     *     
     */
    public void setAddress(FreightShipAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the attentionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionName() {
        return attentionName;
    }

    /**
     * Sets the value of the attentionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionName(String value) {
        this.attentionName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link FreightShipPhoneType }
     *     
     */
    public FreightShipPhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipPhoneType }
     *     
     */
    public void setPhone(FreightShipPhoneType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

}
