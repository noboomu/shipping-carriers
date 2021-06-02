
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WeightSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *     &lt;enumeration value="SCALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightSource")
@XmlEnum
public enum WeightSource {

    MANUAL,
    SCALE;

    public String value() {
        return name();
    }

    public static WeightSource fromValue(String v) {
        return valueOf(v);
    }

}
