
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentNotificationAggregationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentNotificationAggregationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PER_PACKAGE"/&gt;
 *     &lt;enumeration value="PER_SHIPMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentNotificationAggregationType")
@XmlEnum
public enum ShipmentNotificationAggregationType {

    PER_PACKAGE,
    PER_SHIPMENT;

    public String value() {
        return name();
    }

    public static ShipmentNotificationAggregationType fromValue(String v) {
        return valueOf(v);
    }

}
