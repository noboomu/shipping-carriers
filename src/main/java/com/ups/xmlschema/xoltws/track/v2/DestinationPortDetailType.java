
package com.ups.xmlschema.xoltws.track.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationPortDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationPortDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedArrival" type="{http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationPortDetailType", propOrder = {
    "destinationPort",
    "estimatedArrival"
})
public class DestinationPortDetailType {

    @XmlElement(name = "DestinationPort")
    protected String destinationPort;
    @XmlElement(name = "EstimatedArrival")
    protected DateTimeType estimatedArrival;

    /**
     * Gets the value of the destinationPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /**
     * Sets the value of the destinationPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPort(String value) {
        this.destinationPort = value;
    }

    /**
     * Gets the value of the estimatedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEstimatedArrival() {
        return estimatedArrival;
    }

    /**
     * Sets the value of the estimatedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEstimatedArrival(DateTimeType value) {
        this.estimatedArrival = value;
    }

}
