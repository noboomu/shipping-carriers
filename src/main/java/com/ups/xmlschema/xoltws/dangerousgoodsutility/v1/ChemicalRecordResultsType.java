
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChemicalRecordResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalRecordResultsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChemicalRecordIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADRPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TunnelRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADRUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalRecordResultsType", propOrder = {
    "chemicalRecordIdentifier",
    "adrPoints",
    "transportCategory",
    "tunnelRestrictionCode",
    "adrUnits"
})
public class ChemicalRecordResultsType {

    @XmlElement(name = "ChemicalRecordIdentifier", required = true)
    protected String chemicalRecordIdentifier;
    @XmlElement(name = "ADRPoints")
    protected String adrPoints;
    @XmlElement(name = "TransportCategory")
    protected String transportCategory;
    @XmlElement(name = "TunnelRestrictionCode")
    protected String tunnelRestrictionCode;
    @XmlElement(name = "ADRUnits")
    protected String adrUnits;

    /**
     * Gets the value of the chemicalRecordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalRecordIdentifier() {
        return chemicalRecordIdentifier;
    }

    /**
     * Sets the value of the chemicalRecordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalRecordIdentifier(String value) {
        this.chemicalRecordIdentifier = value;
    }

    /**
     * Gets the value of the adrPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRPoints() {
        return adrPoints;
    }

    /**
     * Sets the value of the adrPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRPoints(String value) {
        this.adrPoints = value;
    }

    /**
     * Gets the value of the transportCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportCategory() {
        return transportCategory;
    }

    /**
     * Sets the value of the transportCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportCategory(String value) {
        this.transportCategory = value;
    }

    /**
     * Gets the value of the tunnelRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }

    /**
     * Sets the value of the tunnelRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelRestrictionCode(String value) {
        this.tunnelRestrictionCode = value;
    }

    /**
     * Gets the value of the adrUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRUnits() {
        return adrUnits;
    }

    /**
     * Sets the value of the adrUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRUnits(String value) {
        this.adrUnits = value;
    }

}
