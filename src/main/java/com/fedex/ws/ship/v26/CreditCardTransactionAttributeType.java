
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardTransactionAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreditCardTransactionAttributeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORIGINATED_BY_AUTHORIZED_PERSONNEL"/&gt;
 *     &lt;enumeration value="ORIGINATED_BY_UNAUTHORIZED_PERSONNEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditCardTransactionAttributeType")
@XmlEnum
public enum CreditCardTransactionAttributeType {

    ORIGINATED_BY_AUTHORIZED_PERSONNEL,
    ORIGINATED_BY_UNAUTHORIZED_PERSONNEL;

    public String value() {
        return name();
    }

    public static CreditCardTransactionAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
