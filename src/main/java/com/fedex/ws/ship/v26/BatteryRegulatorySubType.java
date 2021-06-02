
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatteryRegulatorySubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BatteryRegulatorySubType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IATA_SECTION_II"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BatteryRegulatorySubType")
@XmlEnum
public enum BatteryRegulatorySubType {

    IATA_SECTION_II;

    public String value() {
        return name();
    }

    public static BatteryRegulatorySubType fromValue(String v) {
        return valueOf(v);
    }

}
