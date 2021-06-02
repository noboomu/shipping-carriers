
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationFieldsForInternalFedexUseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationFieldsForInternalFedexUseDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonRevenueAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityCenterAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/locs/v12}LocationAttributesForInternalFedexUseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperationalContact" type="{http://fedex.com/ws/locs/v12}Contact" minOccurs="0"/&gt;
 *         &lt;element name="LocalAirportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionalAirportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationFieldsForInternalFedexUseDetail", propOrder = {
    "nonRevenueAccountNumber",
    "cityCenterAccountNumber",
    "customsLocationId",
    "costCenterCode",
    "attributes",
    "operationalContact",
    "localAirportId",
    "regionalAirportId"
})
public class LocationFieldsForInternalFedexUseDetail {

    @XmlElement(name = "NonRevenueAccountNumber")
    protected String nonRevenueAccountNumber;
    @XmlElement(name = "CityCenterAccountNumber")
    protected String cityCenterAccountNumber;
    @XmlElement(name = "CustomsLocationId")
    protected String customsLocationId;
    @XmlElement(name = "CostCenterCode")
    protected String costCenterCode;
    @XmlElement(name = "Attributes")
    @XmlSchemaType(name = "string")
    protected List<LocationAttributesForInternalFedexUseType> attributes;
    @XmlElement(name = "OperationalContact")
    protected Contact operationalContact;
    @XmlElement(name = "LocalAirportId")
    protected String localAirportId;
    @XmlElement(name = "RegionalAirportId")
    protected String regionalAirportId;

    /**
     * Gets the value of the nonRevenueAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRevenueAccountNumber() {
        return nonRevenueAccountNumber;
    }

    /**
     * Sets the value of the nonRevenueAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRevenueAccountNumber(String value) {
        this.nonRevenueAccountNumber = value;
    }

    /**
     * Gets the value of the cityCenterAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCenterAccountNumber() {
        return cityCenterAccountNumber;
    }

    /**
     * Sets the value of the cityCenterAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCenterAccountNumber(String value) {
        this.cityCenterAccountNumber = value;
    }

    /**
     * Gets the value of the customsLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsLocationId() {
        return customsLocationId;
    }

    /**
     * Sets the value of the customsLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsLocationId(String value) {
        this.customsLocationId = value;
    }

    /**
     * Gets the value of the costCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * Sets the value of the costCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterCode(String value) {
        this.costCenterCode = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationAttributesForInternalFedexUseType }
     * 
     * 
     */
    public List<LocationAttributesForInternalFedexUseType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<LocationAttributesForInternalFedexUseType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the operationalContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getOperationalContact() {
        return operationalContact;
    }

    /**
     * Sets the value of the operationalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setOperationalContact(Contact value) {
        this.operationalContact = value;
    }

    /**
     * Gets the value of the localAirportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAirportId() {
        return localAirportId;
    }

    /**
     * Sets the value of the localAirportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAirportId(String value) {
        this.localAirportId = value;
    }

    /**
     * Gets the value of the regionalAirportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalAirportId() {
        return regionalAirportId;
    }

    /**
     * Sets the value of the regionalAirportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionalAirportId(String value) {
        this.regionalAirportId = value;
    }

}
