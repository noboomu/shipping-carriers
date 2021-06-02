
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the details around the ADR license required for shipping.
 * 
 * <p>Java class for AdrLicenseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdrLicenseDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LicenseOrPermitDetail" type="{http://fedex.com/ws/ship/v26}LicenseOrPermitDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdrLicenseDetail", propOrder = {
    "licenseOrPermitDetail"
})
public class AdrLicenseDetail {

    @XmlElement(name = "LicenseOrPermitDetail")
    protected LicenseOrPermitDetail licenseOrPermitDetail;

    /**
     * Gets the value of the licenseOrPermitDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseOrPermitDetail }
     *     
     */
    public LicenseOrPermitDetail getLicenseOrPermitDetail() {
        return licenseOrPermitDetail;
    }

    /**
     * Sets the value of the licenseOrPermitDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseOrPermitDetail }
     *     
     */
    public void setLicenseOrPermitDetail(LicenseOrPermitDetail value) {
        this.licenseOrPermitDetail = value;
    }

}
