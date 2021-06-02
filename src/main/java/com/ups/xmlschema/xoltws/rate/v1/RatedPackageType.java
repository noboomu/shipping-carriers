
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatedPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatedPackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportationCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="BaseServiceCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOptionsCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="TotalCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}BillingWeightType" minOccurs="0"/&gt;
 *         &lt;element name="Accessorial" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}AccessorialType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemizedCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NegotiatedCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}NegotiatedChargesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedPackageType", propOrder = {
    "transportationCharges",
    "baseServiceCharge",
    "serviceOptionsCharges",
    "totalCharges",
    "weight",
    "billingWeight",
    "accessorial",
    "itemizedCharges",
    "negotiatedCharges"
})
public class RatedPackageType {

    @XmlElement(name = "TransportationCharges")
    protected ChargesType transportationCharges;
    @XmlElement(name = "BaseServiceCharge")
    protected ChargesType baseServiceCharge;
    @XmlElement(name = "ServiceOptionsCharges")
    protected ChargesType serviceOptionsCharges;
    @XmlElement(name = "TotalCharges")
    protected ChargesType totalCharges;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "BillingWeight")
    protected BillingWeightType billingWeight;
    @XmlElement(name = "Accessorial")
    protected List<AccessorialType> accessorial;
    @XmlElement(name = "ItemizedCharges")
    protected List<ChargesType> itemizedCharges;
    @XmlElement(name = "NegotiatedCharges")
    protected NegotiatedChargesType negotiatedCharges;

    /**
     * Gets the value of the transportationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTransportationCharges() {
        return transportationCharges;
    }

    /**
     * Sets the value of the transportationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTransportationCharges(ChargesType value) {
        this.transportationCharges = value;
    }

    /**
     * Gets the value of the baseServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getBaseServiceCharge() {
        return baseServiceCharge;
    }

    /**
     * Sets the value of the baseServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setBaseServiceCharge(ChargesType value) {
        this.baseServiceCharge = value;
    }

    /**
     * Gets the value of the serviceOptionsCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getServiceOptionsCharges() {
        return serviceOptionsCharges;
    }

    /**
     * Sets the value of the serviceOptionsCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setServiceOptionsCharges(ChargesType value) {
        this.serviceOptionsCharges = value;
    }

    /**
     * Gets the value of the totalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTotalCharges() {
        return totalCharges;
    }

    /**
     * Sets the value of the totalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTotalCharges(ChargesType value) {
        this.totalCharges = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the billingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BillingWeightType }
     *     
     */
    public BillingWeightType getBillingWeight() {
        return billingWeight;
    }

    /**
     * Sets the value of the billingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingWeightType }
     *     
     */
    public void setBillingWeight(BillingWeightType value) {
        this.billingWeight = value;
    }

    /**
     * Gets the value of the accessorial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessorial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessorial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessorialType }
     * 
     * 
     */
    public List<AccessorialType> getAccessorial() {
        if (accessorial == null) {
            accessorial = new ArrayList<AccessorialType>();
        }
        return this.accessorial;
    }

    /**
     * Gets the value of the itemizedCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesType }
     * 
     * 
     */
    public List<ChargesType> getItemizedCharges() {
        if (itemizedCharges == null) {
            itemizedCharges = new ArrayList<ChargesType>();
        }
        return this.itemizedCharges;
    }

    /**
     * Gets the value of the negotiatedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedChargesType }
     *     
     */
    public NegotiatedChargesType getNegotiatedCharges() {
        return negotiatedCharges;
    }

    /**
     * Sets the value of the negotiatedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedChargesType }
     *     
     */
    public void setNegotiatedCharges(NegotiatedChargesType value) {
        this.negotiatedCharges = value;
    }

}
