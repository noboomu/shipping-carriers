
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains role and completed shipment data for shipments produced while confirming a consolidation.
 * 
 * <p>Java class for ConsolidationShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidationShipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentRoleType" type="{http://fedex.com/ws/openship/v18}ConsolidationShipmentRoleType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipment" type="{http://fedex.com/ws/openship/v18}RequestedShipment" minOccurs="0"/&gt;
 *         &lt;element name="CompletedShipmentDetail" type="{http://fedex.com/ws/openship/v18}CompletedShipmentDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidationShipment", propOrder = {
    "shipmentRoleType",
    "requestedShipment",
    "completedShipmentDetail"
})
public class ConsolidationShipment {

    @XmlElement(name = "ShipmentRoleType")
    @XmlSchemaType(name = "string")
    protected ConsolidationShipmentRoleType shipmentRoleType;
    @XmlElement(name = "RequestedShipment")
    protected RequestedShipment requestedShipment;
    @XmlElement(name = "CompletedShipmentDetail")
    protected CompletedShipmentDetail completedShipmentDetail;

    /**
     * Gets the value of the shipmentRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationShipmentRoleType }
     *     
     */
    public ConsolidationShipmentRoleType getShipmentRoleType() {
        return shipmentRoleType;
    }

    /**
     * Sets the value of the shipmentRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationShipmentRoleType }
     *     
     */
    public void setShipmentRoleType(ConsolidationShipmentRoleType value) {
        this.shipmentRoleType = value;
    }

    /**
     * Gets the value of the requestedShipment property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedShipment }
     *     
     */
    public RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }

    /**
     * Sets the value of the requestedShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedShipment }
     *     
     */
    public void setRequestedShipment(RequestedShipment value) {
        this.requestedShipment = value;
    }

    /**
     * Gets the value of the completedShipmentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedShipmentDetail }
     *     
     */
    public CompletedShipmentDetail getCompletedShipmentDetail() {
        return completedShipmentDetail;
    }

    /**
     * Sets the value of the completedShipmentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedShipmentDetail }
     *     
     */
    public void setCompletedShipmentDetail(CompletedShipmentDetail value) {
        this.completedShipmentDetail = value;
    }

}
