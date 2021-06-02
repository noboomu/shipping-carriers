
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupRequestSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PickupRequestSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTOMATION"/&gt;
 *     &lt;enumeration value="CUSTOMER_SERVICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PickupRequestSourceType")
@XmlEnum
public enum PickupRequestSourceType {

    AUTOMATION,
    CUSTOMER_SERVICE;

    public String value() {
        return name();
    }

    public static PickupRequestSourceType fromValue(String v) {
        return valueOf(v);
    }

}
