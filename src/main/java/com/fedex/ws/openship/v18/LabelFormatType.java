
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LabelFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMON2D"/&gt;
 *     &lt;enumeration value="LABEL_DATA_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelFormatType")
@XmlEnum
public enum LabelFormatType {

    @XmlEnumValue("COMMON2D")
    COMMON_2_D("COMMON2D"),
    LABEL_DATA_ONLY("LABEL_DATA_ONLY");
    private final String value;

    LabelFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelFormatType fromValue(String v) {
        for (LabelFormatType c: LabelFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
