
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatedShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatedShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Disclaimer" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}DisclaimerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CodeDescriptionType"/&gt;
 *         &lt;element name="RateChart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatedShipmentAlert" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}RatedShipmentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillableWeightCalculationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}BillingWeightType"/&gt;
 *         &lt;element name="TransportationCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType"/&gt;
 *         &lt;element name="BaseServiceCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="ItemizedCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FRSShipmentData" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}FRSShipmentType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOptionsCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType"/&gt;
 *         &lt;element name="TaxCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}TaxChargeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType"/&gt;
 *         &lt;element name="TotalChargesWithTaxes" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="NegotiatedRateCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}TotalChargeType" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteedDelivery" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}GuaranteedDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="RatedPackage" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}RatedPackageType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TimeInTransit" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}TimeInTransitResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedShipmentType", propOrder = {
    "disclaimer",
    "service",
    "rateChart",
    "ratedShipmentAlert",
    "billableWeightCalculationMethod",
    "ratingMethod",
    "billingWeight",
    "transportationCharges",
    "baseServiceCharge",
    "itemizedCharges",
    "frsShipmentData",
    "serviceOptionsCharges",
    "taxCharges",
    "totalCharges",
    "totalChargesWithTaxes",
    "negotiatedRateCharges",
    "guaranteedDelivery",
    "ratedPackage",
    "timeInTransit"
})
public class RatedShipmentType {

    @XmlElement(name = "Disclaimer")
    protected List<DisclaimerType> disclaimer;
    @XmlElement(name = "Service", required = true)
    protected CodeDescriptionType service;
    @XmlElement(name = "RateChart")
    protected String rateChart;
    @XmlElement(name = "RatedShipmentAlert")
    protected List<RatedShipmentInfoType> ratedShipmentAlert;
    @XmlElement(name = "BillableWeightCalculationMethod")
    protected String billableWeightCalculationMethod;
    @XmlElement(name = "RatingMethod")
    protected String ratingMethod;
    @XmlElement(name = "BillingWeight", required = true)
    protected BillingWeightType billingWeight;
    @XmlElement(name = "TransportationCharges", required = true)
    protected ChargesType transportationCharges;
    @XmlElement(name = "BaseServiceCharge")
    protected ChargesType baseServiceCharge;
    @XmlElement(name = "ItemizedCharges")
    protected List<ChargesType> itemizedCharges;
    @XmlElement(name = "FRSShipmentData")
    protected FRSShipmentType frsShipmentData;
    @XmlElement(name = "ServiceOptionsCharges", required = true)
    protected ChargesType serviceOptionsCharges;
    @XmlElement(name = "TaxCharges")
    protected List<TaxChargeType> taxCharges;
    @XmlElement(name = "TotalCharges", required = true)
    protected ChargesType totalCharges;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected ChargesType totalChargesWithTaxes;
    @XmlElement(name = "NegotiatedRateCharges")
    protected TotalChargeType negotiatedRateCharges;
    @XmlElement(name = "GuaranteedDelivery")
    protected GuaranteedDeliveryType guaranteedDelivery;
    @XmlElement(name = "RatedPackage", required = true)
    protected List<RatedPackageType> ratedPackage;
    @XmlElement(name = "TimeInTransit")
    protected TimeInTransitResponseType timeInTransit;

    /**
     * Gets the value of the disclaimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclaimerType }
     * 
     * 
     */
    public List<DisclaimerType> getDisclaimer() {
        if (disclaimer == null) {
            disclaimer = new ArrayList<DisclaimerType>();
        }
        return this.disclaimer;
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
     * Gets the value of the rateChart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateChart() {
        return rateChart;
    }

    /**
     * Sets the value of the rateChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateChart(String value) {
        this.rateChart = value;
    }

    /**
     * Gets the value of the ratedShipmentAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ratedShipmentAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatedShipmentAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatedShipmentInfoType }
     * 
     * 
     */
    public List<RatedShipmentInfoType> getRatedShipmentAlert() {
        if (ratedShipmentAlert == null) {
            ratedShipmentAlert = new ArrayList<RatedShipmentInfoType>();
        }
        return this.ratedShipmentAlert;
    }

    /**
     * Gets the value of the billableWeightCalculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillableWeightCalculationMethod() {
        return billableWeightCalculationMethod;
    }

    /**
     * Sets the value of the billableWeightCalculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillableWeightCalculationMethod(String value) {
        this.billableWeightCalculationMethod = value;
    }

    /**
     * Gets the value of the ratingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingMethod() {
        return ratingMethod;
    }

    /**
     * Sets the value of the ratingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingMethod(String value) {
        this.ratingMethod = value;
    }

    /**
     * Gets the value of the billingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BillingWeightType }
     *     
     */
    public BillingWeightType getBillingWeight() {
        return billingWeight;
    }

    /**
     * Sets the value of the billingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingWeightType }
     *     
     */
    public void setBillingWeight(BillingWeightType value) {
        this.billingWeight = value;
    }

    /**
     * Gets the value of the transportationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTransportationCharges() {
        return transportationCharges;
    }

    /**
     * Sets the value of the transportationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTransportationCharges(ChargesType value) {
        this.transportationCharges = value;
    }

    /**
     * Gets the value of the baseServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getBaseServiceCharge() {
        return baseServiceCharge;
    }

    /**
     * Sets the value of the baseServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setBaseServiceCharge(ChargesType value) {
        this.baseServiceCharge = value;
    }

    /**
     * Gets the value of the itemizedCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesType }
     * 
     * 
     */
    public List<ChargesType> getItemizedCharges() {
        if (itemizedCharges == null) {
            itemizedCharges = new ArrayList<ChargesType>();
        }
        return this.itemizedCharges;
    }

    /**
     * Gets the value of the frsShipmentData property.
     * 
     * @return
     *     possible object is
     *     {@link FRSShipmentType }
     *     
     */
    public FRSShipmentType getFRSShipmentData() {
        return frsShipmentData;
    }

    /**
     * Sets the value of the frsShipmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRSShipmentType }
     *     
     */
    public void setFRSShipmentData(FRSShipmentType value) {
        this.frsShipmentData = value;
    }

    /**
     * Gets the value of the serviceOptionsCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getServiceOptionsCharges() {
        return serviceOptionsCharges;
    }

    /**
     * Sets the value of the serviceOptionsCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setServiceOptionsCharges(ChargesType value) {
        this.serviceOptionsCharges = value;
    }

    /**
     * Gets the value of the taxCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxChargeType }
     * 
     * 
     */
    public List<TaxChargeType> getTaxCharges() {
        if (taxCharges == null) {
            taxCharges = new ArrayList<TaxChargeType>();
        }
        return this.taxCharges;
    }

    /**
     * Gets the value of the totalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTotalCharges() {
        return totalCharges;
    }

    /**
     * Sets the value of the totalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTotalCharges(ChargesType value) {
        this.totalCharges = value;
    }

    /**
     * Gets the value of the totalChargesWithTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * Sets the value of the totalChargesWithTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTotalChargesWithTaxes(ChargesType value) {
        this.totalChargesWithTaxes = value;
    }

    /**
     * Gets the value of the negotiatedRateCharges property.
     * 
     * @return
     *     possible object is
     *     {@link TotalChargeType }
     *     
     */
    public TotalChargeType getNegotiatedRateCharges() {
        return negotiatedRateCharges;
    }

    /**
     * Sets the value of the negotiatedRateCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalChargeType }
     *     
     */
    public void setNegotiatedRateCharges(TotalChargeType value) {
        this.negotiatedRateCharges = value;
    }

    /**
     * Gets the value of the guaranteedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedDeliveryType }
     *     
     */
    public GuaranteedDeliveryType getGuaranteedDelivery() {
        return guaranteedDelivery;
    }

    /**
     * Sets the value of the guaranteedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedDeliveryType }
     *     
     */
    public void setGuaranteedDelivery(GuaranteedDeliveryType value) {
        this.guaranteedDelivery = value;
    }

    /**
     * Gets the value of the ratedPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ratedPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatedPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatedPackageType }
     * 
     * 
     */
    public List<RatedPackageType> getRatedPackage() {
        if (ratedPackage == null) {
            ratedPackage = new ArrayList<RatedPackageType>();
        }
        return this.ratedPackage;
    }

    /**
     * Gets the value of the timeInTransit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInTransitResponseType }
     *     
     */
    public TimeInTransitResponseType getTimeInTransit() {
        return timeInTransit;
    }

    /**
     * Sets the value of the timeInTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInTransitResponseType }
     *     
     */
    public void setTimeInTransit(TimeInTransitResponseType value) {
        this.timeInTransit = value;
    }

}
