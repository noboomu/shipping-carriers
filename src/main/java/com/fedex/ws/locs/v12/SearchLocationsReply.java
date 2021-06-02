
package com.fedex.ws.locs.v12;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchLocationsReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLocationsReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighestSeverity" type="{http://fedex.com/ws/locs/v12}NotificationSeverityType"/&gt;
 *         &lt;element name="Notifications" type="{http://fedex.com/ws/locs/v12}Notification" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/locs/v12}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/locs/v12}VersionId"/&gt;
 *         &lt;element name="TotalResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="ResultsReturned" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://fedex.com/ws/locs/v12}Address" minOccurs="0"/&gt;
 *         &lt;element name="AddressToLocationRelationships" type="{http://fedex.com/ws/locs/v12}AddressToLocationRelationshipDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLocationsReply", propOrder = {
    "highestSeverity",
    "notifications",
    "transactionDetail",
    "version",
    "totalResultsAvailable",
    "resultsReturned",
    "formattedAddress",
    "addressToLocationRelationships"
})
public class SearchLocationsReply {

    @XmlElement(name = "HighestSeverity", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications", required = true)
    protected List<Notification> notifications;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "TotalResultsAvailable")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalResultsAvailable;
    @XmlElement(name = "ResultsReturned")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resultsReturned;
    @XmlElement(name = "FormattedAddress")
    protected Address formattedAddress;
    @XmlElement(name = "AddressToLocationRelationships")
    protected List<AddressToLocationRelationshipDetail> addressToLocationRelationships;

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
     * Gets the value of the totalResultsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalResultsAvailable() {
        return totalResultsAvailable;
    }

    /**
     * Sets the value of the totalResultsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalResultsAvailable(BigInteger value) {
        this.totalResultsAvailable = value;
    }

    /**
     * Gets the value of the resultsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultsReturned() {
        return resultsReturned;
    }

    /**
     * Sets the value of the resultsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultsReturned(BigInteger value) {
        this.resultsReturned = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setFormattedAddress(Address value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the addressToLocationRelationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addressToLocationRelationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressToLocationRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressToLocationRelationshipDetail }
     * 
     * 
     */
    public List<AddressToLocationRelationshipDetail> getAddressToLocationRelationships() {
        if (addressToLocationRelationships == null) {
            addressToLocationRelationships = new ArrayList<AddressToLocationRelationshipDetail>();
        }
        return this.addressToLocationRelationships;
    }

}
