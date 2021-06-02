
package com.fedex.ws.cnty.v8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityFirstInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CleanedPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescriptions" type="{http://fedex.com/ws/cnty/v8}LocationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalDetail", propOrder = {
    "countryCode",
    "stateOrProvinceCode",
    "cityFirstInitials",
    "cleanedPostalCode",
    "locationDescriptions"
})
public class PostalDetail {

    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "StateOrProvinceCode")
    protected String stateOrProvinceCode;
    @XmlElement(name = "CityFirstInitials")
    protected String cityFirstInitials;
    @XmlElement(name = "CleanedPostalCode")
    protected String cleanedPostalCode;
    @XmlElement(name = "LocationDescriptions")
    protected List<LocationDescription> locationDescriptions;

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
     * Gets the value of the cityFirstInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityFirstInitials() {
        return cityFirstInitials;
    }

    /**
     * Sets the value of the cityFirstInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityFirstInitials(String value) {
        this.cityFirstInitials = value;
    }

    /**
     * Gets the value of the cleanedPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanedPostalCode() {
        return cleanedPostalCode;
    }

    /**
     * Sets the value of the cleanedPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanedPostalCode(String value) {
        this.cleanedPostalCode = value;
    }

    /**
     * Gets the value of the locationDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDescription }
     * 
     * 
     */
    public List<LocationDescription> getLocationDescriptions() {
        if (locationDescriptions == null) {
            locationDescriptions = new ArrayList<LocationDescription>();
        }
        return this.locationDescriptions;
    }

}
