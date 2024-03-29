
package com.fedex.ws.vacs.v14;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the summary of aggregates that are maintianed for a transborder consolidation.
 * 
 * <p>Java class for TransborderDistributionSummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransborderDistributionSummaryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpressPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="ExpressTotalPackageWeight" type="{http://fedex.com/ws/vacs/v14}Weight" minOccurs="0"/&gt;
 *         &lt;element name="ExpressTotalPackageAdjustedWeight" type="{http://fedex.com/ws/vacs/v14}Weight" minOccurs="0"/&gt;
 *         &lt;element name="ExpressFreightPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="ExpressTotalFreightWeight" type="{http://fedex.com/ws/vacs/v14}Weight" minOccurs="0"/&gt;
 *         &lt;element name="ExpressTotalFreightAdjustedWeight" type="{http://fedex.com/ws/vacs/v14}Weight" minOccurs="0"/&gt;
 *         &lt;element name="GroundPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="GroundTotalPackageWeight" type="{http://fedex.com/ws/vacs/v14}Weight" minOccurs="0"/&gt;
 *         &lt;element name="GroundTotalPackageAdjustedWeight" type="{http://fedex.com/ws/vacs/v14}Weight" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnconsolidatedCommodities" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransborderDistributionSummaryDetail", propOrder = {
    "expressPackageCount",
    "expressTotalPackageWeight",
    "expressTotalPackageAdjustedWeight",
    "expressFreightPackageCount",
    "expressTotalFreightWeight",
    "expressTotalFreightAdjustedWeight",
    "groundPackageCount",
    "groundTotalPackageWeight",
    "groundTotalPackageAdjustedWeight",
    "numberOfUnconsolidatedCommodities"
})
public class TransborderDistributionSummaryDetail {

    @XmlElement(name = "ExpressPackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger expressPackageCount;
    @XmlElement(name = "ExpressTotalPackageWeight")
    protected Weight expressTotalPackageWeight;
    @XmlElement(name = "ExpressTotalPackageAdjustedWeight")
    protected Weight expressTotalPackageAdjustedWeight;
    @XmlElement(name = "ExpressFreightPackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger expressFreightPackageCount;
    @XmlElement(name = "ExpressTotalFreightWeight")
    protected Weight expressTotalFreightWeight;
    @XmlElement(name = "ExpressTotalFreightAdjustedWeight")
    protected Weight expressTotalFreightAdjustedWeight;
    @XmlElement(name = "GroundPackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groundPackageCount;
    @XmlElement(name = "GroundTotalPackageWeight")
    protected Weight groundTotalPackageWeight;
    @XmlElement(name = "GroundTotalPackageAdjustedWeight")
    protected Weight groundTotalPackageAdjustedWeight;
    @XmlElement(name = "NumberOfUnconsolidatedCommodities")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfUnconsolidatedCommodities;

    /**
     * Gets the value of the expressPackageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpressPackageCount() {
        return expressPackageCount;
    }

    /**
     * Sets the value of the expressPackageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpressPackageCount(BigInteger value) {
        this.expressPackageCount = value;
    }

    /**
     * Gets the value of the expressTotalPackageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getExpressTotalPackageWeight() {
        return expressTotalPackageWeight;
    }

    /**
     * Sets the value of the expressTotalPackageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setExpressTotalPackageWeight(Weight value) {
        this.expressTotalPackageWeight = value;
    }

    /**
     * Gets the value of the expressTotalPackageAdjustedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getExpressTotalPackageAdjustedWeight() {
        return expressTotalPackageAdjustedWeight;
    }

    /**
     * Sets the value of the expressTotalPackageAdjustedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setExpressTotalPackageAdjustedWeight(Weight value) {
        this.expressTotalPackageAdjustedWeight = value;
    }

    /**
     * Gets the value of the expressFreightPackageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpressFreightPackageCount() {
        return expressFreightPackageCount;
    }

    /**
     * Sets the value of the expressFreightPackageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpressFreightPackageCount(BigInteger value) {
        this.expressFreightPackageCount = value;
    }

    /**
     * Gets the value of the expressTotalFreightWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getExpressTotalFreightWeight() {
        return expressTotalFreightWeight;
    }

    /**
     * Sets the value of the expressTotalFreightWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setExpressTotalFreightWeight(Weight value) {
        this.expressTotalFreightWeight = value;
    }

    /**
     * Gets the value of the expressTotalFreightAdjustedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getExpressTotalFreightAdjustedWeight() {
        return expressTotalFreightAdjustedWeight;
    }

    /**
     * Sets the value of the expressTotalFreightAdjustedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setExpressTotalFreightAdjustedWeight(Weight value) {
        this.expressTotalFreightAdjustedWeight = value;
    }

    /**
     * Gets the value of the groundPackageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroundPackageCount() {
        return groundPackageCount;
    }

    /**
     * Sets the value of the groundPackageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroundPackageCount(BigInteger value) {
        this.groundPackageCount = value;
    }

    /**
     * Gets the value of the groundTotalPackageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getGroundTotalPackageWeight() {
        return groundTotalPackageWeight;
    }

    /**
     * Sets the value of the groundTotalPackageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setGroundTotalPackageWeight(Weight value) {
        this.groundTotalPackageWeight = value;
    }

    /**
     * Gets the value of the groundTotalPackageAdjustedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getGroundTotalPackageAdjustedWeight() {
        return groundTotalPackageAdjustedWeight;
    }

    /**
     * Sets the value of the groundTotalPackageAdjustedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setGroundTotalPackageAdjustedWeight(Weight value) {
        this.groundTotalPackageAdjustedWeight = value;
    }

    /**
     * Gets the value of the numberOfUnconsolidatedCommodities property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnconsolidatedCommodities() {
        return numberOfUnconsolidatedCommodities;
    }

    /**
     * Sets the value of the numberOfUnconsolidatedCommodities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnconsolidatedCommodities(BigInteger value) {
        this.numberOfUnconsolidatedCommodities = value;
    }

}
