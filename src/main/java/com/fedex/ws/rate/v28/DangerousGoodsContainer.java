
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
 * Describes an approved container used to package dangerous goods commodities. This does not describe any individual inner receptacles that may be within this container.
 * 
 * <p>Java class for DangerousGoodsContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackingType" type="{http://fedex.com/ws/rate/v28}HazardousContainerPackingType" minOccurs="0"/&gt;
 *         &lt;element name="ContainerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioactiveContainerClass" type="{http://fedex.com/ws/rate/v28}RadioactiveContainerClassType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfContainers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="HazardousCommodities" type="{http://fedex.com/ws/rate/v28}HazardousCommodityContent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsContainer", propOrder = {
    "packingType",
    "containerType",
    "radioactiveContainerClass",
    "numberOfContainers",
    "hazardousCommodities"
})
public class DangerousGoodsContainer {

    @XmlElement(name = "PackingType")
    @XmlSchemaType(name = "string")
    protected HazardousContainerPackingType packingType;
    @XmlElement(name = "ContainerType")
    protected String containerType;
    @XmlElement(name = "RadioactiveContainerClass")
    @XmlSchemaType(name = "string")
    protected RadioactiveContainerClassType radioactiveContainerClass;
    @XmlElement(name = "NumberOfContainers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfContainers;
    @XmlElement(name = "HazardousCommodities")
    protected List<HazardousCommodityContent> hazardousCommodities;

    /**
     * Gets the value of the packingType property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousContainerPackingType }
     *     
     */
    public HazardousContainerPackingType getPackingType() {
        return packingType;
    }

    /**
     * Sets the value of the packingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousContainerPackingType }
     *     
     */
    public void setPackingType(HazardousContainerPackingType value) {
        this.packingType = value;
    }

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(String value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the radioactiveContainerClass property.
     * 
     * @return
     *     possible object is
     *     {@link RadioactiveContainerClassType }
     *     
     */
    public RadioactiveContainerClassType getRadioactiveContainerClass() {
        return radioactiveContainerClass;
    }

    /**
     * Sets the value of the radioactiveContainerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactiveContainerClassType }
     *     
     */
    public void setRadioactiveContainerClass(RadioactiveContainerClassType value) {
        this.radioactiveContainerClass = value;
    }

    /**
     * Gets the value of the numberOfContainers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfContainers() {
        return numberOfContainers;
    }

    /**
     * Sets the value of the numberOfContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfContainers(BigInteger value) {
        this.numberOfContainers = value;
    }

    /**
     * Gets the value of the hazardousCommodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousCommodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousCommodityContent }
     * 
     * 
     */
    public List<HazardousCommodityContent> getHazardousCommodities() {
        if (hazardousCommodities == null) {
            hazardousCommodities = new ArrayList<HazardousCommodityContent>();
        }
        return this.hazardousCommodities;
    }

}
