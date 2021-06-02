
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTypeBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateTypeBasisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNT"/&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateTypeBasisType")
@XmlEnum
public enum RateTypeBasisType {

    ACCOUNT,
    LIST;

    public String value() {
        return name();
    }

    public static RateTypeBasisType fromValue(String v) {
        return valueOf(v);
    }

}
