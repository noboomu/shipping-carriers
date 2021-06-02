
package com.ups.xmlschema.xoltws.track.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseTransactionReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseTransactionReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseTransactionReferenceType", propOrder = {
    "customerContext"
})
public class ResponseTransactionReferenceType {

    @XmlElement(name = "CustomerContext")
    protected String customerContext;

    /**
     * Gets the value of the customerContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerContext() {
        return customerContext;
    }

    /**
     * Sets the value of the customerContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerContext(String value) {
        this.customerContext = value;
    }

}
