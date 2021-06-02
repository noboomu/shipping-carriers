
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageLineItemStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PackageLineItemStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELETED"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="EXPIRING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PackageLineItemStatusType")
@XmlEnum
public enum PackageLineItemStatusType {

    DELETED,
    EXPIRED,
    EXPIRING;

    public String value() {
        return name();
    }

    public static PackageLineItemStatusType fromValue(String v) {
        return valueOf(v);
    }

}
