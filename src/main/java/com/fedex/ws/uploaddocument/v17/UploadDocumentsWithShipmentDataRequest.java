
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentsWithShipmentDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentsWithShipmentDataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/uploaddocument/v17}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/uploaddocument/v17}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/uploaddocument/v17}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/uploaddocument/v17}VersionId"/&gt;
 *         &lt;element name="ShippingDocumentTypesToProduce" type="{http://fedex.com/ws/uploaddocument/v17}RequestedShippingDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerProvidedImages" type="{http://fedex.com/ws/uploaddocument/v17}CustomerProvidedImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipment" type="{http://fedex.com/ws/uploaddocument/v17}RequestedShipment" minOccurs="0"/&gt;
 *         &lt;element name="CompletedShipmentDetail" type="{http://fedex.com/ws/uploaddocument/v17}CompletedShipmentDetail" minOccurs="0"/&gt;
 *         &lt;element name="Documents" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DocumentReferences" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentReferenceDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentsWithShipmentDataRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "shippingDocumentTypesToProduce",
    "customerProvidedImages",
    "requestedShipment",
    "completedShipmentDetail",
    "documents",
    "documentReferences"
})
public class UploadDocumentsWithShipmentDataRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "ShippingDocumentTypesToProduce")
    @XmlSchemaType(name = "string")
    protected List<RequestedShippingDocumentType> shippingDocumentTypesToProduce;
    @XmlElement(name = "CustomerProvidedImages")
    protected List<CustomerProvidedImage> customerProvidedImages;
    @XmlElement(name = "RequestedShipment")
    protected RequestedShipment requestedShipment;
    @XmlElement(name = "CompletedShipmentDetail")
    protected CompletedShipmentDetail completedShipmentDetail;
    @XmlElement(name = "Documents")
    protected List<UploadDocumentDetail> documents;
    @XmlElement(name = "DocumentReferences")
    protected List<UploadDocumentReferenceDetail> documentReferences;

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
     * Gets the value of the shippingDocumentTypesToProduce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDocumentTypesToProduce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDocumentTypesToProduce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedShippingDocumentType }
     * 
     * 
     */
    public List<RequestedShippingDocumentType> getShippingDocumentTypesToProduce() {
        if (shippingDocumentTypesToProduce == null) {
            shippingDocumentTypesToProduce = new ArrayList<RequestedShippingDocumentType>();
        }
        return this.shippingDocumentTypesToProduce;
    }

    /**
     * Gets the value of the customerProvidedImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customerProvidedImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerProvidedImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProvidedImage }
     * 
     * 
     */
    public List<CustomerProvidedImage> getCustomerProvidedImages() {
        if (customerProvidedImages == null) {
            customerProvidedImages = new ArrayList<CustomerProvidedImage>();
        }
        return this.customerProvidedImages;
    }

    /**
     * Gets the value of the requestedShipment property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedShipment }
     *     
     */
    public RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }

    /**
     * Sets the value of the requestedShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedShipment }
     *     
     */
    public void setRequestedShipment(RequestedShipment value) {
        this.requestedShipment = value;
    }

    /**
     * Gets the value of the completedShipmentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedShipmentDetail }
     *     
     */
    public CompletedShipmentDetail getCompletedShipmentDetail() {
        return completedShipmentDetail;
    }

    /**
     * Sets the value of the completedShipmentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedShipmentDetail }
     *     
     */
    public void setCompletedShipmentDetail(CompletedShipmentDetail value) {
        this.completedShipmentDetail = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadDocumentDetail }
     * 
     * 
     */
    public List<UploadDocumentDetail> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<UploadDocumentDetail>();
        }
        return this.documents;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadDocumentReferenceDetail }
     * 
     * 
     */
    public List<UploadDocumentReferenceDetail> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<UploadDocumentReferenceDetail>();
        }
        return this.documentReferences;
    }

}
