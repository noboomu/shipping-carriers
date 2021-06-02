
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreAlertEMailMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreAlertEMailMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UndeliverableEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreAlertEMailMessageType", propOrder = {
    "eMailAddress",
    "undeliverableEMailAddress"
})
public class PreAlertEMailMessageType {

    @XmlElement(name = "EMailAddress", required = true)
    protected String eMailAddress;
    @XmlElement(name = "UndeliverableEMailAddress")
    protected String undeliverableEMailAddress;

    /**
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

    /**
     * Gets the value of the undeliverableEMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndeliverableEMailAddress() {
        return undeliverableEMailAddress;
    }

    /**
     * Sets the value of the undeliverableEMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndeliverableEMailAddress(String value) {
        this.undeliverableEMailAddress = value;
    }

}
