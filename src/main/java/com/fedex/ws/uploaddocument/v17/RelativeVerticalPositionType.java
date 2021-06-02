
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeVerticalPositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RelativeVerticalPositionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABOVE"/&gt;
 *     &lt;enumeration value="BELOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelativeVerticalPositionType")
@XmlEnum
public enum RelativeVerticalPositionType {

    ABOVE,
    BELOW;

    public String value() {
        return name();
    }

    public static RelativeVerticalPositionType fromValue(String v) {
        return valueOf(v);
    }

}
