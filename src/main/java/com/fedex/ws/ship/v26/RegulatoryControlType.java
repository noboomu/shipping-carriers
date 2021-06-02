
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegulatoryControlType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FOOD_OR_PERISHABLE"/&gt;
 *     &lt;enumeration value="NAFTA"/&gt;
 *     &lt;enumeration value="NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION"/&gt;
 *     &lt;enumeration value="NOT_IN_FREE_CIRCULATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegulatoryControlType")
@XmlEnum
public enum RegulatoryControlType {

    FOOD_OR_PERISHABLE,
    NAFTA,
    NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION,
    NOT_IN_FREE_CIRCULATION;

    public String value() {
        return name();
    }

    public static RegulatoryControlType fromValue(String v) {
        return valueOf(v);
    }

}
