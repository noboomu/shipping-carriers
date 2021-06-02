
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentNamingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentNamingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAST"/&gt;
 *     &lt;enumeration value="LEGACY_FXRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentNamingType")
@XmlEnum
public enum ShippingDocumentNamingType {

    FAST,
    LEGACY_FXRS;

    public String value() {
        return name();
    }

    public static ShippingDocumentNamingType fromValue(String v) {
        return valueOf(v);
    }

}
