
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReprintShippingDocumentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReprintShippingDocumentsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/openship/v18}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/openship/v18}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/openship/v18}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/openship/v18}VersionId"/&gt;
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/openship/v18}TrackingId" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentCreatorAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentCreatorMeterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelSpecification" type="{http://fedex.com/ws/openship/v18}LabelSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReprintShippingDocumentsRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "trackingId",
    "shipmentCreatorAccountNumber",
    "shipmentCreatorMeterNumber",
    "labelSpecification"
})
public class ReprintShippingDocumentsRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "TrackingId")
    protected TrackingId trackingId;
    @XmlElement(name = "ShipmentCreatorAccountNumber")
    protected String shipmentCreatorAccountNumber;
    @XmlElement(name = "ShipmentCreatorMeterNumber")
    protected String shipmentCreatorMeterNumber;
    @XmlElement(name = "LabelSpecification")
    protected LabelSpecification labelSpecification;

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
     * Gets the value of the shipmentCreatorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentCreatorAccountNumber() {
        return shipmentCreatorAccountNumber;
    }

    /**
     * Sets the value of the shipmentCreatorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentCreatorAccountNumber(String value) {
        this.shipmentCreatorAccountNumber = value;
    }

    /**
     * Gets the value of the shipmentCreatorMeterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentCreatorMeterNumber() {
        return shipmentCreatorMeterNumber;
    }

    /**
     * Sets the value of the shipmentCreatorMeterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentCreatorMeterNumber(String value) {
        this.shipmentCreatorMeterNumber = value;
    }

    /**
     * Gets the value of the labelSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSpecification }
     *     
     */
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }

    /**
     * Sets the value of the labelSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSpecification }
     *     
     */
    public void setLabelSpecification(LabelSpecification value) {
        this.labelSpecification = value;
    }

}
