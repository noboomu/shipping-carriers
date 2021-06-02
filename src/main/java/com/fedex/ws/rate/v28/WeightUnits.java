
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WeightUnits"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightUnits")
@XmlEnum
public enum WeightUnits {

    KG,
    LB;

    public String value() {
        return name();
    }

    public static WeightUnits fromValue(String v) {
        return valueOf(v);
    }

}
