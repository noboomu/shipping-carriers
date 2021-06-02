
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSortOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationSortOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HIGHEST_TO_LOWEST"/&gt;
 *     &lt;enumeration value="LOWEST_TO_HIGHEST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationSortOrderType")
@XmlEnum
public enum LocationSortOrderType {

    HIGHEST_TO_LOWEST,
    LOWEST_TO_HIGHEST;

    public String value() {
        return name();
    }

    public static LocationSortOrderType fromValue(String v) {
        return valueOf(v);
    }

}
