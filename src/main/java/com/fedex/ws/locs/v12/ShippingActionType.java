
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELIVERIES"/&gt;
 *     &lt;enumeration value="PICKUPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingActionType")
@XmlEnum
public enum ShippingActionType {

    DELIVERIES,
    PICKUPS;

    public String value() {
        return name();
    }

    public static ShippingActionType fromValue(String v) {
        return valueOf(v);
    }

}
