
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This type contains equivalent data to ContactAndAddress, but uses a form of person name with separate first, middle and last names.
 * 
 * <p>Java class for ParsedContactAndAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParsedContactAndAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contact" type="{http://fedex.com/ws/ifss/v1}ParsedContact" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://fedex.com/ws/ifss/v1}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParsedContactAndAddress", propOrder = {
    "contact",
    "address"
})
public class ParsedContactAndAddress {

    @XmlElement(name = "Contact")
    protected ParsedContact contact;
    @XmlElement(name = "Address")
    protected Address address;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ParsedContact }
     *     
     */
    public ParsedContact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParsedContact }
     *     
     */
    public void setContact(ParsedContact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
