
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NotificationFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationFormatType")
@XmlEnum
public enum NotificationFormatType {

    HTML,
    TEXT;

    public String value() {
        return name();
    }

    public static NotificationFormatType fromValue(String v) {
        return valueOf(v);
    }

}
