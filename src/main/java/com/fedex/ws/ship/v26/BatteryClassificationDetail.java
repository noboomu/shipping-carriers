
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes attributes of a battery or cell that are used for classification purposes. Typically this structure would be used to allow customers to declare batteries or cells for which full dangerous goods documentation and procedures are not required.
 * 
 * <p>Java class for BatteryClassificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatteryClassificationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Material" type="{http://fedex.com/ws/ship/v26}BatteryMaterialType" minOccurs="0"/&gt;
 *         &lt;element name="Packing" type="{http://fedex.com/ws/ship/v26}BatteryPackingType" minOccurs="0"/&gt;
 *         &lt;element name="RegulatorySubType" type="{http://fedex.com/ws/ship/v26}BatteryRegulatorySubType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatteryClassificationDetail", propOrder = {
    "material",
    "packing",
    "regulatorySubType"
})
public class BatteryClassificationDetail {

    @XmlElement(name = "Material")
    @XmlSchemaType(name = "string")
    protected BatteryMaterialType material;
    @XmlElement(name = "Packing")
    @XmlSchemaType(name = "string")
    protected BatteryPackingType packing;
    @XmlElement(name = "RegulatorySubType")
    @XmlSchemaType(name = "string")
    protected BatteryRegulatorySubType regulatorySubType;

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link BatteryMaterialType }
     *     
     */
    public BatteryMaterialType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryMaterialType }
     *     
     */
    public void setMaterial(BatteryMaterialType value) {
        this.material = value;
    }

    /**
     * Gets the value of the packing property.
     * 
     * @return
     *     possible object is
     *     {@link BatteryPackingType }
     *     
     */
    public BatteryPackingType getPacking() {
        return packing;
    }

    /**
     * Sets the value of the packing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPackingType }
     *     
     */
    public void setPacking(BatteryPackingType value) {
        this.packing = value;
    }

    /**
     * Gets the value of the regulatorySubType property.
     * 
     * @return
     *     possible object is
     *     {@link BatteryRegulatorySubType }
     *     
     */
    public BatteryRegulatorySubType getRegulatorySubType() {
        return regulatorySubType;
    }

    /**
     * Sets the value of the regulatorySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryRegulatorySubType }
     *     
     */
    public void setRegulatorySubType(BatteryRegulatorySubType value) {
        this.regulatorySubType = value;
    }

}
