
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaNetCostMethodCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NaftaNetCostMethodCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NC"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaftaNetCostMethodCode")
@XmlEnum
public enum NaftaNetCostMethodCode {

    NC,
    NO;

    public String value() {
        return name();
    }

    public static NaftaNetCostMethodCode fromValue(String v) {
        return valueOf(v);
    }

}
