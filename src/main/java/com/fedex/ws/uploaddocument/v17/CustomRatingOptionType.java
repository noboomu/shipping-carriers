
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRatingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomRatingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISCOUNT_EXCLUSION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomRatingOptionType")
@XmlEnum
public enum CustomRatingOptionType {

    DISCOUNT_EXCLUSION;

    public String value() {
        return name();
    }

    public static CustomRatingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
