
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightRateQuoteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightRateQuoteType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTOMATED"/&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightRateQuoteType")
@XmlEnum
public enum FreightRateQuoteType {

    AUTOMATED,
    MANUAL;

    public String value() {
        return name();
    }

    public static FreightRateQuoteType fromValue(String v) {
        return valueOf(v);
    }

}
