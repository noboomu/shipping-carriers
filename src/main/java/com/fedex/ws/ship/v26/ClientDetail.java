
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Descriptive data for the client submitting a transaction.
 * 
 * <p>Java class for ClientDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroundShipperNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MasterMeterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeterInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddlewareProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddlewareProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegratorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://fedex.com/ws/ship/v26}ExpressRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="AutoConfigurationType" type="{http://fedex.com/ws/ship/v26}AutoConfigurationType" minOccurs="0"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/ship/v26}Localization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientDetail", propOrder = {
    "accountNumber",
    "groundShipperNumber",
    "meterNumber",
    "masterMeterNumber",
    "meterInstance",
    "companyId",
    "softwareId",
    "softwareRelease",
    "clientProductId",
    "clientProductVersion",
    "middlewareProductId",
    "middlewareProductVersion",
    "integratorId",
    "region",
    "autoConfigurationType",
    "localization"
})
public class ClientDetail {

    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "GroundShipperNumber")
    protected String groundShipperNumber;
    @XmlElement(name = "MeterNumber", required = true)
    protected String meterNumber;
    @XmlElement(name = "MasterMeterNumber")
    protected String masterMeterNumber;
    @XmlElement(name = "MeterInstance")
    protected String meterInstance;
    @XmlElement(name = "CompanyId")
    protected String companyId;
    @XmlElement(name = "SoftwareId")
    protected String softwareId;
    @XmlElement(name = "SoftwareRelease")
    protected String softwareRelease;
    @XmlElement(name = "ClientProductId")
    protected String clientProductId;
    @XmlElement(name = "ClientProductVersion")
    protected String clientProductVersion;
    @XmlElement(name = "MiddlewareProductId")
    protected String middlewareProductId;
    @XmlElement(name = "MiddlewareProductVersion")
    protected String middlewareProductVersion;
    @XmlElement(name = "IntegratorId")
    protected String integratorId;
    @XmlElement(name = "Region")
    @XmlSchemaType(name = "string")
    protected ExpressRegionCode region;
    @XmlElement(name = "AutoConfigurationType")
    @XmlSchemaType(name = "string")
    protected AutoConfigurationType autoConfigurationType;
    @XmlElement(name = "Localization")
    protected Localization localization;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the groundShipperNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundShipperNumber() {
        return groundShipperNumber;
    }

    /**
     * Sets the value of the groundShipperNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundShipperNumber(String value) {
        this.groundShipperNumber = value;
    }

    /**
     * Gets the value of the meterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNumber() {
        return meterNumber;
    }

    /**
     * Sets the value of the meterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNumber(String value) {
        this.meterNumber = value;
    }

    /**
     * Gets the value of the masterMeterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterMeterNumber() {
        return masterMeterNumber;
    }

    /**
     * Sets the value of the masterMeterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterMeterNumber(String value) {
        this.masterMeterNumber = value;
    }

    /**
     * Gets the value of the meterInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterInstance() {
        return meterInstance;
    }

    /**
     * Sets the value of the meterInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterInstance(String value) {
        this.meterInstance = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the softwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareId() {
        return softwareId;
    }

    /**
     * Sets the value of the softwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareId(String value) {
        this.softwareId = value;
    }

    /**
     * Gets the value of the softwareRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareRelease() {
        return softwareRelease;
    }

    /**
     * Sets the value of the softwareRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareRelease(String value) {
        this.softwareRelease = value;
    }

    /**
     * Gets the value of the clientProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientProductId() {
        return clientProductId;
    }

    /**
     * Sets the value of the clientProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientProductId(String value) {
        this.clientProductId = value;
    }

    /**
     * Gets the value of the clientProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientProductVersion() {
        return clientProductVersion;
    }

    /**
     * Sets the value of the clientProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientProductVersion(String value) {
        this.clientProductVersion = value;
    }

    /**
     * Gets the value of the middlewareProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlewareProductId() {
        return middlewareProductId;
    }

    /**
     * Sets the value of the middlewareProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlewareProductId(String value) {
        this.middlewareProductId = value;
    }

    /**
     * Gets the value of the middlewareProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlewareProductVersion() {
        return middlewareProductVersion;
    }

    /**
     * Sets the value of the middlewareProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlewareProductVersion(String value) {
        this.middlewareProductVersion = value;
    }

    /**
     * Gets the value of the integratorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratorId() {
        return integratorId;
    }

    /**
     * Sets the value of the integratorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratorId(String value) {
        this.integratorId = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressRegionCode }
     *     
     */
    public ExpressRegionCode getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressRegionCode }
     *     
     */
    public void setRegion(ExpressRegionCode value) {
        this.region = value;
    }

    /**
     * Gets the value of the autoConfigurationType property.
     * 
     * @return
     *     possible object is
     *     {@link AutoConfigurationType }
     *     
     */
    public AutoConfigurationType getAutoConfigurationType() {
        return autoConfigurationType;
    }

    /**
     * Sets the value of the autoConfigurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoConfigurationType }
     *     
     */
    public void setAutoConfigurationType(AutoConfigurationType value) {
        this.autoConfigurationType = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setLocalization(Localization value) {
        this.localization = value;
    }

}
