
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentEventNotificationSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentEventNotificationSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{http://fedex.com/ws/openship/v18}ShipmentNotificationRoleType" minOccurs="0"/&gt;
 *         &lt;element name="Events" type="{http://fedex.com/ws/openship/v18}NotificationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NotificationDetail" type="{http://fedex.com/ws/openship/v18}NotificationDetail" minOccurs="0"/&gt;
 *         &lt;element name="FormatSpecification" type="{http://fedex.com/ws/openship/v18}ShipmentNotificationFormatSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentEventNotificationSpecification", propOrder = {
    "role",
    "events",
    "notificationDetail",
    "formatSpecification"
})
public class ShipmentEventNotificationSpecification {

    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected ShipmentNotificationRoleType role;
    @XmlElement(name = "Events")
    @XmlSchemaType(name = "string")
    protected List<NotificationEventType> events;
    @XmlElement(name = "NotificationDetail")
    protected NotificationDetail notificationDetail;
    @XmlElement(name = "FormatSpecification")
    protected ShipmentNotificationFormatSpecification formatSpecification;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotificationRoleType }
     *     
     */
    public ShipmentNotificationRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotificationRoleType }
     *     
     */
    public void setRole(ShipmentNotificationRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationEventType }
     * 
     * 
     */
    public List<NotificationEventType> getEvents() {
        if (events == null) {
            events = new ArrayList<NotificationEventType>();
        }
        return this.events;
    }

    /**
     * Gets the value of the notificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationDetail }
     *     
     */
    public NotificationDetail getNotificationDetail() {
        return notificationDetail;
    }

    /**
     * Sets the value of the notificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationDetail }
     *     
     */
    public void setNotificationDetail(NotificationDetail value) {
        this.notificationDetail = value;
    }

    /**
     * Gets the value of the formatSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotificationFormatSpecification }
     *     
     */
    public ShipmentNotificationFormatSpecification getFormatSpecification() {
        return formatSpecification;
    }

    /**
     * Sets the value of the formatSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotificationFormatSpecification }
     *     
     */
    public void setFormatSpecification(ShipmentNotificationFormatSpecification value) {
        this.formatSpecification = value;
    }

}
