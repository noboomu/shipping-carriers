
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackChargeDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackChargeDetailType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORIGINAL_CHARGES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackChargeDetailType")
@XmlEnum
public enum TrackChargeDetailType {

    ORIGINAL_CHARGES;

    public String value() {
        return name();
    }

    public static TrackChargeDetailType fromValue(String v) {
        return valueOf(v);
    }

}
