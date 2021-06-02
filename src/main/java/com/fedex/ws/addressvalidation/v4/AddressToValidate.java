
package com.fedex.ws.addressvalidation.v4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressToValidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressToValidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://fedex.com/ws/addressvalidation/v4}Contact" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://fedex.com/ws/addressvalidation/v4}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressToValidate", propOrder = {
    "clientReferenceId",
    "contact",
    "address"
})
public class AddressToValidate {

    @XmlElement(name = "ClientReferenceId")
    protected String clientReferenceId;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "Address")
    protected Address address;

    /**
     * Gets the value of the clientReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReferenceId() {
        return clientReferenceId;
    }

    /**
     * Sets the value of the clientReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReferenceId(String value) {
        this.clientReferenceId = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
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
