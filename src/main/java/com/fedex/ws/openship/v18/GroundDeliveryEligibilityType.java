
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroundDeliveryEligibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GroundDeliveryEligibilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALTERNATE_DAY_SERVICE"/&gt;
 *     &lt;enumeration value="CARTAGE_AGENT_DELIVERY"/&gt;
 *     &lt;enumeration value="SATURDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="USPS_DELIVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroundDeliveryEligibilityType")
@XmlEnum
public enum GroundDeliveryEligibilityType {

    ALTERNATE_DAY_SERVICE,
    CARTAGE_AGENT_DELIVERY,
    SATURDAY_DELIVERY,
    USPS_DELIVERY;

    public String value() {
        return name();
    }

    public static GroundDeliveryEligibilityType fromValue(String v) {
        return valueOf(v);
    }

}
