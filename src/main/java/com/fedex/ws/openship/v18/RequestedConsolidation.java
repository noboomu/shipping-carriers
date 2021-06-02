
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
 * <p>Java class for RequestedConsolidation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedConsolidation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsolidationType" type="{http://fedex.com/ws/openship/v18}ConsolidationType" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TrackingIds" type="{http://fedex.com/ws/openship/v18}TrackingId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipper" type="{http://fedex.com/ws/openship/v18}Party" minOccurs="0"/&gt;
 *         &lt;element name="Origin" type="{http://fedex.com/ws/openship/v18}ContactAndAddress" minOccurs="0"/&gt;
 *         &lt;element name="SoldTo" type="{http://fedex.com/ws/openship/v18}Party" minOccurs="0"/&gt;
 *         &lt;element name="BookingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidationDataSources" type="{http://fedex.com/ws/openship/v18}ConsolidationDataSource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServicesRequested" type="{http://fedex.com/ws/openship/v18}ConsolidationSpecialServicesRequested" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReferences" type="{http://fedex.com/ws/openship/v18}CustomerReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LabelSpecification" type="{http://fedex.com/ws/openship/v18}LabelSpecification" minOccurs="0"/&gt;
 *         &lt;element name="InternationalDistributionDetail" type="{http://fedex.com/ws/openship/v18}InternationalDistributionDetail" minOccurs="0"/&gt;
 *         &lt;element name="TransborderDistributionDetail" type="{http://fedex.com/ws/openship/v18}ConsolidationTransborderDistributionDetail" minOccurs="0"/&gt;
 *         &lt;element name="DistributionLocations" type="{http://fedex.com/ws/openship/v18}RequestedDistributionLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomsClearanceDetail" type="{http://fedex.com/ws/openship/v18}CustomsClearanceDetail" minOccurs="0"/&gt;
 *         &lt;element name="ShippingChargesPayment" type="{http://fedex.com/ws/openship/v18}Payment" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidationDocumentSpecification" type="{http://fedex.com/ws/openship/v18}ConsolidationDocumentSpecification" minOccurs="0"/&gt;
 *         &lt;element name="CrnShippingDocumentTypes" type="{http://fedex.com/ws/openship/v18}RequestedShippingDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedConsolidation", propOrder = {
    "consolidationType",
    "shipDate",
    "trackingIds",
    "description",
    "shipper",
    "origin",
    "soldTo",
    "bookingNumber",
    "consolidationDataSources",
    "specialServicesRequested",
    "customerReferences",
    "labelSpecification",
    "internationalDistributionDetail",
    "transborderDistributionDetail",
    "distributionLocations",
    "customsClearanceDetail",
    "shippingChargesPayment",
    "consolidationDocumentSpecification",
    "crnShippingDocumentTypes"
})
public class RequestedConsolidation {

    @XmlElement(name = "ConsolidationType")
    @XmlSchemaType(name = "string")
    protected ConsolidationType consolidationType;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "TrackingIds")
    protected List<TrackingId> trackingIds;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Shipper")
    protected Party shipper;
    @XmlElement(name = "Origin")
    protected ContactAndAddress origin;
    @XmlElement(name = "SoldTo")
    protected Party soldTo;
    @XmlElement(name = "BookingNumber")
    protected String bookingNumber;
    @XmlElement(name = "ConsolidationDataSources")
    protected List<ConsolidationDataSource> consolidationDataSources;
    @XmlElement(name = "SpecialServicesRequested")
    protected ConsolidationSpecialServicesRequested specialServicesRequested;
    @XmlElement(name = "CustomerReferences")
    protected List<CustomerReference> customerReferences;
    @XmlElement(name = "LabelSpecification")
    protected LabelSpecification labelSpecification;
    @XmlElement(name = "InternationalDistributionDetail")
    protected InternationalDistributionDetail internationalDistributionDetail;
    @XmlElement(name = "TransborderDistributionDetail")
    protected ConsolidationTransborderDistributionDetail transborderDistributionDetail;
    @XmlElement(name = "DistributionLocations")
    protected List<RequestedDistributionLocation> distributionLocations;
    @XmlElement(name = "CustomsClearanceDetail")
    protected CustomsClearanceDetail customsClearanceDetail;
    @XmlElement(name = "ShippingChargesPayment")
    protected Payment shippingChargesPayment;
    @XmlElement(name = "ConsolidationDocumentSpecification")
    protected ConsolidationDocumentSpecification consolidationDocumentSpecification;
    @XmlElement(name = "CrnShippingDocumentTypes")
    @XmlSchemaType(name = "string")
    protected List<RequestedShippingDocumentType> crnShippingDocumentTypes;

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
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the trackingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trackingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingId }
     * 
     * 
     */
    public List<TrackingId> getTrackingIds() {
        if (trackingIds == null) {
            trackingIds = new ArrayList<TrackingId>();
        }
        return this.trackingIds;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setShipper(Party value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setOrigin(ContactAndAddress value) {
        this.origin = value;
    }

    /**
     * Gets the value of the soldTo property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setSoldTo(Party value) {
        this.soldTo = value;
    }

    /**
     * Gets the value of the bookingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNumber() {
        return bookingNumber;
    }

    /**
     * Sets the value of the bookingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingNumber(String value) {
        this.bookingNumber = value;
    }

    /**
     * Gets the value of the consolidationDataSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the consolidationDataSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidationDataSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidationDataSource }
     * 
     * 
     */
    public List<ConsolidationDataSource> getConsolidationDataSources() {
        if (consolidationDataSources == null) {
            consolidationDataSources = new ArrayList<ConsolidationDataSource>();
        }
        return this.consolidationDataSources;
    }

    /**
     * Gets the value of the specialServicesRequested property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationSpecialServicesRequested }
     *     
     */
    public ConsolidationSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }

    /**
     * Sets the value of the specialServicesRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationSpecialServicesRequested }
     *     
     */
    public void setSpecialServicesRequested(ConsolidationSpecialServicesRequested value) {
        this.specialServicesRequested = value;
    }

    /**
     * Gets the value of the customerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference }
     * 
     * 
     */
    public List<CustomerReference> getCustomerReferences() {
        if (customerReferences == null) {
            customerReferences = new ArrayList<CustomerReference>();
        }
        return this.customerReferences;
    }

    /**
     * Gets the value of the labelSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSpecification }
     *     
     */
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }

    /**
     * Sets the value of the labelSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSpecification }
     *     
     */
    public void setLabelSpecification(LabelSpecification value) {
        this.labelSpecification = value;
    }

    /**
     * Gets the value of the internationalDistributionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalDistributionDetail }
     *     
     */
    public InternationalDistributionDetail getInternationalDistributionDetail() {
        return internationalDistributionDetail;
    }

    /**
     * Sets the value of the internationalDistributionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalDistributionDetail }
     *     
     */
    public void setInternationalDistributionDetail(InternationalDistributionDetail value) {
        this.internationalDistributionDetail = value;
    }

    /**
     * Gets the value of the transborderDistributionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationTransborderDistributionDetail }
     *     
     */
    public ConsolidationTransborderDistributionDetail getTransborderDistributionDetail() {
        return transborderDistributionDetail;
    }

    /**
     * Sets the value of the transborderDistributionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationTransborderDistributionDetail }
     *     
     */
    public void setTransborderDistributionDetail(ConsolidationTransborderDistributionDetail value) {
        this.transborderDistributionDetail = value;
    }

    /**
     * Gets the value of the distributionLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the distributionLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedDistributionLocation }
     * 
     * 
     */
    public List<RequestedDistributionLocation> getDistributionLocations() {
        if (distributionLocations == null) {
            distributionLocations = new ArrayList<RequestedDistributionLocation>();
        }
        return this.distributionLocations;
    }

    /**
     * Gets the value of the customsClearanceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsClearanceDetail }
     *     
     */
    public CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }

    /**
     * Sets the value of the customsClearanceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsClearanceDetail }
     *     
     */
    public void setCustomsClearanceDetail(CustomsClearanceDetail value) {
        this.customsClearanceDetail = value;
    }

    /**
     * Gets the value of the shippingChargesPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }

    /**
     * Sets the value of the shippingChargesPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setShippingChargesPayment(Payment value) {
        this.shippingChargesPayment = value;
    }

    /**
     * Gets the value of the consolidationDocumentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationDocumentSpecification }
     *     
     */
    public ConsolidationDocumentSpecification getConsolidationDocumentSpecification() {
        return consolidationDocumentSpecification;
    }

    /**
     * Sets the value of the consolidationDocumentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationDocumentSpecification }
     *     
     */
    public void setConsolidationDocumentSpecification(ConsolidationDocumentSpecification value) {
        this.consolidationDocumentSpecification = value;
    }

    /**
     * Gets the value of the crnShippingDocumentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crnShippingDocumentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrnShippingDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedShippingDocumentType }
     * 
     * 
     */
    public List<RequestedShippingDocumentType> getCrnShippingDocumentTypes() {
        if (crnShippingDocumentTypes == null) {
            crnShippingDocumentTypes = new ArrayList<RequestedShippingDocumentType>();
        }
        return this.crnShippingDocumentTypes;
    }

}
