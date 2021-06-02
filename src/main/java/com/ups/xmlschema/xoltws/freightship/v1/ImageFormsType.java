
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageFormsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageFormsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ImageCodeDescriptionType"/&gt;
 *         &lt;element name="GraphicImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Format" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ImageCodeDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageFormsType", propOrder = {
    "type",
    "graphicImage",
    "format"
})
public class ImageFormsType {

    @XmlElement(name = "Type", required = true)
    protected ImageCodeDescriptionType type;
    @XmlElement(name = "GraphicImage", required = true)
    protected String graphicImage;
    @XmlElement(name = "Format", required = true)
    protected ImageCodeDescriptionType format;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ImageCodeDescriptionType }
     *     
     */
    public ImageCodeDescriptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCodeDescriptionType }
     *     
     */
    public void setType(ImageCodeDescriptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the graphicImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicImage() {
        return graphicImage;
    }

    /**
     * Sets the value of the graphicImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicImage(String value) {
        this.graphicImage = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ImageCodeDescriptionType }
     *     
     */
    public ImageCodeDescriptionType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCodeDescriptionType }
     *     
     */
    public void setFormat(ImageCodeDescriptionType value) {
        this.format = value;
    }

}
