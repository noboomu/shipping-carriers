
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the criterion and order to be used to sort the location details.
 * 
 * <p>Java class for LocationSortDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSortDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criterion" type="{http://fedex.com/ws/locs/v12}LocationSortCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://fedex.com/ws/locs/v12}LocationSortOrderType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSortDetail", propOrder = {
    "criterion",
    "order"
})
public class LocationSortDetail {

    @XmlElement(name = "Criterion")
    @XmlSchemaType(name = "string")
    protected LocationSortCriteriaType criterion;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "string")
    protected LocationSortOrderType order;

    /**
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSortCriteriaType }
     *     
     */
    public LocationSortCriteriaType getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSortCriteriaType }
     *     
     */
    public void setCriterion(LocationSortCriteriaType value) {
        this.criterion = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSortOrderType }
     *     
     */
    public LocationSortOrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSortOrderType }
     *     
     */
    public void setOrder(LocationSortOrderType value) {
        this.order = value;
    }

}
