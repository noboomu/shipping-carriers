
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NotificationEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ON_DELIVERY"/&gt;
 *     &lt;enumeration value="ON_ESTIMATED_DELIVERY"/&gt;
 *     &lt;enumeration value="ON_EXCEPTION"/&gt;
 *     &lt;enumeration value="ON_PICKUP_DRIVER_ARRIVED"/&gt;
 *     &lt;enumeration value="ON_PICKUP_DRIVER_ASSIGNED"/&gt;
 *     &lt;enumeration value="ON_PICKUP_DRIVER_DEPARTED"/&gt;
 *     &lt;enumeration value="ON_PICKUP_DRIVER_EN_ROUTE"/&gt;
 *     &lt;enumeration value="ON_SHIPMENT"/&gt;
 *     &lt;enumeration value="ON_TENDER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationEventType")
@XmlEnum
public enum NotificationEventType {

    ON_DELIVERY,
    ON_ESTIMATED_DELIVERY,
    ON_EXCEPTION,
    ON_PICKUP_DRIVER_ARRIVED,
    ON_PICKUP_DRIVER_ASSIGNED,
    ON_PICKUP_DRIVER_DEPARTED,
    ON_PICKUP_DRIVER_EN_ROUTE,
    ON_SHIPMENT,
    ON_TENDER;

    public String value() {
        return name();
    }

    public static NotificationEventType fromValue(String v) {
        return valueOf(v);
    }

}
