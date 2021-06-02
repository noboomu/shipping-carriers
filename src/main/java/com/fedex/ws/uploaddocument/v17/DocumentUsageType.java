
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentUsageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER_INFORMATION"/&gt;
 *     &lt;enumeration value="ELECTRONIC_TRADE_DOCUMENTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentUsageType")
@XmlEnum
public enum DocumentUsageType {

    CUSTOMER_INFORMATION,
    ELECTRONIC_TRADE_DOCUMENTS;

    public String value() {
        return name();
    }

    public static DocumentUsageType fromValue(String v) {
        return valueOf(v);
    }

}
