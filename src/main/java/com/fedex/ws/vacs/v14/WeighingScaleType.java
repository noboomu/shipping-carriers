
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeighingScaleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WeighingScaleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_SCALE"/&gt;
 *     &lt;enumeration value="PUBLIC_SCALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeighingScaleType")
@XmlEnum
public enum WeighingScaleType {

    FEDEX_SCALE,
    PUBLIC_SCALE;

    public String value() {
        return name();
    }

    public static WeighingScaleType fromValue(String v) {
        return valueOf(v);
    }

}
