
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransborderDistributionRoutingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransborderDistributionRoutingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BY_METER"/&gt;
 *     &lt;enumeration value="BY_ORIGIN"/&gt;
 *     &lt;enumeration value="CUSTOMER_SPECIFIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransborderDistributionRoutingType")
@XmlEnum
public enum TransborderDistributionRoutingType {

    BY_METER,
    BY_ORIGIN,
    CUSTOMER_SPECIFIED;

    public String value() {
        return name();
    }

    public static TransborderDistributionRoutingType fromValue(String v) {
        return valueOf(v);
    }

}
