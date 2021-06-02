
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RerouteDeliveryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RerouteDeliveryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CROSS_COUNTRY_DEFERRED"/&gt;
 *     &lt;enumeration value="CROSS_COUNTRY_EXPEDITED"/&gt;
 *     &lt;enumeration value="LOCAL"/&gt;
 *     &lt;enumeration value="UNDETERMINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RerouteDeliveryType")
@XmlEnum
public enum RerouteDeliveryType {

    CROSS_COUNTRY_DEFERRED,
    CROSS_COUNTRY_EXPEDITED,
    LOCAL,
    UNDETERMINED;

    public String value() {
        return name();
    }

    public static RerouteDeliveryType fromValue(String v) {
        return valueOf(v);
    }

}
