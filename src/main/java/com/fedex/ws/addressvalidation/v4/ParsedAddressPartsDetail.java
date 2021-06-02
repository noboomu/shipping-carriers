
package com.fedex.ws.addressvalidation.v4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParsedAddressPartsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParsedAddressPartsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParsedStreetLine" type="{http://fedex.com/ws/addressvalidation/v4}ParsedStreetLineDetail" minOccurs="0"/&gt;
 *         &lt;element name="ParsedPostalCode" type="{http://fedex.com/ws/addressvalidation/v4}ParsedPostalCodeDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParsedAddressPartsDetail", propOrder = {
    "parsedStreetLine",
    "parsedPostalCode"
})
public class ParsedAddressPartsDetail {

    @XmlElement(name = "ParsedStreetLine")
    protected ParsedStreetLineDetail parsedStreetLine;
    @XmlElement(name = "ParsedPostalCode")
    protected ParsedPostalCodeDetail parsedPostalCode;

    /**
     * Gets the value of the parsedStreetLine property.
     * 
     * @return
     *     possible object is
     *     {@link ParsedStreetLineDetail }
     *     
     */
    public ParsedStreetLineDetail getParsedStreetLine() {
        return parsedStreetLine;
    }

    /**
     * Sets the value of the parsedStreetLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParsedStreetLineDetail }
     *     
     */
    public void setParsedStreetLine(ParsedStreetLineDetail value) {
        this.parsedStreetLine = value;
    }

    /**
     * Gets the value of the parsedPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParsedPostalCodeDetail }
     *     
     */
    public ParsedPostalCodeDetail getParsedPostalCode() {
        return parsedPostalCode;
    }

    /**
     * Sets the value of the parsedPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParsedPostalCodeDetail }
     *     
     */
    public void setParsedPostalCode(ParsedPostalCodeDetail value) {
        this.parsedPostalCode = value;
    }

}
