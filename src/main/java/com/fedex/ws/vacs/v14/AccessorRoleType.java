
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessorRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccessorRoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHIPMENT_COMPLETOR"/&gt;
 *     &lt;enumeration value="SHIPMENT_INITIATOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessorRoleType")
@XmlEnum
public enum AccessorRoleType {

    SHIPMENT_COMPLETOR,
    SHIPMENT_INITIATOR;

    public String value() {
        return name();
    }

    public static AccessorRoleType fromValue(String v) {
        return valueOf(v);
    }

}
