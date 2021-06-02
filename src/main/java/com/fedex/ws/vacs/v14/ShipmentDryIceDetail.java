
package com.fedex.ws.vacs.v14;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Shipment-level totals of dry ice data across all packages.
 * 
 * <p>Java class for ShipmentDryIceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDryIceDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalWeight" type="{http://fedex.com/ws/vacs/v14}Weight" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/vacs/v14}ShipmentDryIceProcessingOptionsRequested" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDryIceDetail", propOrder = {
    "packageCount",
    "totalWeight",
    "processingOptions"
})
public class ShipmentDryIceDetail {

    @XmlElement(name = "PackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageCount;
    @XmlElement(name = "TotalWeight")
    protected Weight totalWeight;
    @XmlElement(name = "ProcessingOptions")
    protected ShipmentDryIceProcessingOptionsRequested processingOptions;

    /**
     * Gets the value of the packageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageCount() {
        return packageCount;
    }

    /**
     * Sets the value of the packageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageCount(BigInteger value) {
        this.packageCount = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setTotalWeight(Weight value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the processingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDryIceProcessingOptionsRequested }
     *     
     */
    public ShipmentDryIceProcessingOptionsRequested getProcessingOptions() {
        return processingOptions;
    }

    /**
     * Sets the value of the processingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDryIceProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptions(ShipmentDryIceProcessingOptionsRequested value) {
        this.processingOptions = value;
    }

}
