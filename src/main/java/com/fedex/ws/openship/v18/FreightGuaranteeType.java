
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightGuaranteeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightGuaranteeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GUARANTEED_DATE"/&gt;
 *     &lt;enumeration value="GUARANTEED_MORNING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightGuaranteeType")
@XmlEnum
public enum FreightGuaranteeType {

    GUARANTEED_DATE,
    GUARANTEED_MORNING;

    public String value() {
        return name();
    }

    public static FreightGuaranteeType fromValue(String v) {
        return valueOf(v);
    }

}
