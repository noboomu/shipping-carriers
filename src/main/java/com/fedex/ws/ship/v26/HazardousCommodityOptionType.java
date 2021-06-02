
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousCommodityOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazardousCommodityOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BATTERY"/&gt;
 *     &lt;enumeration value="HAZARDOUS_MATERIALS"/&gt;
 *     &lt;enumeration value="LIMITED_QUANTITIES_COMMODITIES"/&gt;
 *     &lt;enumeration value="ORM_D"/&gt;
 *     &lt;enumeration value="REPORTABLE_QUANTITIES"/&gt;
 *     &lt;enumeration value="SMALL_QUANTITY_EXCEPTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityOptionType")
@XmlEnum
public enum HazardousCommodityOptionType {

    BATTERY,
    HAZARDOUS_MATERIALS,
    LIMITED_QUANTITIES_COMMODITIES,
    ORM_D,
    REPORTABLE_QUANTITIES,
    SMALL_QUANTITY_EXCEPTION;

    public String value() {
        return name();
    }

    public static HazardousCommodityOptionType fromValue(String v) {
        return valueOf(v);
    }

}
