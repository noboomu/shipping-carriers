
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TinType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUSINESS_NATIONAL"/&gt;
 *     &lt;enumeration value="BUSINESS_STATE"/&gt;
 *     &lt;enumeration value="BUSINESS_UNION"/&gt;
 *     &lt;enumeration value="PERSONAL_NATIONAL"/&gt;
 *     &lt;enumeration value="PERSONAL_STATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TinType")
@XmlEnum
public enum TinType {

    BUSINESS_NATIONAL,
    BUSINESS_STATE,
    BUSINESS_UNION,
    PERSONAL_NATIONAL,
    PERSONAL_STATE;

    public String value() {
        return name();
    }

    public static TinType fromValue(String v) {
        return valueOf(v);
    }

}
