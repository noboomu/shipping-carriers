
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyPackageInOpenShipmentActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ModifyPackageInOpenShipmentActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STRONG_VALIDATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModifyPackageInOpenShipmentActionType")
@XmlEnum
public enum ModifyPackageInOpenShipmentActionType {

    STRONG_VALIDATION;

    public String value() {
        return name();
    }

    public static ModifyPackageInOpenShipmentActionType fromValue(String v) {
        return valueOf(v);
    }

}
