
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Supporting detail for applied options identified in a rate quote.
 * 
 * <p>Java class for ServiceSubOptionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSubOptionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightGuarantee" type="{http://fedex.com/ws/rate/v28}FreightGuaranteeType" minOccurs="0"/&gt;
 *         &lt;element name="SmartPostHubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmartPostIndicia" type="{http://fedex.com/ws/rate/v28}SmartPostIndiciaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSubOptionDetail", propOrder = {
    "freightGuarantee",
    "smartPostHubId",
    "smartPostIndicia"
})
public class ServiceSubOptionDetail {

    @XmlElement(name = "FreightGuarantee")
    @XmlSchemaType(name = "string")
    protected FreightGuaranteeType freightGuarantee;
    @XmlElement(name = "SmartPostHubId")
    protected String smartPostHubId;
    @XmlElement(name = "SmartPostIndicia")
    @XmlSchemaType(name = "string")
    protected SmartPostIndiciaType smartPostIndicia;

    /**
     * Gets the value of the freightGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link FreightGuaranteeType }
     *     
     */
    public FreightGuaranteeType getFreightGuarantee() {
        return freightGuarantee;
    }

    /**
     * Sets the value of the freightGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightGuaranteeType }
     *     
     */
    public void setFreightGuarantee(FreightGuaranteeType value) {
        this.freightGuarantee = value;
    }

    /**
     * Gets the value of the smartPostHubId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartPostHubId() {
        return smartPostHubId;
    }

    /**
     * Sets the value of the smartPostHubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartPostHubId(String value) {
        this.smartPostHubId = value;
    }

    /**
     * Gets the value of the smartPostIndicia property.
     * 
     * @return
     *     possible object is
     *     {@link SmartPostIndiciaType }
     *     
     */
    public SmartPostIndiciaType getSmartPostIndicia() {
        return smartPostIndicia;
    }

    /**
     * Sets the value of the smartPostIndicia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostIndiciaType }
     *     
     */
    public void setSmartPostIndicia(SmartPostIndiciaType value) {
        this.smartPostIndicia = value;
    }

}
