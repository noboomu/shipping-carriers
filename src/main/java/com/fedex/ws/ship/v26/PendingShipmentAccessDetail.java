
package com.fedex.ws.ship.v26;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This information describes how and when a pending shipment may be accessed for completion.
 * 
 * <p>Java class for PendingShipmentAccessDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingShipmentAccessDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessorDetails" type="{http://fedex.com/ws/ship/v26}PendingShipmentAccessorDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingShipmentAccessDetail", propOrder = {
    "accessorDetails"
})
public class PendingShipmentAccessDetail {

    @XmlElement(name = "AccessorDetails")
    protected List<PendingShipmentAccessorDetail> accessorDetails;

    /**
     * Gets the value of the accessorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingShipmentAccessorDetail }
     * 
     * 
     */
    public List<PendingShipmentAccessorDetail> getAccessorDetails() {
        if (accessorDetails == null) {
            accessorDetails = new ArrayList<PendingShipmentAccessorDetail>();
        }
        return this.accessorDetails;
    }

}
