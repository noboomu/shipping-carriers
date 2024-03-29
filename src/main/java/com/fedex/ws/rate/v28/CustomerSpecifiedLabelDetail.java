
package com.fedex.ws.rate.v28;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Allows customer-specified control of label content.
 * 
 * <p>Java class for CustomerSpecifiedLabelDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSpecifiedLabelDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTabContent" type="{http://fedex.com/ws/rate/v28}DocTabContent" minOccurs="0"/&gt;
 *         &lt;element name="CustomContentPosition" type="{http://fedex.com/ws/rate/v28}RelativeVerticalPositionType" minOccurs="0"/&gt;
 *         &lt;element name="CustomContent" type="{http://fedex.com/ws/rate/v28}CustomLabelDetail" minOccurs="0"/&gt;
 *         &lt;element name="ConfigurableReferenceEntries" type="{http://fedex.com/ws/rate/v28}ConfigurableLabelReferenceEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaskedData" type="{http://fedex.com/ws/rate/v28}LabelMaskableDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryBarcode" type="{http://fedex.com/ws/rate/v28}SecondaryBarcodeType" minOccurs="0"/&gt;
 *         &lt;element name="TermsAndConditionsLocalization" type="{http://fedex.com/ws/rate/v28}Localization" minOccurs="0"/&gt;
 *         &lt;element name="RegulatoryLabels" type="{http://fedex.com/ws/rate/v28}RegulatoryLabelContentDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalLabels" type="{http://fedex.com/ws/rate/v28}AdditionalLabelsDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AirWaybillSuppressionCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSpecifiedLabelDetail", propOrder = {
    "docTabContent",
    "customContentPosition",
    "customContent",
    "configurableReferenceEntries",
    "maskedData",
    "secondaryBarcode",
    "termsAndConditionsLocalization",
    "regulatoryLabels",
    "additionalLabels",
    "airWaybillSuppressionCount"
})
public class CustomerSpecifiedLabelDetail {

    @XmlElement(name = "DocTabContent")
    protected DocTabContent docTabContent;
    @XmlElement(name = "CustomContentPosition")
    @XmlSchemaType(name = "string")
    protected RelativeVerticalPositionType customContentPosition;
    @XmlElement(name = "CustomContent")
    protected CustomLabelDetail customContent;
    @XmlElement(name = "ConfigurableReferenceEntries")
    protected List<ConfigurableLabelReferenceEntry> configurableReferenceEntries;
    @XmlElement(name = "MaskedData")
    @XmlSchemaType(name = "string")
    protected List<LabelMaskableDataType> maskedData;
    @XmlElement(name = "SecondaryBarcode")
    @XmlSchemaType(name = "string")
    protected SecondaryBarcodeType secondaryBarcode;
    @XmlElement(name = "TermsAndConditionsLocalization")
    protected Localization termsAndConditionsLocalization;
    @XmlElement(name = "RegulatoryLabels")
    protected List<RegulatoryLabelContentDetail> regulatoryLabels;
    @XmlElement(name = "AdditionalLabels")
    protected List<AdditionalLabelsDetail> additionalLabels;
    @XmlElement(name = "AirWaybillSuppressionCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger airWaybillSuppressionCount;

    /**
     * Gets the value of the docTabContent property.
     * 
     * @return
     *     possible object is
     *     {@link DocTabContent }
     *     
     */
    public DocTabContent getDocTabContent() {
        return docTabContent;
    }

    /**
     * Sets the value of the docTabContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabContent }
     *     
     */
    public void setDocTabContent(DocTabContent value) {
        this.docTabContent = value;
    }

    /**
     * Gets the value of the customContentPosition property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public RelativeVerticalPositionType getCustomContentPosition() {
        return customContentPosition;
    }

    /**
     * Sets the value of the customContentPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public void setCustomContentPosition(RelativeVerticalPositionType value) {
        this.customContentPosition = value;
    }

    /**
     * Gets the value of the customContent property.
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelDetail }
     *     
     */
    public CustomLabelDetail getCustomContent() {
        return customContent;
    }

    /**
     * Sets the value of the customContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelDetail }
     *     
     */
    public void setCustomContent(CustomLabelDetail value) {
        this.customContent = value;
    }

    /**
     * Gets the value of the configurableReferenceEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the configurableReferenceEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurableReferenceEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurableLabelReferenceEntry }
     * 
     * 
     */
    public List<ConfigurableLabelReferenceEntry> getConfigurableReferenceEntries() {
        if (configurableReferenceEntries == null) {
            configurableReferenceEntries = new ArrayList<ConfigurableLabelReferenceEntry>();
        }
        return this.configurableReferenceEntries;
    }

    /**
     * Gets the value of the maskedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the maskedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaskedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelMaskableDataType }
     * 
     * 
     */
    public List<LabelMaskableDataType> getMaskedData() {
        if (maskedData == null) {
            maskedData = new ArrayList<LabelMaskableDataType>();
        }
        return this.maskedData;
    }

    /**
     * Gets the value of the secondaryBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryBarcodeType }
     *     
     */
    public SecondaryBarcodeType getSecondaryBarcode() {
        return secondaryBarcode;
    }

    /**
     * Sets the value of the secondaryBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryBarcodeType }
     *     
     */
    public void setSecondaryBarcode(SecondaryBarcodeType value) {
        this.secondaryBarcode = value;
    }

    /**
     * Gets the value of the termsAndConditionsLocalization property.
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getTermsAndConditionsLocalization() {
        return termsAndConditionsLocalization;
    }

    /**
     * Sets the value of the termsAndConditionsLocalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setTermsAndConditionsLocalization(Localization value) {
        this.termsAndConditionsLocalization = value;
    }

    /**
     * Gets the value of the regulatoryLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryLabelContentDetail }
     * 
     * 
     */
    public List<RegulatoryLabelContentDetail> getRegulatoryLabels() {
        if (regulatoryLabels == null) {
            regulatoryLabels = new ArrayList<RegulatoryLabelContentDetail>();
        }
        return this.regulatoryLabels;
    }

    /**
     * Gets the value of the additionalLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalLabelsDetail }
     * 
     * 
     */
    public List<AdditionalLabelsDetail> getAdditionalLabels() {
        if (additionalLabels == null) {
            additionalLabels = new ArrayList<AdditionalLabelsDetail>();
        }
        return this.additionalLabels;
    }

    /**
     * Gets the value of the airWaybillSuppressionCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAirWaybillSuppressionCount() {
        return airWaybillSuppressionCount;
    }

    /**
     * Sets the value of the airWaybillSuppressionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAirWaybillSuppressionCount(BigInteger value) {
        this.airWaybillSuppressionCount = value;
    }

}
