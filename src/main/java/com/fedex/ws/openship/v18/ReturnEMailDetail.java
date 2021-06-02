
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnEMailDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnEMailDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerchantPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllowedSpecialServices" type="{http://fedex.com/ws/openship/v18}ReturnEMailAllowedSpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnEMailDetail", propOrder = {
    "merchantPhoneNumber",
    "allowedSpecialServices"
})
public class ReturnEMailDetail {

    @XmlElement(name = "MerchantPhoneNumber")
    protected String merchantPhoneNumber;
    @XmlElement(name = "AllowedSpecialServices")
    @XmlSchemaType(name = "string")
    protected List<ReturnEMailAllowedSpecialServiceType> allowedSpecialServices;

    /**
     * Gets the value of the merchantPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    /**
     * Sets the value of the merchantPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPhoneNumber(String value) {
        this.merchantPhoneNumber = value;
    }

    /**
     * Gets the value of the allowedSpecialServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allowedSpecialServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSpecialServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnEMailAllowedSpecialServiceType }
     * 
     * 
     */
    public List<ReturnEMailAllowedSpecialServiceType> getAllowedSpecialServices() {
        if (allowedSpecialServices == null) {
            allowedSpecialServices = new ArrayList<ReturnEMailAllowedSpecialServiceType>();
        }
        return this.allowedSpecialServices;
    }

}
