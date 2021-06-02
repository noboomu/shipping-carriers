
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyPackageInOpenShipmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPackageInOpenShipmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/openship/v18}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/openship/v18}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/openship/v18}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/openship/v18}VersionId"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Actions" type="{http://fedex.com/ws/openship/v18}ModifyPackageInOpenShipmentActionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/openship/v18}TrackingId" minOccurs="0"/&gt;
 *         &lt;element name="RequestedPackageLineItem" type="{http://fedex.com/ws/openship/v18}RequestedPackageLineItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyPackageInOpenShipmentRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "index",
    "actions",
    "trackingId",
    "requestedPackageLineItem"
})
public class ModifyPackageInOpenShipmentRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "Index")
    protected String index;
    @XmlElement(name = "Actions")
    @XmlSchemaType(name = "string")
    protected List<ModifyPackageInOpenShipmentActionType> actions;
    @XmlElement(name = "TrackingId")
    protected TrackingId trackingId;
    @XmlElement(name = "RequestedPackageLineItem")
    protected RequestedPackageLineItem requestedPackageLineItem;

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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyPackageInOpenShipmentActionType }
     * 
     * 
     */
    public List<ModifyPackageInOpenShipmentActionType> getActions() {
        if (actions == null) {
            actions = new ArrayList<ModifyPackageInOpenShipmentActionType>();
        }
        return this.actions;
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
     * Gets the value of the requestedPackageLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedPackageLineItem }
     *     
     */
    public RequestedPackageLineItem getRequestedPackageLineItem() {
        return requestedPackageLineItem;
    }

    /**
     * Sets the value of the requestedPackageLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedPackageLineItem }
     *     
     */
    public void setRequestedPackageLineItem(RequestedPackageLineItem value) {
        this.requestedPackageLineItem = value;
    }

}
