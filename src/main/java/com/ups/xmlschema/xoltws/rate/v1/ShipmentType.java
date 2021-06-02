
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginRecordTransactionTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipper" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipperType"/&gt;
 *         &lt;element name="ShipTo" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipToType"/&gt;
 *         &lt;element name="ShipFrom" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipFromType" minOccurs="0"/&gt;
 *         &lt;element name="AlternateDeliveryAddress" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}AlternateDeliveryAddressType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentIndicationType" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}IndicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDetails" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PaymentDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="FRSPaymentInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}FRSPaymentInfoType" minOccurs="0"/&gt;
 *         &lt;element name="FreightShipmentInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}FreightShipmentInformationType" minOccurs="0"/&gt;
 *         &lt;element name="GoodsNotInFreeCirculationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="NumOfPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentTotalWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentWeightType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PackageType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipmentServiceOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentRatingOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentRatingOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineTotal" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}InvoiceLineTotalType" minOccurs="0"/&gt;
 *         &lt;element name="RatingMethodRequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxInformationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromotionalDiscountInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PromotionalDiscountInformationType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}TimeInTransitRequestType" minOccurs="0"/&gt;
 *         &lt;element name="MasterCartonIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WWEShipmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", propOrder = {
    "originRecordTransactionTimestamp",
    "shipper",
    "shipTo",
    "shipFrom",
    "alternateDeliveryAddress",
    "shipmentIndicationType",
    "paymentDetails",
    "frsPaymentInformation",
    "freightShipmentInformation",
    "goodsNotInFreeCirculationIndicator",
    "service",
    "numOfPieces",
    "shipmentTotalWeight",
    "documentsOnlyIndicator",
    "_package",
    "shipmentServiceOptions",
    "shipmentRatingOptions",
    "invoiceLineTotal",
    "ratingMethodRequestedIndicator",
    "taxInformationIndicator",
    "promotionalDiscountInformation",
    "deliveryTimeInformation",
    "masterCartonIndicator",
    "wweShipmentIndicator"
})
public class ShipmentType {

    @XmlElement(name = "OriginRecordTransactionTimestamp")
    protected String originRecordTransactionTimestamp;
    @XmlElement(name = "Shipper", required = true)
    protected ShipperType shipper;
    @XmlElement(name = "ShipTo", required = true)
    protected ShipToType shipTo;
    @XmlElement(name = "ShipFrom")
    protected ShipFromType shipFrom;
    @XmlElement(name = "AlternateDeliveryAddress")
    protected AlternateDeliveryAddressType alternateDeliveryAddress;
    @XmlElement(name = "ShipmentIndicationType")
    protected List<IndicationType> shipmentIndicationType;
    @XmlElement(name = "PaymentDetails")
    protected PaymentDetailsType paymentDetails;
    @XmlElement(name = "FRSPaymentInformation")
    protected FRSPaymentInfoType frsPaymentInformation;
    @XmlElement(name = "FreightShipmentInformation")
    protected FreightShipmentInformationType freightShipmentInformation;
    @XmlElement(name = "GoodsNotInFreeCirculationIndicator")
    protected String goodsNotInFreeCirculationIndicator;
    @XmlElement(name = "Service")
    protected CodeDescriptionType service;
    @XmlElement(name = "NumOfPieces")
    protected String numOfPieces;
    @XmlElement(name = "ShipmentTotalWeight")
    protected ShipmentWeightType shipmentTotalWeight;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "Package", required = true)
    protected List<PackageType> _package;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentServiceOptionsType shipmentServiceOptions;
    @XmlElement(name = "ShipmentRatingOptions")
    protected ShipmentRatingOptionsType shipmentRatingOptions;
    @XmlElement(name = "InvoiceLineTotal")
    protected InvoiceLineTotalType invoiceLineTotal;
    @XmlElement(name = "RatingMethodRequestedIndicator")
    protected String ratingMethodRequestedIndicator;
    @XmlElement(name = "TaxInformationIndicator")
    protected String taxInformationIndicator;
    @XmlElement(name = "PromotionalDiscountInformation")
    protected PromotionalDiscountInformationType promotionalDiscountInformation;
    @XmlElement(name = "DeliveryTimeInformation")
    protected TimeInTransitRequestType deliveryTimeInformation;
    @XmlElement(name = "MasterCartonIndicator")
    protected String masterCartonIndicator;
    @XmlElement(name = "WWEShipmentIndicator")
    protected String wweShipmentIndicator;

    /**
     * Gets the value of the originRecordTransactionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginRecordTransactionTimestamp() {
        return originRecordTransactionTimestamp;
    }

    /**
     * Sets the value of the originRecordTransactionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginRecordTransactionTimestamp(String value) {
        this.originRecordTransactionTimestamp = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperType }
     *     
     */
    public ShipperType getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperType }
     *     
     */
    public void setShipper(ShipperType value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToType }
     *     
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *     
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ShipFromType }
     *     
     */
    public ShipFromType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFromType }
     *     
     */
    public void setShipFrom(ShipFromType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the alternateDeliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateDeliveryAddressType }
     *     
     */
    public AlternateDeliveryAddressType getAlternateDeliveryAddress() {
        return alternateDeliveryAddress;
    }

    /**
     * Sets the value of the alternateDeliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateDeliveryAddressType }
     *     
     */
    public void setAlternateDeliveryAddress(AlternateDeliveryAddressType value) {
        this.alternateDeliveryAddress = value;
    }

    /**
     * Gets the value of the shipmentIndicationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentIndicationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentIndicationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationType }
     * 
     * 
     */
    public List<IndicationType> getShipmentIndicationType() {
        if (shipmentIndicationType == null) {
            shipmentIndicationType = new ArrayList<IndicationType>();
        }
        return this.shipmentIndicationType;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *     
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *     
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the frsPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FRSPaymentInfoType }
     *     
     */
    public FRSPaymentInfoType getFRSPaymentInformation() {
        return frsPaymentInformation;
    }

    /**
     * Sets the value of the frsPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRSPaymentInfoType }
     *     
     */
    public void setFRSPaymentInformation(FRSPaymentInfoType value) {
        this.frsPaymentInformation = value;
    }

    /**
     * Gets the value of the freightShipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightShipmentInformationType }
     *     
     */
    public FreightShipmentInformationType getFreightShipmentInformation() {
        return freightShipmentInformation;
    }

    /**
     * Sets the value of the freightShipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipmentInformationType }
     *     
     */
    public void setFreightShipmentInformation(FreightShipmentInformationType value) {
        this.freightShipmentInformation = value;
    }

    /**
     * Gets the value of the goodsNotInFreeCirculationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsNotInFreeCirculationIndicator() {
        return goodsNotInFreeCirculationIndicator;
    }

    /**
     * Sets the value of the goodsNotInFreeCirculationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsNotInFreeCirculationIndicator(String value) {
        this.goodsNotInFreeCirculationIndicator = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setService(CodeDescriptionType value) {
        this.service = value;
    }

    /**
     * Gets the value of the numOfPieces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfPieces() {
        return numOfPieces;
    }

    /**
     * Sets the value of the numOfPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfPieces(String value) {
        this.numOfPieces = value;
    }

    /**
     * Gets the value of the shipmentTotalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentWeightType }
     *     
     */
    public ShipmentWeightType getShipmentTotalWeight() {
        return shipmentTotalWeight;
    }

    /**
     * Sets the value of the shipmentTotalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentWeightType }
     *     
     */
    public void setShipmentTotalWeight(ShipmentWeightType value) {
        this.shipmentTotalWeight = value;
    }

    /**
     * Gets the value of the documentsOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsOnlyIndicator() {
        return documentsOnlyIndicator;
    }

    /**
     * Sets the value of the documentsOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsOnlyIndicator(String value) {
        this.documentsOnlyIndicator = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }

    /**
     * Gets the value of the shipmentServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public ShipmentServiceOptionsType getShipmentServiceOptions() {
        return shipmentServiceOptions;
    }

    /**
     * Sets the value of the shipmentServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public void setShipmentServiceOptions(ShipmentServiceOptionsType value) {
        this.shipmentServiceOptions = value;
    }

    /**
     * Gets the value of the shipmentRatingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentRatingOptionsType }
     *     
     */
    public ShipmentRatingOptionsType getShipmentRatingOptions() {
        return shipmentRatingOptions;
    }

    /**
     * Sets the value of the shipmentRatingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentRatingOptionsType }
     *     
     */
    public void setShipmentRatingOptions(ShipmentRatingOptionsType value) {
        this.shipmentRatingOptions = value;
    }

    /**
     * Gets the value of the invoiceLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLineTotalType }
     *     
     */
    public InvoiceLineTotalType getInvoiceLineTotal() {
        return invoiceLineTotal;
    }

    /**
     * Sets the value of the invoiceLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLineTotalType }
     *     
     */
    public void setInvoiceLineTotal(InvoiceLineTotalType value) {
        this.invoiceLineTotal = value;
    }

    /**
     * Gets the value of the ratingMethodRequestedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingMethodRequestedIndicator() {
        return ratingMethodRequestedIndicator;
    }

    /**
     * Sets the value of the ratingMethodRequestedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingMethodRequestedIndicator(String value) {
        this.ratingMethodRequestedIndicator = value;
    }

    /**
     * Gets the value of the taxInformationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInformationIndicator() {
        return taxInformationIndicator;
    }

    /**
     * Sets the value of the taxInformationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInformationIndicator(String value) {
        this.taxInformationIndicator = value;
    }

    /**
     * Gets the value of the promotionalDiscountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalDiscountInformationType }
     *     
     */
    public PromotionalDiscountInformationType getPromotionalDiscountInformation() {
        return promotionalDiscountInformation;
    }

    /**
     * Sets the value of the promotionalDiscountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalDiscountInformationType }
     *     
     */
    public void setPromotionalDiscountInformation(PromotionalDiscountInformationType value) {
        this.promotionalDiscountInformation = value;
    }

    /**
     * Gets the value of the deliveryTimeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInTransitRequestType }
     *     
     */
    public TimeInTransitRequestType getDeliveryTimeInformation() {
        return deliveryTimeInformation;
    }

    /**
     * Sets the value of the deliveryTimeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInTransitRequestType }
     *     
     */
    public void setDeliveryTimeInformation(TimeInTransitRequestType value) {
        this.deliveryTimeInformation = value;
    }

    /**
     * Gets the value of the masterCartonIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterCartonIndicator() {
        return masterCartonIndicator;
    }

    /**
     * Sets the value of the masterCartonIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterCartonIndicator(String value) {
        this.masterCartonIndicator = value;
    }

    /**
     * Gets the value of the wweShipmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWWEShipmentIndicator() {
        return wweShipmentIndicator;
    }

    /**
     * Sets the value of the wweShipmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWWEShipmentIndicator(String value) {
        this.wweShipmentIndicator = value;
    }

}
