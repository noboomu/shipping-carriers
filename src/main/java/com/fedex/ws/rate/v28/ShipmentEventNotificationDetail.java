
package com.fedex.ws.rate.v28;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentEventNotificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentEventNotificationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AggregationType" type="{http://fedex.com/ws/rate/v28}ShipmentNotificationAggregationType" minOccurs="0"/&gt;
 *         &lt;element name="PersonalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventNotifications" type="{http://fedex.com/ws/rate/v28}ShipmentEventNotificationSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentEventNotificationDetail", propOrder = {
    "aggregationType",
    "personalMessage",
    "eventNotifications"
})
public class ShipmentEventNotificationDetail {

    @XmlElement(name = "AggregationType")
    @XmlSchemaType(name = "string")
    protected ShipmentNotificationAggregationType aggregationType;
    @XmlElement(name = "PersonalMessage")
    protected String personalMessage;
    @XmlElement(name = "EventNotifications")
    protected List<ShipmentEventNotificationSpecification> eventNotifications;

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotificationAggregationType }
     *     
     */
    public ShipmentNotificationAggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotificationAggregationType }
     *     
     */
    public void setAggregationType(ShipmentNotificationAggregationType value) {
        this.aggregationType = value;
    }

    /**
     * Gets the value of the personalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMessage() {
        return personalMessage;
    }

    /**
     * Sets the value of the personalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMessage(String value) {
        this.personalMessage = value;
    }

    /**
     * Gets the value of the eventNotifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eventNotifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentEventNotificationSpecification }
     * 
     * 
     */
    public List<ShipmentEventNotificationSpecification> getEventNotifications() {
        if (eventNotifications == null) {
            eventNotifications = new ArrayList<ShipmentEventNotificationSpecification>();
        }
        return this.eventNotifications;
    }

}
