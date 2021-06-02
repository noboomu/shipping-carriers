
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationContactAndAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationContactAndAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contact" type="{http://fedex.com/ws/locs/v12}Contact" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://fedex.com/ws/locs/v12}Address" minOccurs="0"/&gt;
 *         &lt;element name="AddressAncillaryDetail" type="{http://fedex.com/ws/locs/v12}AddressAncillaryDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationContactAndAddress", propOrder = {
    "contact",
    "address",
    "addressAncillaryDetail"
})
public class LocationContactAndAddress {

    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AddressAncillaryDetail")
    protected AddressAncillaryDetail addressAncillaryDetail;

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

    /**
     * Gets the value of the addressAncillaryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAncillaryDetail }
     *     
     */
    public AddressAncillaryDetail getAddressAncillaryDetail() {
        return addressAncillaryDetail;
    }

    /**
     * Sets the value of the addressAncillaryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAncillaryDetail }
     *     
     */
    public void setAddressAncillaryDetail(AddressAncillaryDetail value) {
        this.addressAncillaryDetail = value;
    }

}
