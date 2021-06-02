
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAccessibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationAccessibilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSIDE"/&gt;
 *     &lt;enumeration value="OUTSIDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationAccessibilityType")
@XmlEnum
public enum LocationAccessibilityType {

    INSIDE,
    OUTSIDE;

    public String value() {
        return name();
    }

    public static LocationAccessibilityType fromValue(String v) {
        return valueOf(v);
    }

}
