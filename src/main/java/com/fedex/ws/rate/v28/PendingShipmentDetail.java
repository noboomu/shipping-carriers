
package com.fedex.ws.rate.v28;

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
 *         &lt;element name="Type" type="{http://fedex.com/ws/rate/v28}PendingShipmentType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/rate/v28}PendingShipmentProcessingOptionsRequested" minOccurs="0"/&gt;
 *         &lt;element name="RecommendedDocumentSpecification" type="{http://fedex.com/ws/rate/v28}RecommendedDocumentSpecification" minOccurs="0"/&gt;
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
    "processingOptions",
    "recommendedDocumentSpecification"
})
public class PendingShipmentDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected PendingShipmentType type;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "ProcessingOptions")
    protected PendingShipmentProcessingOptionsRequested processingOptions;
    @XmlElement(name = "RecommendedDocumentSpecification")
    protected RecommendedDocumentSpecification recommendedDocumentSpecification;

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

}
