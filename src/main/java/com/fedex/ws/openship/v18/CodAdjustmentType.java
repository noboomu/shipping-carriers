
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodAdjustmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CodAdjustmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHARGES_ADDED"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodAdjustmentType")
@XmlEnum
public enum CodAdjustmentType {

    CHARGES_ADDED,
    NONE;

    public String value() {
        return name();
    }

    public static CodAdjustmentType fromValue(String v) {
        return valueOf(v);
    }

}
