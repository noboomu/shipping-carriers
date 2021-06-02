
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmConsolidationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmConsolidationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/openship/v18}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/openship/v18}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/openship/v18}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/openship/v18}VersionId"/&gt;
 *         &lt;element name="AsynchronousProcessingOptions" type="{http://fedex.com/ws/openship/v18}AsynchronousProcessingOptionsRequested" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidationKey" type="{http://fedex.com/ws/openship/v18}ConsolidationKey" minOccurs="0"/&gt;
 *         &lt;element name="LabelSpecification" type="{http://fedex.com/ws/openship/v18}LabelSpecification" minOccurs="0"/&gt;
 *         &lt;element name="ShippingDocumentSpecification" type="{http://fedex.com/ws/openship/v18}ShippingDocumentSpecification" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidationDocumentSpecification" type="{http://fedex.com/ws/openship/v18}ConsolidationDocumentSpecification" minOccurs="0"/&gt;
 *         &lt;element name="RateRequestTypes" type="{http://fedex.com/ws/openship/v18}RateRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EdtRequestType" type="{http://fedex.com/ws/openship/v18}EdtRequestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmConsolidationRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "asynchronousProcessingOptions",
    "consolidationKey",
    "labelSpecification",
    "shippingDocumentSpecification",
    "consolidationDocumentSpecification",
    "rateRequestTypes",
    "edtRequestType"
})
public class ConfirmConsolidationRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "AsynchronousProcessingOptions")
    protected AsynchronousProcessingOptionsRequested asynchronousProcessingOptions;
    @XmlElement(name = "ConsolidationKey")
    protected ConsolidationKey consolidationKey;
    @XmlElement(name = "LabelSpecification")
    protected LabelSpecification labelSpecification;
    @XmlElement(name = "ShippingDocumentSpecification")
    protected ShippingDocumentSpecification shippingDocumentSpecification;
    @XmlElement(name = "ConsolidationDocumentSpecification")
    protected ConsolidationDocumentSpecification consolidationDocumentSpecification;
    @XmlElement(name = "RateRequestTypes")
    @XmlSchemaType(name = "string")
    protected List<RateRequestType> rateRequestTypes;
    @XmlElement(name = "EdtRequestType")
    @XmlSchemaType(name = "string")
    protected EdtRequestType edtRequestType;

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
     * Gets the value of the asynchronousProcessingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AsynchronousProcessingOptionsRequested }
     *     
     */
    public AsynchronousProcessingOptionsRequested getAsynchronousProcessingOptions() {
        return asynchronousProcessingOptions;
    }

    /**
     * Sets the value of the asynchronousProcessingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsynchronousProcessingOptionsRequested }
     *     
     */
    public void setAsynchronousProcessingOptions(AsynchronousProcessingOptionsRequested value) {
        this.asynchronousProcessingOptions = value;
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

    /**
     * Gets the value of the shippingDocumentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentSpecification }
     *     
     */
    public ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }

    /**
     * Sets the value of the shippingDocumentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentSpecification }
     *     
     */
    public void setShippingDocumentSpecification(ShippingDocumentSpecification value) {
        this.shippingDocumentSpecification = value;
    }

    /**
     * Gets the value of the consolidationDocumentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationDocumentSpecification }
     *     
     */
    public ConsolidationDocumentSpecification getConsolidationDocumentSpecification() {
        return consolidationDocumentSpecification;
    }

    /**
     * Sets the value of the consolidationDocumentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationDocumentSpecification }
     *     
     */
    public void setConsolidationDocumentSpecification(ConsolidationDocumentSpecification value) {
        this.consolidationDocumentSpecification = value;
    }

    /**
     * Gets the value of the rateRequestTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rateRequestTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateRequestTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateRequestType }
     * 
     * 
     */
    public List<RateRequestType> getRateRequestTypes() {
        if (rateRequestTypes == null) {
            rateRequestTypes = new ArrayList<RateRequestType>();
        }
        return this.rateRequestTypes;
    }

    /**
     * Gets the value of the edtRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link EdtRequestType }
     *     
     */
    public EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }

    /**
     * Sets the value of the edtRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdtRequestType }
     *     
     */
    public void setEdtRequestType(EdtRequestType value) {
        this.edtRequestType = value;
    }

}
