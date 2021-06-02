
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumeUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VolumeUnits"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUBIC_FT"/&gt;
 *     &lt;enumeration value="CUBIC_M"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VolumeUnits")
@XmlEnum
public enum VolumeUnits {

    CUBIC_FT,
    CUBIC_M;

    public String value() {
        return name();
    }

    public static VolumeUnits fromValue(String v) {
        return valueOf(v);
    }

}
