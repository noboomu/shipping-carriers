
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PickupRequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FUTURE_DAY"/&gt;
 *     &lt;enumeration value="SAME_DAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PickupRequestType")
@XmlEnum
public enum PickupRequestType {

    FUTURE_DAY,
    SAME_DAY;

    public String value() {
        return name();
    }

    public static PickupRequestType fromValue(String v) {
        return valueOf(v);
    }

}
