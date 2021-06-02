
package com.fedex.ws.cnty.v8;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageSpecialServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PackageSpecialServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALCOHOL"/&gt;
 *     &lt;enumeration value="APPOINTMENT_DELIVERY"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="DANGEROUS_GOODS"/&gt;
 *     &lt;enumeration value="DRY_ICE"/&gt;
 *     &lt;enumeration value="NON_STANDARD_CONTAINER"/&gt;
 *     &lt;enumeration value="PIECE_COUNT_VERIFICATION"/&gt;
 *     &lt;enumeration value="PRIORITY_ALERT"/&gt;
 *     &lt;enumeration value="SIGNATURE_OPTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PackageSpecialServiceType")
@XmlEnum
public enum PackageSpecialServiceType {

    ALCOHOL,
    APPOINTMENT_DELIVERY,
    COD,
    DANGEROUS_GOODS,
    DRY_ICE,
    NON_STANDARD_CONTAINER,
    PIECE_COUNT_VERIFICATION,
    PRIORITY_ALERT,
    SIGNATURE_OPTION;

    public String value() {
        return name();
    }

    public static PackageSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
