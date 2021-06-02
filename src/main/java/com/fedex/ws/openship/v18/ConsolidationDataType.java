
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConsolidationDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOTAL_CUSTOMS_VALUE"/&gt;
 *     &lt;enumeration value="TOTAL_FREIGHT_CHARGES"/&gt;
 *     &lt;enumeration value="TOTAL_HANDLING_COSTS"/&gt;
 *     &lt;enumeration value="TOTAL_INSURANCE_CHARGES"/&gt;
 *     &lt;enumeration value="TOTAL_INSURED_VALUE"/&gt;
 *     &lt;enumeration value="TOTAL_PACKING_COSTS"/&gt;
 *     &lt;enumeration value="TOTAL_TAXES_OR_MISCELLANEOUS_CHARGES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsolidationDataType")
@XmlEnum
public enum ConsolidationDataType {

    TOTAL_CUSTOMS_VALUE,
    TOTAL_FREIGHT_CHARGES,
    TOTAL_HANDLING_COSTS,
    TOTAL_INSURANCE_CHARGES,
    TOTAL_INSURED_VALUE,
    TOTAL_PACKING_COSTS,
    TOTAL_TAXES_OR_MISCELLANEOUS_CHARGES;

    public String value() {
        return name();
    }

    public static ConsolidationDataType fromValue(String v) {
        return valueOf(v);
    }

}
