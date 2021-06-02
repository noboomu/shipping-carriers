
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingSignatureProofOfDeliveryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingSignatureProofOfDeliveryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentFormat" type="{http://fedex.com/ws/track/v19}TrackingDocumentFormat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingSignatureProofOfDeliveryDetail", propOrder = {
    "documentFormat"
})
public class TrackingSignatureProofOfDeliveryDetail {

    @XmlElement(name = "DocumentFormat")
    protected TrackingDocumentFormat documentFormat;

    /**
     * Gets the value of the documentFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDocumentFormat }
     *     
     */
    public TrackingDocumentFormat getDocumentFormat() {
        return documentFormat;
    }

    /**
     * Sets the value of the documentFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDocumentFormat }
     *     
     */
    public void setDocumentFormat(TrackingDocumentFormat value) {
        this.documentFormat = value;
    }

}
