
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RebateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RebateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BONUS"/&gt;
 *     &lt;enumeration value="EARNED"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RebateType")
@XmlEnum
public enum RebateType {

    BONUS,
    EARNED,
    OTHER;

    public String value() {
        return name();
    }

    public static RebateType fromValue(String v) {
        return valueOf(v);
    }

}
