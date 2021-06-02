
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerImageUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerImageUsage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}CustomerImageUsageType" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://fedex.com/ws/openship/v18}ImageId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerImageUsage", propOrder = {
    "type",
    "id"
})
public class CustomerImageUsage {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected CustomerImageUsageType type;
    @XmlElement(name = "Id")
    @XmlSchemaType(name = "string")
    protected ImageId id;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerImageUsageType }
     *     
     */
    public CustomerImageUsageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerImageUsageType }
     *     
     */
    public void setType(CustomerImageUsageType value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ImageId }
     *     
     */
    public ImageId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageId }
     *     
     */
    public void setId(ImageId value) {
        this.id = value;
    }

}
