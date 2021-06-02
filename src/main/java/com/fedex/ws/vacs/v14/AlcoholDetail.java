
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies details for a package containing alcohol
 * 
 * <p>Java class for AlcoholDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcoholDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipientType" type="{http://fedex.com/ws/vacs/v14}AlcoholRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="ShipperAgreementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcoholDetail", propOrder = {
    "recipientType",
    "shipperAgreementType"
})
public class AlcoholDetail {

    @XmlElement(name = "RecipientType")
    @XmlSchemaType(name = "string")
    protected AlcoholRecipientType recipientType;
    @XmlElement(name = "ShipperAgreementType")
    protected String shipperAgreementType;

    /**
     * Gets the value of the recipientType property.
     * 
     * @return
     *     possible object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public AlcoholRecipientType getRecipientType() {
        return recipientType;
    }

    /**
     * Sets the value of the recipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public void setRecipientType(AlcoholRecipientType value) {
        this.recipientType = value;
    }

    /**
     * Gets the value of the shipperAgreementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperAgreementType() {
        return shipperAgreementType;
    }

    /**
     * Sets the value of the shipperAgreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperAgreementType(String value) {
        this.shipperAgreementType = value;
    }

}
