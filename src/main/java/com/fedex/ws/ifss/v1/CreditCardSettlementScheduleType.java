
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardSettlementScheduleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreditCardSettlementScheduleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SETTLE_IMMEDIATELY"/&gt;
 *     &lt;enumeration value="SETTLE_NEXT_DAY"/&gt;
 *     &lt;enumeration value="SETTLE_ON_DELIVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditCardSettlementScheduleType")
@XmlEnum
public enum CreditCardSettlementScheduleType {

    SETTLE_IMMEDIATELY,
    SETTLE_NEXT_DAY,
    SETTLE_ON_DELIVERY;

    public String value() {
        return name();
    }

    public static CreditCardSettlementScheduleType fromValue(String v) {
        return valueOf(v);
    }

}
