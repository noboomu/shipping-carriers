
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeInTransitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInTransitResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysInTransit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInTransitResponseType", propOrder = {
    "daysInTransit"
})
public class TimeInTransitResponseType {

    @XmlElement(name = "DaysInTransit")
    protected String daysInTransit;

    /**
     * Gets the value of the daysInTransit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysInTransit() {
        return daysInTransit;
    }

    /**
     * Sets the value of the daysInTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysInTransit(String value) {
        this.daysInTransit = value;
    }

}
