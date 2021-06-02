
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import com.ups.xmlschema.xoltws.common.v1.RequestType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Request"/&gt;
 *         &lt;element name="LabelSpecification" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="Translate" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}TranslateType" minOccurs="0"/&gt;
 *         &lt;element name="LabelDelivery" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailInnovationsTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceValues" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}ReferenceValuesType" minOccurs="0"/&gt;
 *         &lt;element name="UPSPremiumCareForm" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LRUPSPremiumCareFormType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "labelSpecification",
    "translate",
    "labelDelivery",
    "trackingNumber",
    "mailInnovationsTrackingNumber",
    "referenceValues",
    "upsPremiumCareForm"
})
@XmlRootElement(name = "LabelRecoveryRequest")
public class LabelRecoveryRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "LabelSpecification")
    protected LabelSpecificationType labelSpecification;
    @XmlElement(name = "Translate")
    protected TranslateType translate;
    @XmlElement(name = "LabelDelivery")
    protected LabelDeliveryType labelDelivery;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "MailInnovationsTrackingNumber")
    protected String mailInnovationsTrackingNumber;
    @XmlElement(name = "ReferenceValues")
    protected ReferenceValuesType referenceValues;
    @XmlElement(name = "UPSPremiumCareForm")
    protected LRUPSPremiumCareFormType upsPremiumCareForm;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the labelSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSpecificationType }
     *     
     */
    public LabelSpecificationType getLabelSpecification() {
        return labelSpecification;
    }

    /**
     * Sets the value of the labelSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSpecificationType }
     *     
     */
    public void setLabelSpecification(LabelSpecificationType value) {
        this.labelSpecification = value;
    }

    /**
     * Gets the value of the translate property.
     * 
     * @return
     *     possible object is
     *     {@link TranslateType }
     *     
     */
    public TranslateType getTranslate() {
        return translate;
    }

    /**
     * Sets the value of the translate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateType }
     *     
     */
    public void setTranslate(TranslateType value) {
        this.translate = value;
    }

    /**
     * Gets the value of the labelDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link LabelDeliveryType }
     *     
     */
    public LabelDeliveryType getLabelDelivery() {
        return labelDelivery;
    }

    /**
     * Sets the value of the labelDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelDeliveryType }
     *     
     */
    public void setLabelDelivery(LabelDeliveryType value) {
        this.labelDelivery = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the mailInnovationsTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailInnovationsTrackingNumber() {
        return mailInnovationsTrackingNumber;
    }

    /**
     * Sets the value of the mailInnovationsTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailInnovationsTrackingNumber(String value) {
        this.mailInnovationsTrackingNumber = value;
    }

    /**
     * Gets the value of the referenceValues property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceValuesType }
     *     
     */
    public ReferenceValuesType getReferenceValues() {
        return referenceValues;
    }

    /**
     * Sets the value of the referenceValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceValuesType }
     *     
     */
    public void setReferenceValues(ReferenceValuesType value) {
        this.referenceValues = value;
    }

    /**
     * Gets the value of the upsPremiumCareForm property.
     * 
     * @return
     *     possible object is
     *     {@link LRUPSPremiumCareFormType }
     *     
     */
    public LRUPSPremiumCareFormType getUPSPremiumCareForm() {
        return upsPremiumCareForm;
    }

    /**
     * Sets the value of the upsPremiumCareForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LRUPSPremiumCareFormType }
     *     
     */
    public void setUPSPremiumCareForm(LRUPSPremiumCareFormType value) {
        this.upsPremiumCareForm = value;
    }

}
