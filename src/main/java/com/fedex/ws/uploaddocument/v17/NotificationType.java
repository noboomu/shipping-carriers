
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NotificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="SMS_TEXT_MESSAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationType")
@XmlEnum
public enum NotificationType {

    EMAIL,
    FAX,
    SMS_TEXT_MESSAGE;

    public String value() {
        return name();
    }

    public static NotificationType fromValue(String v) {
        return valueOf(v);
    }

}
