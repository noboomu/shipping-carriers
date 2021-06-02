
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalFormType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhysicalFormType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GAS"/&gt;
 *     &lt;enumeration value="LIQUID"/&gt;
 *     &lt;enumeration value="SOLID"/&gt;
 *     &lt;enumeration value="SPECIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalFormType")
@XmlEnum
public enum PhysicalFormType {

    GAS,
    LIQUID,
    SOLID,
    SPECIAL;

    public String value() {
        return name();
    }

    public static PhysicalFormType fromValue(String v) {
        return valueOf(v);
    }

}
