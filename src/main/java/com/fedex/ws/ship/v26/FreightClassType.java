
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLASS_050"/&gt;
 *     &lt;enumeration value="CLASS_055"/&gt;
 *     &lt;enumeration value="CLASS_060"/&gt;
 *     &lt;enumeration value="CLASS_065"/&gt;
 *     &lt;enumeration value="CLASS_070"/&gt;
 *     &lt;enumeration value="CLASS_077_5"/&gt;
 *     &lt;enumeration value="CLASS_085"/&gt;
 *     &lt;enumeration value="CLASS_092_5"/&gt;
 *     &lt;enumeration value="CLASS_100"/&gt;
 *     &lt;enumeration value="CLASS_110"/&gt;
 *     &lt;enumeration value="CLASS_125"/&gt;
 *     &lt;enumeration value="CLASS_150"/&gt;
 *     &lt;enumeration value="CLASS_175"/&gt;
 *     &lt;enumeration value="CLASS_200"/&gt;
 *     &lt;enumeration value="CLASS_250"/&gt;
 *     &lt;enumeration value="CLASS_300"/&gt;
 *     &lt;enumeration value="CLASS_400"/&gt;
 *     &lt;enumeration value="CLASS_500"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightClassType")
@XmlEnum
public enum FreightClassType {

    CLASS_050,
    CLASS_055,
    CLASS_060,
    CLASS_065,
    CLASS_070,
    CLASS_077_5,
    CLASS_085,
    CLASS_092_5,
    CLASS_100,
    CLASS_110,
    CLASS_125,
    CLASS_150,
    CLASS_175,
    CLASS_200,
    CLASS_250,
    CLASS_300,
    CLASS_400,
    CLASS_500;

    public String value() {
        return name();
    }

    public static FreightClassType fromValue(String v) {
        return valueOf(v);
    }

}
