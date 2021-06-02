
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNT"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="COLLECT"/&gt;
 *     &lt;enumeration value="CREDIT_CARD"/&gt;
 *     &lt;enumeration value="RECIPIENT"/&gt;
 *     &lt;enumeration value="SENDER"/&gt;
 *     &lt;enumeration value="THIRD_PARTY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentType")
@XmlEnum
public enum PaymentType {

    ACCOUNT,
    CASH,
    COLLECT,
    CREDIT_CARD,
    RECIPIENT,
    SENDER,
    THIRD_PARTY;

    public String value() {
        return name();
    }

    public static PaymentType fromValue(String v) {
        return valueOf(v);
    }

}
