
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BYPASS_CLEARANCE_PROHIBITS"/&gt;
 *     &lt;enumeration value="FUTURE_DAY_SHIPMENT"/&gt;
 *     &lt;enumeration value="PACKAGE_LEVEL_COMMODITIES"/&gt;
 *     &lt;enumeration value="PRE_EIG_PROCESSING"/&gt;
 *     &lt;enumeration value="PRE_ETD_ENHANCEMENTS"/&gt;
 *     &lt;enumeration value="PRE_MULTIPLIER_PROCESSING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentProcessingOptionType")
@XmlEnum
public enum ShipmentProcessingOptionType {

    BYPASS_CLEARANCE_PROHIBITS,
    FUTURE_DAY_SHIPMENT,
    PACKAGE_LEVEL_COMMODITIES,
    PRE_EIG_PROCESSING,
    PRE_ETD_ENHANCEMENTS,
    PRE_MULTIPLIER_PROCESSING;

    public String value() {
        return name();
    }

    public static ShipmentProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
