
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentRuleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXPORT"/&gt;
 *     &lt;enumeration value="GENERAL"/&gt;
 *     &lt;enumeration value="IMPORT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentRuleType")
@XmlEnum
public enum ShipmentRuleType {

    EXPORT,
    GENERAL,
    IMPORT;

    public String value() {
        return name();
    }

    public static ShipmentRuleType fromValue(String v) {
        return valueOf(v);
    }

}
