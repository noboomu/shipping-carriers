
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProhibitionSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProhibitionSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX"/&gt;
 *     &lt;enumeration value="GOVERNMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProhibitionSourceType")
@XmlEnum
public enum ProhibitionSourceType {

    FEDEX,
    GOVERNMENT;

    public String value() {
        return name();
    }

    public static ProhibitionSourceType fromValue(String v) {
        return valueOf(v);
    }

}
