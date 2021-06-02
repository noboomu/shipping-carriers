
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcoholRecipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AlcoholRecipientType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONSUMER"/&gt;
 *     &lt;enumeration value="LICENSEE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlcoholRecipientType")
@XmlEnum
public enum AlcoholRecipientType {

    CONSUMER,
    LICENSEE;

    public String value() {
        return name();
    }

    public static AlcoholRecipientType fromValue(String v) {
        return valueOf(v);
    }

}
