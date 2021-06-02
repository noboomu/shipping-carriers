
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSortCriteriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationSortCriteriaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISTANCE"/&gt;
 *     &lt;enumeration value="LATEST_EXPRESS_DROPOFF_TIME"/&gt;
 *     &lt;enumeration value="LATEST_GROUND_DROPOFF_TIME"/&gt;
 *     &lt;enumeration value="LOCATION_TYPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationSortCriteriaType")
@XmlEnum
public enum LocationSortCriteriaType {

    DISTANCE,
    LATEST_EXPRESS_DROPOFF_TIME,
    LATEST_GROUND_DROPOFF_TIME,
    LOCATION_TYPE;

    public String value() {
        return name();
    }

    public static LocationSortCriteriaType fromValue(String v) {
        return valueOf(v);
    }

}
