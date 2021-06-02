
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelImageFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelImageFormatType"/&gt;
 *         &lt;element name="GraphicImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HTMLImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDF417" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternationalSignatureGraphicImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelImageType", propOrder = {
    "labelImageFormat",
    "graphicImage",
    "htmlImage",
    "pdf417",
    "internationalSignatureGraphicImage",
    "url"
})
public class LabelImageType {

    @XmlElement(name = "LabelImageFormat", required = true)
    protected LabelImageFormatType labelImageFormat;
    @XmlElement(name = "GraphicImage", required = true)
    protected String graphicImage;
    @XmlElement(name = "HTMLImage")
    protected String htmlImage;
    @XmlElement(name = "PDF417")
    protected String pdf417;
    @XmlElement(name = "InternationalSignatureGraphicImage")
    protected String internationalSignatureGraphicImage;
    @XmlElement(name = "URL")
    protected String url;

    /**
     * Gets the value of the labelImageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LabelImageFormatType }
     *     
     */
    public LabelImageFormatType getLabelImageFormat() {
        return labelImageFormat;
    }

    /**
     * Sets the value of the labelImageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelImageFormatType }
     *     
     */
    public void setLabelImageFormat(LabelImageFormatType value) {
        this.labelImageFormat = value;
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
     * Gets the value of the htmlImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLImage() {
        return htmlImage;
    }

    /**
     * Sets the value of the htmlImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLImage(String value) {
        this.htmlImage = value;
    }

    /**
     * Gets the value of the pdf417 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDF417() {
        return pdf417;
    }

    /**
     * Sets the value of the pdf417 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDF417(String value) {
        this.pdf417 = value;
    }

    /**
     * Gets the value of the internationalSignatureGraphicImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalSignatureGraphicImage() {
        return internationalSignatureGraphicImage;
    }

    /**
     * Sets the value of the internationalSignatureGraphicImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalSignatureGraphicImage(String value) {
        this.internationalSignatureGraphicImage = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
