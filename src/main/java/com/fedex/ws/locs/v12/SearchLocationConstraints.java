
package com.fedex.ws.locs.v12;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies additional constraints on the attributes of the locations being searched.
 * 
 * <p>Java class for SearchLocationConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLocationConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RadiusDistance" type="{http://fedex.com/ws/locs/v12}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DropOffTimeNeeded" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="ResultsFilters" type="{http://fedex.com/ws/locs/v12}LocationSearchFilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupportedRedirectToHoldServices" type="{http://fedex.com/ws/locs/v12}SupportedRedirectToHoldServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequiredLocationAttributes" type="{http://fedex.com/ws/locs/v12}LocationAttributesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequiredLocationCapabilities" type="{http://fedex.com/ws/locs/v12}LocationCapabilityDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentDetail" type="{http://fedex.com/ws/locs/v12}LocationSupportedShipmentDetail" minOccurs="0"/&gt;
 *         &lt;element name="ResultsToSkip" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="ResultsRequested" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="LocationContentOptions" type="{http://fedex.com/ws/locs/v12}LocationContentOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocationTypesToInclude" type="{http://fedex.com/ws/locs/v12}FedExLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLocationConstraints", propOrder = {
    "radiusDistance",
    "dropOffTimeNeeded",
    "resultsFilters",
    "supportedRedirectToHoldServices",
    "requiredLocationAttributes",
    "requiredLocationCapabilities",
    "shipmentDetail",
    "resultsToSkip",
    "resultsRequested",
    "locationContentOptions",
    "locationTypesToInclude"
})
public class SearchLocationConstraints {

    @XmlElement(name = "RadiusDistance")
    protected Distance radiusDistance;
    @XmlElement(name = "DropOffTimeNeeded")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dropOffTimeNeeded;
    @XmlElement(name = "ResultsFilters")
    @XmlSchemaType(name = "string")
    protected List<LocationSearchFilterType> resultsFilters;
    @XmlElement(name = "SupportedRedirectToHoldServices")
    @XmlSchemaType(name = "string")
    protected List<SupportedRedirectToHoldServiceType> supportedRedirectToHoldServices;
    @XmlElement(name = "RequiredLocationAttributes")
    @XmlSchemaType(name = "string")
    protected List<LocationAttributesType> requiredLocationAttributes;
    @XmlElement(name = "RequiredLocationCapabilities")
    protected List<LocationCapabilityDetail> requiredLocationCapabilities;
    @XmlElement(name = "ShipmentDetail")
    protected LocationSupportedShipmentDetail shipmentDetail;
    @XmlElement(name = "ResultsToSkip")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resultsToSkip;
    @XmlElement(name = "ResultsRequested")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resultsRequested;
    @XmlElement(name = "LocationContentOptions")
    @XmlSchemaType(name = "string")
    protected List<LocationContentOptionType> locationContentOptions;
    @XmlElement(name = "LocationTypesToInclude")
    @XmlSchemaType(name = "string")
    protected List<FedExLocationType> locationTypesToInclude;

    /**
     * Gets the value of the radiusDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getRadiusDistance() {
        return radiusDistance;
    }

    /**
     * Sets the value of the radiusDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setRadiusDistance(Distance value) {
        this.radiusDistance = value;
    }

    /**
     * Gets the value of the dropOffTimeNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropOffTimeNeeded() {
        return dropOffTimeNeeded;
    }

    /**
     * Sets the value of the dropOffTimeNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffTimeNeeded(XMLGregorianCalendar value) {
        this.dropOffTimeNeeded = value;
    }

    /**
     * Gets the value of the resultsFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resultsFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultsFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationSearchFilterType }
     * 
     * 
     */
    public List<LocationSearchFilterType> getResultsFilters() {
        if (resultsFilters == null) {
            resultsFilters = new ArrayList<LocationSearchFilterType>();
        }
        return this.resultsFilters;
    }

    /**
     * Gets the value of the supportedRedirectToHoldServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedRedirectToHoldServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedRedirectToHoldServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedRedirectToHoldServiceType }
     * 
     * 
     */
    public List<SupportedRedirectToHoldServiceType> getSupportedRedirectToHoldServices() {
        if (supportedRedirectToHoldServices == null) {
            supportedRedirectToHoldServices = new ArrayList<SupportedRedirectToHoldServiceType>();
        }
        return this.supportedRedirectToHoldServices;
    }

    /**
     * Gets the value of the requiredLocationAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the requiredLocationAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredLocationAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationAttributesType }
     * 
     * 
     */
    public List<LocationAttributesType> getRequiredLocationAttributes() {
        if (requiredLocationAttributes == null) {
            requiredLocationAttributes = new ArrayList<LocationAttributesType>();
        }
        return this.requiredLocationAttributes;
    }

    /**
     * Gets the value of the requiredLocationCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the requiredLocationCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredLocationCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationCapabilityDetail }
     * 
     * 
     */
    public List<LocationCapabilityDetail> getRequiredLocationCapabilities() {
        if (requiredLocationCapabilities == null) {
            requiredLocationCapabilities = new ArrayList<LocationCapabilityDetail>();
        }
        return this.requiredLocationCapabilities;
    }

    /**
     * Gets the value of the shipmentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSupportedShipmentDetail }
     *     
     */
    public LocationSupportedShipmentDetail getShipmentDetail() {
        return shipmentDetail;
    }

    /**
     * Sets the value of the shipmentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSupportedShipmentDetail }
     *     
     */
    public void setShipmentDetail(LocationSupportedShipmentDetail value) {
        this.shipmentDetail = value;
    }

    /**
     * Gets the value of the resultsToSkip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultsToSkip() {
        return resultsToSkip;
    }

    /**
     * Sets the value of the resultsToSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultsToSkip(BigInteger value) {
        this.resultsToSkip = value;
    }

    /**
     * Gets the value of the resultsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultsRequested() {
        return resultsRequested;
    }

    /**
     * Sets the value of the resultsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultsRequested(BigInteger value) {
        this.resultsRequested = value;
    }

    /**
     * Gets the value of the locationContentOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationContentOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContentOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationContentOptionType }
     * 
     * 
     */
    public List<LocationContentOptionType> getLocationContentOptions() {
        if (locationContentOptions == null) {
            locationContentOptions = new ArrayList<LocationContentOptionType>();
        }
        return this.locationContentOptions;
    }

    /**
     * Gets the value of the locationTypesToInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationTypesToInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationTypesToInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FedExLocationType }
     * 
     * 
     */
    public List<FedExLocationType> getLocationTypesToInclude() {
        if (locationTypesToInclude == null) {
            locationTypesToInclude = new ArrayList<FedExLocationType>();
        }
        return this.locationTypesToInclude;
    }

}
