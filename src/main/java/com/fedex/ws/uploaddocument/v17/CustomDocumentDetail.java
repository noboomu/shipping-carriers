
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data required to produce a custom-specified document, either at shipment or package level.
 * 
 * <p>Java class for CustomDocumentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomDocumentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Format" type="{http://fedex.com/ws/uploaddocument/v17}ShippingDocumentFormat" minOccurs="0"/&gt;
 *         &lt;element name="LabelPrintingOrientation" type="{http://fedex.com/ws/uploaddocument/v17}LabelPrintingOrientationType" minOccurs="0"/&gt;
 *         &lt;element name="LabelRotation" type="{http://fedex.com/ws/uploaddocument/v17}LabelRotationType" minOccurs="0"/&gt;
 *         &lt;element name="SpecificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomDocumentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocTabContent" type="{http://fedex.com/ws/uploaddocument/v17}DocTabContent" minOccurs="0"/&gt;
 *         &lt;element name="CustomContent" type="{http://fedex.com/ws/uploaddocument/v17}CustomLabelDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomDocumentDetail", propOrder = {
    "format",
    "labelPrintingOrientation",
    "labelRotation",
    "specificationId",
    "customDocumentIdentifier",
    "docTabContent",
    "customContent"
})
public class CustomDocumentDetail {

    @XmlElement(name = "Format")
    protected ShippingDocumentFormat format;
    @XmlElement(name = "LabelPrintingOrientation")
    @XmlSchemaType(name = "string")
    protected LabelPrintingOrientationType labelPrintingOrientation;
    @XmlElement(name = "LabelRotation")
    @XmlSchemaType(name = "string")
    protected LabelRotationType labelRotation;
    @XmlElement(name = "SpecificationId")
    protected String specificationId;
    @XmlElement(name = "CustomDocumentIdentifier")
    protected String customDocumentIdentifier;
    @XmlElement(name = "DocTabContent")
    protected DocTabContent docTabContent;
    @XmlElement(name = "CustomContent")
    protected CustomLabelDetail customContent;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public void setFormat(ShippingDocumentFormat value) {
        this.format = value;
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
     * Gets the value of the specificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationId() {
        return specificationId;
    }

    /**
     * Sets the value of the specificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationId(String value) {
        this.specificationId = value;
    }

    /**
     * Gets the value of the customDocumentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDocumentIdentifier() {
        return customDocumentIdentifier;
    }

    /**
     * Sets the value of the customDocumentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDocumentIdentifier(String value) {
        this.customDocumentIdentifier = value;
    }

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

}
