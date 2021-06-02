
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeInTransitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInTransitResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageBillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceSummary" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ServiceSummaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInTransitResponseType", propOrder = {
    "pickupDate",
    "documentsOnlyIndicator",
    "packageBillType",
    "autoDutyCode",
    "disclaimer",
    "serviceSummary"
})
public class TimeInTransitResponseType {

    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "PackageBillType")
    protected String packageBillType;
    @XmlElement(name = "AutoDutyCode")
    protected String autoDutyCode;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;
    @XmlElement(name = "ServiceSummary", required = true)
    protected ServiceSummaryType serviceSummary;

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the documentsOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsOnlyIndicator() {
        return documentsOnlyIndicator;
    }

    /**
     * Sets the value of the documentsOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsOnlyIndicator(String value) {
        this.documentsOnlyIndicator = value;
    }

    /**
     * Gets the value of the packageBillType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageBillType() {
        return packageBillType;
    }

    /**
     * Sets the value of the packageBillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageBillType(String value) {
        this.packageBillType = value;
    }

    /**
     * Gets the value of the autoDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoDutyCode() {
        return autoDutyCode;
    }

    /**
     * Sets the value of the autoDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoDutyCode(String value) {
        this.autoDutyCode = value;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

    /**
     * Gets the value of the serviceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSummaryType }
     *     
     */
    public ServiceSummaryType getServiceSummary() {
        return serviceSummary;
    }

    /**
     * Sets the value of the serviceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSummaryType }
     *     
     */
    public void setServiceSummary(ServiceSummaryType value) {
        this.serviceSummary = value;
    }

}
