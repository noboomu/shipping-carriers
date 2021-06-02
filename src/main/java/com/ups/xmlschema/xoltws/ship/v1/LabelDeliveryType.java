
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMail" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}EmailDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="LabelLinksIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelDeliveryType", propOrder = {
    "eMail",
    "labelLinksIndicator"
})
public class LabelDeliveryType {

    @XmlElement(name = "EMail")
    protected EmailDetailsType eMail;
    @XmlElement(name = "LabelLinksIndicator")
    protected String labelLinksIndicator;

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link EmailDetailsType }
     *     
     */
    public EmailDetailsType getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailDetailsType }
     *     
     */
    public void setEMail(EmailDetailsType value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the labelLinksIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelLinksIndicator() {
        return labelLinksIndicator;
    }

    /**
     * Sets the value of the labelLinksIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelLinksIndicator(String value) {
        this.labelLinksIndicator = value;
    }

}
