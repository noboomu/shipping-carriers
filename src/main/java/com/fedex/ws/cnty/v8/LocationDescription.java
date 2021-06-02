
package com.fedex.ws.cnty.v8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedPackageSpecialServices" type="{http://fedex.com/ws/cnty/v8}PackageSpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedShipmentSpecialServices" type="{http://fedex.com/ws/cnty/v8}ShipmentSpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FedExEuropeFirstOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDescription", propOrder = {
    "locationId",
    "locationNumber",
    "countryCode",
    "stateOrProvinceCode",
    "postalCode",
    "serviceArea",
    "airportId",
    "restrictedPackageSpecialServices",
    "restrictedShipmentSpecialServices",
    "fedExEuropeFirstOrigin"
})
public class LocationDescription {

    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "LocationNumber")
    protected Integer locationNumber;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "StateOrProvinceCode")
    protected String stateOrProvinceCode;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "ServiceArea")
    protected String serviceArea;
    @XmlElement(name = "AirportId")
    protected String airportId;
    @XmlElement(name = "RestrictedPackageSpecialServices")
    @XmlSchemaType(name = "string")
    protected List<PackageSpecialServiceType> restrictedPackageSpecialServices;
    @XmlElement(name = "RestrictedShipmentSpecialServices")
    @XmlSchemaType(name = "string")
    protected List<ShipmentSpecialServiceType> restrictedShipmentSpecialServices;
    @XmlElement(name = "FedExEuropeFirstOrigin")
    protected Boolean fedExEuropeFirstOrigin;

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
     * Gets the value of the locationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationNumber() {
        return locationNumber;
    }

    /**
     * Sets the value of the locationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationNumber(Integer value) {
        this.locationNumber = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the stateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Sets the value of the stateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvinceCode(String value) {
        this.stateOrProvinceCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the serviceArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceArea() {
        return serviceArea;
    }

    /**
     * Sets the value of the serviceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceArea(String value) {
        this.serviceArea = value;
    }

    /**
     * Gets the value of the airportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportId() {
        return airportId;
    }

    /**
     * Sets the value of the airportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportId(String value) {
        this.airportId = value;
    }

    /**
     * Gets the value of the restrictedPackageSpecialServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedPackageSpecialServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedPackageSpecialServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageSpecialServiceType }
     * 
     * 
     */
    public List<PackageSpecialServiceType> getRestrictedPackageSpecialServices() {
        if (restrictedPackageSpecialServices == null) {
            restrictedPackageSpecialServices = new ArrayList<PackageSpecialServiceType>();
        }
        return this.restrictedPackageSpecialServices;
    }

    /**
     * Gets the value of the restrictedShipmentSpecialServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedShipmentSpecialServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedShipmentSpecialServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentSpecialServiceType }
     * 
     * 
     */
    public List<ShipmentSpecialServiceType> getRestrictedShipmentSpecialServices() {
        if (restrictedShipmentSpecialServices == null) {
            restrictedShipmentSpecialServices = new ArrayList<ShipmentSpecialServiceType>();
        }
        return this.restrictedShipmentSpecialServices;
    }

    /**
     * Gets the value of the fedExEuropeFirstOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFedExEuropeFirstOrigin() {
        return fedExEuropeFirstOrigin;
    }

    /**
     * Sets the value of the fedExEuropeFirstOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFedExEuropeFirstOrigin(Boolean value) {
        this.fedExEuropeFirstOrigin = value;
    }

}
