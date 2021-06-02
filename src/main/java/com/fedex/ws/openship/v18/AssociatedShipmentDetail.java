
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedShipmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedShipmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}AssociatedShipmentType" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://fedex.com/ws/openship/v18}Party" minOccurs="0"/&gt;
 *         &lt;element name="Recipient" type="{http://fedex.com/ws/openship/v18}Party" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/openship/v18}TrackingId" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReferences" type="{http://fedex.com/ws/openship/v18}CustomerReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentOperationalDetail" type="{http://fedex.com/ws/openship/v18}ShipmentOperationalDetail" minOccurs="0"/&gt;
 *         &lt;element name="PackageOperationalDetail" type="{http://fedex.com/ws/openship/v18}PackageOperationalDetail" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{http://fedex.com/ws/openship/v18}ShippingDocument" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedShipmentDetail", propOrder = {
    "type",
    "sender",
    "recipient",
    "serviceType",
    "packagingType",
    "trackingId",
    "customerReferences",
    "shipmentOperationalDetail",
    "packageOperationalDetail",
    "label"
})
public class AssociatedShipmentDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AssociatedShipmentType type;
    @XmlElement(name = "Sender")
    protected Party sender;
    @XmlElement(name = "Recipient")
    protected Party recipient;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "PackagingType")
    protected String packagingType;
    @XmlElement(name = "TrackingId")
    protected TrackingId trackingId;
    @XmlElement(name = "CustomerReferences")
    protected List<CustomerReference> customerReferences;
    @XmlElement(name = "ShipmentOperationalDetail")
    protected ShipmentOperationalDetail shipmentOperationalDetail;
    @XmlElement(name = "PackageOperationalDetail")
    protected PackageOperationalDetail packageOperationalDetail;
    @XmlElement(name = "Label")
    protected ShippingDocument label;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedShipmentType }
     *     
     */
    public AssociatedShipmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedShipmentType }
     *     
     */
    public void setType(AssociatedShipmentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setSender(Party value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setRecipient(Party value) {
        this.recipient = value;
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
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setTrackingId(TrackingId value) {
        this.trackingId = value;
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
     * Gets the value of the shipmentOperationalDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOperationalDetail }
     *     
     */
    public ShipmentOperationalDetail getShipmentOperationalDetail() {
        return shipmentOperationalDetail;
    }

    /**
     * Sets the value of the shipmentOperationalDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOperationalDetail }
     *     
     */
    public void setShipmentOperationalDetail(ShipmentOperationalDetail value) {
        this.shipmentOperationalDetail = value;
    }

    /**
     * Gets the value of the packageOperationalDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PackageOperationalDetail }
     *     
     */
    public PackageOperationalDetail getPackageOperationalDetail() {
        return packageOperationalDetail;
    }

    /**
     * Sets the value of the packageOperationalDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageOperationalDetail }
     *     
     */
    public void setPackageOperationalDetail(PackageOperationalDetail value) {
        this.packageOperationalDetail = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocument }
     *     
     */
    public ShippingDocument getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocument }
     *     
     */
    public void setLabel(ShippingDocument value) {
        this.label = value;
    }

}
