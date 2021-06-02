
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicFlexibleParcelIndicator" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}InsuranceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedFlexibleParcelIndicator" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}InsuranceValueType" minOccurs="0"/&gt;
 *         &lt;element name="TimeInTransitFlexibleParcelIndicator" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}InsuranceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceType", propOrder = {
    "basicFlexibleParcelIndicator",
    "extendedFlexibleParcelIndicator",
    "timeInTransitFlexibleParcelIndicator"
})
public class InsuranceType {

    @XmlElement(name = "BasicFlexibleParcelIndicator")
    protected InsuranceValueType basicFlexibleParcelIndicator;
    @XmlElement(name = "ExtendedFlexibleParcelIndicator")
    protected InsuranceValueType extendedFlexibleParcelIndicator;
    @XmlElement(name = "TimeInTransitFlexibleParcelIndicator")
    protected InsuranceValueType timeInTransitFlexibleParcelIndicator;

    /**
     * Gets the value of the basicFlexibleParcelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceValueType }
     *     
     */
    public InsuranceValueType getBasicFlexibleParcelIndicator() {
        return basicFlexibleParcelIndicator;
    }

    /**
     * Sets the value of the basicFlexibleParcelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceValueType }
     *     
     */
    public void setBasicFlexibleParcelIndicator(InsuranceValueType value) {
        this.basicFlexibleParcelIndicator = value;
    }

    /**
     * Gets the value of the extendedFlexibleParcelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceValueType }
     *     
     */
    public InsuranceValueType getExtendedFlexibleParcelIndicator() {
        return extendedFlexibleParcelIndicator;
    }

    /**
     * Sets the value of the extendedFlexibleParcelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceValueType }
     *     
     */
    public void setExtendedFlexibleParcelIndicator(InsuranceValueType value) {
        this.extendedFlexibleParcelIndicator = value;
    }

    /**
     * Gets the value of the timeInTransitFlexibleParcelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceValueType }
     *     
     */
    public InsuranceValueType getTimeInTransitFlexibleParcelIndicator() {
        return timeInTransitFlexibleParcelIndicator;
    }

    /**
     * Sets the value of the timeInTransitFlexibleParcelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceValueType }
     *     
     */
    public void setTimeInTransitFlexibleParcelIndicator(InsuranceValueType value) {
        this.timeInTransitFlexibleParcelIndicator = value;
    }

}
