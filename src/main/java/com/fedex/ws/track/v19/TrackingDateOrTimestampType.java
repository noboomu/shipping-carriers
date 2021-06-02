
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDateOrTimestampType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingDateOrTimestampType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTUAL_DELIVERY"/&gt;
 *     &lt;enumeration value="ACTUAL_PICKUP"/&gt;
 *     &lt;enumeration value="ACTUAL_TENDER"/&gt;
 *     &lt;enumeration value="ANTICIPATED_TENDER"/&gt;
 *     &lt;enumeration value="APPOINTMENT_DELIVERY"/&gt;
 *     &lt;enumeration value="ESTIMATED_DELIVERY"/&gt;
 *     &lt;enumeration value="ESTIMATED_PICKUP"/&gt;
 *     &lt;enumeration value="ESTIMATED_RETURN_TO_STATION"/&gt;
 *     &lt;enumeration value="SHIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingDateOrTimestampType")
@XmlEnum
public enum TrackingDateOrTimestampType {

    ACTUAL_DELIVERY,
    ACTUAL_PICKUP,
    ACTUAL_TENDER,
    ANTICIPATED_TENDER,
    APPOINTMENT_DELIVERY,
    ESTIMATED_DELIVERY,
    ESTIMATED_PICKUP,
    ESTIMATED_RETURN_TO_STATION,
    SHIP;

    public String value() {
        return name();
    }

    public static TrackingDateOrTimestampType fromValue(String v) {
        return valueOf(v);
    }

}
