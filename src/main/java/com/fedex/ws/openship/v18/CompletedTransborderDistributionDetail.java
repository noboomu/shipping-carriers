
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Result data for a transborder distribution shipment.
 * 
 * <p>Java class for CompletedTransborderDistributionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedTransborderDistributionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeconsolidationLocationPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedTransborderDistributionDetail", propOrder = {
    "deconsolidationLocationPostalCode"
})
public class CompletedTransborderDistributionDetail {

    @XmlElement(name = "DeconsolidationLocationPostalCode")
    protected String deconsolidationLocationPostalCode;

    /**
     * Gets the value of the deconsolidationLocationPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeconsolidationLocationPostalCode() {
        return deconsolidationLocationPostalCode;
    }

    /**
     * Sets the value of the deconsolidationLocationPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeconsolidationLocationPostalCode(String value) {
        this.deconsolidationLocationPostalCode = value;
    }

}
