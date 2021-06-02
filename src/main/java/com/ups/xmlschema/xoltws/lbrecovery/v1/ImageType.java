
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelImageFormatType" minOccurs="0"/&gt;
 *         &lt;element name="GraphicImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {
    "imageFormat",
    "graphicImage"
})
public class ImageType {

    @XmlElement(name = "ImageFormat")
    protected LabelImageFormatType imageFormat;
    @XmlElement(name = "GraphicImage")
    protected String graphicImage;

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LabelImageFormatType }
     *     
     */
    public LabelImageFormatType getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelImageFormatType }
     *     
     */
    public void setImageFormat(LabelImageFormatType value) {
        this.imageFormat = value;
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

}
