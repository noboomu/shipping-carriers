
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightServiceSchedulingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightServiceSchedulingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIMITED"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="WILL_CALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightServiceSchedulingType")
@XmlEnum
public enum FreightServiceSchedulingType {

    LIMITED,
    STANDARD,
    WILL_CALL;

    public String value() {
        return name();
    }

    public static FreightServiceSchedulingType fromValue(String v) {
        return valueOf(v);
    }

}
