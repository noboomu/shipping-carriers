
package com.fedex.ws.addressvalidation.v4;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressValidationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://fedex.com/ws/addressvalidation/v4}OperationalAddressStateType" minOccurs="0"/&gt;
 *         &lt;element name="Classification" type="{http://fedex.com/ws/addressvalidation/v4}FedExAddressClassificationType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveContact" type="{http://fedex.com/ws/addressvalidation/v4}Contact" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveAddress" type="{http://fedex.com/ws/addressvalidation/v4}Address" minOccurs="0"/&gt;
 *         &lt;element name="ParsedAddressPartsDetail" type="{http://fedex.com/ws/addressvalidation/v4}ParsedAddressPartsDetail" minOccurs="0"/&gt;
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/addressvalidation/v4}AddressAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressValidationResult", propOrder = {
    "clientReferenceId",
    "state",
    "classification",
    "effectiveContact",
    "effectiveAddress",
    "parsedAddressPartsDetail",
    "attributes"
})
public class AddressValidationResult {

    @XmlElement(name = "ClientReferenceId")
    protected String clientReferenceId;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected OperationalAddressStateType state;
    @XmlElement(name = "Classification")
    @XmlSchemaType(name = "string")
    protected FedExAddressClassificationType classification;
    @XmlElement(name = "EffectiveContact")
    protected Contact effectiveContact;
    @XmlElement(name = "EffectiveAddress")
    protected Address effectiveAddress;
    @XmlElement(name = "ParsedAddressPartsDetail")
    protected ParsedAddressPartsDetail parsedAddressPartsDetail;
    @XmlElement(name = "Attributes")
    protected List<AddressAttribute> attributes;

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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalAddressStateType }
     *     
     */
    public OperationalAddressStateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalAddressStateType }
     *     
     */
    public void setState(OperationalAddressStateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link FedExAddressClassificationType }
     *     
     */
    public FedExAddressClassificationType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedExAddressClassificationType }
     *     
     */
    public void setClassification(FedExAddressClassificationType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the effectiveContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getEffectiveContact() {
        return effectiveContact;
    }

    /**
     * Sets the value of the effectiveContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setEffectiveContact(Contact value) {
        this.effectiveContact = value;
    }

    /**
     * Gets the value of the effectiveAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getEffectiveAddress() {
        return effectiveAddress;
    }

    /**
     * Sets the value of the effectiveAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setEffectiveAddress(Address value) {
        this.effectiveAddress = value;
    }

    /**
     * Gets the value of the parsedAddressPartsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ParsedAddressPartsDetail }
     *     
     */
    public ParsedAddressPartsDetail getParsedAddressPartsDetail() {
        return parsedAddressPartsDetail;
    }

    /**
     * Sets the value of the parsedAddressPartsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParsedAddressPartsDetail }
     *     
     */
    public void setParsedAddressPartsDetail(ParsedAddressPartsDetail value) {
        this.parsedAddressPartsDetail = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressAttribute }
     * 
     * 
     */
    public List<AddressAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<AddressAttribute>();
        }
        return this.attributes;
    }

}
