
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains all data required for (non-label) documents to be produced in conjunction with a specific international distribution consolidation.
 * 
 * <p>Java class for ConsolidationDocumentSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidationDocumentSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsolidationDocumentTypes" type="{http://fedex.com/ws/openship/v18}RequestedConsolidationDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CondensedCrnReportDetail" type="{http://fedex.com/ws/openship/v18}CondensedCrnReportDetail" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidatedCommercialInvoiceDetail" type="{http://fedex.com/ws/openship/v18}ConsolidatedCommercialInvoiceDetail" minOccurs="0"/&gt;
 *         &lt;element name="CustomDocumentDetails" type="{http://fedex.com/ws/openship/v18}CustomConsolidationDocumentDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidatedCustomsLinehaulReportDetail" type="{http://fedex.com/ws/openship/v18}ConsolidationCustomsLinehaulReportDetail" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidatedPartyReportDetail" type="{http://fedex.com/ws/openship/v18}ConsolidatedPartyReportDetail" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidatedSoldToSummaryReportDetail" type="{http://fedex.com/ws/openship/v18}ConsolidatedSoldToSummaryReportDetail" minOccurs="0"/&gt;
 *         &lt;element name="CustomsPackingListDetail" type="{http://fedex.com/ws/openship/v18}CustomsPackingListDetail" minOccurs="0"/&gt;
 *         &lt;element name="CrnReportDetail" type="{http://fedex.com/ws/openship/v18}CrnReportDetail" minOccurs="0"/&gt;
 *         &lt;element name="CommoditiesByTrackingNumberDetail" type="{http://fedex.com/ws/openship/v18}CommoditiesByTrackingNumberReportDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidationDocumentSpecification", propOrder = {
    "consolidationDocumentTypes",
    "condensedCrnReportDetail",
    "consolidatedCommercialInvoiceDetail",
    "customDocumentDetails",
    "consolidatedCustomsLinehaulReportDetail",
    "consolidatedPartyReportDetail",
    "consolidatedSoldToSummaryReportDetail",
    "customsPackingListDetail",
    "crnReportDetail",
    "commoditiesByTrackingNumberDetail"
})
public class ConsolidationDocumentSpecification {

    @XmlElement(name = "ConsolidationDocumentTypes")
    @XmlSchemaType(name = "string")
    protected List<RequestedConsolidationDocumentType> consolidationDocumentTypes;
    @XmlElement(name = "CondensedCrnReportDetail")
    protected CondensedCrnReportDetail condensedCrnReportDetail;
    @XmlElement(name = "ConsolidatedCommercialInvoiceDetail")
    protected ConsolidatedCommercialInvoiceDetail consolidatedCommercialInvoiceDetail;
    @XmlElement(name = "CustomDocumentDetails")
    protected List<CustomConsolidationDocumentDetail> customDocumentDetails;
    @XmlElement(name = "ConsolidatedCustomsLinehaulReportDetail")
    protected ConsolidationCustomsLinehaulReportDetail consolidatedCustomsLinehaulReportDetail;
    @XmlElement(name = "ConsolidatedPartyReportDetail")
    protected ConsolidatedPartyReportDetail consolidatedPartyReportDetail;
    @XmlElement(name = "ConsolidatedSoldToSummaryReportDetail")
    protected ConsolidatedSoldToSummaryReportDetail consolidatedSoldToSummaryReportDetail;
    @XmlElement(name = "CustomsPackingListDetail")
    protected CustomsPackingListDetail customsPackingListDetail;
    @XmlElement(name = "CrnReportDetail")
    protected CrnReportDetail crnReportDetail;
    @XmlElement(name = "CommoditiesByTrackingNumberDetail")
    protected CommoditiesByTrackingNumberReportDetail commoditiesByTrackingNumberDetail;

    /**
     * Gets the value of the consolidationDocumentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the consolidationDocumentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidationDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedConsolidationDocumentType }
     * 
     * 
     */
    public List<RequestedConsolidationDocumentType> getConsolidationDocumentTypes() {
        if (consolidationDocumentTypes == null) {
            consolidationDocumentTypes = new ArrayList<RequestedConsolidationDocumentType>();
        }
        return this.consolidationDocumentTypes;
    }

    /**
     * Gets the value of the condensedCrnReportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CondensedCrnReportDetail }
     *     
     */
    public CondensedCrnReportDetail getCondensedCrnReportDetail() {
        return condensedCrnReportDetail;
    }

    /**
     * Sets the value of the condensedCrnReportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondensedCrnReportDetail }
     *     
     */
    public void setCondensedCrnReportDetail(CondensedCrnReportDetail value) {
        this.condensedCrnReportDetail = value;
    }

    /**
     * Gets the value of the consolidatedCommercialInvoiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedCommercialInvoiceDetail }
     *     
     */
    public ConsolidatedCommercialInvoiceDetail getConsolidatedCommercialInvoiceDetail() {
        return consolidatedCommercialInvoiceDetail;
    }

    /**
     * Sets the value of the consolidatedCommercialInvoiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedCommercialInvoiceDetail }
     *     
     */
    public void setConsolidatedCommercialInvoiceDetail(ConsolidatedCommercialInvoiceDetail value) {
        this.consolidatedCommercialInvoiceDetail = value;
    }

    /**
     * Gets the value of the customDocumentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customDocumentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomDocumentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomConsolidationDocumentDetail }
     * 
     * 
     */
    public List<CustomConsolidationDocumentDetail> getCustomDocumentDetails() {
        if (customDocumentDetails == null) {
            customDocumentDetails = new ArrayList<CustomConsolidationDocumentDetail>();
        }
        return this.customDocumentDetails;
    }

    /**
     * Gets the value of the consolidatedCustomsLinehaulReportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationCustomsLinehaulReportDetail }
     *     
     */
    public ConsolidationCustomsLinehaulReportDetail getConsolidatedCustomsLinehaulReportDetail() {
        return consolidatedCustomsLinehaulReportDetail;
    }

    /**
     * Sets the value of the consolidatedCustomsLinehaulReportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationCustomsLinehaulReportDetail }
     *     
     */
    public void setConsolidatedCustomsLinehaulReportDetail(ConsolidationCustomsLinehaulReportDetail value) {
        this.consolidatedCustomsLinehaulReportDetail = value;
    }

    /**
     * Gets the value of the consolidatedPartyReportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedPartyReportDetail }
     *     
     */
    public ConsolidatedPartyReportDetail getConsolidatedPartyReportDetail() {
        return consolidatedPartyReportDetail;
    }

    /**
     * Sets the value of the consolidatedPartyReportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedPartyReportDetail }
     *     
     */
    public void setConsolidatedPartyReportDetail(ConsolidatedPartyReportDetail value) {
        this.consolidatedPartyReportDetail = value;
    }

    /**
     * Gets the value of the consolidatedSoldToSummaryReportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedSoldToSummaryReportDetail }
     *     
     */
    public ConsolidatedSoldToSummaryReportDetail getConsolidatedSoldToSummaryReportDetail() {
        return consolidatedSoldToSummaryReportDetail;
    }

    /**
     * Sets the value of the consolidatedSoldToSummaryReportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedSoldToSummaryReportDetail }
     *     
     */
    public void setConsolidatedSoldToSummaryReportDetail(ConsolidatedSoldToSummaryReportDetail value) {
        this.consolidatedSoldToSummaryReportDetail = value;
    }

    /**
     * Gets the value of the customsPackingListDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsPackingListDetail }
     *     
     */
    public CustomsPackingListDetail getCustomsPackingListDetail() {
        return customsPackingListDetail;
    }

    /**
     * Sets the value of the customsPackingListDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsPackingListDetail }
     *     
     */
    public void setCustomsPackingListDetail(CustomsPackingListDetail value) {
        this.customsPackingListDetail = value;
    }

    /**
     * Gets the value of the crnReportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CrnReportDetail }
     *     
     */
    public CrnReportDetail getCrnReportDetail() {
        return crnReportDetail;
    }

    /**
     * Sets the value of the crnReportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrnReportDetail }
     *     
     */
    public void setCrnReportDetail(CrnReportDetail value) {
        this.crnReportDetail = value;
    }

    /**
     * Gets the value of the commoditiesByTrackingNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CommoditiesByTrackingNumberReportDetail }
     *     
     */
    public CommoditiesByTrackingNumberReportDetail getCommoditiesByTrackingNumberDetail() {
        return commoditiesByTrackingNumberDetail;
    }

    /**
     * Sets the value of the commoditiesByTrackingNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommoditiesByTrackingNumberReportDetail }
     *     
     */
    public void setCommoditiesByTrackingNumberDetail(CommoditiesByTrackingNumberReportDetail value) {
        this.commoditiesByTrackingNumberDetail = value;
    }

}
