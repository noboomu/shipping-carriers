
package com.fedex.ws.rate.v28;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatedPackageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatedPackageDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingIds" type="{http://fedex.com/ws/rate/v28}TrackingId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveNetDiscount" type="{http://fedex.com/ws/rate/v28}Money" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedCodCollectionAmount" type="{http://fedex.com/ws/rate/v28}Money" minOccurs="0"/&gt;
 *         &lt;element name="OversizeClass" type="{http://fedex.com/ws/rate/v28}OversizeClassType" minOccurs="0"/&gt;
 *         &lt;element name="PackageRateDetail" type="{http://fedex.com/ws/rate/v28}PackageRateDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedPackageDetail", propOrder = {
    "trackingIds",
    "groupNumber",
    "effectiveNetDiscount",
    "adjustedCodCollectionAmount",
    "oversizeClass",
    "packageRateDetail"
})
public class RatedPackageDetail {

    @XmlElement(name = "TrackingIds")
    protected List<TrackingId> trackingIds;
    @XmlElement(name = "GroupNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupNumber;
    @XmlElement(name = "EffectiveNetDiscount")
    protected Money effectiveNetDiscount;
    @XmlElement(name = "AdjustedCodCollectionAmount")
    protected Money adjustedCodCollectionAmount;
    @XmlElement(name = "OversizeClass")
    @XmlSchemaType(name = "string")
    protected OversizeClassType oversizeClass;
    @XmlElement(name = "PackageRateDetail")
    protected PackageRateDetail packageRateDetail;

    /**
     * Gets the value of the trackingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trackingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingId }
     * 
     * 
     */
    public List<TrackingId> getTrackingIds() {
        if (trackingIds == null) {
            trackingIds = new ArrayList<TrackingId>();
        }
        return this.trackingIds;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupNumber(BigInteger value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the effectiveNetDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getEffectiveNetDiscount() {
        return effectiveNetDiscount;
    }

    /**
     * Sets the value of the effectiveNetDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setEffectiveNetDiscount(Money value) {
        this.effectiveNetDiscount = value;
    }

    /**
     * Gets the value of the adjustedCodCollectionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAdjustedCodCollectionAmount() {
        return adjustedCodCollectionAmount;
    }

    /**
     * Sets the value of the adjustedCodCollectionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAdjustedCodCollectionAmount(Money value) {
        this.adjustedCodCollectionAmount = value;
    }

    /**
     * Gets the value of the oversizeClass property.
     * 
     * @return
     *     possible object is
     *     {@link OversizeClassType }
     *     
     */
    public OversizeClassType getOversizeClass() {
        return oversizeClass;
    }

    /**
     * Sets the value of the oversizeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OversizeClassType }
     *     
     */
    public void setOversizeClass(OversizeClassType value) {
        this.oversizeClass = value;
    }

    /**
     * Gets the value of the packageRateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PackageRateDetail }
     *     
     */
    public PackageRateDetail getPackageRateDetail() {
        return packageRateDetail;
    }

    /**
     * Sets the value of the packageRateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageRateDetail }
     *     
     */
    public void setPackageRateDetail(PackageRateDetail value) {
        this.packageRateDetail = value;
    }

}
