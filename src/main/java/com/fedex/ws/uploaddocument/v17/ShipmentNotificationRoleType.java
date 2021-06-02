
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentNotificationRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentNotificationRoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BROKER"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="RECIPIENT"/&gt;
 *     &lt;enumeration value="SHIPPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentNotificationRoleType")
@XmlEnum
public enum ShipmentNotificationRoleType {

    BROKER,
    OTHER,
    RECIPIENT,
    SHIPPER;

    public String value() {
        return name();
    }

    public static ShipmentNotificationRoleType fromValue(String v) {
        return valueOf(v);
    }

}
