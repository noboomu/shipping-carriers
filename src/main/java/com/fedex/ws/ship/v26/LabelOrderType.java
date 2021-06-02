
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LabelOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHIPPING_LABEL_FIRST"/&gt;
 *     &lt;enumeration value="SHIPPING_LABEL_LAST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelOrderType")
@XmlEnum
public enum LabelOrderType {

    SHIPPING_LABEL_FIRST,
    SHIPPING_LABEL_LAST;

    public String value() {
        return name();
    }

    public static LabelOrderType fromValue(String v) {
        return valueOf(v);
    }

}
