
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreditCardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMEX"/&gt;
 *     &lt;enumeration value="DANKORT"/&gt;
 *     &lt;enumeration value="DINERS"/&gt;
 *     &lt;enumeration value="DISCOVER"/&gt;
 *     &lt;enumeration value="JCB"/&gt;
 *     &lt;enumeration value="MASTERCARD"/&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditCardType")
@XmlEnum
public enum CreditCardType {

    AMEX,
    DANKORT,
    DINERS,
    DISCOVER,
    JCB,
    MASTERCARD,
    VISA;

    public String value() {
        return name();
    }

    public static CreditCardType fromValue(String v) {
        return valueOf(v);
    }

}
