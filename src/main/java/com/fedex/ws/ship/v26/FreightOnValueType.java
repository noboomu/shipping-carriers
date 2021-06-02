
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightOnValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightOnValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARRIER_RISK"/&gt;
 *     &lt;enumeration value="OWN_RISK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightOnValueType")
@XmlEnum
public enum FreightOnValueType {

    CARRIER_RISK,
    OWN_RISK;

    public String value() {
        return name();
    }

    public static FreightOnValueType fromValue(String v) {
        return valueOf(v);
    }

}
