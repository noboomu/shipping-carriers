
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousGoodsDescriptorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DangerousGoodsDescriptorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALCOHOLIC_BEVERAGE"/&gt;
 *     &lt;enumeration value="DRY_ICE"/&gt;
 *     &lt;enumeration value="EMERGENCY_CONTACT_PHONE_REQUIRED"/&gt;
 *     &lt;enumeration value="EXCEPTED_QUANTITIES"/&gt;
 *     &lt;enumeration value="INFECTIOUS_SUBSTANCE"/&gt;
 *     &lt;enumeration value="RADIOACTIVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodsDescriptorType")
@XmlEnum
public enum DangerousGoodsDescriptorType {

    ALCOHOLIC_BEVERAGE,
    DRY_ICE,
    EMERGENCY_CONTACT_PHONE_REQUIRED,
    EXCEPTED_QUANTITIES,
    INFECTIOUS_SUBSTANCE,
    RADIOACTIVE;

    public String value() {
        return name();
    }

    public static DangerousGoodsDescriptorType fromValue(String v) {
        return valueOf(v);
    }

}
