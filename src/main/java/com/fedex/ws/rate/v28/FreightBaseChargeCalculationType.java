
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightBaseChargeCalculationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightBaseChargeCalculationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LINE_ITEMS"/&gt;
 *     &lt;enumeration value="UNIT_PRICING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightBaseChargeCalculationType")
@XmlEnum
public enum FreightBaseChargeCalculationType {

    LINE_ITEMS,
    UNIT_PRICING;

    public String value() {
        return name();
    }

    public static FreightBaseChargeCalculationType fromValue(String v) {
        return valueOf(v);
    }

}
