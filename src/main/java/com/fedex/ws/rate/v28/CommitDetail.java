
package com.fedex.ws.rate.v28;

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
 * Information about the transit time and delivery commitment date and time.
 * 
 * <p>Java class for CommitDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommodityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDescription" type="{http://fedex.com/ws/rate/v28}ServiceDescription" minOccurs="0"/&gt;
 *         &lt;element name="AppliedOptions" type="{http://fedex.com/ws/rate/v28}ServiceOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AppliedSubOptions" type="{http://fedex.com/ws/rate/v28}ServiceSubOptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="DerivedShipmentSignatureOption" type="{http://fedex.com/ws/rate/v28}SignatureOptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="DerivedPackageSignatureOptions" type="{http://fedex.com/ws/rate/v28}SignatureOptionDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DerivedOriginDetail" type="{http://fedex.com/ws/rate/v28}CleansedAddressAndLocationDetail" minOccurs="0"/&gt;
 *         &lt;element name="DerivedDestinationDetail" type="{http://fedex.com/ws/rate/v28}CleansedAddressAndLocationDetail" minOccurs="0"/&gt;
 *         &lt;element name="CommitTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeek" type="{http://fedex.com/ws/rate/v28}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="TransitTime" type="{http://fedex.com/ws/rate/v28}TransitTimeType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTransitTime" type="{http://fedex.com/ws/rate/v28}TransitTimeType" minOccurs="0"/&gt;
 *         &lt;element name="DestinationServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrokerAddress" type="{http://fedex.com/ws/rate/v28}Address" minOccurs="0"/&gt;
 *         &lt;element name="BrokerLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrokerCommitTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BrokerCommitDayOfWeek" type="{http://fedex.com/ws/rate/v28}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="BrokerToDestinationDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="ProofOfDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ProofOfDeliveryDayOfWeek" type="{http://fedex.com/ws/rate/v28}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="CommitMessages" type="{http://fedex.com/ws/rate/v28}Notification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DelayDetails" type="{http://fedex.com/ws/rate/v28}DelayDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DocumentContent" type="{http://fedex.com/ws/rate/v28}InternationalDocumentContentType" minOccurs="0"/&gt;
 *         &lt;element name="RequiredDocuments" type="{http://fedex.com/ws/rate/v28}RequiredShippingDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FreightCommitDetail" type="{http://fedex.com/ws/rate/v28}FreightCommitDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitDetail", propOrder = {
    "commodityName",
    "serviceType",
    "serviceDescription",
    "appliedOptions",
    "appliedSubOptions",
    "derivedShipmentSignatureOption",
    "derivedPackageSignatureOptions",
    "derivedOriginDetail",
    "derivedDestinationDetail",
    "commitTimestamp",
    "dayOfWeek",
    "transitTime",
    "maximumTransitTime",
    "destinationServiceArea",
    "brokerAddress",
    "brokerLocationId",
    "brokerCommitTimestamp",
    "brokerCommitDayOfWeek",
    "brokerToDestinationDays",
    "proofOfDeliveryDate",
    "proofOfDeliveryDayOfWeek",
    "commitMessages",
    "deliveryMessages",
    "delayDetails",
    "documentContent",
    "requiredDocuments",
    "freightCommitDetail"
})
public class CommitDetail {

    @XmlElement(name = "CommodityName")
    protected String commodityName;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "ServiceDescription")
    protected ServiceDescription serviceDescription;
    @XmlElement(name = "AppliedOptions")
    @XmlSchemaType(name = "string")
    protected List<ServiceOptionType> appliedOptions;
    @XmlElement(name = "AppliedSubOptions")
    protected ServiceSubOptionDetail appliedSubOptions;
    @XmlElement(name = "DerivedShipmentSignatureOption")
    protected SignatureOptionDetail derivedShipmentSignatureOption;
    @XmlElement(name = "DerivedPackageSignatureOptions")
    protected List<SignatureOptionDetail> derivedPackageSignatureOptions;
    @XmlElement(name = "DerivedOriginDetail")
    protected CleansedAddressAndLocationDetail derivedOriginDetail;
    @XmlElement(name = "DerivedDestinationDetail")
    protected CleansedAddressAndLocationDetail derivedDestinationDetail;
    @XmlElement(name = "CommitTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commitTimestamp;
    @XmlElement(name = "DayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayOfWeek;
    @XmlElement(name = "TransitTime")
    @XmlSchemaType(name = "string")
    protected TransitTimeType transitTime;
    @XmlElement(name = "MaximumTransitTime")
    @XmlSchemaType(name = "string")
    protected TransitTimeType maximumTransitTime;
    @XmlElement(name = "DestinationServiceArea")
    protected String destinationServiceArea;
    @XmlElement(name = "BrokerAddress")
    protected Address brokerAddress;
    @XmlElement(name = "BrokerLocationId")
    protected String brokerLocationId;
    @XmlElement(name = "BrokerCommitTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar brokerCommitTimestamp;
    @XmlElement(name = "BrokerCommitDayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType brokerCommitDayOfWeek;
    @XmlElement(name = "BrokerToDestinationDays")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger brokerToDestinationDays;
    @XmlElement(name = "ProofOfDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar proofOfDeliveryDate;
    @XmlElement(name = "ProofOfDeliveryDayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType proofOfDeliveryDayOfWeek;
    @XmlElement(name = "CommitMessages")
    protected List<Notification> commitMessages;
    @XmlElement(name = "DeliveryMessages")
    protected List<String> deliveryMessages;
    @XmlElement(name = "DelayDetails")
    protected List<DelayDetail> delayDetails;
    @XmlElement(name = "DocumentContent")
    @XmlSchemaType(name = "string")
    protected InternationalDocumentContentType documentContent;
    @XmlElement(name = "RequiredDocuments")
    @XmlSchemaType(name = "string")
    protected List<RequiredShippingDocumentType> requiredDocuments;
    @XmlElement(name = "FreightCommitDetail")
    protected FreightCommitDetail freightCommitDetail;

    /**
     * Gets the value of the commodityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * Sets the value of the commodityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityName(String value) {
        this.commodityName = value;
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
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescription }
     *     
     */
    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescription }
     *     
     */
    public void setServiceDescription(ServiceDescription value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the appliedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the appliedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOptionType }
     * 
     * 
     */
    public List<ServiceOptionType> getAppliedOptions() {
        if (appliedOptions == null) {
            appliedOptions = new ArrayList<ServiceOptionType>();
        }
        return this.appliedOptions;
    }

    /**
     * Gets the value of the appliedSubOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSubOptionDetail }
     *     
     */
    public ServiceSubOptionDetail getAppliedSubOptions() {
        return appliedSubOptions;
    }

    /**
     * Sets the value of the appliedSubOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSubOptionDetail }
     *     
     */
    public void setAppliedSubOptions(ServiceSubOptionDetail value) {
        this.appliedSubOptions = value;
    }

    /**
     * Gets the value of the derivedShipmentSignatureOption property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public SignatureOptionDetail getDerivedShipmentSignatureOption() {
        return derivedShipmentSignatureOption;
    }

    /**
     * Sets the value of the derivedShipmentSignatureOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public void setDerivedShipmentSignatureOption(SignatureOptionDetail value) {
        this.derivedShipmentSignatureOption = value;
    }

    /**
     * Gets the value of the derivedPackageSignatureOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the derivedPackageSignatureOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedPackageSignatureOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureOptionDetail }
     * 
     * 
     */
    public List<SignatureOptionDetail> getDerivedPackageSignatureOptions() {
        if (derivedPackageSignatureOptions == null) {
            derivedPackageSignatureOptions = new ArrayList<SignatureOptionDetail>();
        }
        return this.derivedPackageSignatureOptions;
    }

    /**
     * Gets the value of the derivedOriginDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CleansedAddressAndLocationDetail }
     *     
     */
    public CleansedAddressAndLocationDetail getDerivedOriginDetail() {
        return derivedOriginDetail;
    }

    /**
     * Sets the value of the derivedOriginDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleansedAddressAndLocationDetail }
     *     
     */
    public void setDerivedOriginDetail(CleansedAddressAndLocationDetail value) {
        this.derivedOriginDetail = value;
    }

    /**
     * Gets the value of the derivedDestinationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CleansedAddressAndLocationDetail }
     *     
     */
    public CleansedAddressAndLocationDetail getDerivedDestinationDetail() {
        return derivedDestinationDetail;
    }

    /**
     * Sets the value of the derivedDestinationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleansedAddressAndLocationDetail }
     *     
     */
    public void setDerivedDestinationDetail(CleansedAddressAndLocationDetail value) {
        this.derivedDestinationDetail = value;
    }

    /**
     * Gets the value of the commitTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitTimestamp() {
        return commitTimestamp;
    }

    /**
     * Sets the value of the commitTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitTimestamp(XMLGregorianCalendar value) {
        this.commitTimestamp = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
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
     * Gets the value of the brokerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBrokerAddress() {
        return brokerAddress;
    }

    /**
     * Sets the value of the brokerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBrokerAddress(Address value) {
        this.brokerAddress = value;
    }

    /**
     * Gets the value of the brokerLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerLocationId() {
        return brokerLocationId;
    }

    /**
     * Sets the value of the brokerLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerLocationId(String value) {
        this.brokerLocationId = value;
    }

    /**
     * Gets the value of the brokerCommitTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBrokerCommitTimestamp() {
        return brokerCommitTimestamp;
    }

    /**
     * Sets the value of the brokerCommitTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBrokerCommitTimestamp(XMLGregorianCalendar value) {
        this.brokerCommitTimestamp = value;
    }

    /**
     * Gets the value of the brokerCommitDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getBrokerCommitDayOfWeek() {
        return brokerCommitDayOfWeek;
    }

    /**
     * Sets the value of the brokerCommitDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setBrokerCommitDayOfWeek(DayOfWeekType value) {
        this.brokerCommitDayOfWeek = value;
    }

    /**
     * Gets the value of the brokerToDestinationDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrokerToDestinationDays() {
        return brokerToDestinationDays;
    }

    /**
     * Sets the value of the brokerToDestinationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrokerToDestinationDays(BigInteger value) {
        this.brokerToDestinationDays = value;
    }

    /**
     * Gets the value of the proofOfDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProofOfDeliveryDate() {
        return proofOfDeliveryDate;
    }

    /**
     * Sets the value of the proofOfDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProofOfDeliveryDate(XMLGregorianCalendar value) {
        this.proofOfDeliveryDate = value;
    }

    /**
     * Gets the value of the proofOfDeliveryDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getProofOfDeliveryDayOfWeek() {
        return proofOfDeliveryDayOfWeek;
    }

    /**
     * Sets the value of the proofOfDeliveryDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setProofOfDeliveryDayOfWeek(DayOfWeekType value) {
        this.proofOfDeliveryDayOfWeek = value;
    }

    /**
     * Gets the value of the commitMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commitMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getCommitMessages() {
        if (commitMessages == null) {
            commitMessages = new ArrayList<Notification>();
        }
        return this.commitMessages;
    }

    /**
     * Gets the value of the deliveryMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryMessages() {
        if (deliveryMessages == null) {
            deliveryMessages = new ArrayList<String>();
        }
        return this.deliveryMessages;
    }

    /**
     * Gets the value of the delayDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the delayDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelayDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelayDetail }
     * 
     * 
     */
    public List<DelayDetail> getDelayDetails() {
        if (delayDetails == null) {
            delayDetails = new ArrayList<DelayDetail>();
        }
        return this.delayDetails;
    }

    /**
     * Gets the value of the documentContent property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalDocumentContentType }
     *     
     */
    public InternationalDocumentContentType getDocumentContent() {
        return documentContent;
    }

    /**
     * Sets the value of the documentContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalDocumentContentType }
     *     
     */
    public void setDocumentContent(InternationalDocumentContentType value) {
        this.documentContent = value;
    }

    /**
     * Gets the value of the requiredDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the requiredDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredShippingDocumentType }
     * 
     * 
     */
    public List<RequiredShippingDocumentType> getRequiredDocuments() {
        if (requiredDocuments == null) {
            requiredDocuments = new ArrayList<RequiredShippingDocumentType>();
        }
        return this.requiredDocuments;
    }

    /**
     * Gets the value of the freightCommitDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommitDetail }
     *     
     */
    public FreightCommitDetail getFreightCommitDetail() {
        return freightCommitDetail;
    }

    /**
     * Sets the value of the freightCommitDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommitDetail }
     *     
     */
    public void setFreightCommitDetail(FreightCommitDetail value) {
        this.freightCommitDetail = value;
    }

}
