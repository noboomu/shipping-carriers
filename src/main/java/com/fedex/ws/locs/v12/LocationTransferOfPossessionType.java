
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationTransferOfPossessionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationTransferOfPossessionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DROPOFF"/&gt;
 *     &lt;enumeration value="HOLD_AT_LOCATION"/&gt;
 *     &lt;enumeration value="REDIRECT_TO_HOLD_AT_LOCATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationTransferOfPossessionType")
@XmlEnum
public enum LocationTransferOfPossessionType {

    DROPOFF,
    HOLD_AT_LOCATION,
    REDIRECT_TO_HOLD_AT_LOCATION;

    public String value() {
        return name();
    }

    public static LocationTransferOfPossessionType fromValue(String v) {
        return valueOf(v);
    }

}
