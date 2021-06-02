
package com.ups.xmlschema.xoltws.track.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GraphicImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0}ImageFormatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureImageType", propOrder = {
    "graphicImage",
    "imageFormat"
})
public class SignatureImageType {

    @XmlElement(name = "GraphicImage", required = true)
    protected String graphicImage;
    @XmlElement(name = "ImageFormat", required = true)
    protected ImageFormatType imageFormat;

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
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ImageFormatType }
     *     
     */
    public ImageFormatType getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFormatType }
     *     
     */
    public void setImageFormat(ImageFormatType value) {
        this.imageFormat = value;
    }

}
