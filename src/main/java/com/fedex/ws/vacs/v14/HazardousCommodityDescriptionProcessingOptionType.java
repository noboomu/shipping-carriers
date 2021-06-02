
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousCommodityDescriptionProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazardousCommodityDescriptionProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCLUDE_SPECIAL_PROVISIONS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityDescriptionProcessingOptionType")
@XmlEnum
public enum HazardousCommodityDescriptionProcessingOptionType {

    INCLUDE_SPECIAL_PROVISIONS;

    public String value() {
        return name();
    }

    public static HazardousCommodityDescriptionProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
