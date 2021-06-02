
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRatingAppliedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SpecialRatingAppliedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_ONE_RATE"/&gt;
 *     &lt;enumeration value="FIXED_FUEL_SURCHARGE"/&gt;
 *     &lt;enumeration value="IMPORT_PRICING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialRatingAppliedType")
@XmlEnum
public enum SpecialRatingAppliedType {

    FEDEX_ONE_RATE,
    FIXED_FUEL_SURCHARGE,
    IMPORT_PRICING;

    public String value() {
        return name();
    }

    public static SpecialRatingAppliedType fromValue(String v) {
        return valueOf(v);
    }

}
