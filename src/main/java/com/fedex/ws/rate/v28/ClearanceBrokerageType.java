
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearanceBrokerageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ClearanceBrokerageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BROKER_INCLUSIVE"/&gt;
 *     &lt;enumeration value="BROKER_INCLUSIVE_NON_RESIDENT_IMPORTER"/&gt;
 *     &lt;enumeration value="BROKER_SELECT"/&gt;
 *     &lt;enumeration value="BROKER_SELECT_NON_RESIDENT_IMPORTER"/&gt;
 *     &lt;enumeration value="BROKER_UNASSIGNED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearanceBrokerageType")
@XmlEnum
public enum ClearanceBrokerageType {

    BROKER_INCLUSIVE,
    BROKER_INCLUSIVE_NON_RESIDENT_IMPORTER,
    BROKER_SELECT,
    BROKER_SELECT_NON_RESIDENT_IMPORTER,
    BROKER_UNASSIGNED;

    public String value() {
        return name();
    }

    public static ClearanceBrokerageType fromValue(String v) {
        return valueOf(v);
    }

}
