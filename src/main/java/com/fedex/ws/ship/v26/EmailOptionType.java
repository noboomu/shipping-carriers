
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EmailOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUPPRESS_ACCESS_EMAILS"/&gt;
 *     &lt;enumeration value="SUPPRESS_ADDITIONAL_LANGUAGES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailOptionType")
@XmlEnum
public enum EmailOptionType {

    SUPPRESS_ACCESS_EMAILS,
    SUPPRESS_ADDITIONAL_LANGUAGES;

    public String value() {
        return name();
    }

    public static EmailOptionType fromValue(String v) {
        return valueOf(v);
    }

}
