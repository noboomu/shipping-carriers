
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelayPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DelayPointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BROKER"/&gt;
 *     &lt;enumeration value="DESTINATION"/&gt;
 *     &lt;enumeration value="ORIGIN"/&gt;
 *     &lt;enumeration value="ORIGIN_DESTINATION_PAIR"/&gt;
 *     &lt;enumeration value="PROOF_OF_DELIVERY_POINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelayPointType")
@XmlEnum
public enum DelayPointType {

    BROKER,
    DESTINATION,
    ORIGIN,
    ORIGIN_DESTINATION_PAIR,
    PROOF_OF_DELIVERY_POINT;

    public String value() {
        return name();
    }

    public static DelayPointType fromValue(String v) {
        return valueOf(v);
    }

}
