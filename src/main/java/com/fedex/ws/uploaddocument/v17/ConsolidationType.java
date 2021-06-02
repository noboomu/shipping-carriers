
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConsolidationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERNATIONAL_DISTRIBUTION_FREIGHT"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_ECONOMY_DISTRIBUTION"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_GROUND_DIRECT_DISTRIBUTION"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_GROUND_DISTRIBUTION"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_PRIORITY_DISTRIBUTION"/&gt;
 *     &lt;enumeration value="TRANSBORDER_DISTRIBUTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsolidationType")
@XmlEnum
public enum ConsolidationType {

    INTERNATIONAL_DISTRIBUTION_FREIGHT,
    INTERNATIONAL_ECONOMY_DISTRIBUTION,
    INTERNATIONAL_GROUND_DIRECT_DISTRIBUTION,
    INTERNATIONAL_GROUND_DISTRIBUTION,
    INTERNATIONAL_PRIORITY_DISTRIBUTION,
    TRANSBORDER_DISTRIBUTION;

    public String value() {
        return name();
    }

    public static ConsolidationType fromValue(String v) {
        return valueOf(v);
    }

}
