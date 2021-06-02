
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCapabilityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationCapabilityDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/locs/v12}CarrierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCategory" type="{http://fedex.com/ws/locs/v12}ServiceCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="TransferOfPossessionType" type="{http://fedex.com/ws/locs/v12}LocationTransferOfPossessionType" minOccurs="0"/&gt;
 *         &lt;element name="DaysOfWeek" type="{http://fedex.com/ws/locs/v12}DayOfWeekType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCapabilityDetail", propOrder = {
    "carrierCode",
    "serviceType",
    "serviceCategory",
    "transferOfPossessionType",
    "daysOfWeek"
})
public class LocationCapabilityDetail {

    @XmlElement(name = "CarrierCode")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "ServiceCategory")
    @XmlSchemaType(name = "string")
    protected ServiceCategoryType serviceCategory;
    @XmlElement(name = "TransferOfPossessionType")
    @XmlSchemaType(name = "string")
    protected LocationTransferOfPossessionType transferOfPossessionType;
    @XmlElement(name = "DaysOfWeek")
    @XmlSchemaType(name = "string")
    protected List<DayOfWeekType> daysOfWeek;

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setCarrierCode(CarrierCodeType value) {
        this.carrierCode = value;
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
     * Gets the value of the transferOfPossessionType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTransferOfPossessionType }
     *     
     */
    public LocationTransferOfPossessionType getTransferOfPossessionType() {
        return transferOfPossessionType;
    }

    /**
     * Sets the value of the transferOfPossessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTransferOfPossessionType }
     *     
     */
    public void setTransferOfPossessionType(LocationTransferOfPossessionType value) {
        this.transferOfPossessionType = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekType }
     * 
     * 
     */
    public List<DayOfWeekType> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new ArrayList<DayOfWeekType>();
        }
        return this.daysOfWeek;
    }

}
