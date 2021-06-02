
package com.fedex.ws.vacs.v14;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifications for pallets to be shrinkwrapped as part of a Freight shipment.
 * 
 * <p>Java class for PalletShrinkwrapDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PalletShrinkwrapDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PalletCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalletShrinkwrapDetail", propOrder = {
    "palletCount"
})
public class PalletShrinkwrapDetail {

    @XmlElement(name = "PalletCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger palletCount;

    /**
     * Gets the value of the palletCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPalletCount() {
        return palletCount;
    }

    /**
     * Sets the value of the palletCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPalletCount(BigInteger value) {
        this.palletCount = value;
    }

}
