
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSearchFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationSearchFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXCLUDE_LOCATIONS_OUTSIDE_COUNTRY"/&gt;
 *     &lt;enumeration value="EXCLUDE_LOCATIONS_OUTSIDE_STATE_OR_PROVINCE"/&gt;
 *     &lt;enumeration value="EXCLUDE_UNAVAILABLE_LOCATIONS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationSearchFilterType")
@XmlEnum
public enum LocationSearchFilterType {

    EXCLUDE_LOCATIONS_OUTSIDE_COUNTRY,
    EXCLUDE_LOCATIONS_OUTSIDE_STATE_OR_PROVINCE,
    EXCLUDE_UNAVAILABLE_LOCATIONS;

    public String value() {
        return name();
    }

    public static LocationSearchFilterType fromValue(String v) {
        return valueOf(v);
    }

}
