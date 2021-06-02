
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequesterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequesterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ThirdPartyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttentionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Phone" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}FreightShipPhoneType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequesterType", propOrder = {
    "thirdPartyIndicator",
    "attentionName",
    "eMailAddress",
    "name",
    "phone"
})
public class RequesterType {

    @XmlElement(name = "ThirdPartyIndicator")
    protected String thirdPartyIndicator;
    @XmlElement(name = "AttentionName", required = true)
    protected String attentionName;
    @XmlElement(name = "EMailAddress", required = true)
    protected String eMailAddress;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Phone", required = true)
    protected FreightShipPhoneType phone;

    /**
     * Gets the value of the thirdPartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyIndicator() {
        return thirdPartyIndicator;
    }

    /**
     * Sets the value of the thirdPartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyIndicator(String value) {
        this.thirdPartyIndicator = value;
    }

    /**
     * Gets the value of the attentionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionName() {
        return attentionName;
    }

    /**
     * Sets the value of the attentionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionName(String value) {
        this.attentionName = value;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link FreightShipPhoneType }
     *     
     */
    public FreightShipPhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipPhoneType }
     *     
     */
    public void setPhone(FreightShipPhoneType value) {
        this.phone = value;
    }

}
