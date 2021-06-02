
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartPostShipmentProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SmartPostShipmentProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GROUND_TRACKING_NUMBER_REQUESTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmartPostShipmentProcessingOptionType")
@XmlEnum
public enum SmartPostShipmentProcessingOptionType {

    GROUND_TRACKING_NUMBER_REQUESTED;

    public String value() {
        return name();
    }

    public static SmartPostShipmentProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
