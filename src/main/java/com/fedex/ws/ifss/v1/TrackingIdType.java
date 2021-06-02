
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingIdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXPRESS"/&gt;
 *     &lt;enumeration value="FEDEX"/&gt;
 *     &lt;enumeration value="FREIGHT"/&gt;
 *     &lt;enumeration value="GROUND"/&gt;
 *     &lt;enumeration value="INTERNAL"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="USPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingIdType")
@XmlEnum
public enum TrackingIdType {

    EXPRESS,
    FEDEX,
    FREIGHT,
    GROUND,
    INTERNAL,
    UNKNOWN,
    USPS;

    public String value() {
        return name();
    }

    public static TrackingIdType fromValue(String v) {
        return valueOf(v);
    }

}
