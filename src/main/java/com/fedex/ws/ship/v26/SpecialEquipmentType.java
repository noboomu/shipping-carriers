
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialEquipmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SpecialEquipmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FORK_LIFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialEquipmentType")
@XmlEnum
public enum SpecialEquipmentType {

    FORK_LIFT;

    public String value() {
        return name();
    }

    public static SpecialEquipmentType fromValue(String v) {
        return valueOf(v);
    }

}
