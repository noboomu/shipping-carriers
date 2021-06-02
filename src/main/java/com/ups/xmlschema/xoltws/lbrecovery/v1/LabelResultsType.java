
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelResultsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LabelImage" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelImageType"/&gt;
 *         &lt;element name="Receipt" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}ReceiptType" minOccurs="0"/&gt;
 *         &lt;element name="Form" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}FormType" minOccurs="0"/&gt;
 *         &lt;element name="MailInnovationsTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailInnovationsLabelImage" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelImageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelResultsType", propOrder = {
    "trackingNumber",
    "labelImage",
    "receipt",
    "form",
    "mailInnovationsTrackingNumber",
    "mailInnovationsLabelImage"
})
public class LabelResultsType {

    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "LabelImage", required = true)
    protected LabelImageType labelImage;
    @XmlElement(name = "Receipt")
    protected ReceiptType receipt;
    @XmlElement(name = "Form")
    protected FormType form;
    @XmlElement(name = "MailInnovationsTrackingNumber")
    protected String mailInnovationsTrackingNumber;
    @XmlElement(name = "MailInnovationsLabelImage")
    protected LabelImageType mailInnovationsLabelImage;

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
     * Gets the value of the labelImage property.
     * 
     * @return
     *     possible object is
     *     {@link LabelImageType }
     *     
     */
    public LabelImageType getLabelImage() {
        return labelImage;
    }

    /**
     * Sets the value of the labelImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelImageType }
     *     
     */
    public void setLabelImage(LabelImageType value) {
        this.labelImage = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptType }
     *     
     */
    public ReceiptType getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptType }
     *     
     */
    public void setReceipt(ReceiptType value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setForm(FormType value) {
        this.form = value;
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
     * Gets the value of the mailInnovationsLabelImage property.
     * 
     * @return
     *     possible object is
     *     {@link LabelImageType }
     *     
     */
    public LabelImageType getMailInnovationsLabelImage() {
        return mailInnovationsLabelImage;
    }

    /**
     * Sets the value of the mailInnovationsLabelImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelImageType }
     *     
     */
    public void setMailInnovationsLabelImage(LabelImageType value) {
        this.mailInnovationsLabelImage = value;
    }

}
