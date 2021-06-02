
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UnitSystemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENGLISH"/&gt;
 *     &lt;enumeration value="METRIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitSystemType")
@XmlEnum
public enum UnitSystemType {

    ENGLISH,
    METRIC;

    public String value() {
        return name();
    }

    public static UnitSystemType fromValue(String v) {
        return valueOf(v);
    }

}
