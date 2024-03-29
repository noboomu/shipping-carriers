
package com.ups.schema.xpci._1_0.error;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrimaryErrorCode" type="{http://www.ups.com/schema/xpci/1.0/error}CodeType"/&gt;
 *         &lt;element name="MinimumRetrySeconds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.ups.com/schema/xpci/1.0/error}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="SubErrorCode" type="{http://www.ups.com/schema/xpci/1.0/error}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInformation" type="{http://www.ups.com/schema/xpci/1.0/error}AdditionalInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetailType", propOrder = {
    "severity",
    "primaryErrorCode",
    "minimumRetrySeconds",
    "location",
    "subErrorCode",
    "additionalInformation"
})
public class ErrorDetailType {

    @XmlElement(name = "Severity", required = true)
    protected String severity;
    @XmlElement(name = "PrimaryErrorCode", required = true)
    protected CodeType primaryErrorCode;
    @XmlElement(name = "MinimumRetrySeconds")
    protected String minimumRetrySeconds;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "SubErrorCode")
    protected List<CodeType> subErrorCode;
    @XmlElement(name = "AdditionalInformation")
    protected List<AdditionalInfoType> additionalInformation;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the primaryErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPrimaryErrorCode() {
        return primaryErrorCode;
    }

    /**
     * Sets the value of the primaryErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPrimaryErrorCode(CodeType value) {
        this.primaryErrorCode = value;
    }

    /**
     * Gets the value of the minimumRetrySeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumRetrySeconds() {
        return minimumRetrySeconds;
    }

    /**
     * Sets the value of the minimumRetrySeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumRetrySeconds(String value) {
        this.minimumRetrySeconds = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the subErrorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subErrorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubErrorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getSubErrorCode() {
        if (subErrorCode == null) {
            subErrorCode = new ArrayList<CodeType>();
        }
        return this.subErrorCode;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfoType }
     * 
     * 
     */
    public List<AdditionalInfoType> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInfoType>();
        }
        return this.additionalInformation;
    }

}
