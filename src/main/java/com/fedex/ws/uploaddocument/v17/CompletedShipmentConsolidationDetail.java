
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Associates a shipment within a consolidation with data about the consolidation.
 * 
 * <p>Java class for CompletedShipmentConsolidationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedShipmentConsolidationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/uploaddocument/v17}ConsolidationType" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://fedex.com/ws/uploaddocument/v17}ConsolidationShipmentRoleType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedTransborderDistributionDetail" type="{http://fedex.com/ws/uploaddocument/v17}CompletedTransborderDistributionDetail" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedTrackingIds" type="{http://fedex.com/ws/uploaddocument/v17}AssociatedTrackingId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedShipmentConsolidationDetail", propOrder = {
    "type",
    "role",
    "completedTransborderDistributionDetail",
    "associatedTrackingIds"
})
public class CompletedShipmentConsolidationDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ConsolidationType type;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected ConsolidationShipmentRoleType role;
    @XmlElement(name = "CompletedTransborderDistributionDetail")
    protected CompletedTransborderDistributionDetail completedTransborderDistributionDetail;
    @XmlElement(name = "AssociatedTrackingIds")
    protected List<AssociatedTrackingId> associatedTrackingIds;

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
     * Gets the value of the completedTransborderDistributionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedTransborderDistributionDetail }
     *     
     */
    public CompletedTransborderDistributionDetail getCompletedTransborderDistributionDetail() {
        return completedTransborderDistributionDetail;
    }

    /**
     * Sets the value of the completedTransborderDistributionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedTransborderDistributionDetail }
     *     
     */
    public void setCompletedTransborderDistributionDetail(CompletedTransborderDistributionDetail value) {
        this.completedTransborderDistributionDetail = value;
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

}
