
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeOfShipmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurposeOfShipmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GIFT"/&gt;
 *     &lt;enumeration value="NOT_SOLD"/&gt;
 *     &lt;enumeration value="PERSONAL_EFFECTS"/&gt;
 *     &lt;enumeration value="REPAIR_AND_RETURN"/&gt;
 *     &lt;enumeration value="SAMPLE"/&gt;
 *     &lt;enumeration value="SOLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurposeOfShipmentType")
@XmlEnum
public enum PurposeOfShipmentType {

    GIFT,
    NOT_SOLD,
    PERSONAL_EFFECTS,
    REPAIR_AND_RETURN,
    SAMPLE,
    SOLD;

    public String value() {
        return name();
    }

    public static PurposeOfShipmentType fromValue(String v) {
        return valueOf(v);
    }

}
