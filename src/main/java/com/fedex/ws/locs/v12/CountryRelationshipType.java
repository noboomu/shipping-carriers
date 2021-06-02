
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryRelationshipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CountryRelationshipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOMESTIC"/&gt;
 *     &lt;enumeration value="INTERNATIONAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryRelationshipType")
@XmlEnum
public enum CountryRelationshipType {

    DOMESTIC,
    INTERNATIONAL;

    public String value() {
        return name();
    }

    public static CountryRelationshipType fromValue(String v) {
        return valueOf(v);
    }

}
