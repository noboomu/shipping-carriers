
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Electronic Trade document references used with the ETD special service.
 * 
 * <p>Java class for EtdDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EtdDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Confirmation" type="{http://fedex.com/ws/uploaddocument/v17}EtdConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/uploaddocument/v17}EtdAttributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDocumentCopies" type="{http://fedex.com/ws/uploaddocument/v17}RequestedShippingDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EtdDetail", propOrder = {
    "confirmation",
    "attributes",
    "requestedDocumentCopies",
    "documents",
    "documentReferences"
})
public class EtdDetail {

    @XmlElement(name = "Confirmation")
    @XmlSchemaType(name = "string")
    protected EtdConfirmationType confirmation;
    @XmlElement(name = "Attributes")
    @XmlSchemaType(name = "string")
    protected List<EtdAttributeType> attributes;
    @XmlElement(name = "RequestedDocumentCopies")
    @XmlSchemaType(name = "string")
    protected List<RequestedShippingDocumentType> requestedDocumentCopies;
    @XmlElement(name = "Documents")
    protected List<UploadDocumentDetail> documents;
    @XmlElement(name = "DocumentReferences")
    protected List<UploadDocumentReferenceDetail> documentReferences;

    /**
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link EtdConfirmationType }
     *     
     */
    public EtdConfirmationType getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtdConfirmationType }
     *     
     */
    public void setConfirmation(EtdConfirmationType value) {
        this.confirmation = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtdAttributeType }
     * 
     * 
     */
    public List<EtdAttributeType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<EtdAttributeType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the requestedDocumentCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the requestedDocumentCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedDocumentCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedShippingDocumentType }
     * 
     * 
     */
    public List<RequestedShippingDocumentType> getRequestedDocumentCopies() {
        if (requestedDocumentCopies == null) {
            requestedDocumentCopies = new ArrayList<RequestedShippingDocumentType>();
        }
        return this.requestedDocumentCopies;
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
