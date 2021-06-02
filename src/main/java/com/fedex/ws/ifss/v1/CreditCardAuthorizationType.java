
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardAuthorizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreditCardAuthorizationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTHORIZE_NON_ACCOUNT"/&gt;
 *     &lt;enumeration value="AUTHORIZE_WITH_ACCOUNT"/&gt;
 *     &lt;enumeration value="VERIFY_WITH_ACCOUNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditCardAuthorizationType")
@XmlEnum
public enum CreditCardAuthorizationType {

    AUTHORIZE_NON_ACCOUNT,
    AUTHORIZE_WITH_ACCOUNT,
    VERIFY_WITH_ACCOUNT;

    public String value() {
        return name();
    }

    public static CreditCardAuthorizationType fromValue(String v) {
        return valueOf(v);
    }

}
