
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableImagesDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableImagesDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v19}AvailableImageType" minOccurs="0"/&gt;
 *         &lt;element name="Size" type="{http://fedex.com/ws/track/v19}ImageSizeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableImagesDetail", propOrder = {
    "type",
    "size"
})
public class AvailableImagesDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AvailableImageType type;
    @XmlElement(name = "Size")
    @XmlSchemaType(name = "string")
    protected ImageSizeType size;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableImageType }
     *     
     */
    public AvailableImageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableImageType }
     *     
     */
    public void setType(AvailableImageType value) {
        this.type = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link ImageSizeType }
     *     
     */
    public ImageSizeType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSizeType }
     *     
     */
    public void setSize(ImageSizeType value) {
        this.size = value;
    }

}
