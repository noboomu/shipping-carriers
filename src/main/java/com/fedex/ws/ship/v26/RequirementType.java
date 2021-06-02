
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequirementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequirementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPTIONAL"/&gt;
 *     &lt;enumeration value="PROHIBITED"/&gt;
 *     &lt;enumeration value="REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequirementType")
@XmlEnum
public enum RequirementType {

    OPTIONAL,
    PROHIBITED,
    REQUIRED;

    public String value() {
        return name();
    }

    public static RequirementType fromValue(String v) {
        return valueOf(v);
    }

}
