
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateLevelBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateLevelBasisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUNDLED_RATE"/&gt;
 *     &lt;enumeration value="INDIVIDUAL_PACKAGE_RATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateLevelBasisType")
@XmlEnum
public enum RateLevelBasisType {

    BUNDLED_RATE,
    INDIVIDUAL_PACKAGE_RATE;

    public String value() {
        return name();
    }

    public static RateLevelBasisType fromValue(String v) {
        return valueOf(v);
    }

}
