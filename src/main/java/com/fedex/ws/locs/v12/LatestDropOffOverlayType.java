
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LatestDropOffOverlayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LatestDropOffOverlayType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="US_WEST_COAST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LatestDropOffOverlayType")
@XmlEnum
public enum LatestDropOffOverlayType {

    US_WEST_COAST;

    public String value() {
        return name();
    }

    public static LatestDropOffOverlayType fromValue(String v) {
        return valueOf(v);
    }

}
