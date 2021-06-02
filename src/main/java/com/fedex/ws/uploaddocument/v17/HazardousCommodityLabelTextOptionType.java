
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousCommodityLabelTextOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazardousCommodityLabelTextOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPEND"/&gt;
 *     &lt;enumeration value="OVERRIDE"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityLabelTextOptionType")
@XmlEnum
public enum HazardousCommodityLabelTextOptionType {

    APPEND,
    OVERRIDE,
    STANDARD;

    public String value() {
        return name();
    }

    public static HazardousCommodityLabelTextOptionType fromValue(String v) {
        return valueOf(v);
    }

}
