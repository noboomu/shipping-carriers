
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedAccountNumberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssociatedAccountNumberType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_EXPRESS"/&gt;
 *     &lt;enumeration value="FEDEX_FREIGHT"/&gt;
 *     &lt;enumeration value="FEDEX_GROUND"/&gt;
 *     &lt;enumeration value="FEDEX_OFFICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssociatedAccountNumberType")
@XmlEnum
public enum AssociatedAccountNumberType {

    FEDEX_EXPRESS,
    FEDEX_FREIGHT,
    FEDEX_GROUND,
    FEDEX_OFFICE;

    public String value() {
        return name();
    }

    public static AssociatedAccountNumberType fromValue(String v) {
        return valueOf(v);
    }

}
