
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDetailAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackDetailAttributeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCLUDED_IN_WATCHLIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackDetailAttributeType")
@XmlEnum
public enum TrackDetailAttributeType {

    INCLUDED_IN_WATCHLIST;

    public String value() {
        return name();
    }

    public static TrackDetailAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
