
package com.ups.xmlschema.xoltws.track.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreauthorizedReturnInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreauthorizedReturnInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnEligibilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnRequestURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreauthorizedReturnInformationType", propOrder = {
    "returnEligibilityIndicator",
    "returnExpirationDate",
    "returnRequestURL",
    "originalTrackingNumber",
    "returnTrackingNumber"
})
public class PreauthorizedReturnInformationType {

    @XmlElement(name = "ReturnEligibilityIndicator")
    protected String returnEligibilityIndicator;
    @XmlElement(name = "ReturnExpirationDate")
    protected String returnExpirationDate;
    @XmlElement(name = "ReturnRequestURL")
    protected String returnRequestURL;
    @XmlElement(name = "OriginalTrackingNumber")
    protected String originalTrackingNumber;
    @XmlElement(name = "ReturnTrackingNumber")
    protected String returnTrackingNumber;

    /**
     * Gets the value of the returnEligibilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnEligibilityIndicator() {
        return returnEligibilityIndicator;
    }

    /**
     * Sets the value of the returnEligibilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnEligibilityIndicator(String value) {
        this.returnEligibilityIndicator = value;
    }

    /**
     * Gets the value of the returnExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnExpirationDate() {
        return returnExpirationDate;
    }

    /**
     * Sets the value of the returnExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnExpirationDate(String value) {
        this.returnExpirationDate = value;
    }

    /**
     * Gets the value of the returnRequestURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnRequestURL() {
        return returnRequestURL;
    }

    /**
     * Sets the value of the returnRequestURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnRequestURL(String value) {
        this.returnRequestURL = value;
    }

    /**
     * Gets the value of the originalTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTrackingNumber() {
        return originalTrackingNumber;
    }

    /**
     * Sets the value of the originalTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTrackingNumber(String value) {
        this.originalTrackingNumber = value;
    }

    /**
     * Gets the value of the returnTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }

    /**
     * Sets the value of the returnTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTrackingNumber(String value) {
        this.returnTrackingNumber = value;
    }

}
