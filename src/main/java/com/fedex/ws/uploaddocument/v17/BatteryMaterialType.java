
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatteryMaterialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BatteryMaterialType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LITHIUM_ION"/&gt;
 *     &lt;enumeration value="LITHIUM_METAL"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BatteryMaterialType")
@XmlEnum
public enum BatteryMaterialType {

    LITHIUM_ION,
    LITHIUM_METAL,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BatteryMaterialType fromValue(String v) {
        return valueOf(v);
    }

}
