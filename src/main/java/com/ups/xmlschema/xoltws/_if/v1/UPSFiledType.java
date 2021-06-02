
package com.ups.xmlschema.xoltws._if.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UPSFiledType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPSFiledType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POA" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}POAType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPSFiledType", propOrder = {
    "poa"
})
public class UPSFiledType {

    @XmlElement(name = "POA", required = true)
    protected POAType poa;

    /**
     * Gets the value of the poa property.
     * 
     * @return
     *     possible object is
     *     {@link POAType }
     *     
     */
    public POAType getPOA() {
        return poa;
    }

    /**
     * Sets the value of the poa property.
     * 
     * @param value
     *     allowed object is
     *     {@link POAType }
     *     
     */
    public void setPOA(POAType value) {
        this.poa = value;
    }

}
