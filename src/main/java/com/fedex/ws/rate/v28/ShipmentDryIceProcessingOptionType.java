
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentDryIceProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentDryIceProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHIPMENT_LEVEL_DRY_ICE_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentDryIceProcessingOptionType")
@XmlEnum
public enum ShipmentDryIceProcessingOptionType {

    SHIPMENT_LEVEL_DRY_ICE_ONLY;

    public String value() {
        return name();
    }

    public static ShipmentDryIceProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
