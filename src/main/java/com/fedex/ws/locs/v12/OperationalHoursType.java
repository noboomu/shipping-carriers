
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalHoursType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperationalHoursType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLOSED_ALL_DAY"/&gt;
 *     &lt;enumeration value="OPEN_ALL_DAY"/&gt;
 *     &lt;enumeration value="OPEN_BY_HOURS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationalHoursType")
@XmlEnum
public enum OperationalHoursType {

    CLOSED_ALL_DAY,
    OPEN_ALL_DAY,
    OPEN_BY_HOURS;

    public String value() {
        return name();
    }

    public static OperationalHoursType fromValue(String v) {
        return valueOf(v);
    }

}
