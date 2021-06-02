
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocTabContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocTabContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BARCODED"/&gt;
 *     &lt;enumeration value="CUSTOM"/&gt;
 *     &lt;enumeration value="MINIMUM"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="ZONE001"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocTabContentType")
@XmlEnum
public enum DocTabContentType {

    BARCODED("BARCODED"),
    CUSTOM("CUSTOM"),
    MINIMUM("MINIMUM"),
    STANDARD("STANDARD"),
    @XmlEnumValue("ZONE001")
    ZONE_001("ZONE001");
    private final String value;

    DocTabContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocTabContentType fromValue(String v) {
        for (DocTabContentType c: DocTabContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
