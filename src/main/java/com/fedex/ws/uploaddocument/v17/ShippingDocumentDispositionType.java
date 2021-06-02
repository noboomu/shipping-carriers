
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentDispositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentDispositionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="DEFERRED_QUEUED"/&gt;
 *     &lt;enumeration value="DEFERRED_RETURNED"/&gt;
 *     &lt;enumeration value="DEFERRED_STORED"/&gt;
 *     &lt;enumeration value="EMAILED"/&gt;
 *     &lt;enumeration value="QUEUED"/&gt;
 *     &lt;enumeration value="RETURNED"/&gt;
 *     &lt;enumeration value="STORED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentDispositionType")
@XmlEnum
public enum ShippingDocumentDispositionType {

    CONFIRMED,
    DEFERRED_QUEUED,
    DEFERRED_RETURNED,
    DEFERRED_STORED,
    EMAILED,
    QUEUED,
    RETURNED,
    STORED;

    public String value() {
        return name();
    }

    public static ShippingDocumentDispositionType fromValue(String v) {
        return valueOf(v);
    }

}
