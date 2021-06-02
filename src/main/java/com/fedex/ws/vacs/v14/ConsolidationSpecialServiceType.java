
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationSpecialServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConsolidationSpecialServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BROKER_SELECT_OPTION"/&gt;
 *     &lt;enumeration value="PRIORITY_ALERT"/&gt;
 *     &lt;enumeration value="SATURDAY_PICKUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsolidationSpecialServiceType")
@XmlEnum
public enum ConsolidationSpecialServiceType {

    BROKER_SELECT_OPTION,
    PRIORITY_ALERT,
    SATURDAY_PICKUP;

    public String value() {
        return name();
    }

    public static ConsolidationSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
