
package com.fedex.ws.addressvalidation.v4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParsedStreetLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParsedStreetLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreStreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeadingDirectional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrailingDirectional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuralRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParsedStreetLineDetail", propOrder = {
    "houseNumber",
    "preStreetType",
    "leadingDirectional",
    "streetName",
    "streetSuffix",
    "trailingDirectional",
    "unitLabel",
    "unitNumber",
    "ruralRoute",
    "poBox",
    "building",
    "organization"
})
public class ParsedStreetLineDetail {

    @XmlElement(name = "HouseNumber")
    protected String houseNumber;
    @XmlElement(name = "PreStreetType")
    protected String preStreetType;
    @XmlElement(name = "LeadingDirectional")
    protected String leadingDirectional;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffix")
    protected String streetSuffix;
    @XmlElement(name = "TrailingDirectional")
    protected String trailingDirectional;
    @XmlElement(name = "UnitLabel")
    protected String unitLabel;
    @XmlElement(name = "UnitNumber")
    protected String unitNumber;
    @XmlElement(name = "RuralRoute")
    protected String ruralRoute;
    @XmlElement(name = "POBox")
    protected String poBox;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Organization")
    protected String organization;

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the preStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreStreetType() {
        return preStreetType;
    }

    /**
     * Sets the value of the preStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreStreetType(String value) {
        this.preStreetType = value;
    }

    /**
     * Gets the value of the leadingDirectional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadingDirectional() {
        return leadingDirectional;
    }

    /**
     * Sets the value of the leadingDirectional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadingDirectional(String value) {
        this.leadingDirectional = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the trailingDirectional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailingDirectional() {
        return trailingDirectional;
    }

    /**
     * Sets the value of the trailingDirectional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailingDirectional(String value) {
        this.trailingDirectional = value;
    }

    /**
     * Gets the value of the unitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLabel() {
        return unitLabel;
    }

    /**
     * Sets the value of the unitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLabel(String value) {
        this.unitLabel = value;
    }

    /**
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumber(String value) {
        this.unitNumber = value;
    }

    /**
     * Gets the value of the ruralRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuralRoute() {
        return ruralRoute;
    }

    /**
     * Sets the value of the ruralRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuralRoute(String value) {
        this.ruralRoute = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

}
