
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProhibitionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProhibitionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMODITY"/&gt;
 *     &lt;enumeration value="COUNTRY"/&gt;
 *     &lt;enumeration value="DOCUMENT"/&gt;
 *     &lt;enumeration value="SHIPMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProhibitionType")
@XmlEnum
public enum ProhibitionType {

    COMMODITY,
    COUNTRY,
    DOCUMENT,
    SHIPMENT;

    public String value() {
        return name();
    }

    public static ProhibitionType fromValue(String v) {
        return valueOf(v);
    }

}
