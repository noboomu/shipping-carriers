
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomLabelCoordinateUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomLabelCoordinateUnits"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MILS"/&gt;
 *     &lt;enumeration value="PIXELS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomLabelCoordinateUnits")
@XmlEnum
public enum CustomLabelCoordinateUnits {

    MILS,
    PIXELS;

    public String value() {
        return name();
    }

    public static CustomLabelCoordinateUnits fromValue(String v) {
        return valueOf(v);
    }

}
