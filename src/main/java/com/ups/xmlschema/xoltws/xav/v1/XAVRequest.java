
package com.ups.xmlschema.xoltws.xav.v1;

import com.ups.xmlschema.xoltws.common.v1.RequestType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Request"/&gt;
 *         &lt;element name="RegionalRequestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaximumCandidateListSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressKeyFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/xav/v1.0}AddressKeyFormatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "regionalRequestIndicator",
    "maximumCandidateListSize",
    "addressKeyFormat"
})
@XmlRootElement(name = "XAVRequest")
public class XAVRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "RegionalRequestIndicator")
    protected String regionalRequestIndicator;
    @XmlElement(name = "MaximumCandidateListSize")
    protected String maximumCandidateListSize;
    @XmlElement(name = "AddressKeyFormat", required = true)
    protected AddressKeyFormatType addressKeyFormat;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the regionalRequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalRequestIndicator() {
        return regionalRequestIndicator;
    }

    /**
     * Sets the value of the regionalRequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionalRequestIndicator(String value) {
        this.regionalRequestIndicator = value;
    }

    /**
     * Gets the value of the maximumCandidateListSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCandidateListSize() {
        return maximumCandidateListSize;
    }

    /**
     * Sets the value of the maximumCandidateListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCandidateListSize(String value) {
        this.maximumCandidateListSize = value;
    }

    /**
     * Gets the value of the addressKeyFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AddressKeyFormatType }
     *     
     */
    public AddressKeyFormatType getAddressKeyFormat() {
        return addressKeyFormat;
    }

    /**
     * Sets the value of the addressKeyFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressKeyFormatType }
     *     
     */
    public void setAddressKeyFormat(AddressKeyFormatType value) {
        this.addressKeyFormat = value;
    }

}
