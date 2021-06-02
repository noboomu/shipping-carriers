
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentFormatOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentFormatOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUPPRESS_ADDITIONAL_LANGUAGES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentFormatOptionType")
@XmlEnum
public enum DocumentFormatOptionType {

    SUPPRESS_ADDITIONAL_LANGUAGES;

    public String value() {
        return name();
    }

    public static DocumentFormatOptionType fromValue(String v) {
        return valueOf(v);
    }

}
