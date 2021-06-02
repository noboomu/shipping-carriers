
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentOperationalDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentOperationalDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UrsaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UrsaSuffixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginLocationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OriginServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationLocationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DestinationServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationLocationStateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDay" type="{http://fedex.com/ws/openship/v18}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="PublishedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="CommitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CommitDay" type="{http://fedex.com/ws/openship/v18}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="TransitTime" type="{http://fedex.com/ws/openship/v18}TransitTimeType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTransitTime" type="{http://fedex.com/ws/openship/v18}TransitTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CustomTransitTime" type="{http://fedex.com/ws/openship/v18}TransitTimeType" minOccurs="0"/&gt;
 *         &lt;element name="IneligibleForMoneyBackGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryEligibilities" type="{http://fedex.com/ws/openship/v18}GroundDeliveryEligibilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AstraPlannedServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AstraDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Scac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentOperationalDetail", propOrder = {
    "ursaPrefixCode",
    "ursaSuffixCode",
    "originLocationId",
    "originLocationNumber",
    "originServiceArea",
    "destinationLocationId",
    "destinationLocationNumber",
    "destinationServiceArea",
    "destinationLocationStateOrProvinceCode",
    "deliveryDate",
    "deliveryDay",
    "publishedDeliveryTime",
    "commitDate",
    "commitDay",
    "transitTime",
    "maximumTransitTime",
    "customTransitTime",
    "ineligibleForMoneyBackGuarantee",
    "deliveryEligibilities",
    "astraPlannedServiceLevel",
    "astraDescription",
    "postalCode",
    "stateOrProvinceCode",
    "countryCode",
    "airportId",
    "serviceCode",
    "packagingCode",
    "scac"
})
public class ShipmentOperationalDetail {

    @XmlElement(name = "UrsaPrefixCode")
    protected String ursaPrefixCode;
    @XmlElement(name = "UrsaSuffixCode")
    protected String ursaSuffixCode;
    @XmlElement(name = "OriginLocationId")
    protected String originLocationId;
    @XmlElement(name = "OriginLocationNumber")
    protected Integer originLocationNumber;
    @XmlElement(name = "OriginServiceArea")
    protected String originServiceArea;
    @XmlElement(name = "DestinationLocationId")
    protected String destinationLocationId;
    @XmlElement(name = "DestinationLocationNumber")
    protected Integer destinationLocationNumber;
    @XmlElement(name = "DestinationServiceArea")
    protected String destinationServiceArea;
    @XmlElement(name = "DestinationLocationStateOrProvinceCode")
    protected String destinationLocationStateOrProvinceCode;
    @XmlElement(name = "DeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryDay")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType deliveryDay;
    @XmlElement(name = "PublishedDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar publishedDeliveryTime;
    @XmlElement(name = "CommitDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commitDate;
    @XmlElement(name = "CommitDay")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType commitDay;
    @XmlElement(name = "TransitTime")
    @XmlSchemaType(name = "string")
    protected TransitTimeType transitTime;
    @XmlElement(name = "MaximumTransitTime")
    @XmlSchemaType(name = "string")
    protected TransitTimeType maximumTransitTime;
    @XmlElement(name = "CustomTransitTime")
    @XmlSchemaType(name = "string")
    protected TransitTimeType customTransitTime;
    @XmlElement(name = "IneligibleForMoneyBackGuarantee")
    protected Boolean ineligibleForMoneyBackGuarantee;
    @XmlElement(name = "DeliveryEligibilities")
    @XmlSchemaType(name = "string")
    protected List<GroundDeliveryEligibilityType> deliveryEligibilities;
    @XmlElement(name = "AstraPlannedServiceLevel")
    protected String astraPlannedServiceLevel;
    @XmlElement(name = "AstraDescription")
    protected String astraDescription;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "StateOrProvinceCode")
    protected String stateOrProvinceCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "AirportId")
    protected String airportId;
    @XmlElement(name = "ServiceCode")
    protected String serviceCode;
    @XmlElement(name = "PackagingCode")
    protected String packagingCode;
    @XmlElement(name = "Scac")
    protected String scac;

    /**
     * Gets the value of the ursaPrefixCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrsaPrefixCode() {
        return ursaPrefixCode;
    }

    /**
     * Sets the value of the ursaPrefixCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrsaPrefixCode(String value) {
        this.ursaPrefixCode = value;
    }

    /**
     * Gets the value of the ursaSuffixCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrsaSuffixCode() {
        return ursaSuffixCode;
    }

    /**
     * Sets the value of the ursaSuffixCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrsaSuffixCode(String value) {
        this.ursaSuffixCode = value;
    }

    /**
     * Gets the value of the originLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginLocationId() {
        return originLocationId;
    }

    /**
     * Sets the value of the originLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginLocationId(String value) {
        this.originLocationId = value;
    }

    /**
     * Gets the value of the originLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginLocationNumber() {
        return originLocationNumber;
    }

    /**
     * Sets the value of the originLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginLocationNumber(Integer value) {
        this.originLocationNumber = value;
    }

    /**
     * Gets the value of the originServiceArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginServiceArea() {
        return originServiceArea;
    }

    /**
     * Sets the value of the originServiceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginServiceArea(String value) {
        this.originServiceArea = value;
    }

    /**
     * Gets the value of the destinationLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationId() {
        return destinationLocationId;
    }

    /**
     * Sets the value of the destinationLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationId(String value) {
        this.destinationLocationId = value;
    }

    /**
     * Gets the value of the destinationLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationLocationNumber() {
        return destinationLocationNumber;
    }

    /**
     * Sets the value of the destinationLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationLocationNumber(Integer value) {
        this.destinationLocationNumber = value;
    }

    /**
     * Gets the value of the destinationServiceArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }

    /**
     * Sets the value of the destinationServiceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationServiceArea(String value) {
        this.destinationServiceArea = value;
    }

    /**
     * Gets the value of the destinationLocationStateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationStateOrProvinceCode() {
        return destinationLocationStateOrProvinceCode;
    }

    /**
     * Sets the value of the destinationLocationStateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationStateOrProvinceCode(String value) {
        this.destinationLocationStateOrProvinceCode = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryDay property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDeliveryDay() {
        return deliveryDay;
    }

    /**
     * Sets the value of the deliveryDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDeliveryDay(DayOfWeekType value) {
        this.deliveryDay = value;
    }

    /**
     * Gets the value of the publishedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishedDeliveryTime() {
        return publishedDeliveryTime;
    }

    /**
     * Sets the value of the publishedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishedDeliveryTime(XMLGregorianCalendar value) {
        this.publishedDeliveryTime = value;
    }

    /**
     * Gets the value of the commitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitDate() {
        return commitDate;
    }

    /**
     * Sets the value of the commitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitDate(XMLGregorianCalendar value) {
        this.commitDate = value;
    }

    /**
     * Gets the value of the commitDay property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getCommitDay() {
        return commitDay;
    }

    /**
     * Sets the value of the commitDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setCommitDay(DayOfWeekType value) {
        this.commitDay = value;
    }

    /**
     * Gets the value of the transitTime property.
     * 
     * @return
     *     possible object is
     *     {@link TransitTimeType }
     *     
     */
    public TransitTimeType getTransitTime() {
        return transitTime;
    }

    /**
     * Sets the value of the transitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitTimeType }
     *     
     */
    public void setTransitTime(TransitTimeType value) {
        this.transitTime = value;
    }

    /**
     * Gets the value of the maximumTransitTime property.
     * 
     * @return
     *     possible object is
     *     {@link TransitTimeType }
     *     
     */
    public TransitTimeType getMaximumTransitTime() {
        return maximumTransitTime;
    }

    /**
     * Sets the value of the maximumTransitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitTimeType }
     *     
     */
    public void setMaximumTransitTime(TransitTimeType value) {
        this.maximumTransitTime = value;
    }

    /**
     * Gets the value of the customTransitTime property.
     * 
     * @return
     *     possible object is
     *     {@link TransitTimeType }
     *     
     */
    public TransitTimeType getCustomTransitTime() {
        return customTransitTime;
    }

    /**
     * Sets the value of the customTransitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitTimeType }
     *     
     */
    public void setCustomTransitTime(TransitTimeType value) {
        this.customTransitTime = value;
    }

    /**
     * Gets the value of the ineligibleForMoneyBackGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIneligibleForMoneyBackGuarantee() {
        return ineligibleForMoneyBackGuarantee;
    }

    /**
     * Sets the value of the ineligibleForMoneyBackGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIneligibleForMoneyBackGuarantee(Boolean value) {
        this.ineligibleForMoneyBackGuarantee = value;
    }

    /**
     * Gets the value of the deliveryEligibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryEligibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryEligibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundDeliveryEligibilityType }
     * 
     * 
     */
    public List<GroundDeliveryEligibilityType> getDeliveryEligibilities() {
        if (deliveryEligibilities == null) {
            deliveryEligibilities = new ArrayList<GroundDeliveryEligibilityType>();
        }
        return this.deliveryEligibilities;
    }

    /**
     * Gets the value of the astraPlannedServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstraPlannedServiceLevel() {
        return astraPlannedServiceLevel;
    }

    /**
     * Sets the value of the astraPlannedServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstraPlannedServiceLevel(String value) {
        this.astraPlannedServiceLevel = value;
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
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the packagingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingCode() {
        return packagingCode;
    }

    /**
     * Sets the value of the packagingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingCode(String value) {
        this.packagingCode = value;
    }

    /**
     * Gets the value of the scac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScac() {
        return scac;
    }

    /**
     * Sets the value of the scac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScac(String value) {
        this.scac = value;
    }

}
