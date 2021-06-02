
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateDiscountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateDiscountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BONUS"/&gt;
 *     &lt;enumeration value="COUPON"/&gt;
 *     &lt;enumeration value="EARNED"/&gt;
 *     &lt;enumeration value="INCENTIVE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="VOLUME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateDiscountType")
@XmlEnum
public enum RateDiscountType {

    BONUS,
    COUPON,
    EARNED,
    INCENTIVE,
    OTHER,
    VOLUME;

    public String value() {
        return name();
    }

    public static RateDiscountType fromValue(String v) {
        return valueOf(v);
    }

}
