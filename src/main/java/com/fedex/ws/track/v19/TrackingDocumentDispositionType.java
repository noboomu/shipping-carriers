
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocumentDispositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingDocumentDispositionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="RETURN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingDocumentDispositionType")
@XmlEnum
public enum TrackingDocumentDispositionType {

    EMAIL,
    FAX,
    RETURN;

    public String value() {
        return name();
    }

    public static TrackingDocumentDispositionType fromValue(String v) {
        return valueOf(v);
    }

}
