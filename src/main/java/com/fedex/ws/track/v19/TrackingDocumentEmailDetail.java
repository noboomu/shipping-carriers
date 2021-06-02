
package com.fedex.ws.track.v19;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocumentEmailDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingDocumentEmailDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Recipients" type="{http://fedex.com/ws/track/v19}EMailDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://fedex.com/ws/track/v19}EMailDetail" minOccurs="0"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/track/v19}Localization" minOccurs="0"/&gt;
 *         &lt;element name="PersonalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingDocumentEmailDetail", propOrder = {
    "recipients",
    "sender",
    "localization",
    "personalMessage"
})
public class TrackingDocumentEmailDetail {

    @XmlElement(name = "Recipients")
    protected List<EMailDetail> recipients;
    @XmlElement(name = "Sender")
    protected EMailDetail sender;
    @XmlElement(name = "Localization")
    protected Localization localization;
    @XmlElement(name = "PersonalMessage")
    protected String personalMessage;

    /**
     * Gets the value of the recipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailDetail }
     * 
     * 
     */
    public List<EMailDetail> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<EMailDetail>();
        }
        return this.recipients;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link EMailDetail }
     *     
     */
    public EMailDetail getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailDetail }
     *     
     */
    public void setSender(EMailDetail value) {
        this.sender = value;
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

    /**
     * Gets the value of the personalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMessage() {
        return personalMessage;
    }

    /**
     * Sets the value of the personalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMessage(String value) {
        this.personalMessage = value;
    }

}
