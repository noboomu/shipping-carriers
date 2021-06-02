
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProhibitionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProhibitionStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROHIBITED"/&gt;
 *     &lt;enumeration value="WAIVED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProhibitionStatusType")
@XmlEnum
public enum ProhibitionStatusType {

    PROHIBITED,
    WAIVED;

    public String value() {
        return name();
    }

    public static ProhibitionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
