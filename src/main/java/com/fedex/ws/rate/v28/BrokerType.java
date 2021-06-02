
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrokerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BrokerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXPORT"/&gt;
 *     &lt;enumeration value="IMPORT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BrokerType")
@XmlEnum
public enum BrokerType {

    EXPORT,
    IMPORT;

    public String value() {
        return name();
    }

    public static BrokerType fromValue(String v) {
        return valueOf(v);
    }

}
