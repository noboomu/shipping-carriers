
package com.fedex.ws.vacs.v14;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadioactivityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioactivityDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportIndex" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SurfaceReading" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CriticalitySafetyIndex" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://fedex.com/ws/vacs/v14}Dimensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioactivityDetail", propOrder = {
    "transportIndex",
    "surfaceReading",
    "criticalitySafetyIndex",
    "dimensions"
})
public class RadioactivityDetail {

    @XmlElement(name = "TransportIndex")
    protected BigDecimal transportIndex;
    @XmlElement(name = "SurfaceReading")
    protected BigDecimal surfaceReading;
    @XmlElement(name = "CriticalitySafetyIndex")
    protected BigDecimal criticalitySafetyIndex;
    @XmlElement(name = "Dimensions")
    protected Dimensions dimensions;

    /**
     * Gets the value of the transportIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransportIndex() {
        return transportIndex;
    }

    /**
     * Sets the value of the transportIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransportIndex(BigDecimal value) {
        this.transportIndex = value;
    }

    /**
     * Gets the value of the surfaceReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurfaceReading() {
        return surfaceReading;
    }

    /**
     * Sets the value of the surfaceReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurfaceReading(BigDecimal value) {
        this.surfaceReading = value;
    }

    /**
     * Gets the value of the criticalitySafetyIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCriticalitySafetyIndex() {
        return criticalitySafetyIndex;
    }

    /**
     * Sets the value of the criticalitySafetyIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCriticalitySafetyIndex(BigDecimal value) {
        this.criticalitySafetyIndex = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

}
