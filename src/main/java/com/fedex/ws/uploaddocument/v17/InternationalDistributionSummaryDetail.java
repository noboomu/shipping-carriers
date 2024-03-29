
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Totals accumulated during the processing of CRNs into the consolidation.
 * 
 * <p>Java class for InternationalDistributionSummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalDistributionSummaryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalWeight" type="{http://fedex.com/ws/uploaddocument/v17}Weight" minOccurs="0"/&gt;
 *         &lt;element name="TotalPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalUniqueAddressCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalCustomsValue" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalInsuredValue" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalFreightCharges" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalInsuranceCharges" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalTaxesOrMiscellaneousCharges" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalHandlingCosts" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalPackingCosts" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="DryIceDetail" type="{http://fedex.com/ws/uploaddocument/v17}ShipmentDryIceDetail" minOccurs="0"/&gt;
 *         &lt;element name="DangerousGoodsAccessibility" type="{http://fedex.com/ws/uploaddocument/v17}DangerousGoodsAccessibilityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalDistributionSummaryDetail", propOrder = {
    "totalWeight",
    "totalPackageCount",
    "totalUniqueAddressCount",
    "totalCustomsValue",
    "totalInsuredValue",
    "totalFreightCharges",
    "totalInsuranceCharges",
    "totalTaxesOrMiscellaneousCharges",
    "totalHandlingCosts",
    "totalPackingCosts",
    "dryIceDetail",
    "dangerousGoodsAccessibility"
})
public class InternationalDistributionSummaryDetail {

    @XmlElement(name = "TotalWeight")
    protected Weight totalWeight;
    @XmlElement(name = "TotalPackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalPackageCount;
    @XmlElement(name = "TotalUniqueAddressCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalUniqueAddressCount;
    @XmlElement(name = "TotalCustomsValue")
    protected Money totalCustomsValue;
    @XmlElement(name = "TotalInsuredValue")
    protected Money totalInsuredValue;
    @XmlElement(name = "TotalFreightCharges")
    protected Money totalFreightCharges;
    @XmlElement(name = "TotalInsuranceCharges")
    protected Money totalInsuranceCharges;
    @XmlElement(name = "TotalTaxesOrMiscellaneousCharges")
    protected Money totalTaxesOrMiscellaneousCharges;
    @XmlElement(name = "TotalHandlingCosts")
    protected Money totalHandlingCosts;
    @XmlElement(name = "TotalPackingCosts")
    protected Money totalPackingCosts;
    @XmlElement(name = "DryIceDetail")
    protected ShipmentDryIceDetail dryIceDetail;
    @XmlElement(name = "DangerousGoodsAccessibility")
    @XmlSchemaType(name = "string")
    protected DangerousGoodsAccessibilityType dangerousGoodsAccessibility;

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setTotalWeight(Weight value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the totalPackageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPackageCount() {
        return totalPackageCount;
    }

    /**
     * Sets the value of the totalPackageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPackageCount(BigInteger value) {
        this.totalPackageCount = value;
    }

    /**
     * Gets the value of the totalUniqueAddressCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUniqueAddressCount() {
        return totalUniqueAddressCount;
    }

    /**
     * Sets the value of the totalUniqueAddressCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUniqueAddressCount(BigInteger value) {
        this.totalUniqueAddressCount = value;
    }

    /**
     * Gets the value of the totalCustomsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalCustomsValue() {
        return totalCustomsValue;
    }

    /**
     * Sets the value of the totalCustomsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalCustomsValue(Money value) {
        this.totalCustomsValue = value;
    }

    /**
     * Gets the value of the totalInsuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalInsuredValue() {
        return totalInsuredValue;
    }

    /**
     * Sets the value of the totalInsuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalInsuredValue(Money value) {
        this.totalInsuredValue = value;
    }

    /**
     * Gets the value of the totalFreightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalFreightCharges() {
        return totalFreightCharges;
    }

    /**
     * Sets the value of the totalFreightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalFreightCharges(Money value) {
        this.totalFreightCharges = value;
    }

    /**
     * Gets the value of the totalInsuranceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalInsuranceCharges() {
        return totalInsuranceCharges;
    }

    /**
     * Sets the value of the totalInsuranceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalInsuranceCharges(Money value) {
        this.totalInsuranceCharges = value;
    }

    /**
     * Gets the value of the totalTaxesOrMiscellaneousCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalTaxesOrMiscellaneousCharges() {
        return totalTaxesOrMiscellaneousCharges;
    }

    /**
     * Sets the value of the totalTaxesOrMiscellaneousCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalTaxesOrMiscellaneousCharges(Money value) {
        this.totalTaxesOrMiscellaneousCharges = value;
    }

    /**
     * Gets the value of the totalHandlingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalHandlingCosts() {
        return totalHandlingCosts;
    }

    /**
     * Sets the value of the totalHandlingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalHandlingCosts(Money value) {
        this.totalHandlingCosts = value;
    }

    /**
     * Gets the value of the totalPackingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalPackingCosts() {
        return totalPackingCosts;
    }

    /**
     * Sets the value of the totalPackingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalPackingCosts(Money value) {
        this.totalPackingCosts = value;
    }

    /**
     * Gets the value of the dryIceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public ShipmentDryIceDetail getDryIceDetail() {
        return dryIceDetail;
    }

    /**
     * Sets the value of the dryIceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public void setDryIceDetail(ShipmentDryIceDetail value) {
        this.dryIceDetail = value;
    }

    /**
     * Gets the value of the dangerousGoodsAccessibility property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsAccessibilityType }
     *     
     */
    public DangerousGoodsAccessibilityType getDangerousGoodsAccessibility() {
        return dangerousGoodsAccessibility;
    }

    /**
     * Sets the value of the dangerousGoodsAccessibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsAccessibilityType }
     *     
     */
    public void setDangerousGoodsAccessibility(DangerousGoodsAccessibilityType value) {
        this.dangerousGoodsAccessibility = value;
    }

}
