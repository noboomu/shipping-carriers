
package com.ups.xmlschema.xoltws.track.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginPortDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginPortDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeparture" type="{http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginPortDetailType", propOrder = {
    "originPort",
    "estimatedDeparture"
})
public class OriginPortDetailType {

    @XmlElement(name = "OriginPort")
    protected String originPort;
    @XmlElement(name = "EstimatedDeparture")
    protected DateTimeType estimatedDeparture;

    /**
     * Gets the value of the originPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPort() {
        return originPort;
    }

    /**
     * Sets the value of the originPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPort(String value) {
        this.originPort = value;
    }

    /**
     * Gets the value of the estimatedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEstimatedDeparture() {
        return estimatedDeparture;
    }

    /**
     * Sets the value of the estimatedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEstimatedDeparture(DateTimeType value) {
        this.estimatedDeparture = value;
    }

}
