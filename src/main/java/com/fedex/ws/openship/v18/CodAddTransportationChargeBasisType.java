
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodAddTransportationChargeBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CodAddTransportationChargeBasisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COD_SURCHARGE"/&gt;
 *     &lt;enumeration value="NET_CHARGE"/&gt;
 *     &lt;enumeration value="NET_FREIGHT"/&gt;
 *     &lt;enumeration value="TOTAL_CUSTOMER_CHARGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodAddTransportationChargeBasisType")
@XmlEnum
public enum CodAddTransportationChargeBasisType {

    COD_SURCHARGE,
    NET_CHARGE,
    NET_FREIGHT,
    TOTAL_CUSTOMER_CHARGE;

    public String value() {
        return name();
    }

    public static CodAddTransportationChargeBasisType fromValue(String v) {
        return valueOf(v);
    }

}
