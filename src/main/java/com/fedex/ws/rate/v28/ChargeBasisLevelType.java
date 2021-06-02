
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBasisLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChargeBasisLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CURRENT_PACKAGE"/&gt;
 *     &lt;enumeration value="SUM_OF_PACKAGES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeBasisLevelType")
@XmlEnum
public enum ChargeBasisLevelType {

    CURRENT_PACKAGE,
    SUM_OF_PACKAGES;

    public String value() {
        return name();
    }

    public static ChargeBasisLevelType fromValue(String v) {
        return valueOf(v);
    }

}
