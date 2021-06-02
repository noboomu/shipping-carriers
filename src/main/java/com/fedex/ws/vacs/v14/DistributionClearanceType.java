
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionClearanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DistributionClearanceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DESTINATION_COUNTRY_CLEARANCE"/&gt;
 *     &lt;enumeration value="SINGLE_POINT_OF_CLEARANCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistributionClearanceType")
@XmlEnum
public enum DistributionClearanceType {

    DESTINATION_COUNTRY_CLEARANCE,
    SINGLE_POINT_OF_CLEARANCE;

    public String value() {
        return name();
    }

    public static DistributionClearanceType fromValue(String v) {
        return valueOf(v);
    }

}
