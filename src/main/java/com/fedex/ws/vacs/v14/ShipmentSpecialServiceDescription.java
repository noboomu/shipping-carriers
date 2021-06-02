
package com.fedex.ws.vacs.v14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentSpecialServiceDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentSpecialServiceDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierCodesAndServices" type="{http://fedex.com/ws/vacs/v14}ServiceTypesByCarrierCodeDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubSpecialServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubNames" type="{http://fedex.com/ws/vacs/v14}ProductName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Names" type="{http://fedex.com/ws/vacs/v14}ProductName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServiceSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AstraDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIntegrationMode" type="{http://fedex.com/ws/vacs/v14}CustomerIntegrationModeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentSpecialServiceDescription", propOrder = {
    "carrierCodesAndServices",
    "subSpecialServiceId",
    "subNames",
    "specialServiceId",
    "names",
    "specialServiceType",
    "specialServiceSubType",
    "code",
    "description",
    "astraDescription",
    "customerIntegrationMode"
})
public class ShipmentSpecialServiceDescription {

    @XmlElement(name = "CarrierCodesAndServices")
    protected List<ServiceTypesByCarrierCodeDetail> carrierCodesAndServices;
    @XmlElement(name = "SubSpecialServiceId")
    protected String subSpecialServiceId;
    @XmlElement(name = "SubNames")
    protected List<ProductName> subNames;
    @XmlElement(name = "SpecialServiceId")
    protected String specialServiceId;
    @XmlElement(name = "Names")
    protected List<ProductName> names;
    @XmlElement(name = "SpecialServiceType")
    protected String specialServiceType;
    @XmlElement(name = "SpecialServiceSubType")
    protected String specialServiceSubType;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AstraDescription")
    protected String astraDescription;
    @XmlElement(name = "CustomerIntegrationMode")
    @XmlSchemaType(name = "string")
    protected CustomerIntegrationModeType customerIntegrationMode;

    /**
     * Gets the value of the carrierCodesAndServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carrierCodesAndServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierCodesAndServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTypesByCarrierCodeDetail }
     * 
     * 
     */
    public List<ServiceTypesByCarrierCodeDetail> getCarrierCodesAndServices() {
        if (carrierCodesAndServices == null) {
            carrierCodesAndServices = new ArrayList<ServiceTypesByCarrierCodeDetail>();
        }
        return this.carrierCodesAndServices;
    }

    /**
     * Gets the value of the subSpecialServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSpecialServiceId() {
        return subSpecialServiceId;
    }

    /**
     * Sets the value of the subSpecialServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSpecialServiceId(String value) {
        this.subSpecialServiceId = value;
    }

    /**
     * Gets the value of the subNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductName }
     * 
     * 
     */
    public List<ProductName> getSubNames() {
        if (subNames == null) {
            subNames = new ArrayList<ProductName>();
        }
        return this.subNames;
    }

    /**
     * Gets the value of the specialServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServiceId() {
        return specialServiceId;
    }

    /**
     * Sets the value of the specialServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServiceId(String value) {
        this.specialServiceId = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductName }
     * 
     * 
     */
    public List<ProductName> getNames() {
        if (names == null) {
            names = new ArrayList<ProductName>();
        }
        return this.names;
    }

    /**
     * Gets the value of the specialServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServiceType() {
        return specialServiceType;
    }

    /**
     * Sets the value of the specialServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServiceType(String value) {
        this.specialServiceType = value;
    }

    /**
     * Gets the value of the specialServiceSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServiceSubType() {
        return specialServiceSubType;
    }

    /**
     * Sets the value of the specialServiceSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServiceSubType(String value) {
        this.specialServiceSubType = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the astraDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstraDescription() {
        return astraDescription;
    }

    /**
     * Sets the value of the astraDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstraDescription(String value) {
        this.astraDescription = value;
    }

    /**
     * Gets the value of the customerIntegrationMode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIntegrationModeType }
     *     
     */
    public CustomerIntegrationModeType getCustomerIntegrationMode() {
        return customerIntegrationMode;
    }

    /**
     * Sets the value of the customerIntegrationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIntegrationModeType }
     *     
     */
    public void setCustomerIntegrationMode(CustomerIntegrationModeType value) {
        this.customerIntegrationMode = value;
    }

}
