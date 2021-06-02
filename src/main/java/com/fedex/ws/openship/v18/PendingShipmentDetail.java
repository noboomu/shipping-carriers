
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This information describes the kind of pending shipment being requested.
 * 
 * <p>Java class for PendingShipmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingShipmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}PendingShipmentType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EmailLabelDetail" type="{http://fedex.com/ws/openship/v18}EMailLabelDetail" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/openship/v18}PendingShipmentProcessingOptionsRequested" minOccurs="0"/&gt;
 *         &lt;element name="RecommendedDocumentSpecification" type="{http://fedex.com/ws/openship/v18}RecommendedDocumentSpecification" minOccurs="0"/&gt;
 *         &lt;element name="DocumentReferences" type="{http://fedex.com/ws/openship/v18}UploadDocumentReferenceDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingShipmentDetail", propOrder = {
    "type",
    "expirationDate",
    "emailLabelDetail",
    "processingOptions",
    "recommendedDocumentSpecification",
    "documentReferences"
})
public class PendingShipmentDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected PendingShipmentType type;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "EmailLabelDetail")
    protected EMailLabelDetail emailLabelDetail;
    @XmlElement(name = "ProcessingOptions")
    protected PendingShipmentProcessingOptionsRequested processingOptions;
    @XmlElement(name = "RecommendedDocumentSpecification")
    protected RecommendedDocumentSpecification recommendedDocumentSpecification;
    @XmlElement(name = "DocumentReferences")
    protected List<UploadDocumentReferenceDetail> documentReferences;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PendingShipmentType }
     *     
     */
    public PendingShipmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingShipmentType }
     *     
     */
    public void setType(PendingShipmentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the emailLabelDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EMailLabelDetail }
     *     
     */
    public EMailLabelDetail getEmailLabelDetail() {
        return emailLabelDetail;
    }

    /**
     * Sets the value of the emailLabelDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailLabelDetail }
     *     
     */
    public void setEmailLabelDetail(EMailLabelDetail value) {
        this.emailLabelDetail = value;
    }

    /**
     * Gets the value of the processingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PendingShipmentProcessingOptionsRequested }
     *     
     */
    public PendingShipmentProcessingOptionsRequested getProcessingOptions() {
        return processingOptions;
    }

    /**
     * Sets the value of the processingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingShipmentProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptions(PendingShipmentProcessingOptionsRequested value) {
        this.processingOptions = value;
    }

    /**
     * Gets the value of the recommendedDocumentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendedDocumentSpecification }
     *     
     */
    public RecommendedDocumentSpecification getRecommendedDocumentSpecification() {
        return recommendedDocumentSpecification;
    }

    /**
     * Sets the value of the recommendedDocumentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendedDocumentSpecification }
     *     
     */
    public void setRecommendedDocumentSpecification(RecommendedDocumentSpecification value) {
        this.recommendedDocumentSpecification = value;
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
