
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackChargesPaymentClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackChargesPaymentClassificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUTIES_AND_TAXES"/&gt;
 *     &lt;enumeration value="TRANSPORTATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackChargesPaymentClassificationType")
@XmlEnum
public enum TrackChargesPaymentClassificationType {

    DUTIES_AND_TAXES,
    TRANSPORTATION;

    public String value() {
        return name();
    }

    public static TrackChargesPaymentClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
