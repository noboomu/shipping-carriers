
package com.ups.xmlschema.xoltws._if.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EEIInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EEIInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExportInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="License" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}EEILicenseType" minOccurs="0"/&gt;
 *         &lt;element name="DDTCInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}DDTCInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EEIInformationType", propOrder = {
    "exportInformation",
    "license",
    "ddtcInformation"
})
public class EEIInformationType {

    @XmlElement(name = "ExportInformation")
    protected String exportInformation;
    @XmlElement(name = "License")
    protected EEILicenseType license;
    @XmlElement(name = "DDTCInformation")
    protected DDTCInformationType ddtcInformation;

    /**
     * Gets the value of the exportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportInformation() {
        return exportInformation;
    }

    /**
     * Sets the value of the exportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportInformation(String value) {
        this.exportInformation = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link EEILicenseType }
     *     
     */
    public EEILicenseType getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEILicenseType }
     *     
     */
    public void setLicense(EEILicenseType value) {
        this.license = value;
    }

    /**
     * Gets the value of the ddtcInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DDTCInformationType }
     *     
     */
    public DDTCInformationType getDDTCInformation() {
        return ddtcInformation;
    }

    /**
     * Sets the value of the ddtcInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DDTCInformationType }
     *     
     */
    public void setDDTCInformation(DDTCInformationType value) {
        this.ddtcInformation = value;
    }

}
