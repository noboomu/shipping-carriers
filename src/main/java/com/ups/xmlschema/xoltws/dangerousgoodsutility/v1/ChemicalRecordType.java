
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChemicalRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChemicalRecordIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReportableQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClassDivisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubRiskClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingInstructionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProperShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HazardLabelRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingTypeQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommodityRegulatedLevelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransportCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TunnelRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllPackedInOneIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalRecordType", propOrder = {
    "chemicalRecordIdentifier",
    "reportableQuantity",
    "classDivisionNumber",
    "subRiskClass",
    "idNumber",
    "packagingGroupType",
    "quantity",
    "uom",
    "packagingInstructionCode",
    "properShippingName",
    "technicalName",
    "additionalDescription",
    "packagingType",
    "hazardLabelRequired",
    "packagingTypeQuantity",
    "commodityRegulatedLevelCode",
    "transportCategory",
    "tunnelRestrictionCode",
    "allPackedInOneIndicator"
})
public class ChemicalRecordType {

    @XmlElement(name = "ChemicalRecordIdentifier", required = true)
    protected String chemicalRecordIdentifier;
    @XmlElement(name = "ReportableQuantity")
    protected String reportableQuantity;
    @XmlElement(name = "ClassDivisionNumber")
    protected String classDivisionNumber;
    @XmlElement(name = "SubRiskClass")
    protected String subRiskClass;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "PackagingGroupType")
    protected String packagingGroupType;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UOM")
    protected String uom;
    @XmlElement(name = "PackagingInstructionCode")
    protected String packagingInstructionCode;
    @XmlElement(name = "ProperShippingName")
    protected String properShippingName;
    @XmlElement(name = "TechnicalName")
    protected String technicalName;
    @XmlElement(name = "AdditionalDescription")
    protected String additionalDescription;
    @XmlElement(name = "PackagingType")
    protected String packagingType;
    @XmlElement(name = "HazardLabelRequired")
    protected String hazardLabelRequired;
    @XmlElement(name = "PackagingTypeQuantity")
    protected String packagingTypeQuantity;
    @XmlElement(name = "CommodityRegulatedLevelCode", required = true)
    protected String commodityRegulatedLevelCode;
    @XmlElement(name = "TransportCategory")
    protected String transportCategory;
    @XmlElement(name = "TunnelRestrictionCode")
    protected String tunnelRestrictionCode;
    @XmlElement(name = "AllPackedInOneIndicator")
    protected String allPackedInOneIndicator;

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
     * Gets the value of the reportableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportableQuantity() {
        return reportableQuantity;
    }

    /**
     * Sets the value of the reportableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportableQuantity(String value) {
        this.reportableQuantity = value;
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOM(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the packagingInstructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingInstructionCode() {
        return packagingInstructionCode;
    }

    /**
     * Sets the value of the packagingInstructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingInstructionCode(String value) {
        this.packagingInstructionCode = value;
    }

    /**
     * Gets the value of the properShippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperShippingName() {
        return properShippingName;
    }

    /**
     * Sets the value of the properShippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperShippingName(String value) {
        this.properShippingName = value;
    }

    /**
     * Gets the value of the technicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalName() {
        return technicalName;
    }

    /**
     * Sets the value of the technicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalName(String value) {
        this.technicalName = value;
    }

    /**
     * Gets the value of the additionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDescription() {
        return additionalDescription;
    }

    /**
     * Sets the value of the additionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDescription(String value) {
        this.additionalDescription = value;
    }

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the hazardLabelRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardLabelRequired() {
        return hazardLabelRequired;
    }

    /**
     * Sets the value of the hazardLabelRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardLabelRequired(String value) {
        this.hazardLabelRequired = value;
    }

    /**
     * Gets the value of the packagingTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingTypeQuantity() {
        return packagingTypeQuantity;
    }

    /**
     * Sets the value of the packagingTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingTypeQuantity(String value) {
        this.packagingTypeQuantity = value;
    }

    /**
     * Gets the value of the commodityRegulatedLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityRegulatedLevelCode() {
        return commodityRegulatedLevelCode;
    }

    /**
     * Sets the value of the commodityRegulatedLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityRegulatedLevelCode(String value) {
        this.commodityRegulatedLevelCode = value;
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
     * Gets the value of the allPackedInOneIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPackedInOneIndicator() {
        return allPackedInOneIndicator;
    }

    /**
     * Sets the value of the allPackedInOneIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPackedInOneIndicator(String value) {
        this.allPackedInOneIndicator = value;
    }

}
