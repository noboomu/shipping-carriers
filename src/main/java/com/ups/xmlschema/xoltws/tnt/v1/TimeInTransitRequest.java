
package com.ups.xmlschema.xoltws.tnt.v1;

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
 *         &lt;element name="ShipFrom" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}RequestShipFromType"/&gt;
 *         &lt;element name="ShipTo" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}RequestShipToType"/&gt;
 *         &lt;element name="Pickup" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}PickupType"/&gt;
 *         &lt;element name="ShipmentWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}ShipmentWeightType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPackagesInShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineTotal" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}InvoiceLineTotalType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaximumListSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayDeliveryInfoRequestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DropOffAtFacilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldForPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllServicesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnContractServices" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}ReturnContractServicesType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pickup",
    "shipmentWeight",
    "totalPackagesInShipment",
    "invoiceLineTotal",
    "documentsOnlyIndicator",
    "billType",
    "maximumListSize",
    "saturdayDeliveryInfoRequestIndicator",
    "dropOffAtFacilityIndicator",
    "holdForPickupIndicator",
    "includeAllServicesIndicator",
    "returnContractServices"
})
@XmlRootElement(name = "TimeInTransitRequest")
public class TimeInTransitRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "ShipFrom", required = true)
    protected RequestShipFromType shipFrom;
    @XmlElement(name = "ShipTo", required = true)
    protected RequestShipToType shipTo;
    @XmlElement(name = "Pickup", required = true)
    protected PickupType pickup;
    @XmlElement(name = "ShipmentWeight")
    protected ShipmentWeightType shipmentWeight;
    @XmlElement(name = "TotalPackagesInShipment")
    protected String totalPackagesInShipment;
    @XmlElement(name = "InvoiceLineTotal")
    protected InvoiceLineTotalType invoiceLineTotal;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "MaximumListSize")
    protected String maximumListSize;
    @XmlElement(name = "SaturdayDeliveryInfoRequestIndicator")
    protected String saturdayDeliveryInfoRequestIndicator;
    @XmlElement(name = "DropOffAtFacilityIndicator")
    protected String dropOffAtFacilityIndicator;
    @XmlElement(name = "HoldForPickupIndicator")
    protected String holdForPickupIndicator;
    @XmlElement(name = "IncludeAllServicesIndicator")
    protected String includeAllServicesIndicator;
    @XmlElement(name = "ReturnContractServices")
    protected List<ReturnContractServicesType> returnContractServices;

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
     *     {@link RequestShipFromType }
     *     
     */
    public RequestShipFromType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShipFromType }
     *     
     */
    public void setShipFrom(RequestShipFromType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link RequestShipToType }
     *     
     */
    public RequestShipToType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShipToType }
     *     
     */
    public void setShipTo(RequestShipToType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the pickup property.
     * 
     * @return
     *     possible object is
     *     {@link PickupType }
     *     
     */
    public PickupType getPickup() {
        return pickup;
    }

    /**
     * Sets the value of the pickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupType }
     *     
     */
    public void setPickup(PickupType value) {
        this.pickup = value;
    }

    /**
     * Gets the value of the shipmentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentWeightType }
     *     
     */
    public ShipmentWeightType getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * Sets the value of the shipmentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentWeightType }
     *     
     */
    public void setShipmentWeight(ShipmentWeightType value) {
        this.shipmentWeight = value;
    }

    /**
     * Gets the value of the totalPackagesInShipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPackagesInShipment() {
        return totalPackagesInShipment;
    }

    /**
     * Sets the value of the totalPackagesInShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPackagesInShipment(String value) {
        this.totalPackagesInShipment = value;
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
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the maximumListSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumListSize() {
        return maximumListSize;
    }

    /**
     * Sets the value of the maximumListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumListSize(String value) {
        this.maximumListSize = value;
    }

    /**
     * Gets the value of the saturdayDeliveryInfoRequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayDeliveryInfoRequestIndicator() {
        return saturdayDeliveryInfoRequestIndicator;
    }

    /**
     * Sets the value of the saturdayDeliveryInfoRequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayDeliveryInfoRequestIndicator(String value) {
        this.saturdayDeliveryInfoRequestIndicator = value;
    }

    /**
     * Gets the value of the dropOffAtFacilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffAtFacilityIndicator() {
        return dropOffAtFacilityIndicator;
    }

    /**
     * Sets the value of the dropOffAtFacilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffAtFacilityIndicator(String value) {
        this.dropOffAtFacilityIndicator = value;
    }

    /**
     * Gets the value of the holdForPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldForPickupIndicator() {
        return holdForPickupIndicator;
    }

    /**
     * Sets the value of the holdForPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldForPickupIndicator(String value) {
        this.holdForPickupIndicator = value;
    }

    /**
     * Gets the value of the includeAllServicesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeAllServicesIndicator() {
        return includeAllServicesIndicator;
    }

    /**
     * Sets the value of the includeAllServicesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeAllServicesIndicator(String value) {
        this.includeAllServicesIndicator = value;
    }

    /**
     * Gets the value of the returnContractServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the returnContractServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnContractServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnContractServicesType }
     * 
     * 
     */
    public List<ReturnContractServicesType> getReturnContractServices() {
        if (returnContractServices == null) {
            returnContractServices = new ArrayList<ReturnContractServicesType>();
        }
        return this.returnContractServices;
    }

}
