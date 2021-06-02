
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the details about the countries supported by this location.
 * 
 * <p>Java class for ClearanceLocationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearanceLocationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServicesSupported" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidationType" type="{http://fedex.com/ws/locs/v12}ConsolidationType" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceLocationType" type="{http://fedex.com/ws/locs/v12}DistributionClearanceType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServicesSupported" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceCountries" type="{http://fedex.com/ws/locs/v12}ClearanceCountryDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceRoutingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearanceLocationDetail", propOrder = {
    "servicesSupported",
    "consolidationType",
    "clearanceLocationType",
    "specialServicesSupported",
    "clearanceCountries",
    "clearanceRoutingCode"
})
public class ClearanceLocationDetail {

    @XmlElement(name = "ServicesSupported")
    protected List<String> servicesSupported;
    @XmlElement(name = "ConsolidationType")
    @XmlSchemaType(name = "string")
    protected ConsolidationType consolidationType;
    @XmlElement(name = "ClearanceLocationType")
    @XmlSchemaType(name = "string")
    protected DistributionClearanceType clearanceLocationType;
    @XmlElement(name = "SpecialServicesSupported")
    protected List<String> specialServicesSupported;
    @XmlElement(name = "ClearanceCountries")
    protected List<ClearanceCountryDetail> clearanceCountries;
    @XmlElement(name = "ClearanceRoutingCode")
    protected String clearanceRoutingCode;

    /**
     * Gets the value of the servicesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the servicesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServicesSupported() {
        if (servicesSupported == null) {
            servicesSupported = new ArrayList<String>();
        }
        return this.servicesSupported;
    }

    /**
     * Gets the value of the consolidationType property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationType }
     *     
     */
    public ConsolidationType getConsolidationType() {
        return consolidationType;
    }

    /**
     * Sets the value of the consolidationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationType }
     *     
     */
    public void setConsolidationType(ConsolidationType value) {
        this.consolidationType = value;
    }

    /**
     * Gets the value of the clearanceLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionClearanceType }
     *     
     */
    public DistributionClearanceType getClearanceLocationType() {
        return clearanceLocationType;
    }

    /**
     * Sets the value of the clearanceLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionClearanceType }
     *     
     */
    public void setClearanceLocationType(DistributionClearanceType value) {
        this.clearanceLocationType = value;
    }

    /**
     * Gets the value of the specialServicesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specialServicesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServicesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialServicesSupported() {
        if (specialServicesSupported == null) {
            specialServicesSupported = new ArrayList<String>();
        }
        return this.specialServicesSupported;
    }

    /**
     * Gets the value of the clearanceCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clearanceCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearanceCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearanceCountryDetail }
     * 
     * 
     */
    public List<ClearanceCountryDetail> getClearanceCountries() {
        if (clearanceCountries == null) {
            clearanceCountries = new ArrayList<ClearanceCountryDetail>();
        }
        return this.clearanceCountries;
    }

    /**
     * Gets the value of the clearanceRoutingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceRoutingCode() {
        return clearanceRoutingCode;
    }

    /**
     * Sets the value of the clearanceRoutingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceRoutingCode(String value) {
        this.clearanceRoutingCode = value;
    }

}
