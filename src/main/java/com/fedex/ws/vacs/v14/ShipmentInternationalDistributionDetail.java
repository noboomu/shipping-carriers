
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the attributes of a shipment related to its role in an international distribution (consolidation).
 * 
 * <p>Java class for ShipmentInternationalDistributionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInternationalDistributionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClearanceFacilityLocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceType" type="{http://fedex.com/ws/vacs/v14}DistributionClearanceType" minOccurs="0"/&gt;
 *         &lt;element name="SummaryDetail" type="{http://fedex.com/ws/vacs/v14}InternationalDistributionSummaryDetail" minOccurs="0"/&gt;
 *         &lt;element name="SplitPaymentSpecification" type="{http://fedex.com/ws/vacs/v14}SplitPaymentSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInternationalDistributionDetail", propOrder = {
    "clearanceFacilityLocId",
    "clearanceType",
    "summaryDetail",
    "splitPaymentSpecification"
})
public class ShipmentInternationalDistributionDetail {

    @XmlElement(name = "ClearanceFacilityLocId")
    protected String clearanceFacilityLocId;
    @XmlElement(name = "ClearanceType")
    @XmlSchemaType(name = "string")
    protected DistributionClearanceType clearanceType;
    @XmlElement(name = "SummaryDetail")
    protected InternationalDistributionSummaryDetail summaryDetail;
    @XmlElement(name = "SplitPaymentSpecification")
    protected SplitPaymentSpecification splitPaymentSpecification;

    /**
     * Gets the value of the clearanceFacilityLocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceFacilityLocId() {
        return clearanceFacilityLocId;
    }

    /**
     * Sets the value of the clearanceFacilityLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceFacilityLocId(String value) {
        this.clearanceFacilityLocId = value;
    }

    /**
     * Gets the value of the clearanceType property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionClearanceType }
     *     
     */
    public DistributionClearanceType getClearanceType() {
        return clearanceType;
    }

    /**
     * Sets the value of the clearanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionClearanceType }
     *     
     */
    public void setClearanceType(DistributionClearanceType value) {
        this.clearanceType = value;
    }

    /**
     * Gets the value of the summaryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalDistributionSummaryDetail }
     *     
     */
    public InternationalDistributionSummaryDetail getSummaryDetail() {
        return summaryDetail;
    }

    /**
     * Sets the value of the summaryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalDistributionSummaryDetail }
     *     
     */
    public void setSummaryDetail(InternationalDistributionSummaryDetail value) {
        this.summaryDetail = value;
    }

    /**
     * Gets the value of the splitPaymentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link SplitPaymentSpecification }
     *     
     */
    public SplitPaymentSpecification getSplitPaymentSpecification() {
        return splitPaymentSpecification;
    }

    /**
     * Sets the value of the splitPaymentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPaymentSpecification }
     *     
     */
    public void setSplitPaymentSpecification(SplitPaymentSpecification value) {
        this.splitPaymentSpecification = value;
    }

}
