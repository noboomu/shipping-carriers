
package com.fedex.ws.addressvalidation.v4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalAddressStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperationalAddressStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NORMALIZED"/&gt;
 *     &lt;enumeration value="RAW"/&gt;
 *     &lt;enumeration value="STANDARDIZED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationalAddressStateType")
@XmlEnum
public enum OperationalAddressStateType {

    NORMALIZED,
    RAW,
    STANDARDIZED;

    public String value() {
        return name();
    }

    public static OperationalAddressStateType fromValue(String v) {
        return valueOf(v);
    }

}
