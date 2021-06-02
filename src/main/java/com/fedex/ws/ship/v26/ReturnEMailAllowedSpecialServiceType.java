
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnEMailAllowedSpecialServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnEMailAllowedSpecialServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SATURDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="SATURDAY_PICKUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnEMailAllowedSpecialServiceType")
@XmlEnum
public enum ReturnEMailAllowedSpecialServiceType {

    SATURDAY_DELIVERY,
    SATURDAY_PICKUP;

    public String value() {
        return name();
    }

    public static ReturnEMailAllowedSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
