
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateConsolidationReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateConsolidationReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighestSeverity" type="{http://fedex.com/ws/openship/v18}NotificationSeverityType"/&gt;
 *         &lt;element name="Notifications" type="{http://fedex.com/ws/openship/v18}Notification" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/openship/v18}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/openship/v18}VersionId"/&gt;
 *         &lt;element name="ConsolidationKey" type="{http://fedex.com/ws/openship/v18}ConsolidationKey" minOccurs="0"/&gt;
 *         &lt;element name="TrackingIds" type="{http://fedex.com/ws/openship/v18}TrackingId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDistributionLocations" type="{http://fedex.com/ws/openship/v18}RequestedDistributionLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateConsolidationReply", propOrder = {
    "highestSeverity",
    "notifications",
    "transactionDetail",
    "version",
    "consolidationKey",
    "trackingIds",
    "effectiveDistributionLocations"
})
public class CreateConsolidationReply {

    @XmlElement(name = "HighestSeverity", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications", required = true)
    protected List<Notification> notifications;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "ConsolidationKey")
    protected ConsolidationKey consolidationKey;
    @XmlElement(name = "TrackingIds")
    protected List<TrackingId> trackingIds;
    @XmlElement(name = "EffectiveDistributionLocations")
    protected List<RequestedDistributionLocation> effectiveDistributionLocations;

    /**
     * Gets the value of the highestSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSeverityType }
     *     
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * Sets the value of the highestSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSeverityType }
     *     
     */
    public void setHighestSeverity(NotificationSeverityType value) {
        this.highestSeverity = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<Notification>();
        }
        return this.notifications;
    }

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetail }
     *     
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetail }
     *     
     */
    public void setTransactionDetail(TransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionId }
     *     
     */
    public VersionId getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionId }
     *     
     */
    public void setVersion(VersionId value) {
        this.version = value;
    }

    /**
     * Gets the value of the consolidationKey property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationKey }
     *     
     */
    public ConsolidationKey getConsolidationKey() {
        return consolidationKey;
    }

    /**
     * Sets the value of the consolidationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationKey }
     *     
     */
    public void setConsolidationKey(ConsolidationKey value) {
        this.consolidationKey = value;
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
     * Gets the value of the effectiveDistributionLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveDistributionLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveDistributionLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedDistributionLocation }
     * 
     * 
     */
    public List<RequestedDistributionLocation> getEffectiveDistributionLocations() {
        if (effectiveDistributionLocations == null) {
            effectiveDistributionLocations = new ArrayList<RequestedDistributionLocation>();
        }
        return this.effectiveDistributionLocations;
    }

}
