
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentEMailGroupingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentEMailGroupingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BY_RECIPIENT"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentEMailGroupingType")
@XmlEnum
public enum ShippingDocumentEMailGroupingType {

    BY_RECIPIENT,
    NONE;

    public String value() {
        return name();
    }

    public static ShippingDocumentEMailGroupingType fromValue(String v) {
        return valueOf(v);
    }

}
