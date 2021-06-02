
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorLabelBehaviorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ErrorLabelBehaviorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACKAGE_ERROR_LABELS"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorLabelBehaviorType")
@XmlEnum
public enum ErrorLabelBehaviorType {

    PACKAGE_ERROR_LABELS,
    STANDARD;

    public String value() {
        return name();
    }

    public static ErrorLabelBehaviorType fromValue(String v) {
        return valueOf(v);
    }

}
