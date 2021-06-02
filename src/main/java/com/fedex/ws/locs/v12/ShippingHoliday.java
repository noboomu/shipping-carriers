
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingHoliday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingHoliday"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Holiday" type="{http://fedex.com/ws/locs/v12}Holiday" minOccurs="0"/&gt;
 *         &lt;element name="UnavailableActions" type="{http://fedex.com/ws/locs/v12}ShippingActionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingHoliday", propOrder = {
    "holiday",
    "unavailableActions"
})
public class ShippingHoliday {

    @XmlElement(name = "Holiday")
    protected Holiday holiday;
    @XmlElement(name = "UnavailableActions")
    @XmlSchemaType(name = "string")
    protected List<ShippingActionType> unavailableActions;

    /**
     * Gets the value of the holiday property.
     * 
     * @return
     *     possible object is
     *     {@link Holiday }
     *     
     */
    public Holiday getHoliday() {
        return holiday;
    }

    /**
     * Sets the value of the holiday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Holiday }
     *     
     */
    public void setHoliday(Holiday value) {
        this.holiday = value;
    }

    /**
     * Gets the value of the unavailableActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unavailableActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnavailableActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingActionType }
     * 
     * 
     */
    public List<ShippingActionType> getUnavailableActions() {
        if (unavailableActions == null) {
            unavailableActions = new ArrayList<ShippingActionType>();
        }
        return this.unavailableActions;
    }

}
