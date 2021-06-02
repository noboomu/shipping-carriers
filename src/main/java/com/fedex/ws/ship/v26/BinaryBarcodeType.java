
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryBarcodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BinaryBarcodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMON_2D"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BinaryBarcodeType")
@XmlEnum
public enum BinaryBarcodeType {

    @XmlEnumValue("COMMON_2D")
    COMMON_2_D("COMMON_2D");
    private final String value;

    BinaryBarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BinaryBarcodeType fromValue(String v) {
        for (BinaryBarcodeType c: BinaryBarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
