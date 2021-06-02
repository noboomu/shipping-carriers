
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingShipmentProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PendingShipmentProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLOW_MODIFICATIONS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingShipmentProcessingOptionType")
@XmlEnum
public enum PendingShipmentProcessingOptionType {

    ALLOW_MODIFICATIONS;

    public String value() {
        return name();
    }

    public static PendingShipmentProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
