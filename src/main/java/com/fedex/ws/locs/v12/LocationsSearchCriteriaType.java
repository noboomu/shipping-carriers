
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationsSearchCriteriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationsSearchCriteriaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDRESS"/&gt;
 *     &lt;enumeration value="GEOGRAPHIC_COORDINATES"/&gt;
 *     &lt;enumeration value="PHONE_NUMBER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationsSearchCriteriaType")
@XmlEnum
public enum LocationsSearchCriteriaType {

    ADDRESS,
    GEOGRAPHIC_COORDINATES,
    PHONE_NUMBER;

    public String value() {
        return name();
    }

    public static LocationsSearchCriteriaType fromValue(String v) {
        return valueOf(v);
    }

}
