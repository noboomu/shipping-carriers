
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocumentImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingDocumentImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingDocumentImageType")
@XmlEnum
public enum TrackingDocumentImageType {

    PDF,
    PNG;

    public String value() {
        return name();
    }

    public static TrackingDocumentImageType fromValue(String v) {
        return valueOf(v);
    }

}
