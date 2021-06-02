
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DamageStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DamageStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAMAGE_KNOWN"/&gt;
 *     &lt;enumeration value="NO_KNOWN_DAMAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DamageStatusType")
@XmlEnum
public enum DamageStatusType {

    DAMAGE_KNOWN,
    NO_KNOWN_DAMAGE;

    public String value() {
        return name();
    }

    public static DamageStatusType fromValue(String v) {
        return valueOf(v);
    }

}
