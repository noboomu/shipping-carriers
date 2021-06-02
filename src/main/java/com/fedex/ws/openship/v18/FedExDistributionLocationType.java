
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FedExDistributionLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FedExDistributionLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER_SPECIFIED"/&gt;
 *     &lt;enumeration value="FEDEX_EXPRESS_FREIGHT_RAMP"/&gt;
 *     &lt;enumeration value="FEDEX_EXPRESS_STATION"/&gt;
 *     &lt;enumeration value="FEDEX_GROUND_TERMINAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FedExDistributionLocationType")
@XmlEnum
public enum FedExDistributionLocationType {

    CUSTOMER_SPECIFIED,
    FEDEX_EXPRESS_FREIGHT_RAMP,
    FEDEX_EXPRESS_STATION,
    FEDEX_GROUND_TERMINAL;

    public String value() {
        return name();
    }

    public static FedExDistributionLocationType fromValue(String v) {
        return valueOf(v);
    }

}
