
package com.fedex.ws.ifss.v1;

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
 * Reply parameter of IFSS method to process a specific delivery option
 * 
 * <p>Java class for ProcessDeliveryReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessDeliveryReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighestSeverity" type="{http://fedex.com/ws/ifss/v1}NotificationSeverityType"/&gt;
 *         &lt;element name="Notifications" type="{http://fedex.com/ws/ifss/v1}Notification" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/ifss/v1}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/ifss/v1}VersionId"/&gt;
 *         &lt;element name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasterTrackingNumber" type="{http://fedex.com/ws/ifss/v1}TrackingId" minOccurs="0"/&gt;
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessDeliveryReply", propOrder = {
    "highestSeverity",
    "notifications",
    "transactionDetail",
    "version",
    "confirmation",
    "masterTrackingNumber",
    "packageCount",
    "estimatedDeliveryTimestamp"
})
public class ProcessDeliveryReply {

    @XmlElement(name = "HighestSeverity", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications", required = true)
    protected List<Notification> notifications;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "Confirmation")
    protected String confirmation;
    @XmlElement(name = "MasterTrackingNumber")
    protected TrackingId masterTrackingNumber;
    @XmlElement(name = "PackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageCount;
    @XmlElement(name = "EstimatedDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryTimestamp;

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
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmation(String value) {
        this.confirmation = value;
    }

    /**
     * Gets the value of the masterTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getMasterTrackingNumber() {
        return masterTrackingNumber;
    }

    /**
     * Sets the value of the masterTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setMasterTrackingNumber(TrackingId value) {
        this.masterTrackingNumber = value;
    }

    /**
     * Gets the value of the packageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageCount() {
        return packageCount;
    }

    /**
     * Sets the value of the packageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageCount(BigInteger value) {
        this.packageCount = value;
    }

    /**
     * Gets the value of the estimatedDeliveryTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryTimestamp() {
        return estimatedDeliveryTimestamp;
    }

    /**
     * Sets the value of the estimatedDeliveryTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryTimestamp(XMLGregorianCalendar value) {
        this.estimatedDeliveryTimestamp = value;
    }

}
