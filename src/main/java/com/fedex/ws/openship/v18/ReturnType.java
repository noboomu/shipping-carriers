
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_TAG"/&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="PRINT_RETURN_LABEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnType")
@XmlEnum
public enum ReturnType {

    FEDEX_TAG,
    PENDING,
    PRINT_RETURN_LABEL;

    public String value() {
        return name();
    }

    public static ReturnType fromValue(String v) {
        return valueOf(v);
    }

}
