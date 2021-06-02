
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebServiceEnvironment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WebServiceEnvironment"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRODUCTION"/&gt;
 *     &lt;enumeration value="TEST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WebServiceEnvironment")
@XmlEnum
public enum WebServiceEnvironment {

    PRODUCTION,
    TEST;

    public String value() {
        return name();
    }

    public static WebServiceEnvironment fromValue(String v) {
        return valueOf(v);
    }

}
