
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL_OF_LADING"/&gt;
 *     &lt;enumeration value="FREIGHT_BILLING_DOCUMENT"/&gt;
 *     &lt;enumeration value="SIGNATURE_PROOF_OF_DELIVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingDocumentType")
@XmlEnum
public enum TrackingDocumentType {

    BILL_OF_LADING,
    FREIGHT_BILLING_DOCUMENT,
    SIGNATURE_PROOF_OF_DELIVERY;

    public String value() {
        return name();
    }

    public static TrackingDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
