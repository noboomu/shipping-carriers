
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentStatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentStatusDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentProducer" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentProducerType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentStatusType" minOccurs="0"/&gt;
 *         &lt;element name="StatusInfo" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentStatusInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentIdProducer" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentIdProducer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentStatusDetail", propOrder = {
    "lineNumber",
    "customerReference",
    "documentProducer",
    "documentType",
    "fileName",
    "status",
    "statusInfo",
    "message",
    "documentId",
    "documentIdProducer"
})
public class UploadDocumentStatusDetail {

    @XmlElement(name = "LineNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lineNumber;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "DocumentProducer")
    @XmlSchemaType(name = "string")
    protected UploadDocumentProducerType documentProducer;
    @XmlElement(name = "DocumentType")
    @XmlSchemaType(name = "string")
    protected UploadDocumentType documentType;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected UploadDocumentStatusType status;
    @XmlElement(name = "StatusInfo")
    @XmlSchemaType(name = "string")
    protected UploadDocumentStatusInfoType statusInfo;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "DocumentId")
    protected String documentId;
    @XmlElement(name = "DocumentIdProducer")
    @XmlSchemaType(name = "string")
    protected UploadDocumentIdProducer documentIdProducer;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the documentProducer property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentProducerType }
     *     
     */
    public UploadDocumentProducerType getDocumentProducer() {
        return documentProducer;
    }

    /**
     * Sets the value of the documentProducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentProducerType }
     *     
     */
    public void setDocumentProducer(UploadDocumentProducerType value) {
        this.documentProducer = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentType }
     *     
     */
    public UploadDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentType }
     *     
     */
    public void setDocumentType(UploadDocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentStatusType }
     *     
     */
    public UploadDocumentStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentStatusType }
     *     
     */
    public void setStatus(UploadDocumentStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentStatusInfoType }
     *     
     */
    public UploadDocumentStatusInfoType getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentStatusInfoType }
     *     
     */
    public void setStatusInfo(UploadDocumentStatusInfoType value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the documentIdProducer property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentIdProducer }
     *     
     */
    public UploadDocumentIdProducer getDocumentIdProducer() {
        return documentIdProducer;
    }

    /**
     * Sets the value of the documentIdProducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentIdProducer }
     *     
     */
    public void setDocumentIdProducer(UploadDocumentIdProducer value) {
        this.documentIdProducer = value;
    }

}
