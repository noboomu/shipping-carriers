
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChemicalDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegulationSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HazardousMaterialsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClassDivisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubRiskClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPermit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalNameRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalShippingInformationRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TunnelRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportMultiplierQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelTunnelAcceptedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChemicalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAToUSShipmentAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalDetailType", propOrder = {
    "regulationSet",
    "idNumber",
    "hazardousMaterialsDescription",
    "classDivisionNumber",
    "subRiskClass",
    "packagingGroupType",
    "specialPermit",
    "technicalNameRequiredIndicator",
    "additionalShippingInformationRequiredIndicator",
    "tunnelRestrictionCode",
    "transportCategory",
    "transportMultiplierQuantity",
    "channelTunnelAcceptedIndicator",
    "chemicalType",
    "caToUSShipmentAllowedIndicator"
})
public class ChemicalDetailType {

    @XmlElement(name = "RegulationSet")
    protected String regulationSet;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "HazardousMaterialsDescription")
    protected String hazardousMaterialsDescription;
    @XmlElement(name = "ClassDivisionNumber")
    protected String classDivisionNumber;
    @XmlElement(name = "SubRiskClass")
    protected String subRiskClass;
    @XmlElement(name = "PackagingGroupType")
    protected String packagingGroupType;
    @XmlElement(name = "SpecialPermit")
    protected String specialPermit;
    @XmlElement(name = "TechnicalNameRequiredIndicator")
    protected String technicalNameRequiredIndicator;
    @XmlElement(name = "AdditionalShippingInformationRequiredIndicator")
    protected String additionalShippingInformationRequiredIndicator;
    @XmlElement(name = "TunnelRestrictionCode")
    protected String tunnelRestrictionCode;
    @XmlElement(name = "TransportCategory")
    protected String transportCategory;
    @XmlElement(name = "TransportMultiplierQuantity")
    protected String transportMultiplierQuantity;
    @XmlElement(name = "ChannelTunnelAcceptedIndicator")
    protected String channelTunnelAcceptedIndicator;
    @XmlElement(name = "ChemicalType")
    protected String chemicalType;
    @XmlElement(name = "CAToUSShipmentAllowedIndicator")
    protected String caToUSShipmentAllowedIndicator;

    /**
     * Gets the value of the regulationSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationSet() {
        return regulationSet;
    }

    /**
     * Sets the value of the regulationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationSet(String value) {
        this.regulationSet = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the hazardousMaterialsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousMaterialsDescription() {
        return hazardousMaterialsDescription;
    }

    /**
     * Sets the value of the hazardousMaterialsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousMaterialsDescription(String value) {
        this.hazardousMaterialsDescription = value;
    }

    /**
     * Gets the value of the classDivisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDivisionNumber() {
        return classDivisionNumber;
    }

    /**
     * Sets the value of the classDivisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDivisionNumber(String value) {
        this.classDivisionNumber = value;
    }

    /**
     * Gets the value of the subRiskClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRiskClass() {
        return subRiskClass;
    }

    /**
     * Sets the value of the subRiskClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRiskClass(String value) {
        this.subRiskClass = value;
    }

    /**
     * Gets the value of the packagingGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingGroupType() {
        return packagingGroupType;
    }

    /**
     * Sets the value of the packagingGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingGroupType(String value) {
        this.packagingGroupType = value;
    }

    /**
     * Gets the value of the specialPermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPermit() {
        return specialPermit;
    }

    /**
     * Sets the value of the specialPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPermit(String value) {
        this.specialPermit = value;
    }

    /**
     * Gets the value of the technicalNameRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalNameRequiredIndicator() {
        return technicalNameRequiredIndicator;
    }

    /**
     * Sets the value of the technicalNameRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalNameRequiredIndicator(String value) {
        this.technicalNameRequiredIndicator = value;
    }

    /**
     * Gets the value of the additionalShippingInformationRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalShippingInformationRequiredIndicator() {
        return additionalShippingInformationRequiredIndicator;
    }

    /**
     * Sets the value of the additionalShippingInformationRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalShippingInformationRequiredIndicator(String value) {
        this.additionalShippingInformationRequiredIndicator = value;
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
     * Gets the value of the transportMultiplierQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMultiplierQuantity() {
        return transportMultiplierQuantity;
    }

    /**
     * Sets the value of the transportMultiplierQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMultiplierQuantity(String value) {
        this.transportMultiplierQuantity = value;
    }

    /**
     * Gets the value of the channelTunnelAcceptedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelTunnelAcceptedIndicator() {
        return channelTunnelAcceptedIndicator;
    }

    /**
     * Sets the value of the channelTunnelAcceptedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelTunnelAcceptedIndicator(String value) {
        this.channelTunnelAcceptedIndicator = value;
    }

    /**
     * Gets the value of the chemicalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalType() {
        return chemicalType;
    }

    /**
     * Sets the value of the chemicalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalType(String value) {
        this.chemicalType = value;
    }

    /**
     * Gets the value of the caToUSShipmentAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAToUSShipmentAllowedIndicator() {
        return caToUSShipmentAllowedIndicator;
    }

    /**
     * Sets the value of the caToUSShipmentAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAToUSShipmentAllowedIndicator(String value) {
        this.caToUSShipmentAllowedIndicator = value;
    }

}
