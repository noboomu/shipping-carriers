
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousCommodityRegulationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazardousCommodityRegulationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADR"/&gt;
 *     &lt;enumeration value="DOT"/&gt;
 *     &lt;enumeration value="IATA"/&gt;
 *     &lt;enumeration value="ORMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityRegulationType")
@XmlEnum
public enum HazardousCommodityRegulationType {

    ADR,
    DOT,
    IATA,
    ORMD;

    public String value() {
        return name();
    }

    public static HazardousCommodityRegulationType fromValue(String v) {
        return valueOf(v);
    }

}
