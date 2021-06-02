
package com.fedex.ws.vacs.v14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceDescription" type="{http://fedex.com/ws/vacs/v14}ServiceDescription" minOccurs="0"/&gt;
 *         &lt;element name="PackagingDescription" type="{http://fedex.com/ws/vacs/v14}PackagingDescription" minOccurs="0"/&gt;
 *         &lt;element name="AstraServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Scac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppliedOptions" type="{http://fedex.com/ws/vacs/v14}ServiceOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AppliedSubOptions" type="{http://fedex.com/ws/vacs/v14}ServiceSubOptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="DerivedShipmentSignatureOption" type="{http://fedex.com/ws/vacs/v14}SignatureOptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="DerivedPackageSignatureOptions" type="{http://fedex.com/ws/vacs/v14}SignatureOptionDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaximumWeights" type="{http://fedex.com/ws/vacs/v14}Weight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaximumDimensions" type="{http://fedex.com/ws/vacs/v14}Dimensions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaximumLengthPlusGirths" type="{http://fedex.com/ws/vacs/v14}LinearMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaximumInsuredValue" type="{http://fedex.com/ws/vacs/v14}Money" minOccurs="0"/&gt;
 *         &lt;element name="DerivedEtdType" type="{http://fedex.com/ws/vacs/v14}CompletedEtdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetail", propOrder = {
    "serviceDescription",
    "packagingDescription",
    "astraServiceDescription",
    "scac",
    "appliedOptions",
    "appliedSubOptions",
    "derivedShipmentSignatureOption",
    "derivedPackageSignatureOptions",
    "maximumWeights",
    "maximumDimensions",
    "maximumLengthPlusGirths",
    "maximumInsuredValue",
    "derivedEtdType"
})
public class ProductDetail {

    @XmlElement(name = "ServiceDescription")
    protected ServiceDescription serviceDescription;
    @XmlElement(name = "PackagingDescription")
    protected PackagingDescription packagingDescription;
    @XmlElement(name = "AstraServiceDescription")
    protected String astraServiceDescription;
    @XmlElement(name = "Scac")
    protected String scac;
    @XmlElement(name = "AppliedOptions")
    @XmlSchemaType(name = "string")
    protected List<ServiceOptionType> appliedOptions;
    @XmlElement(name = "AppliedSubOptions")
    protected ServiceSubOptionDetail appliedSubOptions;
    @XmlElement(name = "DerivedShipmentSignatureOption")
    protected SignatureOptionDetail derivedShipmentSignatureOption;
    @XmlElement(name = "DerivedPackageSignatureOptions")
    protected List<SignatureOptionDetail> derivedPackageSignatureOptions;
    @XmlElement(name = "MaximumWeights")
    protected List<Weight> maximumWeights;
    @XmlElement(name = "MaximumDimensions")
    protected List<Dimensions> maximumDimensions;
    @XmlElement(name = "MaximumLengthPlusGirths")
    protected List<LinearMeasure> maximumLengthPlusGirths;
    @XmlElement(name = "MaximumInsuredValue")
    protected Money maximumInsuredValue;
    @XmlElement(name = "DerivedEtdType")
    @XmlSchemaType(name = "string")
    protected CompletedEtdType derivedEtdType;

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescription }
     *     
     */
    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescription }
     *     
     */
    public void setServiceDescription(ServiceDescription value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the packagingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingDescription }
     *     
     */
    public PackagingDescription getPackagingDescription() {
        return packagingDescription;
    }

    /**
     * Sets the value of the packagingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingDescription }
     *     
     */
    public void setPackagingDescription(PackagingDescription value) {
        this.packagingDescription = value;
    }

    /**
     * Gets the value of the astraServiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstraServiceDescription() {
        return astraServiceDescription;
    }

    /**
     * Sets the value of the astraServiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstraServiceDescription(String value) {
        this.astraServiceDescription = value;
    }

    /**
     * Gets the value of the scac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScac() {
        return scac;
    }

    /**
     * Sets the value of the scac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScac(String value) {
        this.scac = value;
    }

    /**
     * Gets the value of the appliedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the appliedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOptionType }
     * 
     * 
     */
    public List<ServiceOptionType> getAppliedOptions() {
        if (appliedOptions == null) {
            appliedOptions = new ArrayList<ServiceOptionType>();
        }
        return this.appliedOptions;
    }

    /**
     * Gets the value of the appliedSubOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSubOptionDetail }
     *     
     */
    public ServiceSubOptionDetail getAppliedSubOptions() {
        return appliedSubOptions;
    }

    /**
     * Sets the value of the appliedSubOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSubOptionDetail }
     *     
     */
    public void setAppliedSubOptions(ServiceSubOptionDetail value) {
        this.appliedSubOptions = value;
    }

    /**
     * Gets the value of the derivedShipmentSignatureOption property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public SignatureOptionDetail getDerivedShipmentSignatureOption() {
        return derivedShipmentSignatureOption;
    }

    /**
     * Sets the value of the derivedShipmentSignatureOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public void setDerivedShipmentSignatureOption(SignatureOptionDetail value) {
        this.derivedShipmentSignatureOption = value;
    }

    /**
     * Gets the value of the derivedPackageSignatureOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the derivedPackageSignatureOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedPackageSignatureOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureOptionDetail }
     * 
     * 
     */
    public List<SignatureOptionDetail> getDerivedPackageSignatureOptions() {
        if (derivedPackageSignatureOptions == null) {
            derivedPackageSignatureOptions = new ArrayList<SignatureOptionDetail>();
        }
        return this.derivedPackageSignatureOptions;
    }

    /**
     * Gets the value of the maximumWeights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the maximumWeights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumWeights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Weight }
     * 
     * 
     */
    public List<Weight> getMaximumWeights() {
        if (maximumWeights == null) {
            maximumWeights = new ArrayList<Weight>();
        }
        return this.maximumWeights;
    }

    /**
     * Gets the value of the maximumDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the maximumDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimensions }
     * 
     * 
     */
    public List<Dimensions> getMaximumDimensions() {
        if (maximumDimensions == null) {
            maximumDimensions = new ArrayList<Dimensions>();
        }
        return this.maximumDimensions;
    }

    /**
     * Gets the value of the maximumLengthPlusGirths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the maximumLengthPlusGirths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumLengthPlusGirths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearMeasure }
     * 
     * 
     */
    public List<LinearMeasure> getMaximumLengthPlusGirths() {
        if (maximumLengthPlusGirths == null) {
            maximumLengthPlusGirths = new ArrayList<LinearMeasure>();
        }
        return this.maximumLengthPlusGirths;
    }

    /**
     * Gets the value of the maximumInsuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaximumInsuredValue() {
        return maximumInsuredValue;
    }

    /**
     * Sets the value of the maximumInsuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaximumInsuredValue(Money value) {
        this.maximumInsuredValue = value;
    }

    /**
     * Gets the value of the derivedEtdType property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedEtdType }
     *     
     */
    public CompletedEtdType getDerivedEtdType() {
        return derivedEtdType;
    }

    /**
     * Sets the value of the derivedEtdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedEtdType }
     *     
     */
    public void setDerivedEtdType(CompletedEtdType value) {
        this.derivedEtdType = value;
    }

}
