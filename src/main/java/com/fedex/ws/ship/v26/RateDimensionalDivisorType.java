
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateDimensionalDivisorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateDimensionalDivisorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COUNTRY"/&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="PRODUCT"/&gt;
 *     &lt;enumeration value="WAIVED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateDimensionalDivisorType")
@XmlEnum
public enum RateDimensionalDivisorType {

    COUNTRY,
    CUSTOMER,
    OTHER,
    PRODUCT,
    WAIVED;

    public String value() {
        return name();
    }

    public static RateDimensionalDivisorType fromValue(String v) {
        return valueOf(v);
    }

}
