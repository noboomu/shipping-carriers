
package com.ups.xmlschema.xoltws.xav.v1;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws.common.v1.ResponseType;
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
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Response"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ValidAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="AmbiguousAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="NoCandidatesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AddressClassification" type="{http://www.ups.com/XMLSchema/XOLTWS/xav/v1.0}AddressClassificationType" minOccurs="0"/&gt;
 *         &lt;element name="Candidate" type="{http://www.ups.com/XMLSchema/XOLTWS/xav/v1.0}CandidateType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "response",
    "validAddressIndicator",
    "ambiguousAddressIndicator",
    "noCandidatesIndicator",
    "addressClassification",
    "candidate"
})
@XmlRootElement(name = "XAVResponse")
public class XAVResponse {

    @XmlElement(name = "Response", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected ResponseType response;
    @XmlElement(name = "ValidAddressIndicator")
    protected String validAddressIndicator;
    @XmlElement(name = "AmbiguousAddressIndicator")
    protected String ambiguousAddressIndicator;
    @XmlElement(name = "NoCandidatesIndicator")
    protected String noCandidatesIndicator;
    @XmlElement(name = "AddressClassification")
    protected AddressClassificationType addressClassification;
    @XmlElement(name = "Candidate")
    protected List<CandidateType> candidate;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the validAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidAddressIndicator() {
        return validAddressIndicator;
    }

    /**
     * Sets the value of the validAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidAddressIndicator(String value) {
        this.validAddressIndicator = value;
    }

    /**
     * Gets the value of the ambiguousAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbiguousAddressIndicator() {
        return ambiguousAddressIndicator;
    }

    /**
     * Sets the value of the ambiguousAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbiguousAddressIndicator(String value) {
        this.ambiguousAddressIndicator = value;
    }

    /**
     * Gets the value of the noCandidatesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCandidatesIndicator() {
        return noCandidatesIndicator;
    }

    /**
     * Sets the value of the noCandidatesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCandidatesIndicator(String value) {
        this.noCandidatesIndicator = value;
    }

    /**
     * Gets the value of the addressClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AddressClassificationType }
     *     
     */
    public AddressClassificationType getAddressClassification() {
        return addressClassification;
    }

    /**
     * Sets the value of the addressClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressClassificationType }
     *     
     */
    public void setAddressClassification(AddressClassificationType value) {
        this.addressClassification = value;
    }

    /**
     * Gets the value of the candidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the candidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateType }
     * 
     * 
     */
    public List<CandidateType> getCandidate() {
        if (candidate == null) {
            candidate = new ArrayList<CandidateType>();
        }
        return this.candidate;
    }

}
