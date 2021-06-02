
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationAttributesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReservationAttributesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESERVATION_AVAILABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationAttributesType")
@XmlEnum
public enum ReservationAttributesType {

    RESERVATION_AVAILABLE;

    public String value() {
        return name();
    }

    public static ReservationAttributesType fromValue(String v) {
        return valueOf(v);
    }

}
