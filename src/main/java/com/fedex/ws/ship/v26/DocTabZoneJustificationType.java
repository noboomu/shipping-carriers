
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocTabZoneJustificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocTabZoneJustificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEFT"/&gt;
 *     &lt;enumeration value="RIGHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocTabZoneJustificationType")
@XmlEnum
public enum DocTabZoneJustificationType {

    LEFT,
    RIGHT;

    public String value() {
        return name();
    }

    public static DocTabZoneJustificationType fromValue(String v) {
        return valueOf(v);
    }

}
