
package com.fedex.ws.track.v19;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Options available for a tracking notification recipient.
 * 
 * <p>Java class for TrackNotificationRecipientDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackNotificationRecipientDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationEventsAvailable" type="{http://fedex.com/ws/track/v19}NotificationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackNotificationRecipientDetail", propOrder = {
    "notificationEventsAvailable"
})
public class TrackNotificationRecipientDetail {

    @XmlElement(name = "NotificationEventsAvailable")
    @XmlSchemaType(name = "string")
    protected List<NotificationEventType> notificationEventsAvailable;

    /**
     * Gets the value of the notificationEventsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notificationEventsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationEventsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationEventType }
     * 
     * 
     */
    public List<NotificationEventType> getNotificationEventsAvailable() {
        if (notificationEventsAvailable == null) {
            notificationEventsAvailable = new ArrayList<NotificationEventType>();
        }
        return this.notificationEventsAvailable;
    }

}
