
package com.fedex.ws.openship.v18;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidationDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}ReturnedConsolidationDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingDocumentDisposition" type="{http://fedex.com/ws/openship/v18}ShippingDocumentDispositionType" minOccurs="0"/&gt;
 *         &lt;element name="AccessReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImageType" type="{http://fedex.com/ws/openship/v18}ShippingDocumentImageType" minOccurs="0"/&gt;
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="CopiesToPrint" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Parts" type="{http://fedex.com/ws/openship/v18}ShippingDocumentPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidationDocument", propOrder = {
    "type",
    "shippingDocumentDisposition",
    "accessReference",
    "imageType",
    "resolution",
    "copiesToPrint",
    "parts"
})
public class ConsolidationDocument {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ReturnedConsolidationDocumentType type;
    @XmlElement(name = "ShippingDocumentDisposition")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentDispositionType shippingDocumentDisposition;
    @XmlElement(name = "AccessReference")
    protected String accessReference;
    @XmlElement(name = "ImageType")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentImageType imageType;
    @XmlElement(name = "Resolution")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resolution;
    @XmlElement(name = "CopiesToPrint")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger copiesToPrint;
    @XmlElement(name = "Parts")
    protected List<ShippingDocumentPart> parts;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnedConsolidationDocumentType }
     *     
     */
    public ReturnedConsolidationDocumentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedConsolidationDocumentType }
     *     
     */
    public void setType(ReturnedConsolidationDocumentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the shippingDocumentDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public ShippingDocumentDispositionType getShippingDocumentDisposition() {
        return shippingDocumentDisposition;
    }

    /**
     * Sets the value of the shippingDocumentDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public void setShippingDocumentDisposition(ShippingDocumentDispositionType value) {
        this.shippingDocumentDisposition = value;
    }

    /**
     * Gets the value of the accessReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessReference() {
        return accessReference;
    }

    /**
     * Sets the value of the accessReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessReference(String value) {
        this.accessReference = value;
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
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolution(BigInteger value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the copiesToPrint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCopiesToPrint() {
        return copiesToPrint;
    }

    /**
     * Sets the value of the copiesToPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCopiesToPrint(BigInteger value) {
        this.copiesToPrint = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocumentPart }
     * 
     * 
     */
    public List<ShippingDocumentPart> getParts() {
        if (parts == null) {
            parts = new ArrayList<ShippingDocumentPart>();
        }
        return this.parts;
    }

}
