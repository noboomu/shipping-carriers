
package com.ups.xmlschema.xoltws._if.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3"/&gt;
 *         &lt;element name="Unit" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}UnitType" minOccurs="0"/&gt;
 *         &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JointProductionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetCostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetCostDateRange" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}NetCostDateType" minOccurs="0"/&gt;
 *         &lt;element name="PreferenceCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProducerInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarksAndNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPackagesPerCommodity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ProductWeightType" minOccurs="0"/&gt;
 *         &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleB" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ScheduleBType" minOccurs="0"/&gt;
 *         &lt;element name="ExportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEDTotalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcludeFromForm" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ExcludeFromFormType" minOccurs="0"/&gt;
 *         &lt;element name="ProductCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackingListInfo" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}PackingListInfoType" minOccurs="0"/&gt;
 *         &lt;element name="EEIInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}EEIInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "description",
    "unit",
    "commodityCode",
    "partNumber",
    "originCountryCode",
    "jointProductionIndicator",
    "netCostCode",
    "netCostDateRange",
    "preferenceCriteria",
    "producerInfo",
    "marksAndNumbers",
    "numberOfPackagesPerCommodity",
    "productWeight",
    "vehicleID",
    "scheduleB",
    "exportType",
    "sedTotalValue",
    "excludeFromForm",
    "productCurrencyCode",
    "packingListInfo",
    "eeiInformation"
})
public class ProductType {

    @XmlElement(name = "Description", required = true)
    protected List<String> description;
    @XmlElement(name = "Unit")
    protected UnitType unit;
    @XmlElement(name = "CommodityCode")
    protected String commodityCode;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "OriginCountryCode")
    protected String originCountryCode;
    @XmlElement(name = "JointProductionIndicator")
    protected String jointProductionIndicator;
    @XmlElement(name = "NetCostCode")
    protected String netCostCode;
    @XmlElement(name = "NetCostDateRange")
    protected NetCostDateType netCostDateRange;
    @XmlElement(name = "PreferenceCriteria")
    protected String preferenceCriteria;
    @XmlElement(name = "ProducerInfo")
    protected String producerInfo;
    @XmlElement(name = "MarksAndNumbers")
    protected String marksAndNumbers;
    @XmlElement(name = "NumberOfPackagesPerCommodity")
    protected String numberOfPackagesPerCommodity;
    @XmlElement(name = "ProductWeight")
    protected ProductWeightType productWeight;
    @XmlElement(name = "VehicleID")
    protected String vehicleID;
    @XmlElement(name = "ScheduleB")
    protected ScheduleBType scheduleB;
    @XmlElement(name = "ExportType")
    protected String exportType;
    @XmlElement(name = "SEDTotalValue")
    protected String sedTotalValue;
    @XmlElement(name = "ExcludeFromForm")
    protected ExcludeFromFormType excludeFromForm;
    @XmlElement(name = "ProductCurrencyCode")
    protected String productCurrencyCode;
    @XmlElement(name = "PackingListInfo")
    protected PackingListInfoType packingListInfo;
    @XmlElement(name = "EEIInformation")
    protected EEIInformationType eeiInformation;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnit(UnitType value) {
        this.unit = value;
    }

    /**
     * Gets the value of the commodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the originCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * Sets the value of the originCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * Gets the value of the jointProductionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointProductionIndicator() {
        return jointProductionIndicator;
    }

    /**
     * Sets the value of the jointProductionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointProductionIndicator(String value) {
        this.jointProductionIndicator = value;
    }

    /**
     * Gets the value of the netCostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetCostCode() {
        return netCostCode;
    }

    /**
     * Sets the value of the netCostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetCostCode(String value) {
        this.netCostCode = value;
    }

    /**
     * Gets the value of the netCostDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link NetCostDateType }
     *     
     */
    public NetCostDateType getNetCostDateRange() {
        return netCostDateRange;
    }

    /**
     * Sets the value of the netCostDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetCostDateType }
     *     
     */
    public void setNetCostDateRange(NetCostDateType value) {
        this.netCostDateRange = value;
    }

    /**
     * Gets the value of the preferenceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceCriteria() {
        return preferenceCriteria;
    }

    /**
     * Sets the value of the preferenceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceCriteria(String value) {
        this.preferenceCriteria = value;
    }

    /**
     * Gets the value of the producerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerInfo() {
        return producerInfo;
    }

    /**
     * Sets the value of the producerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerInfo(String value) {
        this.producerInfo = value;
    }

    /**
     * Gets the value of the marksAndNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarksAndNumbers() {
        return marksAndNumbers;
    }

    /**
     * Sets the value of the marksAndNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarksAndNumbers(String value) {
        this.marksAndNumbers = value;
    }

    /**
     * Gets the value of the numberOfPackagesPerCommodity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPackagesPerCommodity() {
        return numberOfPackagesPerCommodity;
    }

    /**
     * Sets the value of the numberOfPackagesPerCommodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPackagesPerCommodity(String value) {
        this.numberOfPackagesPerCommodity = value;
    }

    /**
     * Gets the value of the productWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ProductWeightType }
     *     
     */
    public ProductWeightType getProductWeight() {
        return productWeight;
    }

    /**
     * Sets the value of the productWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductWeightType }
     *     
     */
    public void setProductWeight(ProductWeightType value) {
        this.productWeight = value;
    }

    /**
     * Gets the value of the vehicleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleID(String value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the scheduleB property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBType }
     *     
     */
    public ScheduleBType getScheduleB() {
        return scheduleB;
    }

    /**
     * Sets the value of the scheduleB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBType }
     *     
     */
    public void setScheduleB(ScheduleBType value) {
        this.scheduleB = value;
    }

    /**
     * Gets the value of the exportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportType() {
        return exportType;
    }

    /**
     * Sets the value of the exportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportType(String value) {
        this.exportType = value;
    }

    /**
     * Gets the value of the sedTotalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDTotalValue() {
        return sedTotalValue;
    }

    /**
     * Sets the value of the sedTotalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDTotalValue(String value) {
        this.sedTotalValue = value;
    }

    /**
     * Gets the value of the excludeFromForm property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludeFromFormType }
     *     
     */
    public ExcludeFromFormType getExcludeFromForm() {
        return excludeFromForm;
    }

    /**
     * Sets the value of the excludeFromForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludeFromFormType }
     *     
     */
    public void setExcludeFromForm(ExcludeFromFormType value) {
        this.excludeFromForm = value;
    }

    /**
     * Gets the value of the productCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCurrencyCode() {
        return productCurrencyCode;
    }

    /**
     * Sets the value of the productCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCurrencyCode(String value) {
        this.productCurrencyCode = value;
    }

    /**
     * Gets the value of the packingListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PackingListInfoType }
     *     
     */
    public PackingListInfoType getPackingListInfo() {
        return packingListInfo;
    }

    /**
     * Sets the value of the packingListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingListInfoType }
     *     
     */
    public void setPackingListInfo(PackingListInfoType value) {
        this.packingListInfo = value;
    }

    /**
     * Gets the value of the eeiInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EEIInformationType }
     *     
     */
    public EEIInformationType getEEIInformation() {
        return eeiInformation;
    }

    /**
     * Sets the value of the eeiInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEIInformationType }
     *     
     */
    public void setEEIInformation(EEIInformationType value) {
        this.eeiInformation = value;
    }

}
