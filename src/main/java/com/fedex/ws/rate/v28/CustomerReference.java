
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerReferenceType" type="{http://fedex.com/ws/rate/v28}CustomerReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReference", propOrder = {
    "customerReferenceType",
    "value"
})
public class CustomerReference {

    @XmlElement(name = "CustomerReferenceType")
    @XmlSchemaType(name = "string")
    protected CustomerReferenceType customerReferenceType;
    @XmlElement(name = "Value")
    protected String value;

    /**
     * Gets the value of the customerReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReferenceType }
     *     
     */
    public CustomerReferenceType getCustomerReferenceType() {
        return customerReferenceType;
    }

    /**
     * Sets the value of the customerReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReferenceType }
     *     
     */
    public void setCustomerReferenceType(CustomerReferenceType value) {
        this.customerReferenceType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
