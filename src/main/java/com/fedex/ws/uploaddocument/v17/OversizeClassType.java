
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OversizeClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OversizeClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OVERSIZE_1"/&gt;
 *     &lt;enumeration value="OVERSIZE_2"/&gt;
 *     &lt;enumeration value="OVERSIZE_3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OversizeClassType")
@XmlEnum
public enum OversizeClassType {

    OVERSIZE_1,
    OVERSIZE_2,
    OVERSIZE_3;

    public String value() {
        return name();
    }

    public static OversizeClassType fromValue(String v) {
        return valueOf(v);
    }

}
