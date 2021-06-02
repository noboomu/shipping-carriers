
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationType" type="{http://fedex.com/ws/vacs/v14}NotificationType" minOccurs="0"/&gt;
 *         &lt;element name="EmailDetail" type="{http://fedex.com/ws/vacs/v14}EMailDetail" minOccurs="0"/&gt;
 *         &lt;element name="FaxDetail" type="{http://fedex.com/ws/vacs/v14}FaxDetail" minOccurs="0"/&gt;
 *         &lt;element name="SmsDetail" type="{http://fedex.com/ws/vacs/v14}SmsDetail" minOccurs="0"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/vacs/v14}Localization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDetail", propOrder = {
    "notificationType",
    "emailDetail",
    "faxDetail",
    "smsDetail",
    "localization"
})
public class NotificationDetail {

    @XmlElement(name = "NotificationType")
    @XmlSchemaType(name = "string")
    protected NotificationType notificationType;
    @XmlElement(name = "EmailDetail")
    protected EMailDetail emailDetail;
    @XmlElement(name = "FaxDetail")
    protected FaxDetail faxDetail;
    @XmlElement(name = "SmsDetail")
    protected SmsDetail smsDetail;
    @XmlElement(name = "Localization")
    protected Localization localization;

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the emailDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EMailDetail }
     *     
     */
    public EMailDetail getEmailDetail() {
        return emailDetail;
    }

    /**
     * Sets the value of the emailDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailDetail }
     *     
     */
    public void setEmailDetail(EMailDetail value) {
        this.emailDetail = value;
    }

    /**
     * Gets the value of the faxDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FaxDetail }
     *     
     */
    public FaxDetail getFaxDetail() {
        return faxDetail;
    }

    /**
     * Sets the value of the faxDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxDetail }
     *     
     */
    public void setFaxDetail(FaxDetail value) {
        this.faxDetail = value;
    }

    /**
     * Gets the value of the smsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SmsDetail }
     *     
     */
    public SmsDetail getSmsDetail() {
        return smsDetail;
    }

    /**
     * Sets the value of the smsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsDetail }
     *     
     */
    public void setSmsDetail(SmsDetail value) {
        this.smsDetail = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setLocalization(Localization value) {
        this.localization = value;
    }

}
