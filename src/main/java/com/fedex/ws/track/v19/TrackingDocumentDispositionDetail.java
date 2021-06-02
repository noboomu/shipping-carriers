
package com.fedex.ws.track.v19;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocumentDispositionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingDocumentDispositionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DispositionType" type="{http://fedex.com/ws/track/v19}TrackingDocumentDispositionType" minOccurs="0"/&gt;
 *         &lt;element name="EMailDetail" type="{http://fedex.com/ws/track/v19}TrackingDocumentEmailDetail" minOccurs="0"/&gt;
 *         &lt;element name="FaxDetails" type="{http://fedex.com/ws/track/v19}FaxDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingDocumentDispositionDetail", propOrder = {
    "dispositionType",
    "eMailDetail",
    "faxDetails"
})
public class TrackingDocumentDispositionDetail {

    @XmlElement(name = "DispositionType")
    @XmlSchemaType(name = "string")
    protected TrackingDocumentDispositionType dispositionType;
    @XmlElement(name = "EMailDetail")
    protected TrackingDocumentEmailDetail eMailDetail;
    @XmlElement(name = "FaxDetails")
    protected List<FaxDetail> faxDetails;

    /**
     * Gets the value of the dispositionType property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDocumentDispositionType }
     *     
     */
    public TrackingDocumentDispositionType getDispositionType() {
        return dispositionType;
    }

    /**
     * Sets the value of the dispositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDocumentDispositionType }
     *     
     */
    public void setDispositionType(TrackingDocumentDispositionType value) {
        this.dispositionType = value;
    }

    /**
     * Gets the value of the eMailDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDocumentEmailDetail }
     *     
     */
    public TrackingDocumentEmailDetail getEMailDetail() {
        return eMailDetail;
    }

    /**
     * Sets the value of the eMailDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDocumentEmailDetail }
     *     
     */
    public void setEMailDetail(TrackingDocumentEmailDetail value) {
        this.eMailDetail = value;
    }

    /**
     * Gets the value of the faxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the faxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaxDetail }
     * 
     * 
     */
    public List<FaxDetail> getFaxDetails() {
        if (faxDetails == null) {
            faxDetails = new ArrayList<FaxDetail>();
        }
        return this.faxDetails;
    }

}
