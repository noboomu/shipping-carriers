
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/uploaddocument/v17}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/uploaddocument/v17}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/uploaddocument/v17}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/uploaddocument/v17}VersionId"/&gt;
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentsProcessingOptionsRequested" minOccurs="0"/&gt;
 *         &lt;element name="OriginCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginStateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationStateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/uploaddocument/v17}CarrierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Usage" type="{http://fedex.com/ws/uploaddocument/v17}DocumentUsageType" minOccurs="0"/&gt;
 *         &lt;element name="Documents" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentsRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "processingOptions",
    "originCountryCode",
    "originStateOrProvinceCode",
    "originPostalCode",
    "originLocationId",
    "destinationCountryCode",
    "destinationStateOrProvinceCode",
    "destinationPostalCode",
    "destinationLocationId",
    "folderId",
    "shipTimestamp",
    "carrierCode",
    "usage",
    "documents"
})
public class UploadDocumentsRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "ProcessingOptions")
    protected UploadDocumentsProcessingOptionsRequested processingOptions;
    @XmlElement(name = "OriginCountryCode")
    protected String originCountryCode;
    @XmlElement(name = "OriginStateOrProvinceCode")
    protected String originStateOrProvinceCode;
    @XmlElement(name = "OriginPostalCode")
    protected String originPostalCode;
    @XmlElement(name = "OriginLocationId")
    protected String originLocationId;
    @XmlElement(name = "DestinationCountryCode")
    protected String destinationCountryCode;
    @XmlElement(name = "DestinationStateOrProvinceCode")
    protected String destinationStateOrProvinceCode;
    @XmlElement(name = "DestinationPostalCode")
    protected String destinationPostalCode;
    @XmlElement(name = "DestinationLocationId")
    protected String destinationLocationId;
    @XmlElement(name = "FolderId")
    protected String folderId;
    @XmlElement(name = "ShipTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipTimestamp;
    @XmlElement(name = "CarrierCode")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "Usage")
    @XmlSchemaType(name = "string")
    protected DocumentUsageType usage;
    @XmlElement(name = "Documents")
    protected List<UploadDocumentDetail> documents;

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
     * Gets the value of the processingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentsProcessingOptionsRequested }
     *     
     */
    public UploadDocumentsProcessingOptionsRequested getProcessingOptions() {
        return processingOptions;
    }

    /**
     * Sets the value of the processingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentsProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptions(UploadDocumentsProcessingOptionsRequested value) {
        this.processingOptions = value;
    }

    /**
     * Gets the value of the originCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * Sets the value of the originCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * Gets the value of the originStateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStateOrProvinceCode() {
        return originStateOrProvinceCode;
    }

    /**
     * Sets the value of the originStateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStateOrProvinceCode(String value) {
        this.originStateOrProvinceCode = value;
    }

    /**
     * Gets the value of the originPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPostalCode() {
        return originPostalCode;
    }

    /**
     * Sets the value of the originPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPostalCode(String value) {
        this.originPostalCode = value;
    }

    /**
     * Gets the value of the originLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginLocationId() {
        return originLocationId;
    }

    /**
     * Sets the value of the originLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginLocationId(String value) {
        this.originLocationId = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the destinationStateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStateOrProvinceCode() {
        return destinationStateOrProvinceCode;
    }

    /**
     * Sets the value of the destinationStateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStateOrProvinceCode(String value) {
        this.destinationStateOrProvinceCode = value;
    }

    /**
     * Gets the value of the destinationPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    /**
     * Sets the value of the destinationPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPostalCode(String value) {
        this.destinationPostalCode = value;
    }

    /**
     * Gets the value of the destinationLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationId() {
        return destinationLocationId;
    }

    /**
     * Sets the value of the destinationLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationId(String value) {
        this.destinationLocationId = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
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
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setCarrierCode(CarrierCodeType value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentUsageType }
     *     
     */
    public DocumentUsageType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentUsageType }
     *     
     */
    public void setUsage(DocumentUsageType value) {
        this.usage = value;
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

}
