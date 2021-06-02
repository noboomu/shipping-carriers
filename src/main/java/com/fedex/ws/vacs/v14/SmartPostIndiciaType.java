
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartPostIndiciaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SmartPostIndiciaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MEDIA_MAIL"/&gt;
 *     &lt;enumeration value="PARCEL_RETURN"/&gt;
 *     &lt;enumeration value="PARCEL_SELECT"/&gt;
 *     &lt;enumeration value="PRESORTED_BOUND_PRINTED_MATTER"/&gt;
 *     &lt;enumeration value="PRESORTED_STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmartPostIndiciaType")
@XmlEnum
public enum SmartPostIndiciaType {

    MEDIA_MAIL,
    PARCEL_RETURN,
    PARCEL_SELECT,
    PRESORTED_BOUND_PRINTED_MATTER,
    PRESORTED_STANDARD;

    public String value() {
        return name();
    }

    public static SmartPostIndiciaType fromValue(String v) {
        return valueOf(v);
    }

}
