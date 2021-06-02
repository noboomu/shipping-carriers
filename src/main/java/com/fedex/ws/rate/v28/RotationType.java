
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RotationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RotationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEFT"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="RIGHT"/&gt;
 *     &lt;enumeration value="UPSIDE_DOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RotationType")
@XmlEnum
public enum RotationType {

    LEFT,
    NONE,
    RIGHT,
    UPSIDE_DOWN;

    public String value() {
        return name();
    }

    public static RotationType fromValue(String v) {
        return valueOf(v);
    }

}
