
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentManifestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentManifestDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManifestReferenceType" type="{http://fedex.com/ws/uploaddocument/v17}CustomerReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentManifestDetail", propOrder = {
    "manifestReferenceType"
})
public class ShipmentManifestDetail {

    @XmlElement(name = "ManifestReferenceType")
    @XmlSchemaType(name = "string")
    protected CustomerReferenceType manifestReferenceType;

    /**
     * Gets the value of the manifestReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReferenceType }
     *     
     */
    public CustomerReferenceType getManifestReferenceType() {
        return manifestReferenceType;
    }

    /**
     * Sets the value of the manifestReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReferenceType }
     *     
     */
    public void setManifestReferenceType(CustomerReferenceType value) {
        this.manifestReferenceType = value;
    }

}
