
package com.fedex.ws.async.v4;

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
 *         &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MeterInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegratorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://fedex.com/ws/async/v4}ExpressRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/async/v4}Localization" minOccurs="0"/&gt;
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
    "meterNumber",
    "meterInstance",
    "integratorId",
    "region",
    "localization"
})
public class ClientDetail {

    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "MeterNumber", required = true)
    protected String meterNumber;
    @XmlElement(name = "MeterInstance")
    protected String meterInstance;
    @XmlElement(name = "IntegratorId")
    protected String integratorId;
    @XmlElement(name = "Region")
    @XmlSchemaType(name = "string")
    protected ExpressRegionCode region;
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
