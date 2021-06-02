
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessingOptionsRequested" type="{http://fedex.com/ws/uploaddocument/v17}LabelSpecificationProcessingOptionsRequested" minOccurs="0"/&gt;
 *         &lt;element name="Dispositions" type="{http://fedex.com/ws/uploaddocument/v17}ShippingDocumentDispositionDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LabelFormatType" type="{http://fedex.com/ws/uploaddocument/v17}LabelFormatType" minOccurs="0"/&gt;
 *         &lt;element name="ImageType" type="{http://fedex.com/ws/uploaddocument/v17}ShippingDocumentImageType" minOccurs="0"/&gt;
 *         &lt;element name="LabelStockType" type="{http://fedex.com/ws/uploaddocument/v17}LabelStockType" minOccurs="0"/&gt;
 *         &lt;element name="LabelPrintingOrientation" type="{http://fedex.com/ws/uploaddocument/v17}LabelPrintingOrientationType" minOccurs="0"/&gt;
 *         &lt;element name="LabelRotation" type="{http://fedex.com/ws/uploaddocument/v17}LabelRotationType" minOccurs="0"/&gt;
 *         &lt;element name="LabelOrder" type="{http://fedex.com/ws/uploaddocument/v17}LabelOrderType" minOccurs="0"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/uploaddocument/v17}Localization" minOccurs="0"/&gt;
 *         &lt;element name="PrintedLabelOrigin" type="{http://fedex.com/ws/uploaddocument/v17}ContactAndAddress" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSpecifiedDetail" type="{http://fedex.com/ws/uploaddocument/v17}CustomerSpecifiedLabelDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelSpecification", propOrder = {
    "processingOptionsRequested",
    "dispositions",
    "labelFormatType",
    "imageType",
    "labelStockType",
    "labelPrintingOrientation",
    "labelRotation",
    "labelOrder",
    "localization",
    "printedLabelOrigin",
    "customerSpecifiedDetail"
})
public class LabelSpecification {

    @XmlElement(name = "ProcessingOptionsRequested")
    protected LabelSpecificationProcessingOptionsRequested processingOptionsRequested;
    @XmlElement(name = "Dispositions")
    protected List<ShippingDocumentDispositionDetail> dispositions;
    @XmlElement(name = "LabelFormatType")
    @XmlSchemaType(name = "string")
    protected LabelFormatType labelFormatType;
    @XmlElement(name = "ImageType")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentImageType imageType;
    @XmlElement(name = "LabelStockType")
    @XmlSchemaType(name = "string")
    protected LabelStockType labelStockType;
    @XmlElement(name = "LabelPrintingOrientation")
    @XmlSchemaType(name = "string")
    protected LabelPrintingOrientationType labelPrintingOrientation;
    @XmlElement(name = "LabelRotation")
    @XmlSchemaType(name = "string")
    protected LabelRotationType labelRotation;
    @XmlElement(name = "LabelOrder")
    @XmlSchemaType(name = "string")
    protected LabelOrderType labelOrder;
    @XmlElement(name = "Localization")
    protected Localization localization;
    @XmlElement(name = "PrintedLabelOrigin")
    protected ContactAndAddress printedLabelOrigin;
    @XmlElement(name = "CustomerSpecifiedDetail")
    protected CustomerSpecifiedLabelDetail customerSpecifiedDetail;

    /**
     * Gets the value of the processingOptionsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSpecificationProcessingOptionsRequested }
     *     
     */
    public LabelSpecificationProcessingOptionsRequested getProcessingOptionsRequested() {
        return processingOptionsRequested;
    }

    /**
     * Sets the value of the processingOptionsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSpecificationProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptionsRequested(LabelSpecificationProcessingOptionsRequested value) {
        this.processingOptionsRequested = value;
    }

    /**
     * Gets the value of the dispositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dispositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocumentDispositionDetail }
     * 
     * 
     */
    public List<ShippingDocumentDispositionDetail> getDispositions() {
        if (dispositions == null) {
            dispositions = new ArrayList<ShippingDocumentDispositionDetail>();
        }
        return this.dispositions;
    }

    /**
     * Gets the value of the labelFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link LabelFormatType }
     *     
     */
    public LabelFormatType getLabelFormatType() {
        return labelFormatType;
    }

    /**
     * Sets the value of the labelFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelFormatType }
     *     
     */
    public void setLabelFormatType(LabelFormatType value) {
        this.labelFormatType = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentImageType }
     *     
     */
    public ShippingDocumentImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentImageType }
     *     
     */
    public void setImageType(ShippingDocumentImageType value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the labelStockType property.
     * 
     * @return
     *     possible object is
     *     {@link LabelStockType }
     *     
     */
    public LabelStockType getLabelStockType() {
        return labelStockType;
    }

    /**
     * Sets the value of the labelStockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelStockType }
     *     
     */
    public void setLabelStockType(LabelStockType value) {
        this.labelStockType = value;
    }

    /**
     * Gets the value of the labelPrintingOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LabelPrintingOrientationType }
     *     
     */
    public LabelPrintingOrientationType getLabelPrintingOrientation() {
        return labelPrintingOrientation;
    }

    /**
     * Sets the value of the labelPrintingOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelPrintingOrientationType }
     *     
     */
    public void setLabelPrintingOrientation(LabelPrintingOrientationType value) {
        this.labelPrintingOrientation = value;
    }

    /**
     * Gets the value of the labelRotation property.
     * 
     * @return
     *     possible object is
     *     {@link LabelRotationType }
     *     
     */
    public LabelRotationType getLabelRotation() {
        return labelRotation;
    }

    /**
     * Sets the value of the labelRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRotationType }
     *     
     */
    public void setLabelRotation(LabelRotationType value) {
        this.labelRotation = value;
    }

    /**
     * Gets the value of the labelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link LabelOrderType }
     *     
     */
    public LabelOrderType getLabelOrder() {
        return labelOrder;
    }

    /**
     * Sets the value of the labelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelOrderType }
     *     
     */
    public void setLabelOrder(LabelOrderType value) {
        this.labelOrder = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setLocalization(Localization value) {
        this.localization = value;
    }

    /**
     * Gets the value of the printedLabelOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getPrintedLabelOrigin() {
        return printedLabelOrigin;
    }

    /**
     * Sets the value of the printedLabelOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setPrintedLabelOrigin(ContactAndAddress value) {
        this.printedLabelOrigin = value;
    }

    /**
     * Gets the value of the customerSpecifiedDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSpecifiedLabelDetail }
     *     
     */
    public CustomerSpecifiedLabelDetail getCustomerSpecifiedDetail() {
        return customerSpecifiedDetail;
    }

    /**
     * Sets the value of the customerSpecifiedDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSpecifiedLabelDetail }
     *     
     */
    public void setCustomerSpecifiedDetail(CustomerSpecifiedLabelDetail value) {
        this.customerSpecifiedDetail = value;
    }

}
