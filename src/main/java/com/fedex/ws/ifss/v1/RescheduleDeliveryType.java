
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RescheduleDeliveryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RescheduleDeliveryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPOINTMENT"/&gt;
 *     &lt;enumeration value="DATE_CERTAIN"/&gt;
 *     &lt;enumeration value="EVENING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RescheduleDeliveryType")
@XmlEnum
public enum RescheduleDeliveryType {

    APPOINTMENT,
    DATE_CERTAIN,
    EVENING;

    public String value() {
        return name();
    }

    public static RescheduleDeliveryType fromValue(String v) {
        return valueOf(v);
    }

}
