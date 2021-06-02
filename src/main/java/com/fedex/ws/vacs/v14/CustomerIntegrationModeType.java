
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerIntegrationModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerIntegrationModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOM"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerIntegrationModeType")
@XmlEnum
public enum CustomerIntegrationModeType {

    CUSTOM,
    STANDARD;

    public String value() {
        return name();
    }

    public static CustomerIntegrationModeType fromValue(String v) {
        return valueOf(v);
    }

}
