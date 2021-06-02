
package com.fedex.ws.ship.v26;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteShipmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteShipmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/ship/v26}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/ship/v26}ClientDetail"/&gt;
 *         &lt;element name="UserDetail" type="{http://fedex.com/ws/ship/v26}UserDetail" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/ship/v26}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/ship/v26}VersionId"/&gt;
 *         &lt;element name="ShipTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/ship/v26}TrackingId" minOccurs="0"/&gt;
 *         &lt;element name="DeletionControl" type="{http://fedex.com/ws/ship/v26}DeletionControlType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteShipmentRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "userDetail",
    "transactionDetail",
    "version",
    "shipTimestamp",
    "trackingId",
    "deletionControl"
})
public class DeleteShipmentRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "UserDetail")
    protected UserDetail userDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "ShipTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipTimestamp;
    @XmlElement(name = "TrackingId")
    protected TrackingId trackingId;
    @XmlElement(name = "DeletionControl", required = true)
    @XmlSchemaType(name = "string")
    protected DeletionControlType deletionControl;

    /**
     * Gets the value of the webAuthenticationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }

    /**
     * Sets the value of the webAuthenticationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail value) {
        this.webAuthenticationDetail = value;
    }

    /**
     * Gets the value of the clientDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDetail }
     *     
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    /**
     * Sets the value of the clientDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetail }
     *     
     */
    public void setClientDetail(ClientDetail value) {
        this.clientDetail = value;
    }

    /**
     * Gets the value of the userDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetail }
     *     
     */
    public UserDetail getUserDetail() {
        return userDetail;
    }

    /**
     * Sets the value of the userDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetail }
     *     
     */
    public void setUserDetail(UserDetail value) {
        this.userDetail = value;
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
     * Gets the value of the shipTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipTimestamp() {
        return shipTimestamp;
    }

    /**
     * Sets the value of the shipTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipTimestamp(XMLGregorianCalendar value) {
        this.shipTimestamp = value;
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
     * Gets the value of the deletionControl property.
     * 
     * @return
     *     possible object is
     *     {@link DeletionControlType }
     *     
     */
    public DeletionControlType getDeletionControl() {
        return deletionControl;
    }

    /**
     * Sets the value of the deletionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletionControlType }
     *     
     */
    public void setDeletionControl(DeletionControlType value) {
        this.deletionControl = value;
    }

}
