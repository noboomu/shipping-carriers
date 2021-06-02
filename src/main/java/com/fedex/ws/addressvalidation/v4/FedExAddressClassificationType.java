
package com.fedex.ws.addressvalidation.v4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FedExAddressClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FedExAddressClassificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="MIXED"/&gt;
 *     &lt;enumeration value="RESIDENTIAL"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FedExAddressClassificationType")
@XmlEnum
public enum FedExAddressClassificationType {

    BUSINESS,
    MIXED,
    RESIDENTIAL,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FedExAddressClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
