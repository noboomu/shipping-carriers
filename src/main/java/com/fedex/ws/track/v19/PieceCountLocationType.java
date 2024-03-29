
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PieceCountLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PieceCountLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DESTINATION"/&gt;
 *     &lt;enumeration value="ORIGIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PieceCountLocationType")
@XmlEnum
public enum PieceCountLocationType {

    DESTINATION,
    ORIGIN;

    public String value() {
        return name();
    }

    public static PieceCountLocationType fromValue(String v) {
        return valueOf(v);
    }

}
