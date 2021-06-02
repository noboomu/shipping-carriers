
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DistanceUnits"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="MI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistanceUnits")
@XmlEnum
public enum DistanceUnits {

    KM,
    MI;

    public String value() {
        return name();
    }

    public static DistanceUnits fromValue(String v) {
        return valueOf(v);
    }

}
