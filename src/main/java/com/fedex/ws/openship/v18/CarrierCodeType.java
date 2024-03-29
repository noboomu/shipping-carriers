
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CarrierCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FDXC"/&gt;
 *     &lt;enumeration value="FDXE"/&gt;
 *     &lt;enumeration value="FDXG"/&gt;
 *     &lt;enumeration value="FDXO"/&gt;
 *     &lt;enumeration value="FXCC"/&gt;
 *     &lt;enumeration value="FXFR"/&gt;
 *     &lt;enumeration value="FXSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarrierCodeType")
@XmlEnum
public enum CarrierCodeType {

    FDXC,
    FDXE,
    FDXG,
    FDXO,
    FXCC,
    FXFR,
    FXSP;

    public String value() {
        return name();
    }

    public static CarrierCodeType fromValue(String v) {
        return valueOf(v);
    }

}
