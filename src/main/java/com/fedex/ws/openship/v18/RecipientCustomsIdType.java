
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientCustomsIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RecipientCustomsIdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMPANY"/&gt;
 *     &lt;enumeration value="INDIVIDUAL"/&gt;
 *     &lt;enumeration value="PASSPORT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecipientCustomsIdType")
@XmlEnum
public enum RecipientCustomsIdType {

    COMPANY,
    INDIVIDUAL,
    PASSPORT;

    public String value() {
        return name();
    }

    public static RecipientCustomsIdType fromValue(String v) {
        return valueOf(v);
    }

}
