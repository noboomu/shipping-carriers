
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadioactiveLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RadioactiveLabelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="III_YELLOW"/&gt;
 *     &lt;enumeration value="II_YELLOW"/&gt;
 *     &lt;enumeration value="I_WHITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RadioactiveLabelType")
@XmlEnum
public enum RadioactiveLabelType {

    III_YELLOW,
    II_YELLOW,
    I_WHITE;

    public String value() {
        return name();
    }

    public static RadioactiveLabelType fromValue(String v) {
        return valueOf(v);
    }

}
