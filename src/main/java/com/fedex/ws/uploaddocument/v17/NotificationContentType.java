
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NotificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCHEDULE_PICKUP_SUGGESTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationContentType")
@XmlEnum
public enum NotificationContentType {

    SCHEDULE_PICKUP_SUGGESTION;

    public String value() {
        return name();
    }

    public static NotificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
