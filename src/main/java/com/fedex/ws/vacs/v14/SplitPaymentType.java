
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SplitPaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPOINTMENT_DELIVERY"/&gt;
 *     &lt;enumeration value="PIECE_COUNT_VERIFICATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SplitPaymentType")
@XmlEnum
public enum SplitPaymentType {

    APPOINTMENT_DELIVERY,
    PIECE_COUNT_VERIFICATION;

    public String value() {
        return name();
    }

    public static SplitPaymentType fromValue(String v) {
        return valueOf(v);
    }

}
