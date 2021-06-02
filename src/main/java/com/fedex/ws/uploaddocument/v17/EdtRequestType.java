
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EdtRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EdtRequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EdtRequestType")
@XmlEnum
public enum EdtRequestType {

    ALL,
    NONE;

    public String value() {
        return name();
    }

    public static EdtRequestType fromValue(String v) {
        return valueOf(v);
    }

}
