
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinimumChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MinimumChargeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *     &lt;enumeration value="CUSTOMER_FREIGHT_WEIGHT"/&gt;
 *     &lt;enumeration value="EARNED_DISCOUNT"/&gt;
 *     &lt;enumeration value="MIXED"/&gt;
 *     &lt;enumeration value="RATE_SCALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MinimumChargeType")
@XmlEnum
public enum MinimumChargeType {

    CUSTOMER,
    CUSTOMER_FREIGHT_WEIGHT,
    EARNED_DISCOUNT,
    MIXED,
    RATE_SCALE;

    public String value() {
        return name();
    }

    public static MinimumChargeType fromValue(String v) {
        return valueOf(v);
    }

}
