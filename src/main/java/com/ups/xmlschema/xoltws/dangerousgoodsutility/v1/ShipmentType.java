
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

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
 *         &lt;element name="ShipperNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShipFromAddress" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}AddressType"/&gt;
 *         &lt;element name="ShipToAddress" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}AddressType"/&gt;
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}ServiceType"/&gt;
 *         &lt;element name="RegulationSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}PackageType" maxOccurs="unbounded"/&gt;
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
    "shipperNumber",
    "shipFromAddress",
    "shipToAddress",
    "service",
    "regulationSet",
    "_package"
})
public class ShipmentType {

    @XmlElement(name = "ShipperNumber", required = true)
    protected String shipperNumber;
    @XmlElement(name = "ShipFromAddress", required = true)
    protected AddressType shipFromAddress;
    @XmlElement(name = "ShipToAddress", required = true)
    protected AddressType shipToAddress;
    @XmlElement(name = "Service", required = true)
    protected ServiceType service;
    @XmlElement(name = "RegulationSet")
    protected String regulationSet;
    @XmlElement(name = "Package", required = true)
    protected List<PackageType> _package;

    /**
     * Gets the value of the shipperNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperNumber() {
        return shipperNumber;
    }

    /**
     * Sets the value of the shipperNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperNumber(String value) {
        this.shipperNumber = value;
    }

    /**
     * Gets the value of the shipFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipFromAddress() {
        return shipFromAddress;
    }

    /**
     * Sets the value of the shipFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipFromAddress(AddressType value) {
        this.shipFromAddress = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipToAddress(AddressType value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the regulationSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationSet() {
        return regulationSet;
    }

    /**
     * Sets the value of the regulationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationSet(String value) {
        this.regulationSet = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }

}
