
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ReceiptImageFormatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptSpecificationType", propOrder = {
    "imageFormat"
})
public class ReceiptSpecificationType {

    @XmlElement(name = "ImageFormat", required = true)
    protected ReceiptImageFormatType imageFormat;

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptImageFormatType }
     *     
     */
    public ReceiptImageFormatType getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptImageFormatType }
     *     
     */
    public void setImageFormat(ReceiptImageFormatType value) {
        this.imageFormat = value;
    }

}
