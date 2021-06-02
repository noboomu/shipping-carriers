
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PalletDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumOfPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Packaging" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PackagingType" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}DimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="DimWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="PackageWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="LargePackageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ReferenceNumberType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalHandlingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageServiceOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PackageServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="Commodity" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}CommodityType" minOccurs="0"/&gt;
 *         &lt;element name="HazMatPackageInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}HazMatPackageInformationType" minOccurs="0"/&gt;
 *         &lt;element name="SimpleRate" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="UPSPremier" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}UPSPremierType" minOccurs="0"/&gt;
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
    "description",
    "palletDescription",
    "numOfPieces",
    "unitPrice",
    "packaging",
    "dimensions",
    "dimWeight",
    "packageWeight",
    "largePackageIndicator",
    "referenceNumber",
    "additionalHandlingIndicator",
    "packageServiceOptions",
    "commodity",
    "hazMatPackageInformation",
    "simpleRate",
    "upsPremier"
})
public class PackageType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PalletDescription")
    protected String palletDescription;
    @XmlElement(name = "NumOfPieces")
    protected String numOfPieces;
    @XmlElement(name = "UnitPrice")
    protected String unitPrice;
    @XmlElement(name = "Packaging")
    protected PackagingType packaging;
    @XmlElement(name = "Dimensions")
    protected DimensionsType dimensions;
    @XmlElement(name = "DimWeight")
    protected PackageWeightType dimWeight;
    @XmlElement(name = "PackageWeight")
    protected PackageWeightType packageWeight;
    @XmlElement(name = "LargePackageIndicator")
    protected String largePackageIndicator;
    @XmlElement(name = "ReferenceNumber")
    protected List<ReferenceNumberType> referenceNumber;
    @XmlElement(name = "AdditionalHandlingIndicator")
    protected String additionalHandlingIndicator;
    @XmlElement(name = "PackageServiceOptions")
    protected PackageServiceOptionsType packageServiceOptions;
    @XmlElement(name = "Commodity")
    protected CommodityType commodity;
    @XmlElement(name = "HazMatPackageInformation")
    protected HazMatPackageInformationType hazMatPackageInformation;
    @XmlElement(name = "SimpleRate")
    protected CodeDescriptionType simpleRate;
    @XmlElement(name = "UPSPremier")
    protected UPSPremierType upsPremier;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the palletDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalletDescription() {
        return palletDescription;
    }

    /**
     * Sets the value of the palletDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalletDescription(String value) {
        this.palletDescription = value;
    }

    /**
     * Gets the value of the numOfPieces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfPieces() {
        return numOfPieces;
    }

    /**
     * Sets the value of the numOfPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfPieces(String value) {
        this.numOfPieces = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingType }
     *     
     */
    public PackagingType getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingType }
     *     
     */
    public void setPackaging(PackagingType value) {
        this.packaging = value;
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
     * Gets the value of the referenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceNumberType }
     * 
     * 
     */
    public List<ReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ReferenceNumberType>();
        }
        return this.referenceNumber;
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
     * Gets the value of the hazMatPackageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HazMatPackageInformationType }
     *     
     */
    public HazMatPackageInformationType getHazMatPackageInformation() {
        return hazMatPackageInformation;
    }

    /**
     * Sets the value of the hazMatPackageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazMatPackageInformationType }
     *     
     */
    public void setHazMatPackageInformation(HazMatPackageInformationType value) {
        this.hazMatPackageInformation = value;
    }

    /**
     * Gets the value of the simpleRate property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getSimpleRate() {
        return simpleRate;
    }

    /**
     * Sets the value of the simpleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setSimpleRate(CodeDescriptionType value) {
        this.simpleRate = value;
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