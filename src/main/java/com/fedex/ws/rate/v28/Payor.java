
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponsibleParty" type="{http://fedex.com/ws/rate/v28}Party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payor", propOrder = {
    "responsibleParty"
})
public class Payor {

    @XmlElement(name = "ResponsibleParty")
    protected Party responsibleParty;

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setResponsibleParty(Party value) {
        this.responsibleParty = value;
    }

}
