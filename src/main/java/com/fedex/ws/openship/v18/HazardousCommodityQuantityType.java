
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousCommodityQuantityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazardousCommodityQuantityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GROSS"/&gt;
 *     &lt;enumeration value="NET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityQuantityType")
@XmlEnum
public enum HazardousCommodityQuantityType {

    GROSS,
    NET;

    public String value() {
        return name();
    }

    public static HazardousCommodityQuantityType fromValue(String v) {
        return valueOf(v);
    }

}
