
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationContentOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationContentOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOLIDAYS"/&gt;
 *     &lt;enumeration value="LOCATION_DROPOFF_TIMES"/&gt;
 *     &lt;enumeration value="MAP_URL"/&gt;
 *     &lt;enumeration value="TIMEZONE_OFFSET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationContentOptionType")
@XmlEnum
public enum LocationContentOptionType {

    HOLIDAYS,
    LOCATION_DROPOFF_TIMES,
    MAP_URL,
    TIMEZONE_OFFSET;

    public String value() {
        return name();
    }

    public static LocationContentOptionType fromValue(String v) {
        return valueOf(v);
    }

}
