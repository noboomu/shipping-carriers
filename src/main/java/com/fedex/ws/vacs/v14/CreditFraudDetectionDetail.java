
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This class is a rename of the previous VerifyCreditFraudDetail; the name change reflects the fact that it is no longer tied to a "verify" usage.
 * 
 * <p>Java class for CreditFraudDetectionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditFraudDetectionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCookiesEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DevicePrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditFraudDetectionDetail", propOrder = {
    "ipAddress",
    "clientCookiesEnabled",
    "devicePrint"
})
public class CreditFraudDetectionDetail {

    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "ClientCookiesEnabled")
    protected Boolean clientCookiesEnabled;
    @XmlElement(name = "DevicePrint")
    protected String devicePrint;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the clientCookiesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientCookiesEnabled() {
        return clientCookiesEnabled;
    }

    /**
     * Sets the value of the clientCookiesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientCookiesEnabled(Boolean value) {
        this.clientCookiesEnabled = value;
    }

    /**
     * Gets the value of the devicePrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePrint() {
        return devicePrint;
    }

    /**
     * Sets the value of the devicePrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePrint(String value) {
        this.devicePrint = value;
    }

}
