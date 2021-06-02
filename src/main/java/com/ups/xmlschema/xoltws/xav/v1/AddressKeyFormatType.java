
package com.ups.xmlschema.xoltws.xav.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressKeyFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressKeyFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsigneeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttentionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="PoliticalDivision2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="PoliticalDivision1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="PostcodePrimaryLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="PostcodeExtendedLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Urbanization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressKeyFormatType", propOrder = {
    "consigneeName",
    "attentionName",
    "addressLine",
    "politicalDivision2",
    "politicalDivision1",
    "postcodePrimaryLow",
    "postcodeExtendedLow",
    "region",
    "urbanization",
    "countryCode"
})
public class AddressKeyFormatType {

    @XmlElement(name = "ConsigneeName")
    protected String consigneeName;
    @XmlElement(name = "AttentionName")
    protected String attentionName;
    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "PoliticalDivision2")
    protected String politicalDivision2;
    @XmlElement(name = "PoliticalDivision1")
    protected String politicalDivision1;
    @XmlElement(name = "PostcodePrimaryLow")
    protected String postcodePrimaryLow;
    @XmlElement(name = "PostcodeExtendedLow")
    protected String postcodeExtendedLow;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Urbanization")
    protected String urbanization;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;

    /**
     * Gets the value of the consigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * Sets the value of the consigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeName(String value) {
        this.consigneeName = value;
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
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the politicalDivision2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalDivision2() {
        return politicalDivision2;
    }

    /**
     * Sets the value of the politicalDivision2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalDivision2(String value) {
        this.politicalDivision2 = value;
    }

    /**
     * Gets the value of the politicalDivision1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalDivision1() {
        return politicalDivision1;
    }

    /**
     * Sets the value of the politicalDivision1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalDivision1(String value) {
        this.politicalDivision1 = value;
    }

    /**
     * Gets the value of the postcodePrimaryLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodePrimaryLow() {
        return postcodePrimaryLow;
    }

    /**
     * Sets the value of the postcodePrimaryLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodePrimaryLow(String value) {
        this.postcodePrimaryLow = value;
    }

    /**
     * Gets the value of the postcodeExtendedLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeExtendedLow() {
        return postcodeExtendedLow;
    }

    /**
     * Sets the value of the postcodeExtendedLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeExtendedLow(String value) {
        this.postcodeExtendedLow = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the urbanization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanization() {
        return urbanization;
    }

    /**
     * Sets the value of the urbanization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanization(String value) {
        this.urbanization = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
