
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationDataSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConsolidationDataSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCUMULATED"/&gt;
 *     &lt;enumeration value="CLIENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsolidationDataSourceType")
@XmlEnum
public enum ConsolidationDataSourceType {

    ACCUMULATED,
    CLIENT;

    public String value() {
        return name();
    }

    public static ConsolidationDataSourceType fromValue(String v) {
        return valueOf(v);
    }

}
