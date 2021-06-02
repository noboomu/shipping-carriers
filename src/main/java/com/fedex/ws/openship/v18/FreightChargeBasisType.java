
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightChargeBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightChargeBasisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CWT"/&gt;
 *     &lt;enumeration value="FLAT"/&gt;
 *     &lt;enumeration value="MINIMUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightChargeBasisType")
@XmlEnum
public enum FreightChargeBasisType {

    CWT,
    FLAT,
    MINIMUM;

    public String value() {
        return name();
    }

    public static FreightChargeBasisType fromValue(String v) {
        return valueOf(v);
    }

}
