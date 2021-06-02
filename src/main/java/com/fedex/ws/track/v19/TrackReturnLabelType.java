
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackReturnLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackReturnLabelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="PRINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackReturnLabelType")
@XmlEnum
public enum TrackReturnLabelType {

    EMAIL,
    PRINT;

    public String value() {
        return name();
    }

    public static TrackReturnLabelType fromValue(String v) {
        return valueOf(v);
    }

}
