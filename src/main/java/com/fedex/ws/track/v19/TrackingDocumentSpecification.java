
package com.fedex.ws.track.v19;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocumentSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingDocumentSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentTypes" type="{http://fedex.com/ws/track/v19}TrackingDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillOfLadingDocumentDetail" type="{http://fedex.com/ws/track/v19}TrackingBillOfLadingDocumentDetail" minOccurs="0"/&gt;
 *         &lt;element name="FreightBillingDocumentDetail" type="{http://fedex.com/ws/track/v19}TrackingFreightBillingDocumentDetail" minOccurs="0"/&gt;
 *         &lt;element name="SignatureProofOfDeliveryDetail" type="{http://fedex.com/ws/track/v19}TrackingSignatureProofOfDeliveryDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingDocumentSpecification", propOrder = {
    "documentTypes",
    "billOfLadingDocumentDetail",
    "freightBillingDocumentDetail",
    "signatureProofOfDeliveryDetail"
})
public class TrackingDocumentSpecification {

    @XmlElement(name = "DocumentTypes")
    @XmlSchemaType(name = "string")
    protected List<TrackingDocumentType> documentTypes;
    @XmlElement(name = "BillOfLadingDocumentDetail")
    protected TrackingBillOfLadingDocumentDetail billOfLadingDocumentDetail;
    @XmlElement(name = "FreightBillingDocumentDetail")
    protected TrackingFreightBillingDocumentDetail freightBillingDocumentDetail;
    @XmlElement(name = "SignatureProofOfDeliveryDetail")
    protected TrackingSignatureProofOfDeliveryDetail signatureProofOfDeliveryDetail;

    /**
     * Gets the value of the documentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingDocumentType }
     * 
     * 
     */
    public List<TrackingDocumentType> getDocumentTypes() {
        if (documentTypes == null) {
            documentTypes = new ArrayList<TrackingDocumentType>();
        }
        return this.documentTypes;
    }

    /**
     * Gets the value of the billOfLadingDocumentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingBillOfLadingDocumentDetail }
     *     
     */
    public TrackingBillOfLadingDocumentDetail getBillOfLadingDocumentDetail() {
        return billOfLadingDocumentDetail;
    }

    /**
     * Sets the value of the billOfLadingDocumentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingBillOfLadingDocumentDetail }
     *     
     */
    public void setBillOfLadingDocumentDetail(TrackingBillOfLadingDocumentDetail value) {
        this.billOfLadingDocumentDetail = value;
    }

    /**
     * Gets the value of the freightBillingDocumentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingFreightBillingDocumentDetail }
     *     
     */
    public TrackingFreightBillingDocumentDetail getFreightBillingDocumentDetail() {
        return freightBillingDocumentDetail;
    }

    /**
     * Sets the value of the freightBillingDocumentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingFreightBillingDocumentDetail }
     *     
     */
    public void setFreightBillingDocumentDetail(TrackingFreightBillingDocumentDetail value) {
        this.freightBillingDocumentDetail = value;
    }

    /**
     * Gets the value of the signatureProofOfDeliveryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingSignatureProofOfDeliveryDetail }
     *     
     */
    public TrackingSignatureProofOfDeliveryDetail getSignatureProofOfDeliveryDetail() {
        return signatureProofOfDeliveryDetail;
    }

    /**
     * Sets the value of the signatureProofOfDeliveryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingSignatureProofOfDeliveryDetail }
     *     
     */
    public void setSignatureProofOfDeliveryDetail(TrackingSignatureProofOfDeliveryDetail value) {
        this.signatureProofOfDeliveryDetail = value;
    }

}
