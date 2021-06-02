
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeclarationValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeclarationValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMS_VALUE"/&gt;
 *     &lt;enumeration value="INSURED_VALUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeclarationValueType")
@XmlEnum
public enum DeclarationValueType {

    CUSTOMS_VALUE,
    INSURED_VALUE;

    public String value() {
        return name();
    }

    public static DeclarationValueType fromValue(String v) {
        return valueOf(v);
    }

}
