
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodCollectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CodCollectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANY"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="COMPANY_CHECK"/&gt;
 *     &lt;enumeration value="GUARANTEED_FUNDS"/&gt;
 *     &lt;enumeration value="PERSONAL_CHECK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodCollectionType")
@XmlEnum
public enum CodCollectionType {

    ANY,
    CASH,
    COMPANY_CHECK,
    GUARANTEED_FUNDS,
    PERSONAL_CHECK;

    public String value() {
        return name();
    }

    public static CodCollectionType fromValue(String v) {
        return valueOf(v);
    }

}
