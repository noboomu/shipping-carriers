
package com.fedex.ws.rate.v28;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Description of an individual commodity or class of content in a shipment.
 * 
 * <p>Java class for FreightShipmentLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightShipmentLineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreightClass" type="{http://fedex.com/ws/rate/v28}FreightClassType" minOccurs="0"/&gt;
 *         &lt;element name="Packaging" type="{http://fedex.com/ws/rate/v28}PhysicalPackagingType" minOccurs="0"/&gt;
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://fedex.com/ws/rate/v28}Weight" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://fedex.com/ws/rate/v28}Dimensions" minOccurs="0"/&gt;
 *         &lt;element name="Volume" type="{http://fedex.com/ws/rate/v28}Volume" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightShipmentLineItem", propOrder = {
    "id",
    "freightClass",
    "packaging",
    "pieces",
    "description",
    "weight",
    "dimensions",
    "volume"
})
public class FreightShipmentLineItem {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "FreightClass")
    @XmlSchemaType(name = "string")
    protected FreightClassType freightClass;
    @XmlElement(name = "Packaging")
    @XmlSchemaType(name = "string")
    protected PhysicalPackagingType packaging;
    @XmlElement(name = "Pieces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pieces;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Weight")
    protected Weight weight;
    @XmlElement(name = "Dimensions")
    protected Dimensions dimensions;
    @XmlElement(name = "Volume")
    protected Volume volume;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the freightClass property.
     * 
     * @return
     *     possible object is
     *     {@link FreightClassType }
     *     
     */
    public FreightClassType getFreightClass() {
        return freightClass;
    }

    /**
     * Sets the value of the freightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightClassType }
     *     
     */
    public void setFreightClass(FreightClassType value) {
        this.freightClass = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public PhysicalPackagingType getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public void setPackaging(PhysicalPackagingType value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the pieces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieces() {
        return pieces;
    }

    /**
     * Sets the value of the pieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieces(BigInteger value) {
        this.pieces = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

}
