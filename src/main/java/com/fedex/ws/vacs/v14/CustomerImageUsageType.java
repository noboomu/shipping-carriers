
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerImageUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerImageUsageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LETTER_HEAD"/&gt;
 *     &lt;enumeration value="SIGNATURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerImageUsageType")
@XmlEnum
public enum CustomerImageUsageType {

    LETTER_HEAD,
    SIGNATURE;

    public String value() {
        return name();
    }

    public static CustomerImageUsageType fromValue(String v) {
        return valueOf(v);
    }

}
