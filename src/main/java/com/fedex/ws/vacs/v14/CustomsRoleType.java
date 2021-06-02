
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomsRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomsRoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXPORTER"/&gt;
 *     &lt;enumeration value="IMPORTER"/&gt;
 *     &lt;enumeration value="LEGAL_AGENT"/&gt;
 *     &lt;enumeration value="PRODUCER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomsRoleType")
@XmlEnum
public enum CustomsRoleType {

    EXPORTER,
    IMPORTER,
    LEGAL_AGENT,
    PRODUCER;

    public String value() {
        return name();
    }

    public static CustomsRoleType fromValue(String v) {
        return valueOf(v);
    }

}
