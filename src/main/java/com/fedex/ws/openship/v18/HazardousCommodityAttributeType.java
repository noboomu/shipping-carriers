
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousCommodityAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazardousCommodityAttributeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_SUBJECT_TO_REGULATIONS"/&gt;
 *     &lt;enumeration value="PLACARDED_VEHICLE_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityAttributeType")
@XmlEnum
public enum HazardousCommodityAttributeType {

    NOT_SUBJECT_TO_REGULATIONS,
    PLACARDED_VEHICLE_REQUIRED;

    public String value() {
        return name();
    }

    public static HazardousCommodityAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
