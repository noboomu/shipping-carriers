
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the characteristics of the containing RequestedShipment that define its participation in a consolidation.
 * 
 * <p>Java class for ShipmentConsolidationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentConsolidationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelationshipTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}ConsolidationType" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://fedex.com/ws/openship/v18}ConsolidationShipmentRoleType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedTrackingIds" type="{http://fedex.com/ws/openship/v18}AssociatedTrackingId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServicesRequested" type="{http://fedex.com/ws/openship/v18}ConsolidationSpecialServicesRequested" minOccurs="0"/&gt;
 *         &lt;element name="InternationalDistributionDetail" type="{http://fedex.com/ws/openship/v18}ShipmentInternationalDistributionDetail" minOccurs="0"/&gt;
 *         &lt;element name="TransborderDistributionDetail" type="{http://fedex.com/ws/openship/v18}ShipmentTransborderDistributionDetail" minOccurs="0"/&gt;
 *         &lt;element name="DistributionLocations" type="{http://fedex.com/ws/openship/v18}RequestedDistributionLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentConsolidationDetail", propOrder = {
    "relationshipTimestamp",
    "type",
    "role",
    "associatedTrackingIds",
    "specialServicesRequested",
    "internationalDistributionDetail",
    "transborderDistributionDetail",
    "distributionLocations"
})
public class ShipmentConsolidationDetail {

    @XmlElement(name = "RelationshipTimestamp")
    protected String relationshipTimestamp;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ConsolidationType type;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected ConsolidationShipmentRoleType role;
    @XmlElement(name = "AssociatedTrackingIds")
    protected List<AssociatedTrackingId> associatedTrackingIds;
    @XmlElement(name = "SpecialServicesRequested")
    protected ConsolidationSpecialServicesRequested specialServicesRequested;
    @XmlElement(name = "InternationalDistributionDetail")
    protected ShipmentInternationalDistributionDetail internationalDistributionDetail;
    @XmlElement(name = "TransborderDistributionDetail")
    protected ShipmentTransborderDistributionDetail transborderDistributionDetail;
    @XmlElement(name = "DistributionLocations")
    protected List<RequestedDistributionLocation> distributionLocations;

    /**
     * Gets the value of the relationshipTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipTimestamp() {
        return relationshipTimestamp;
    }

    /**
     * Sets the value of the relationshipTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipTimestamp(String value) {
        this.relationshipTimestamp = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationType }
     *     
     */
    public ConsolidationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationType }
     *     
     */
    public void setType(ConsolidationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationShipmentRoleType }
     *     
     */
    public ConsolidationShipmentRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationShipmentRoleType }
     *     
     */
    public void setRole(ConsolidationShipmentRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the associatedTrackingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the associatedTrackingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedTrackingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedTrackingId }
     * 
     * 
     */
    public List<AssociatedTrackingId> getAssociatedTrackingIds() {
        if (associatedTrackingIds == null) {
            associatedTrackingIds = new ArrayList<AssociatedTrackingId>();
        }
        return this.associatedTrackingIds;
    }

    /**
     * Gets the value of the specialServicesRequested property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationSpecialServicesRequested }
     *     
     */
    public ConsolidationSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }

    /**
     * Sets the value of the specialServicesRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationSpecialServicesRequested }
     *     
     */
    public void setSpecialServicesRequested(ConsolidationSpecialServicesRequested value) {
        this.specialServicesRequested = value;
    }

    /**
     * Gets the value of the internationalDistributionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInternationalDistributionDetail }
     *     
     */
    public ShipmentInternationalDistributionDetail getInternationalDistributionDetail() {
        return internationalDistributionDetail;
    }

    /**
     * Sets the value of the internationalDistributionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInternationalDistributionDetail }
     *     
     */
    public void setInternationalDistributionDetail(ShipmentInternationalDistributionDetail value) {
        this.internationalDistributionDetail = value;
    }

    /**
     * Gets the value of the transborderDistributionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTransborderDistributionDetail }
     *     
     */
    public ShipmentTransborderDistributionDetail getTransborderDistributionDetail() {
        return transborderDistributionDetail;
    }

    /**
     * Sets the value of the transborderDistributionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTransborderDistributionDetail }
     *     
     */
    public void setTransborderDistributionDetail(ShipmentTransborderDistributionDetail value) {
        this.transborderDistributionDetail = value;
    }

    /**
     * Gets the value of the distributionLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the distributionLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedDistributionLocation }
     * 
     * 
     */
    public List<RequestedDistributionLocation> getDistributionLocations() {
        if (distributionLocations == null) {
            distributionLocations = new ArrayList<RequestedDistributionLocation>();
        }
        return this.distributionLocations;
    }

}
