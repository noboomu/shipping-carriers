
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomDeliveryWindowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomDeliveryWindowType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFTER"/&gt;
 *     &lt;enumeration value="BEFORE"/&gt;
 *     &lt;enumeration value="BETWEEN"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomDeliveryWindowType")
@XmlEnum
public enum CustomDeliveryWindowType {

    AFTER,
    BEFORE,
    BETWEEN,
    ON;

    public String value() {
        return name();
    }

    public static CustomDeliveryWindowType fromValue(String v) {
        return valueOf(v);
    }

}
