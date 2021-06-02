
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentDelayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommitmentDelayType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOLIDAY"/&gt;
 *     &lt;enumeration value="NON_WORKDAY"/&gt;
 *     &lt;enumeration value="NO_CITY_DELIVERY"/&gt;
 *     &lt;enumeration value="NO_HOLD_AT_LOCATION"/&gt;
 *     &lt;enumeration value="NO_LOCATION_DELIVERY"/&gt;
 *     &lt;enumeration value="NO_SERVICE_AREA_DELIVERY"/&gt;
 *     &lt;enumeration value="NO_SERVICE_AREA_SPECIAL_SERVICE_DELIVERY"/&gt;
 *     &lt;enumeration value="NO_SPECIAL_SERVICE_DELIVERY"/&gt;
 *     &lt;enumeration value="NO_ZIP_DELIVERY"/&gt;
 *     &lt;enumeration value="WEEKEND"/&gt;
 *     &lt;enumeration value="WEEKEND_SPECIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommitmentDelayType")
@XmlEnum
public enum CommitmentDelayType {

    HOLIDAY,
    NON_WORKDAY,
    NO_CITY_DELIVERY,
    NO_HOLD_AT_LOCATION,
    NO_LOCATION_DELIVERY,
    NO_SERVICE_AREA_DELIVERY,
    NO_SERVICE_AREA_SPECIAL_SERVICE_DELIVERY,
    NO_SPECIAL_SERVICE_DELIVERY,
    NO_ZIP_DELIVERY,
    WEEKEND,
    WEEKEND_SPECIAL;

    public String value() {
        return name();
    }

    public static CommitmentDelayType fromValue(String v) {
        return valueOf(v);
    }

}
