
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousContainerPackingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazardousContainerPackingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL_PACKED_IN_ONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazardousContainerPackingType")
@XmlEnum
public enum HazardousContainerPackingType {

    ALL_PACKED_IN_ONE;

    public String value() {
        return name();
    }

    public static HazardousContainerPackingType fromValue(String v) {
        return valueOf(v);
    }

}
