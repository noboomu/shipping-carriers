
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodReturnReferenceIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CodReturnReferenceIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVOICE"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="REFERENCE"/&gt;
 *     &lt;enumeration value="TRACKING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodReturnReferenceIndicatorType")
@XmlEnum
public enum CodReturnReferenceIndicatorType {

    INVOICE,
    PO,
    REFERENCE,
    TRACKING;

    public String value() {
        return name();
    }

    public static CodReturnReferenceIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
