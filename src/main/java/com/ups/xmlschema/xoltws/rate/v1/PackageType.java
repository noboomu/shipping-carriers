
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackagingType" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}DimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="DimWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="PackageWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="Commodity" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CommodityType" minOccurs="0"/&gt;
 *         &lt;element name="LargePackageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageServiceOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PackageServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalHandlingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPSPremier" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}UPSPremierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "packagingType",
    "dimensions",
    "dimWeight",
    "packageWeight",
    "commodity",
    "largePackageIndicator",
    "packageServiceOptions",
    "additionalHandlingIndicator",
    "upsPremier"
})
public class PackageType {

    @XmlElement(name = "PackagingType")
    protected CodeDescriptionType packagingType;
    @XmlElement(name = "Dimensions")
    protected DimensionsType dimensions;
    @XmlElement(name = "DimWeight")
    protected PackageWeightType dimWeight;
    @XmlElement(name = "PackageWeight")
    protected PackageWeightType packageWeight;
    @XmlElement(name = "Commodity")
    protected CommodityType commodity;
    @XmlElement(name = "LargePackageIndicator")
    protected String largePackageIndicator;
    @XmlElement(name = "PackageServiceOptions")
    protected PackageServiceOptionsType packageServiceOptions;
    @XmlElement(name = "AdditionalHandlingIndicator")
    protected String additionalHandlingIndicator;
    @XmlElement(name = "UPSPremier")
    protected UPSPremierType upsPremier;

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setPackagingType(CodeDescriptionType value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setDimensions(DimensionsType value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the dimWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PackageWeightType }
     *     
     */
    public PackageWeightType getDimWeight() {
        return dimWeight;
    }

    /**
     * Sets the value of the dimWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageWeightType }
     *     
     */
    public void setDimWeight(PackageWeightType value) {
        this.dimWeight = value;
    }

    /**
     * Gets the value of the packageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PackageWeightType }
     *     
     */
    public PackageWeightType getPackageWeight() {
        return packageWeight;
    }

    /**
     * Sets the value of the packageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageWeightType }
     *     
     */
    public void setPackageWeight(PackageWeightType value) {
        this.packageWeight = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityType }
     *     
     */
    public CommodityType getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityType }
     *     
     */
    public void setCommodity(CommodityType value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the largePackageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargePackageIndicator() {
        return largePackageIndicator;
    }

    /**
     * Sets the value of the largePackageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargePackageIndicator(String value) {
        this.largePackageIndicator = value;
    }

    /**
     * Gets the value of the packageServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public PackageServiceOptionsType getPackageServiceOptions() {
        return packageServiceOptions;
    }

    /**
     * Sets the value of the packageServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public void setPackageServiceOptions(PackageServiceOptionsType value) {
        this.packageServiceOptions = value;
    }

    /**
     * Gets the value of the additionalHandlingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalHandlingIndicator() {
        return additionalHandlingIndicator;
    }

    /**
     * Sets the value of the additionalHandlingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalHandlingIndicator(String value) {
        this.additionalHandlingIndicator = value;
    }

    /**
     * Gets the value of the upsPremier property.
     * 
     * @return
     *     possible object is
     *     {@link UPSPremierType }
     *     
     */
    public UPSPremierType getUPSPremier() {
        return upsPremier;
    }

    /**
     * Sets the value of the upsPremier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPSPremierType }
     *     
     */
    public void setUPSPremier(UPSPremierType value) {
        this.upsPremier = value;
    }

}
