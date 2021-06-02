
package com.fedex.ws.rate.v28;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * These special services are available at the shipment level for some or all service types. If the shipper is requesting a special service which requires additional data (such as the COD amount), the shipment special service type must be present in the specialServiceTypes collection, and the supporting detail must be provided in the appropriate sub-object below.
 * 
 * <p>Java class for ShipmentSpecialServicesRequested complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentSpecialServicesRequested"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialServiceTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CodDetail" type="{http://fedex.com/ws/rate/v28}CodDetail" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOnInvoiceAcceptanceDetail" type="{http://fedex.com/ws/rate/v28}DeliveryOnInvoiceAcceptanceDetail" minOccurs="0"/&gt;
 *         &lt;element name="HoldAtLocationDetail" type="{http://fedex.com/ws/rate/v28}HoldAtLocationDetail" minOccurs="0"/&gt;
 *         &lt;element name="EventNotificationDetail" type="{http://fedex.com/ws/rate/v28}ShipmentEventNotificationDetail" minOccurs="0"/&gt;
 *         &lt;element name="ReturnShipmentDetail" type="{http://fedex.com/ws/rate/v28}ReturnShipmentDetail" minOccurs="0"/&gt;
 *         &lt;element name="PendingShipmentDetail" type="{http://fedex.com/ws/rate/v28}PendingShipmentDetail" minOccurs="0"/&gt;
 *         &lt;element name="InternationalControlledExportDetail" type="{http://fedex.com/ws/rate/v28}InternationalControlledExportDetail" minOccurs="0"/&gt;
 *         &lt;element name="InternationalTrafficInArmsRegulationsDetail" type="{http://fedex.com/ws/rate/v28}InternationalTrafficInArmsRegulationsDetail" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentDryIceDetail" type="{http://fedex.com/ws/rate/v28}ShipmentDryIceDetail" minOccurs="0"/&gt;
 *         &lt;element name="HomeDeliveryPremiumDetail" type="{http://fedex.com/ws/rate/v28}HomeDeliveryPremiumDetail" minOccurs="0"/&gt;
 *         &lt;element name="FlatbedTrailerDetail" type="{http://fedex.com/ws/rate/v28}FlatbedTrailerDetail" minOccurs="0"/&gt;
 *         &lt;element name="FreightGuaranteeDetail" type="{http://fedex.com/ws/rate/v28}FreightGuaranteeDetail" minOccurs="0"/&gt;
 *         &lt;element name="EtdDetail" type="{http://fedex.com/ws/rate/v28}EtdDetail" minOccurs="0"/&gt;
 *         &lt;element name="CustomDeliveryWindowDetail" type="{http://fedex.com/ws/rate/v28}CustomDeliveryWindowDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentSpecialServicesRequested", propOrder = {
    "specialServiceTypes",
    "codDetail",
    "deliveryOnInvoiceAcceptanceDetail",
    "holdAtLocationDetail",
    "eventNotificationDetail",
    "returnShipmentDetail",
    "pendingShipmentDetail",
    "internationalControlledExportDetail",
    "internationalTrafficInArmsRegulationsDetail",
    "shipmentDryIceDetail",
    "homeDeliveryPremiumDetail",
    "flatbedTrailerDetail",
    "freightGuaranteeDetail",
    "etdDetail",
    "customDeliveryWindowDetail"
})
public class ShipmentSpecialServicesRequested {

    @XmlElement(name = "SpecialServiceTypes")
    protected List<String> specialServiceTypes;
    @XmlElement(name = "CodDetail")
    protected CodDetail codDetail;
    @XmlElement(name = "DeliveryOnInvoiceAcceptanceDetail")
    protected DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail;
    @XmlElement(name = "HoldAtLocationDetail")
    protected HoldAtLocationDetail holdAtLocationDetail;
    @XmlElement(name = "EventNotificationDetail")
    protected ShipmentEventNotificationDetail eventNotificationDetail;
    @XmlElement(name = "ReturnShipmentDetail")
    protected ReturnShipmentDetail returnShipmentDetail;
    @XmlElement(name = "PendingShipmentDetail")
    protected PendingShipmentDetail pendingShipmentDetail;
    @XmlElement(name = "InternationalControlledExportDetail")
    protected InternationalControlledExportDetail internationalControlledExportDetail;
    @XmlElement(name = "InternationalTrafficInArmsRegulationsDetail")
    protected InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail;
    @XmlElement(name = "ShipmentDryIceDetail")
    protected ShipmentDryIceDetail shipmentDryIceDetail;
    @XmlElement(name = "HomeDeliveryPremiumDetail")
    protected HomeDeliveryPremiumDetail homeDeliveryPremiumDetail;
    @XmlElement(name = "FlatbedTrailerDetail")
    protected FlatbedTrailerDetail flatbedTrailerDetail;
    @XmlElement(name = "FreightGuaranteeDetail")
    protected FreightGuaranteeDetail freightGuaranteeDetail;
    @XmlElement(name = "EtdDetail")
    protected EtdDetail etdDetail;
    @XmlElement(name = "CustomDeliveryWindowDetail")
    protected CustomDeliveryWindowDetail customDeliveryWindowDetail;

    /**
     * Gets the value of the specialServiceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialServiceTypes() {
        if (specialServiceTypes == null) {
            specialServiceTypes = new ArrayList<String>();
        }
        return this.specialServiceTypes;
    }

    /**
     * Gets the value of the codDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CodDetail }
     *     
     */
    public CodDetail getCodDetail() {
        return codDetail;
    }

    /**
     * Sets the value of the codDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodDetail }
     *     
     */
    public void setCodDetail(CodDetail value) {
        this.codDetail = value;
    }

    /**
     * Gets the value of the deliveryOnInvoiceAcceptanceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOnInvoiceAcceptanceDetail }
     *     
     */
    public DeliveryOnInvoiceAcceptanceDetail getDeliveryOnInvoiceAcceptanceDetail() {
        return deliveryOnInvoiceAcceptanceDetail;
    }

    /**
     * Sets the value of the deliveryOnInvoiceAcceptanceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOnInvoiceAcceptanceDetail }
     *     
     */
    public void setDeliveryOnInvoiceAcceptanceDetail(DeliveryOnInvoiceAcceptanceDetail value) {
        this.deliveryOnInvoiceAcceptanceDetail = value;
    }

    /**
     * Gets the value of the holdAtLocationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HoldAtLocationDetail }
     *     
     */
    public HoldAtLocationDetail getHoldAtLocationDetail() {
        return holdAtLocationDetail;
    }

    /**
     * Sets the value of the holdAtLocationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldAtLocationDetail }
     *     
     */
    public void setHoldAtLocationDetail(HoldAtLocationDetail value) {
        this.holdAtLocationDetail = value;
    }

    /**
     * Gets the value of the eventNotificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentEventNotificationDetail }
     *     
     */
    public ShipmentEventNotificationDetail getEventNotificationDetail() {
        return eventNotificationDetail;
    }

    /**
     * Sets the value of the eventNotificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentEventNotificationDetail }
     *     
     */
    public void setEventNotificationDetail(ShipmentEventNotificationDetail value) {
        this.eventNotificationDetail = value;
    }

    /**
     * Gets the value of the returnShipmentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnShipmentDetail }
     *     
     */
    public ReturnShipmentDetail getReturnShipmentDetail() {
        return returnShipmentDetail;
    }

    /**
     * Sets the value of the returnShipmentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnShipmentDetail }
     *     
     */
    public void setReturnShipmentDetail(ReturnShipmentDetail value) {
        this.returnShipmentDetail = value;
    }

    /**
     * Gets the value of the pendingShipmentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PendingShipmentDetail }
     *     
     */
    public PendingShipmentDetail getPendingShipmentDetail() {
        return pendingShipmentDetail;
    }

    /**
     * Sets the value of the pendingShipmentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingShipmentDetail }
     *     
     */
    public void setPendingShipmentDetail(PendingShipmentDetail value) {
        this.pendingShipmentDetail = value;
    }

    /**
     * Gets the value of the internationalControlledExportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalControlledExportDetail }
     *     
     */
    public InternationalControlledExportDetail getInternationalControlledExportDetail() {
        return internationalControlledExportDetail;
    }

    /**
     * Sets the value of the internationalControlledExportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalControlledExportDetail }
     *     
     */
    public void setInternationalControlledExportDetail(InternationalControlledExportDetail value) {
        this.internationalControlledExportDetail = value;
    }

    /**
     * Gets the value of the internationalTrafficInArmsRegulationsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTrafficInArmsRegulationsDetail }
     *     
     */
    public InternationalTrafficInArmsRegulationsDetail getInternationalTrafficInArmsRegulationsDetail() {
        return internationalTrafficInArmsRegulationsDetail;
    }

    /**
     * Sets the value of the internationalTrafficInArmsRegulationsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTrafficInArmsRegulationsDetail }
     *     
     */
    public void setInternationalTrafficInArmsRegulationsDetail(InternationalTrafficInArmsRegulationsDetail value) {
        this.internationalTrafficInArmsRegulationsDetail = value;
    }

    /**
     * Gets the value of the shipmentDryIceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public ShipmentDryIceDetail getShipmentDryIceDetail() {
        return shipmentDryIceDetail;
    }

    /**
     * Sets the value of the shipmentDryIceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public void setShipmentDryIceDetail(ShipmentDryIceDetail value) {
        this.shipmentDryIceDetail = value;
    }

    /**
     * Gets the value of the homeDeliveryPremiumDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HomeDeliveryPremiumDetail }
     *     
     */
    public HomeDeliveryPremiumDetail getHomeDeliveryPremiumDetail() {
        return homeDeliveryPremiumDetail;
    }

    /**
     * Sets the value of the homeDeliveryPremiumDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeDeliveryPremiumDetail }
     *     
     */
    public void setHomeDeliveryPremiumDetail(HomeDeliveryPremiumDetail value) {
        this.homeDeliveryPremiumDetail = value;
    }

    /**
     * Gets the value of the flatbedTrailerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FlatbedTrailerDetail }
     *     
     */
    public FlatbedTrailerDetail getFlatbedTrailerDetail() {
        return flatbedTrailerDetail;
    }

    /**
     * Sets the value of the flatbedTrailerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatbedTrailerDetail }
     *     
     */
    public void setFlatbedTrailerDetail(FlatbedTrailerDetail value) {
        this.flatbedTrailerDetail = value;
    }

    /**
     * Gets the value of the freightGuaranteeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreightGuaranteeDetail }
     *     
     */
    public FreightGuaranteeDetail getFreightGuaranteeDetail() {
        return freightGuaranteeDetail;
    }

    /**
     * Sets the value of the freightGuaranteeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightGuaranteeDetail }
     *     
     */
    public void setFreightGuaranteeDetail(FreightGuaranteeDetail value) {
        this.freightGuaranteeDetail = value;
    }

    /**
     * Gets the value of the etdDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EtdDetail }
     *     
     */
    public EtdDetail getEtdDetail() {
        return etdDetail;
    }

    /**
     * Sets the value of the etdDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtdDetail }
     *     
     */
    public void setEtdDetail(EtdDetail value) {
        this.etdDetail = value;
    }

    /**
     * Gets the value of the customDeliveryWindowDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDeliveryWindowDetail }
     *     
     */
    public CustomDeliveryWindowDetail getCustomDeliveryWindowDetail() {
        return customDeliveryWindowDetail;
    }

    /**
     * Sets the value of the customDeliveryWindowDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDeliveryWindowDetail }
     *     
     */
    public void setCustomDeliveryWindowDetail(CustomDeliveryWindowDetail value) {
        this.customDeliveryWindowDetail = value;
    }

}
