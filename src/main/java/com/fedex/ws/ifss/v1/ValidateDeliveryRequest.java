
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Request parameter of IFSS method to validate a delivery option.
 * 
 * <p>Java class for ValidateDeliveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateDeliveryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/ifss/v1}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/ifss/v1}ClientDetail"/&gt;
 *         &lt;element name="UserDetail" type="{http://fedex.com/ws/ifss/v1}UserDetail" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/ifss/v1}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/ifss/v1}VersionId"/&gt;
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActionRequested" type="{http://fedex.com/ws/ifss/v1}DeliveryActionType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueTrackingNumber" type="{http://fedex.com/ws/ifss/v1}UniqueTrackingNumber" minOccurs="0"/&gt;
 *         &lt;element name="RecipientContact" type="{http://fedex.com/ws/ifss/v1}Contact" minOccurs="0"/&gt;
 *         &lt;element name="DestinationAddress" type="{http://fedex.com/ws/ifss/v1}Address" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryRequestDetail" type="{http://fedex.com/ws/ifss/v1}DeliveryRequestDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateDeliveryRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "userDetail",
    "transactionDetail",
    "version",
    "applicationId",
    "actionRequested",
    "uniqueTrackingNumber",
    "recipientContact",
    "destinationAddress",
    "deliveryRequestDetail"
})
public class ValidateDeliveryRequest {

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
    @XmlElement(name = "ApplicationId")
    protected String applicationId;
    @XmlElement(name = "ActionRequested")
    @XmlSchemaType(name = "string")
    protected DeliveryActionType actionRequested;
    @XmlElement(name = "UniqueTrackingNumber")
    protected UniqueTrackingNumber uniqueTrackingNumber;
    @XmlElement(name = "RecipientContact")
    protected Contact recipientContact;
    @XmlElement(name = "DestinationAddress")
    protected Address destinationAddress;
    @XmlElement(name = "DeliveryRequestDetail")
    protected DeliveryRequestDetail deliveryRequestDetail;

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
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the actionRequested property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryActionType }
     *     
     */
    public DeliveryActionType getActionRequested() {
        return actionRequested;
    }

    /**
     * Sets the value of the actionRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryActionType }
     *     
     */
    public void setActionRequested(DeliveryActionType value) {
        this.actionRequested = value;
    }

    /**
     * Gets the value of the uniqueTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTrackingNumber }
     *     
     */
    public UniqueTrackingNumber getUniqueTrackingNumber() {
        return uniqueTrackingNumber;
    }

    /**
     * Sets the value of the uniqueTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTrackingNumber }
     *     
     */
    public void setUniqueTrackingNumber(UniqueTrackingNumber value) {
        this.uniqueTrackingNumber = value;
    }

    /**
     * Gets the value of the recipientContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getRecipientContact() {
        return recipientContact;
    }

    /**
     * Sets the value of the recipientContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setRecipientContact(Contact value) {
        this.recipientContact = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestinationAddress(Address value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the deliveryRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRequestDetail }
     *     
     */
    public DeliveryRequestDetail getDeliveryRequestDetail() {
        return deliveryRequestDetail;
    }

    /**
     * Sets the value of the deliveryRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRequestDetail }
     *     
     */
    public void setDeliveryRequestDetail(DeliveryRequestDetail value) {
        this.deliveryRequestDetail = value;
    }

}
