
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlatbedTrailerOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FlatbedTrailerOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OVER_DIMENSION"/&gt;
 *     &lt;enumeration value="TARP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlatbedTrailerOption")
@XmlEnum
public enum FlatbedTrailerOption {

    OVER_DIMENSION,
    TARP;

    public String value() {
        return name();
    }

    public static FlatbedTrailerOption fromValue(String v) {
        return valueOf(v);
    }

}
