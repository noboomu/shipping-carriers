
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartPostAncillaryEndorsementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SmartPostAncillaryEndorsementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDRESS_CORRECTION"/&gt;
 *     &lt;enumeration value="CARRIER_LEAVE_IF_NO_RESPONSE"/&gt;
 *     &lt;enumeration value="CHANGE_SERVICE"/&gt;
 *     &lt;enumeration value="FORWARDING_SERVICE"/&gt;
 *     &lt;enumeration value="RETURN_SERVICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmartPostAncillaryEndorsementType")
@XmlEnum
public enum SmartPostAncillaryEndorsementType {

    ADDRESS_CORRECTION,
    CARRIER_LEAVE_IF_NO_RESPONSE,
    CHANGE_SERVICE,
    FORWARDING_SERVICE,
    RETURN_SERVICE;

    public String value() {
        return name();
    }

    public static SmartPostAncillaryEndorsementType fromValue(String v) {
        return valueOf(v);
    }

}
