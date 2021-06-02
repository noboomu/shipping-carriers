
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransborderDistributionSpecialServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransborderDistributionSpecialServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_LTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransborderDistributionSpecialServiceType")
@XmlEnum
public enum TransborderDistributionSpecialServiceType {

    FEDEX_LTL;

    public String value() {
        return name();
    }

    public static TransborderDistributionSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
