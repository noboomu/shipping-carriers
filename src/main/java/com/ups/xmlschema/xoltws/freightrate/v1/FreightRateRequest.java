
package com.ups.xmlschema.xoltws.freightrate.v1;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws.common.v1.RequestType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Request"/&gt;
 *         &lt;element name="ShipFrom" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}ShipFromType"/&gt;
 *         &lt;element name="ShipTo" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}ShipToType"/&gt;
 *         &lt;element name="PaymentInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}PaymentInformationType"/&gt;
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}RateCodeDescriptionType"/&gt;
 *         &lt;element name="HandlingUnitOne" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}HandlingUnitType"/&gt;
 *         &lt;element name="HandlingUnitTwo" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}HandlingUnitType" minOccurs="0"/&gt;
 *         &lt;element name="Commodity" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}CommodityType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipmentServiceOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}ShipmentServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="PickupRequest" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}PickupRequestType" minOccurs="0"/&gt;
 *         &lt;element name="AlternateRateOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}RateCodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="GFPOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}GFPOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}AccountType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentTotalWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}ShipmentTotalWeightType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingUnitWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}HandlingUnitWeightType" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedWeightIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeInTransitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HandlingUnits" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}HandlingUnitsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedHeightIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DensityEligibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "shipFrom",
    "shipTo",
    "paymentInformation",
    "service",
    "handlingUnitOne",
    "handlingUnitTwo",
    "commodity",
    "shipmentServiceOptions",
    "pickupRequest",
    "alternateRateOptions",
    "gfpOptions",
    "accountType",
    "shipmentTotalWeight",
    "handlingUnitWeight",
    "adjustedWeightIndicator",
    "timeInTransitIndicator",
    "handlingUnits",
    "adjustedHeightIndicator",
    "densityEligibleIndicator",
    "quoteNumberIndicator"
})
@XmlRootElement(name = "FreightRateRequest")
public class FreightRateRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "ShipFrom", required = true)
    protected ShipFromType shipFrom;
    @XmlElement(name = "ShipTo", required = true)
    protected ShipToType shipTo;
    @XmlElement(name = "PaymentInformation", required = true)
    protected PaymentInformationType paymentInformation;
    @XmlElement(name = "Service", required = true)
    protected RateCodeDescriptionType service;
    @XmlElement(name = "HandlingUnitOne", required = true)
    protected HandlingUnitType handlingUnitOne;
    @XmlElement(name = "HandlingUnitTwo")
    protected HandlingUnitType handlingUnitTwo;
    @XmlElement(name = "Commodity", required = true)
    protected List<CommodityType> commodity;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentServiceOptionsType shipmentServiceOptions;
    @XmlElement(name = "PickupRequest")
    protected PickupRequestType pickupRequest;
    @XmlElement(name = "AlternateRateOptions")
    protected RateCodeDescriptionType alternateRateOptions;
    @XmlElement(name = "GFPOptions")
    protected GFPOptionsType gfpOptions;
    @XmlElement(name = "AccountType")
    protected AccountType accountType;
    @XmlElement(name = "ShipmentTotalWeight")
    protected ShipmentTotalWeightType shipmentTotalWeight;
    @XmlElement(name = "HandlingUnitWeight")
    protected HandlingUnitWeightType handlingUnitWeight;
    @XmlElement(name = "AdjustedWeightIndicator")
    protected String adjustedWeightIndicator;
    @XmlElement(name = "TimeInTransitIndicator")
    protected String timeInTransitIndicator;
    @XmlElement(name = "HandlingUnits")
    protected List<HandlingUnitsType> handlingUnits;
    @XmlElement(name = "AdjustedHeightIndicator")
    protected String adjustedHeightIndicator;
    @XmlElement(name = "DensityEligibleIndicator")
    protected String densityEligibleIndicator;
    @XmlElement(name = "QuoteNumberIndicator")
    protected String quoteNumberIndicator;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
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
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformationType }
     *     
     */
    public PaymentInformationType getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformationType }
     *     
     */
    public void setPaymentInformation(PaymentInformationType value) {
        this.paymentInformation = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link RateCodeDescriptionType }
     *     
     */
    public RateCodeDescriptionType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCodeDescriptionType }
     *     
     */
    public void setService(RateCodeDescriptionType value) {
        this.service = value;
    }

    /**
     * Gets the value of the handlingUnitOne property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingUnitType }
     *     
     */
    public HandlingUnitType getHandlingUnitOne() {
        return handlingUnitOne;
    }

    /**
     * Sets the value of the handlingUnitOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingUnitType }
     *     
     */
    public void setHandlingUnitOne(HandlingUnitType value) {
        this.handlingUnitOne = value;
    }

    /**
     * Gets the value of the handlingUnitTwo property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingUnitType }
     *     
     */
    public HandlingUnitType getHandlingUnitTwo() {
        return handlingUnitTwo;
    }

    /**
     * Sets the value of the handlingUnitTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingUnitType }
     *     
     */
    public void setHandlingUnitTwo(HandlingUnitType value) {
        this.handlingUnitTwo = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commodity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityType }
     * 
     * 
     */
    public List<CommodityType> getCommodity() {
        if (commodity == null) {
            commodity = new ArrayList<CommodityType>();
        }
        return this.commodity;
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
     * Gets the value of the pickupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PickupRequestType }
     *     
     */
    public PickupRequestType getPickupRequest() {
        return pickupRequest;
    }

    /**
     * Sets the value of the pickupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupRequestType }
     *     
     */
    public void setPickupRequest(PickupRequestType value) {
        this.pickupRequest = value;
    }

    /**
     * Gets the value of the alternateRateOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RateCodeDescriptionType }
     *     
     */
    public RateCodeDescriptionType getAlternateRateOptions() {
        return alternateRateOptions;
    }

    /**
     * Sets the value of the alternateRateOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCodeDescriptionType }
     *     
     */
    public void setAlternateRateOptions(RateCodeDescriptionType value) {
        this.alternateRateOptions = value;
    }

    /**
     * Gets the value of the gfpOptions property.
     * 
     * @return
     *     possible object is
     *     {@link GFPOptionsType }
     *     
     */
    public GFPOptionsType getGFPOptions() {
        return gfpOptions;
    }

    /**
     * Sets the value of the gfpOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GFPOptionsType }
     *     
     */
    public void setGFPOptions(GFPOptionsType value) {
        this.gfpOptions = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the shipmentTotalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTotalWeightType }
     *     
     */
    public ShipmentTotalWeightType getShipmentTotalWeight() {
        return shipmentTotalWeight;
    }

    /**
     * Sets the value of the shipmentTotalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTotalWeightType }
     *     
     */
    public void setShipmentTotalWeight(ShipmentTotalWeightType value) {
        this.shipmentTotalWeight = value;
    }

    /**
     * Gets the value of the handlingUnitWeight property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingUnitWeightType }
     *     
     */
    public HandlingUnitWeightType getHandlingUnitWeight() {
        return handlingUnitWeight;
    }

    /**
     * Sets the value of the handlingUnitWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingUnitWeightType }
     *     
     */
    public void setHandlingUnitWeight(HandlingUnitWeightType value) {
        this.handlingUnitWeight = value;
    }

    /**
     * Gets the value of the adjustedWeightIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedWeightIndicator() {
        return adjustedWeightIndicator;
    }

    /**
     * Sets the value of the adjustedWeightIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedWeightIndicator(String value) {
        this.adjustedWeightIndicator = value;
    }

    /**
     * Gets the value of the timeInTransitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeInTransitIndicator() {
        return timeInTransitIndicator;
    }

    /**
     * Sets the value of the timeInTransitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeInTransitIndicator(String value) {
        this.timeInTransitIndicator = value;
    }

    /**
     * Gets the value of the handlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the handlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingUnitsType }
     * 
     * 
     */
    public List<HandlingUnitsType> getHandlingUnits() {
        if (handlingUnits == null) {
            handlingUnits = new ArrayList<HandlingUnitsType>();
        }
        return this.handlingUnits;
    }

    /**
     * Gets the value of the adjustedHeightIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedHeightIndicator() {
        return adjustedHeightIndicator;
    }

    /**
     * Sets the value of the adjustedHeightIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedHeightIndicator(String value) {
        this.adjustedHeightIndicator = value;
    }

    /**
     * Gets the value of the densityEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensityEligibleIndicator() {
        return densityEligibleIndicator;
    }

    /**
     * Sets the value of the densityEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensityEligibleIndicator(String value) {
        this.densityEligibleIndicator = value;
    }

    /**
     * Gets the value of the quoteNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumberIndicator() {
        return quoteNumberIndicator;
    }

    /**
     * Sets the value of the quoteNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumberIndicator(String value) {
        this.quoteNumberIndicator = value;
    }

}
