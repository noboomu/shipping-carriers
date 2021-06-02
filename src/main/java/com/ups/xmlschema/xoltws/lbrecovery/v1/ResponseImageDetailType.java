
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseImageDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseImageDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}ImageFormatCodeType"/&gt;
 *         &lt;element name="GraphicImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseImageDetailType", propOrder = {
    "imageFormat",
    "graphicImage"
})
public class ResponseImageDetailType {

    @XmlElement(name = "ImageFormat", required = true)
    protected ImageFormatCodeType imageFormat;
    @XmlElement(name = "GraphicImage", required = true)
    protected String graphicImage;

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ImageFormatCodeType }
     *     
     */
    public ImageFormatCodeType getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFormatCodeType }
     *     
     */
    public void setImageFormat(ImageFormatCodeType value) {
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
