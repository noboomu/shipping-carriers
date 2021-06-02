
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes an individual location providing a set of customer service features.
 * 
 * <p>Java class for LocationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationContactAndAddress" type="{http://fedex.com/ws/locs/v12}LocationContactAndAddress" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://fedex.com/ws/locs/v12}FedExLocationType" minOccurs="0"/&gt;
 *         &lt;element name="LocationTypeForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalFieldsDetail" type="{http://fedex.com/ws/locs/v12}LocationFieldsForInternalFedexUseDetail" minOccurs="0"/&gt;
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/locs/v12}LocationAttributesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocationCapabilities" type="{http://fedex.com/ws/locs/v12}LocationCapabilityDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageMaximumLimits" type="{http://fedex.com/ws/locs/v12}LocationPackageLimitsDetail" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceLocationDetail" type="{http://fedex.com/ws/locs/v12}ClearanceLocationDetail" minOccurs="0"/&gt;
 *         &lt;element name="ServicingLocationDetails" type="{http://fedex.com/ws/locs/v12}LocationIdentificationDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AcceptedCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationHolidays" type="{http://fedex.com/ws/locs/v12}Holiday" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MapUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalHours" type="{http://fedex.com/ws/locs/v12}LocationHours" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExceptionalHours" type="{http://fedex.com/ws/locs/v12}LocationHours" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HoursForEffectiveDate" type="{http://fedex.com/ws/locs/v12}LocationHours" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CarrierDetails" type="{http://fedex.com/ws/locs/v12}CarrierDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDetail", propOrder = {
    "locationId",
    "storeNumber",
    "locationContactAndAddress",
    "specialInstructions",
    "timeZoneOffset",
    "locationType",
    "locationTypeForDisplay",
    "internalFieldsDetail",
    "attributes",
    "locationCapabilities",
    "packageMaximumLimits",
    "clearanceLocationDetail",
    "servicingLocationDetails",
    "acceptedCurrency",
    "locationHolidays",
    "mapUrl",
    "entityId",
    "normalHours",
    "exceptionalHours",
    "hoursForEffectiveDate",
    "carrierDetails"
})
public class LocationDetail {

    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "StoreNumber")
    protected String storeNumber;
    @XmlElement(name = "LocationContactAndAddress")
    protected LocationContactAndAddress locationContactAndAddress;
    @XmlElement(name = "SpecialInstructions")
    protected String specialInstructions;
    @XmlElement(name = "TimeZoneOffset")
    protected String timeZoneOffset;
    @XmlElement(name = "LocationType")
    @XmlSchemaType(name = "string")
    protected FedExLocationType locationType;
    @XmlElement(name = "LocationTypeForDisplay")
    protected String locationTypeForDisplay;
    @XmlElement(name = "InternalFieldsDetail")
    protected LocationFieldsForInternalFedexUseDetail internalFieldsDetail;
    @XmlElement(name = "Attributes")
    @XmlSchemaType(name = "string")
    protected List<LocationAttributesType> attributes;
    @XmlElement(name = "LocationCapabilities")
    protected List<LocationCapabilityDetail> locationCapabilities;
    @XmlElement(name = "PackageMaximumLimits")
    protected LocationPackageLimitsDetail packageMaximumLimits;
    @XmlElement(name = "ClearanceLocationDetail")
    protected ClearanceLocationDetail clearanceLocationDetail;
    @XmlElement(name = "ServicingLocationDetails")
    protected List<LocationIdentificationDetail> servicingLocationDetails;
    @XmlElement(name = "AcceptedCurrency")
    protected String acceptedCurrency;
    @XmlElement(name = "LocationHolidays")
    protected List<Holiday> locationHolidays;
    @XmlElement(name = "MapUrl")
    protected String mapUrl;
    @XmlElement(name = "EntityId")
    protected String entityId;
    @XmlElement(name = "NormalHours")
    protected List<LocationHours> normalHours;
    @XmlElement(name = "ExceptionalHours")
    protected List<LocationHours> exceptionalHours;
    @XmlElement(name = "HoursForEffectiveDate")
    protected List<LocationHours> hoursForEffectiveDate;
    @XmlElement(name = "CarrierDetails")
    protected List<CarrierDetail> carrierDetails;

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the locationContactAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link LocationContactAndAddress }
     *     
     */
    public LocationContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    /**
     * Sets the value of the locationContactAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationContactAndAddress }
     *     
     */
    public void setLocationContactAndAddress(LocationContactAndAddress value) {
        this.locationContactAndAddress = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions(String value) {
        this.specialInstructions = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneOffset(String value) {
        this.timeZoneOffset = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link FedExLocationType }
     *     
     */
    public FedExLocationType getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedExLocationType }
     *     
     */
    public void setLocationType(FedExLocationType value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationTypeForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTypeForDisplay() {
        return locationTypeForDisplay;
    }

    /**
     * Sets the value of the locationTypeForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTypeForDisplay(String value) {
        this.locationTypeForDisplay = value;
    }

    /**
     * Gets the value of the internalFieldsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFieldsForInternalFedexUseDetail }
     *     
     */
    public LocationFieldsForInternalFedexUseDetail getInternalFieldsDetail() {
        return internalFieldsDetail;
    }

    /**
     * Sets the value of the internalFieldsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFieldsForInternalFedexUseDetail }
     *     
     */
    public void setInternalFieldsDetail(LocationFieldsForInternalFedexUseDetail value) {
        this.internalFieldsDetail = value;
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
     * {@link LocationAttributesType }
     * 
     * 
     */
    public List<LocationAttributesType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<LocationAttributesType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the locationCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationCapabilityDetail }
     * 
     * 
     */
    public List<LocationCapabilityDetail> getLocationCapabilities() {
        if (locationCapabilities == null) {
            locationCapabilities = new ArrayList<LocationCapabilityDetail>();
        }
        return this.locationCapabilities;
    }

    /**
     * Gets the value of the packageMaximumLimits property.
     * 
     * @return
     *     possible object is
     *     {@link LocationPackageLimitsDetail }
     *     
     */
    public LocationPackageLimitsDetail getPackageMaximumLimits() {
        return packageMaximumLimits;
    }

    /**
     * Sets the value of the packageMaximumLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationPackageLimitsDetail }
     *     
     */
    public void setPackageMaximumLimits(LocationPackageLimitsDetail value) {
        this.packageMaximumLimits = value;
    }

    /**
     * Gets the value of the clearanceLocationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceLocationDetail }
     *     
     */
    public ClearanceLocationDetail getClearanceLocationDetail() {
        return clearanceLocationDetail;
    }

    /**
     * Sets the value of the clearanceLocationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceLocationDetail }
     *     
     */
    public void setClearanceLocationDetail(ClearanceLocationDetail value) {
        this.clearanceLocationDetail = value;
    }

    /**
     * Gets the value of the servicingLocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the servicingLocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicingLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationIdentificationDetail }
     * 
     * 
     */
    public List<LocationIdentificationDetail> getServicingLocationDetails() {
        if (servicingLocationDetails == null) {
            servicingLocationDetails = new ArrayList<LocationIdentificationDetail>();
        }
        return this.servicingLocationDetails;
    }

    /**
     * Gets the value of the acceptedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptedCurrency() {
        return acceptedCurrency;
    }

    /**
     * Sets the value of the acceptedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedCurrency(String value) {
        this.acceptedCurrency = value;
    }

    /**
     * Gets the value of the locationHolidays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationHolidays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationHolidays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Holiday }
     * 
     * 
     */
    public List<Holiday> getLocationHolidays() {
        if (locationHolidays == null) {
            locationHolidays = new ArrayList<Holiday>();
        }
        return this.locationHolidays;
    }

    /**
     * Gets the value of the mapUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUrl() {
        return mapUrl;
    }

    /**
     * Sets the value of the mapUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUrl(String value) {
        this.mapUrl = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the normalHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the normalHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormalHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHours }
     * 
     * 
     */
    public List<LocationHours> getNormalHours() {
        if (normalHours == null) {
            normalHours = new ArrayList<LocationHours>();
        }
        return this.normalHours;
    }

    /**
     * Gets the value of the exceptionalHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionalHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionalHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHours }
     * 
     * 
     */
    public List<LocationHours> getExceptionalHours() {
        if (exceptionalHours == null) {
            exceptionalHours = new ArrayList<LocationHours>();
        }
        return this.exceptionalHours;
    }

    /**
     * Gets the value of the hoursForEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hoursForEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoursForEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHours }
     * 
     * 
     */
    public List<LocationHours> getHoursForEffectiveDate() {
        if (hoursForEffectiveDate == null) {
            hoursForEffectiveDate = new ArrayList<LocationHours>();
        }
        return this.hoursForEffectiveDate;
    }

    /**
     * Gets the value of the carrierDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carrierDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierDetail }
     * 
     * 
     */
    public List<CarrierDetail> getCarrierDetails() {
        if (carrierDetails == null) {
            carrierDetails = new ArrayList<CarrierDetail>();
        }
        return this.carrierDetails;
    }

}
