
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedRedirectToHoldServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SupportedRedirectToHoldServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_EXPRESS"/&gt;
 *     &lt;enumeration value="FEDEX_GROUND"/&gt;
 *     &lt;enumeration value="FEDEX_GROUND_HOME_DELIVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupportedRedirectToHoldServiceType")
@XmlEnum
public enum SupportedRedirectToHoldServiceType {

    FEDEX_EXPRESS,
    FEDEX_GROUND,
    FEDEX_GROUND_HOME_DELIVERY;

    public String value() {
        return name();
    }

    public static SupportedRedirectToHoldServiceType fromValue(String v) {
        return valueOf(v);
    }

}
