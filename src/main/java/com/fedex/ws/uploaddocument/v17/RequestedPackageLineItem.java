
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedPackageLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedPackageLineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="GroupPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="StatusDetail" type="{http://fedex.com/ws/uploaddocument/v17}PackageStatusDetail" minOccurs="0"/&gt;
 *         &lt;element name="TrackingIds" type="{http://fedex.com/ws/uploaddocument/v17}TrackingId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VariableHandlingChargeDetail" type="{http://fedex.com/ws/uploaddocument/v17}VariableHandlingChargeDetail" minOccurs="0"/&gt;
 *         &lt;element name="InsuredValue" type="{http://fedex.com/ws/uploaddocument/v17}Money" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://fedex.com/ws/uploaddocument/v17}Weight" minOccurs="0"/&gt;
 *         &lt;element name="WeightSource" type="{http://fedex.com/ws/uploaddocument/v17}WeightSource" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://fedex.com/ws/uploaddocument/v17}Dimensions" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalPackaging" type="{http://fedex.com/ws/uploaddocument/v17}PhysicalPackagingType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedFreightLineItems" type="{http://fedex.com/ws/uploaddocument/v17}AssociatedFreightLineItemDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemDescriptionForClearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReferences" type="{http://fedex.com/ws/uploaddocument/v17}CustomerReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServicesRequested" type="{http://fedex.com/ws/uploaddocument/v17}PackageSpecialServicesRequested" minOccurs="0"/&gt;
 *         &lt;element name="SpecialHandlingDetail" type="{http://fedex.com/ws/uploaddocument/v17}PackageSpecialHandlingDetail" minOccurs="0"/&gt;
 *         &lt;element name="ContentRecords" type="{http://fedex.com/ws/uploaddocument/v17}ContentRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Commodities" type="{http://fedex.com/ws/uploaddocument/v17}Commodity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConveyanceDetail" type="{http://fedex.com/ws/uploaddocument/v17}ShipperConveyanceDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedPackageLineItem", propOrder = {
    "sequenceNumber",
    "groupNumber",
    "groupPackageCount",
    "statusDetail",
    "trackingIds",
    "variableHandlingChargeDetail",
    "insuredValue",
    "weight",
    "weightSource",
    "dimensions",
    "physicalPackaging",
    "associatedFreightLineItems",
    "itemDescription",
    "itemDescriptionForClearance",
    "customerReferences",
    "specialServicesRequested",
    "specialHandlingDetail",
    "contentRecords",
    "commodities",
    "conveyanceDetail"
})
public class RequestedPackageLineItem {

    @XmlElement(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "GroupNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupNumber;
    @XmlElement(name = "GroupPackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupPackageCount;
    @XmlElement(name = "StatusDetail")
    protected PackageStatusDetail statusDetail;
    @XmlElement(name = "TrackingIds")
    protected List<TrackingId> trackingIds;
    @XmlElement(name = "VariableHandlingChargeDetail")
    protected VariableHandlingChargeDetail variableHandlingChargeDetail;
    @XmlElement(name = "InsuredValue")
    protected Money insuredValue;
    @XmlElement(name = "Weight")
    protected Weight weight;
    @XmlElement(name = "WeightSource")
    @XmlSchemaType(name = "string")
    protected WeightSource weightSource;
    @XmlElement(name = "Dimensions")
    protected Dimensions dimensions;
    @XmlElement(name = "PhysicalPackaging")
    @XmlSchemaType(name = "string")
    protected PhysicalPackagingType physicalPackaging;
    @XmlElement(name = "AssociatedFreightLineItems")
    protected List<AssociatedFreightLineItemDetail> associatedFreightLineItems;
    @XmlElement(name = "ItemDescription")
    protected String itemDescription;
    @XmlElement(name = "ItemDescriptionForClearance")
    protected String itemDescriptionForClearance;
    @XmlElement(name = "CustomerReferences")
    protected List<CustomerReference> customerReferences;
    @XmlElement(name = "SpecialServicesRequested")
    protected PackageSpecialServicesRequested specialServicesRequested;
    @XmlElement(name = "SpecialHandlingDetail")
    protected PackageSpecialHandlingDetail specialHandlingDetail;
    @XmlElement(name = "ContentRecords")
    protected List<ContentRecord> contentRecords;
    @XmlElement(name = "Commodities")
    protected List<Commodity> commodities;
    @XmlElement(name = "ConveyanceDetail")
    protected ShipperConveyanceDetail conveyanceDetail;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupNumber(BigInteger value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the groupPackageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupPackageCount() {
        return groupPackageCount;
    }

    /**
     * Sets the value of the groupPackageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupPackageCount(BigInteger value) {
        this.groupPackageCount = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PackageStatusDetail }
     *     
     */
    public PackageStatusDetail getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageStatusDetail }
     *     
     */
    public void setStatusDetail(PackageStatusDetail value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the trackingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trackingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingId }
     * 
     * 
     */
    public List<TrackingId> getTrackingIds() {
        if (trackingIds == null) {
            trackingIds = new ArrayList<TrackingId>();
        }
        return this.trackingIds;
    }

    /**
     * Gets the value of the variableHandlingChargeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link VariableHandlingChargeDetail }
     *     
     */
    public VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }

    /**
     * Sets the value of the variableHandlingChargeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableHandlingChargeDetail }
     *     
     */
    public void setVariableHandlingChargeDetail(VariableHandlingChargeDetail value) {
        this.variableHandlingChargeDetail = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInsuredValue(Money value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightSource property.
     * 
     * @return
     *     possible object is
     *     {@link WeightSource }
     *     
     */
    public WeightSource getWeightSource() {
        return weightSource;
    }

    /**
     * Sets the value of the weightSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightSource }
     *     
     */
    public void setWeightSource(WeightSource value) {
        this.weightSource = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the physicalPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public PhysicalPackagingType getPhysicalPackaging() {
        return physicalPackaging;
    }

    /**
     * Sets the value of the physicalPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public void setPhysicalPackaging(PhysicalPackagingType value) {
        this.physicalPackaging = value;
    }

    /**
     * Gets the value of the associatedFreightLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the associatedFreightLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedFreightLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedFreightLineItemDetail }
     * 
     * 
     */
    public List<AssociatedFreightLineItemDetail> getAssociatedFreightLineItems() {
        if (associatedFreightLineItems == null) {
            associatedFreightLineItems = new ArrayList<AssociatedFreightLineItemDetail>();
        }
        return this.associatedFreightLineItems;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the itemDescriptionForClearance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescriptionForClearance() {
        return itemDescriptionForClearance;
    }

    /**
     * Sets the value of the itemDescriptionForClearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescriptionForClearance(String value) {
        this.itemDescriptionForClearance = value;
    }

    /**
     * Gets the value of the customerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference }
     * 
     * 
     */
    public List<CustomerReference> getCustomerReferences() {
        if (customerReferences == null) {
            customerReferences = new ArrayList<CustomerReference>();
        }
        return this.customerReferences;
    }

    /**
     * Gets the value of the specialServicesRequested property.
     * 
     * @return
     *     possible object is
     *     {@link PackageSpecialServicesRequested }
     *     
     */
    public PackageSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }

    /**
     * Sets the value of the specialServicesRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageSpecialServicesRequested }
     *     
     */
    public void setSpecialServicesRequested(PackageSpecialServicesRequested value) {
        this.specialServicesRequested = value;
    }

    /**
     * Gets the value of the specialHandlingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PackageSpecialHandlingDetail }
     *     
     */
    public PackageSpecialHandlingDetail getSpecialHandlingDetail() {
        return specialHandlingDetail;
    }

    /**
     * Sets the value of the specialHandlingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageSpecialHandlingDetail }
     *     
     */
    public void setSpecialHandlingDetail(PackageSpecialHandlingDetail value) {
        this.specialHandlingDetail = value;
    }

    /**
     * Gets the value of the contentRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contentRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentRecord }
     * 
     * 
     */
    public List<ContentRecord> getContentRecords() {
        if (contentRecords == null) {
            contentRecords = new ArrayList<ContentRecord>();
        }
        return this.contentRecords;
    }

    /**
     * Gets the value of the commodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commodity }
     * 
     * 
     */
    public List<Commodity> getCommodities() {
        if (commodities == null) {
            commodities = new ArrayList<Commodity>();
        }
        return this.commodities;
    }

    /**
     * Gets the value of the conveyanceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperConveyanceDetail }
     *     
     */
    public ShipperConveyanceDetail getConveyanceDetail() {
        return conveyanceDetail;
    }

    /**
     * Sets the value of the conveyanceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperConveyanceDetail }
     *     
     */
    public void setConveyanceDetail(ShipperConveyanceDetail value) {
        this.conveyanceDetail = value;
    }

}
