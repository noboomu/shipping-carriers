
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentOnlyFieldsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentOnlyFieldsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIMENSIONS"/&gt;
 *     &lt;enumeration value="INSURED_VALUE"/&gt;
 *     &lt;enumeration value="WEIGHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentOnlyFieldsType")
@XmlEnum
public enum ShipmentOnlyFieldsType {

    DIMENSIONS,
    INSURED_VALUE,
    WEIGHT;

    public String value() {
        return name();
    }

    public static ShipmentOnlyFieldsType fromValue(String v) {
        return valueOf(v);
    }

}
