
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightShipmentRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightShipmentRoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONSIGNEE"/&gt;
 *     &lt;enumeration value="SHIPPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightShipmentRoleType")
@XmlEnum
public enum FreightShipmentRoleType {

    CONSIGNEE,
    SHIPPER;

    public String value() {
        return name();
    }

    public static FreightShipmentRoleType fromValue(String v) {
        return valueOf(v);
    }

}
