
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatteryPackingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BatteryPackingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTAINED_IN_EQUIPMENT"/&gt;
 *     &lt;enumeration value="PACKED_WITH_EQUIPMENT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BatteryPackingType")
@XmlEnum
public enum BatteryPackingType {

    CONTAINED_IN_EQUIPMENT,
    PACKED_WITH_EQUIPMENT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BatteryPackingType fromValue(String v) {
        return valueOf(v);
    }

}
