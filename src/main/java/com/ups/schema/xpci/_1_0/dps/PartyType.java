
package com.ups.schema.xpci._1_0.dps;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScreenType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.ups.com/schema/xpci/1.0/dps}AddressType" minOccurs="0"/&gt;
 *         &lt;element name="MatchLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", propOrder = {
    "screenType",
    "contactName",
    "companyName",
    "address",
    "matchLevel"
})
public class PartyType {

    @XmlElement(name = "ScreenType", required = true)
    protected String screenType;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "MatchLevel")
    protected String matchLevel;

    /**
     * Gets the value of the screenType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenType() {
        return screenType;
    }

    /**
     * Sets the value of the screenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenType(String value) {
        this.screenType = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the matchLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchLevel() {
        return matchLevel;
    }

    /**
     * Sets the value of the matchLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchLevel(String value) {
        this.matchLevel = value;
    }

}
