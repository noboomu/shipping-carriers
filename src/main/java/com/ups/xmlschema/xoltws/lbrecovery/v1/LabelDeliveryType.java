
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelLinkIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelDeliveryType", propOrder = {
    "labelLinkIndicator"
})
public class LabelDeliveryType {

    @XmlElement(name = "LabelLinkIndicator")
    protected String labelLinkIndicator;

    /**
     * Gets the value of the labelLinkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelLinkIndicator() {
        return labelLinkIndicator;
    }

    /**
     * Sets the value of the labelLinkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelLinkIndicator(String value) {
        this.labelLinkIndicator = value;
    }

}
