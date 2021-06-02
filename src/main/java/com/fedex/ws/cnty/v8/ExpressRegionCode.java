
package com.fedex.ws.cnty.v8;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressRegionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExpressRegionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APAC"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="EMEA"/&gt;
 *     &lt;enumeration value="LAC"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExpressRegionCode")
@XmlEnum
public enum ExpressRegionCode {

    APAC,
    CA,
    EMEA,
    LAC,
    US;

    public String value() {
        return name();
    }

    public static ExpressRegionCode fromValue(String v) {
        return valueOf(v);
    }

}
