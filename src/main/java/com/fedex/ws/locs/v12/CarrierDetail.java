
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Carrier" type="{http://fedex.com/ws/locs/v12}CarrierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCategory" type="{http://fedex.com/ws/locs/v12}ServiceCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryRelationship" type="{http://fedex.com/ws/locs/v12}CountryRelationshipType" minOccurs="0"/&gt;
 *         &lt;element name="NormalLatestDropOffDetails" type="{http://fedex.com/ws/locs/v12}LatestDropOffDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExceptionalLatestDropOffDetails" type="{http://fedex.com/ws/locs/v12}LatestDropOffDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveLatestDropOffDetails" type="{http://fedex.com/ws/locs/v12}LatestDropOffDetail" minOccurs="0"/&gt;
 *         &lt;element name="ShippingHolidays" type="{http://fedex.com/ws/locs/v12}ShippingHoliday" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierDetail", propOrder = {
    "carrier",
    "serviceCategory",
    "serviceType",
    "countryRelationship",
    "normalLatestDropOffDetails",
    "exceptionalLatestDropOffDetails",
    "effectiveLatestDropOffDetails",
    "shippingHolidays"
})
public class CarrierDetail {

    @XmlElement(name = "Carrier")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType carrier;
    @XmlElement(name = "ServiceCategory")
    @XmlSchemaType(name = "string")
    protected ServiceCategoryType serviceCategory;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "CountryRelationship")
    @XmlSchemaType(name = "string")
    protected CountryRelationshipType countryRelationship;
    @XmlElement(name = "NormalLatestDropOffDetails")
    protected List<LatestDropOffDetail> normalLatestDropOffDetails;
    @XmlElement(name = "ExceptionalLatestDropOffDetails")
    protected List<LatestDropOffDetail> exceptionalLatestDropOffDetails;
    @XmlElement(name = "EffectiveLatestDropOffDetails")
    protected LatestDropOffDetail effectiveLatestDropOffDetails;
    @XmlElement(name = "ShippingHolidays")
    protected List<ShippingHoliday> shippingHolidays;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setCarrier(CarrierCodeType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCategoryType }
     *     
     */
    public ServiceCategoryType getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCategoryType }
     *     
     */
    public void setServiceCategory(ServiceCategoryType value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the countryRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRelationshipType }
     *     
     */
    public CountryRelationshipType getCountryRelationship() {
        return countryRelationship;
    }

    /**
     * Sets the value of the countryRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRelationshipType }
     *     
     */
    public void setCountryRelationship(CountryRelationshipType value) {
        this.countryRelationship = value;
    }

    /**
     * Gets the value of the normalLatestDropOffDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the normalLatestDropOffDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormalLatestDropOffDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LatestDropOffDetail }
     * 
     * 
     */
    public List<LatestDropOffDetail> getNormalLatestDropOffDetails() {
        if (normalLatestDropOffDetails == null) {
            normalLatestDropOffDetails = new ArrayList<LatestDropOffDetail>();
        }
        return this.normalLatestDropOffDetails;
    }

    /**
     * Gets the value of the exceptionalLatestDropOffDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionalLatestDropOffDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionalLatestDropOffDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LatestDropOffDetail }
     * 
     * 
     */
    public List<LatestDropOffDetail> getExceptionalLatestDropOffDetails() {
        if (exceptionalLatestDropOffDetails == null) {
            exceptionalLatestDropOffDetails = new ArrayList<LatestDropOffDetail>();
        }
        return this.exceptionalLatestDropOffDetails;
    }

    /**
     * Gets the value of the effectiveLatestDropOffDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LatestDropOffDetail }
     *     
     */
    public LatestDropOffDetail getEffectiveLatestDropOffDetails() {
        return effectiveLatestDropOffDetails;
    }

    /**
     * Sets the value of the effectiveLatestDropOffDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestDropOffDetail }
     *     
     */
    public void setEffectiveLatestDropOffDetails(LatestDropOffDetail value) {
        this.effectiveLatestDropOffDetails = value;
    }

    /**
     * Gets the value of the shippingHolidays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shippingHolidays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingHolidays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingHoliday }
     * 
     * 
     */
    public List<ShippingHoliday> getShippingHolidays() {
        if (shippingHolidays == null) {
            shippingHolidays = new ArrayList<ShippingHoliday>();
        }
        return this.shippingHolidays;
    }

}
