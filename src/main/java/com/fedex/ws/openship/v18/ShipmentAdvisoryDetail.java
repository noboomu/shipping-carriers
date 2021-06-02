
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentAdvisoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentAdvisoryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegulatoryAdvisory" type="{http://fedex.com/ws/openship/v18}RegulatoryAdvisoryDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentAdvisoryDetail", propOrder = {
    "regulatoryAdvisory"
})
public class ShipmentAdvisoryDetail {

    @XmlElement(name = "RegulatoryAdvisory")
    protected RegulatoryAdvisoryDetail regulatoryAdvisory;

    /**
     * Gets the value of the regulatoryAdvisory property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryAdvisoryDetail }
     *     
     */
    public RegulatoryAdvisoryDetail getRegulatoryAdvisory() {
        return regulatoryAdvisory;
    }

    /**
     * Sets the value of the regulatoryAdvisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryAdvisoryDetail }
     *     
     */
    public void setRegulatoryAdvisory(RegulatoryAdvisoryDetail value) {
        this.regulatoryAdvisory = value;
    }

}
