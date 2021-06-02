
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Solid (filled) rectangular area on label.
 * 
 * <p>Java class for CustomLabelBoxEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomLabelBoxEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TopLeftCorner" type="{http://fedex.com/ws/rate/v28}CustomLabelPosition" minOccurs="0"/&gt;
 *         &lt;element name="BottomRightCorner" type="{http://fedex.com/ws/rate/v28}CustomLabelPosition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLabelBoxEntry", propOrder = {
    "topLeftCorner",
    "bottomRightCorner"
})
public class CustomLabelBoxEntry {

    @XmlElement(name = "TopLeftCorner")
    protected CustomLabelPosition topLeftCorner;
    @XmlElement(name = "BottomRightCorner")
    protected CustomLabelPosition bottomRightCorner;

    /**
     * Gets the value of the topLeftCorner property.
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelPosition }
     *     
     */
    public CustomLabelPosition getTopLeftCorner() {
        return topLeftCorner;
    }

    /**
     * Sets the value of the topLeftCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelPosition }
     *     
     */
    public void setTopLeftCorner(CustomLabelPosition value) {
        this.topLeftCorner = value;
    }

    /**
     * Gets the value of the bottomRightCorner property.
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelPosition }
     *     
     */
    public CustomLabelPosition getBottomRightCorner() {
        return bottomRightCorner;
    }

    /**
     * Sets the value of the bottomRightCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelPosition }
     *     
     */
    public void setBottomRightCorner(CustomLabelPosition value) {
        this.bottomRightCorner = value;
    }

}
