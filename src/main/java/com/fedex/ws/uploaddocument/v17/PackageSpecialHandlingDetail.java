
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the condition of a package when it was received at a FedEx location.
 * 
 * <p>Java class for PackageSpecialHandlingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageSpecialHandlingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackedBy" type="{http://fedex.com/ws/uploaddocument/v17}PackagePackedByType" minOccurs="0"/&gt;
 *         &lt;element name="DamageKnown" type="{http://fedex.com/ws/uploaddocument/v17}DamageStatusType" minOccurs="0"/&gt;
 *         &lt;element name="InspectionStatus" type="{http://fedex.com/ws/uploaddocument/v17}InspectionStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageSpecialHandlingDetail", propOrder = {
    "packedBy",
    "damageKnown",
    "inspectionStatus"
})
public class PackageSpecialHandlingDetail {

    @XmlElement(name = "PackedBy")
    @XmlSchemaType(name = "string")
    protected PackagePackedByType packedBy;
    @XmlElement(name = "DamageKnown")
    @XmlSchemaType(name = "string")
    protected DamageStatusType damageKnown;
    @XmlElement(name = "InspectionStatus")
    @XmlSchemaType(name = "string")
    protected InspectionStatusType inspectionStatus;

    /**
     * Gets the value of the packedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PackagePackedByType }
     *     
     */
    public PackagePackedByType getPackedBy() {
        return packedBy;
    }

    /**
     * Sets the value of the packedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePackedByType }
     *     
     */
    public void setPackedBy(PackagePackedByType value) {
        this.packedBy = value;
    }

    /**
     * Gets the value of the damageKnown property.
     * 
     * @return
     *     possible object is
     *     {@link DamageStatusType }
     *     
     */
    public DamageStatusType getDamageKnown() {
        return damageKnown;
    }

    /**
     * Sets the value of the damageKnown property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageStatusType }
     *     
     */
    public void setDamageKnown(DamageStatusType value) {
        this.damageKnown = value;
    }

    /**
     * Gets the value of the inspectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InspectionStatusType }
     *     
     */
    public InspectionStatusType getInspectionStatus() {
        return inspectionStatus;
    }

    /**
     * Sets the value of the inspectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionStatusType }
     *     
     */
    public void setInspectionStatus(InspectionStatusType value) {
        this.inspectionStatus = value;
    }

}
