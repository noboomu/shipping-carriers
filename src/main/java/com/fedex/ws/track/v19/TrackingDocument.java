
package com.fedex.ws.track.v19;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v19}TrackingDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="Localizations" type="{http://fedex.com/ws/track/v19}Localization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ImageType" type="{http://fedex.com/ws/track/v19}TrackingDocumentImageType" minOccurs="0"/&gt;
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Parts" type="{http://fedex.com/ws/track/v19}DocumentPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingDocument", propOrder = {
    "type",
    "localizations",
    "imageType",
    "resolution",
    "parts"
})
public class TrackingDocument {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected TrackingDocumentType type;
    @XmlElement(name = "Localizations")
    protected List<Localization> localizations;
    @XmlElement(name = "ImageType")
    @XmlSchemaType(name = "string")
    protected TrackingDocumentImageType imageType;
    @XmlElement(name = "Resolution")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resolution;
    @XmlElement(name = "Parts")
    protected List<DocumentPart> parts;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDocumentType }
     *     
     */
    public TrackingDocumentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDocumentType }
     *     
     */
    public void setType(TrackingDocumentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the localizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the localizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Localization }
     * 
     * 
     */
    public List<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new ArrayList<Localization>();
        }
        return this.localizations;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDocumentImageType }
     *     
     */
    public TrackingDocumentImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDocumentImageType }
     *     
     */
    public void setImageType(TrackingDocumentImageType value) {
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
     * {@link DocumentPart }
     * 
     * 
     */
    public List<DocumentPart> getParts() {
        if (parts == null) {
            parts = new ArrayList<DocumentPart>();
        }
        return this.parts;
    }

}
