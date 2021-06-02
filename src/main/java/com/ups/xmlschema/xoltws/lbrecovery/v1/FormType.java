
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Image" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}FormImageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormType", propOrder = {
    "image"
})
public class FormType {

    @XmlElement(name = "Image", required = true)
    protected FormImageType image;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link FormImageType }
     *     
     */
    public FormImageType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormImageType }
     *     
     */
    public void setImage(FormImageType value) {
        this.image = value;
    }

}
