
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EtdConfirmationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EtdConfirmationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="DEFERRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EtdConfirmationType")
@XmlEnum
public enum EtdConfirmationType {

    CONFIRMED,
    DEFERRED;

    public String value() {
        return name();
    }

    public static EtdConfirmationType fromValue(String v) {
        return valueOf(v);
    }

}
