
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeliveryOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REDIRECT_TO_HOLD_AT_LOCATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryOptionType")
@XmlEnum
public enum DeliveryOptionType {

    REDIRECT_TO_HOLD_AT_LOCATION;

    public String value() {
        return name();
    }

    public static DeliveryOptionType fromValue(String v) {
        return valueOf(v);
    }

}
