
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondaryBarcodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SecondaryBarcodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMON_2D"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="SSCC_18"/&gt;
 *     &lt;enumeration value="USPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecondaryBarcodeType")
@XmlEnum
public enum SecondaryBarcodeType {

    @XmlEnumValue("COMMON_2D")
    COMMON_2_D("COMMON_2D"),
    NONE("NONE"),
    SSCC_18("SSCC_18"),
    USPS("USPS");
    private final String value;

    SecondaryBarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondaryBarcodeType fromValue(String v) {
        for (SecondaryBarcodeType c: SecondaryBarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
