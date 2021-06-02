
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagePackedByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PackagePackedByType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *     &lt;enumeration value="FEDEX_OFFICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PackagePackedByType")
@XmlEnum
public enum PackagePackedByType {

    CUSTOMER,
    FEDEX_OFFICE;

    public String value() {
        return name();
    }

    public static PackagePackedByType fromValue(String v) {
        return valueOf(v);
    }

}
