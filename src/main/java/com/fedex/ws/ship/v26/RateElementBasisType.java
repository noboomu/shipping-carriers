
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateElementBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateElementBasisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASE_CHARGE"/&gt;
 *     &lt;enumeration value="NET_CHARGE"/&gt;
 *     &lt;enumeration value="NET_CHARGE_EXCLUDING_TAXES"/&gt;
 *     &lt;enumeration value="NET_FREIGHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateElementBasisType")
@XmlEnum
public enum RateElementBasisType {

    BASE_CHARGE,
    NET_CHARGE,
    NET_CHARGE_EXCLUDING_TAXES,
    NET_FREIGHT;

    public String value() {
        return name();
    }

    public static RateElementBasisType fromValue(String v) {
        return valueOf(v);
    }

}
