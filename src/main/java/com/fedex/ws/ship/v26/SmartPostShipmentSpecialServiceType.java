
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartPostShipmentSpecialServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SmartPostShipmentSpecialServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USPS_DELIVERY_CONFIRMATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmartPostShipmentSpecialServiceType")
@XmlEnum
public enum SmartPostShipmentSpecialServiceType {

    USPS_DELIVERY_CONFIRMATION;

    public String value() {
        return name();
    }

    public static SmartPostShipmentSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
