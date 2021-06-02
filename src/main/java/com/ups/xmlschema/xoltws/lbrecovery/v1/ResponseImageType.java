
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Image" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}ResponseImageDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseImageType", propOrder = {
    "image"
})
public class ResponseImageType {

    @XmlElement(name = "Image", required = true)
    protected ResponseImageDetailType image;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseImageDetailType }
     *     
     */
    public ResponseImageDetailType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseImageDetailType }
     *     
     */
    public void setImage(ResponseImageDetailType value) {
        this.image = value;
    }

}
