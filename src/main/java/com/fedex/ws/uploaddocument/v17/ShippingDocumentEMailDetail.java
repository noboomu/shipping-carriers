
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies how to e-mail shipping documents.
 * 
 * <p>Java class for ShippingDocumentEMailDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentEMailDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMailRecipients" type="{http://fedex.com/ws/uploaddocument/v17}ShippingDocumentEMailRecipient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Grouping" type="{http://fedex.com/ws/uploaddocument/v17}ShippingDocumentEMailGroupingType" minOccurs="0"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/uploaddocument/v17}Localization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentEMailDetail", propOrder = {
    "eMailRecipients",
    "grouping",
    "localization"
})
public class ShippingDocumentEMailDetail {

    @XmlElement(name = "EMailRecipients")
    protected List<ShippingDocumentEMailRecipient> eMailRecipients;
    @XmlElement(name = "Grouping")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentEMailGroupingType grouping;
    @XmlElement(name = "Localization")
    protected Localization localization;

    /**
     * Gets the value of the eMailRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eMailRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMailRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocumentEMailRecipient }
     * 
     * 
     */
    public List<ShippingDocumentEMailRecipient> getEMailRecipients() {
        if (eMailRecipients == null) {
            eMailRecipients = new ArrayList<ShippingDocumentEMailRecipient>();
        }
        return this.eMailRecipients;
    }

    /**
     * Gets the value of the grouping property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentEMailGroupingType }
     *     
     */
    public ShippingDocumentEMailGroupingType getGrouping() {
        return grouping;
    }

    /**
     * Sets the value of the grouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentEMailGroupingType }
     *     
     */
    public void setGrouping(ShippingDocumentEMailGroupingType value) {
        this.grouping = value;
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
