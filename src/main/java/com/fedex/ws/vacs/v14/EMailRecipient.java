
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information describing the address of of the email recipient, role of the email recipient and languages that are requested to be supported.
 * 
 * <p>Java class for EMailRecipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMailRecipient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://fedex.com/ws/vacs/v14}AccessorRoleType" minOccurs="0"/&gt;
 *         &lt;element name="OptionsRequested" type="{http://fedex.com/ws/vacs/v14}EmailOptionsRequested" minOccurs="0"/&gt;
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
@XmlType(name = "EMailRecipient", propOrder = {
    "emailAddress",
    "role",
    "optionsRequested",
    "localization"
})
public class EMailRecipient {

    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected AccessorRoleType role;
    @XmlElement(name = "OptionsRequested")
    protected EmailOptionsRequested optionsRequested;
    @XmlElement(name = "Localization")
    protected Localization localization;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link AccessorRoleType }
     *     
     */
    public AccessorRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessorRoleType }
     *     
     */
    public void setRole(AccessorRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the optionsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link EmailOptionsRequested }
     *     
     */
    public EmailOptionsRequested getOptionsRequested() {
        return optionsRequested;
    }

    /**
     * Sets the value of the optionsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailOptionsRequested }
     *     
     */
    public void setOptionsRequested(EmailOptionsRequested value) {
        this.optionsRequested = value;
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
