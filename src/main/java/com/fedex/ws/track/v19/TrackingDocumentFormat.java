
package com.fedex.ws.track.v19;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocumentFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingDocumentFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dispositions" type="{http://fedex.com/ws/track/v19}TrackingDocumentDispositionDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Grouping" type="{http://fedex.com/ws/track/v19}TrackingDocumentGroupingType" minOccurs="0"/&gt;
 *         &lt;element name="ImageType" type="{http://fedex.com/ws/track/v19}TrackingDocumentImageType" minOccurs="0"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/track/v19}Localization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingDocumentFormat", propOrder = {
    "dispositions",
    "grouping",
    "imageType",
    "localization"
})
public class TrackingDocumentFormat {

    @XmlElement(name = "Dispositions")
    protected List<TrackingDocumentDispositionDetail> dispositions;
    @XmlElement(name = "Grouping")
    @XmlSchemaType(name = "string")
    protected TrackingDocumentGroupingType grouping;
    @XmlElement(name = "ImageType")
    @XmlSchemaType(name = "string")
    protected TrackingDocumentImageType imageType;
    @XmlElement(name = "Localization")
    protected Localization localization;

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
     * {@link TrackingDocumentDispositionDetail }
     * 
     * 
     */
    public List<TrackingDocumentDispositionDetail> getDispositions() {
        if (dispositions == null) {
            dispositions = new ArrayList<TrackingDocumentDispositionDetail>();
        }
        return this.dispositions;
    }

    /**
     * Gets the value of the grouping property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDocumentGroupingType }
     *     
     */
    public TrackingDocumentGroupingType getGrouping() {
        return grouping;
    }

    /**
     * Sets the value of the grouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDocumentGroupingType }
     *     
     */
    public void setGrouping(TrackingDocumentGroupingType value) {
        this.grouping = value;
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

}
