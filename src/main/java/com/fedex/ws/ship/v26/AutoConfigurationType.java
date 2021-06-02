
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoConfigurationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AutoConfigurationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENTERPRISE"/&gt;
 *     &lt;enumeration value="SHIPPING_SERVICE_PROVIDER"/&gt;
 *     &lt;enumeration value="SOFTWARE_ONLY"/&gt;
 *     &lt;enumeration value="TRADITIONAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutoConfigurationType")
@XmlEnum
public enum AutoConfigurationType {

    ENTERPRISE,
    SHIPPING_SERVICE_PROVIDER,
    SOFTWARE_ONLY,
    TRADITIONAL;

    public String value() {
        return name();
    }

    public static AutoConfigurationType fromValue(String v) {
        return valueOf(v);
    }

}
