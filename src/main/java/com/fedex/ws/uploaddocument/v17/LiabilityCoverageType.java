
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiabilityCoverageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LiabilityCoverageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEW"/&gt;
 *     &lt;enumeration value="USED_OR_RECONDITIONED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LiabilityCoverageType")
@XmlEnum
public enum LiabilityCoverageType {

    NEW,
    USED_OR_RECONDITIONED;

    public String value() {
        return name();
    }

    public static LiabilityCoverageType fromValue(String v) {
        return valueOf(v);
    }

}
