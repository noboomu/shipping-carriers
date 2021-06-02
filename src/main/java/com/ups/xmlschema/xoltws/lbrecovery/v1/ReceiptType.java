
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HTMLImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}ImageType" minOccurs="0"/&gt;
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
@XmlType(name = "ReceiptType", propOrder = {
    "htmlImage",
    "image",
    "url"
})
public class ReceiptType {

    @XmlElement(name = "HTMLImage")
    protected String htmlImage;
    @XmlElement(name = "Image")
    protected ImageType image;
    @XmlElement(name = "URL")
    protected String url;

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
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImage(ImageType value) {
        this.image = value;
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
