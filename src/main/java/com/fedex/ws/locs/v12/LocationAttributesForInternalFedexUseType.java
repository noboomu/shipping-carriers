
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAttributesForInternalFedexUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationAttributesForInternalFedexUseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAMIS_LOCATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationAttributesForInternalFedexUseType")
@XmlEnum
public enum LocationAttributesForInternalFedexUseType {

    FAMIS_LOCATION;

    public String value() {
        return name();
    }

    public static LocationAttributesForInternalFedexUseType fromValue(String v) {
        return valueOf(v);
    }

}
