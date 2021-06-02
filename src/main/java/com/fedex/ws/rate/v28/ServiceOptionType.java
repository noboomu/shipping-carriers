
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_ONE_RATE"/&gt;
 *     &lt;enumeration value="FREIGHT_GUARANTEE"/&gt;
 *     &lt;enumeration value="SATURDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="SMART_POST_ALLOWED_INDICIA"/&gt;
 *     &lt;enumeration value="SMART_POST_HUB_ID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceOptionType")
@XmlEnum
public enum ServiceOptionType {

    FEDEX_ONE_RATE,
    FREIGHT_GUARANTEE,
    SATURDAY_DELIVERY,
    SMART_POST_ALLOWED_INDICIA,
    SMART_POST_HUB_ID;

    public String value() {
        return name();
    }

    public static ServiceOptionType fromValue(String v) {
        return valueOf(v);
    }

}
