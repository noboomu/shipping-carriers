
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The instructions indicating how to print the customs packing list document.
 * 
 * <p>Java class for CustomsPackingListDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsPackingListDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Format" type="{http://fedex.com/ws/openship/v18}ShippingDocumentFormat" minOccurs="0"/&gt;
 *         &lt;element name="CustomerImageUsages" type="{http://fedex.com/ws/openship/v18}CustomerImageUsage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SignatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsPackingListDetail", propOrder = {
    "format",
    "customerImageUsages",
    "signatureName"
})
public class CustomsPackingListDetail {

    @XmlElement(name = "Format")
    protected ShippingDocumentFormat format;
    @XmlElement(name = "CustomerImageUsages")
    protected List<CustomerImageUsage> customerImageUsages;
    @XmlElement(name = "SignatureName")
    protected String signatureName;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public void setFormat(ShippingDocumentFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the customerImageUsages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customerImageUsages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerImageUsages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerImageUsage }
     * 
     * 
     */
    public List<CustomerImageUsage> getCustomerImageUsages() {
        if (customerImageUsages == null) {
            customerImageUsages = new ArrayList<CustomerImageUsage>();
        }
        return this.customerImageUsages;
    }

    /**
     * Gets the value of the signatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

}
