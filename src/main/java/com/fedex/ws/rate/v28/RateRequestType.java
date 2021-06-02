
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateRequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="PREFERRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateRequestType")
@XmlEnum
public enum RateRequestType {

    LIST,
    NONE,
    PREFERRED;

    public String value() {
        return name();
    }

    public static RateRequestType fromValue(String v) {
        return valueOf(v);
    }

}
