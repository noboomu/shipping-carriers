
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackRequestProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackRequestProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCLUDE_DETAILED_SCANS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackRequestProcessingOptionType")
@XmlEnum
public enum TrackRequestProcessingOptionType {

    INCLUDE_DETAILED_SCANS;

    public String value() {
        return name();
    }

    public static TrackRequestProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
