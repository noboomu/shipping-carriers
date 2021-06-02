
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProvidedImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProvidedImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImageReferenceDetail" type="{http://fedex.com/ws/uploaddocument/v17}ImageReferenceDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProvidedImage", propOrder = {
    "image",
    "imageReferenceDetail"
})
public class CustomerProvidedImage {

    @XmlElement(name = "Image")
    protected byte[] image;
    @XmlElement(name = "ImageReferenceDetail")
    protected ImageReferenceDetail imageReferenceDetail;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Gets the value of the imageReferenceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ImageReferenceDetail }
     *     
     */
    public ImageReferenceDetail getImageReferenceDetail() {
        return imageReferenceDetail;
    }

    /**
     * Sets the value of the imageReferenceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageReferenceDetail }
     *     
     */
    public void setImageReferenceDetail(ImageReferenceDetail value) {
        this.imageReferenceDetail = value;
    }

}
