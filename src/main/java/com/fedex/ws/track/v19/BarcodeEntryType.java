
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BarcodeEntryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANUAL_ENTRY"/&gt;
 *     &lt;enumeration value="SCAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BarcodeEntryType")
@XmlEnum
public enum BarcodeEntryType {

    MANUAL_ENTRY,
    SCAN;

    public String value() {
        return name();
    }

    public static BarcodeEntryType fromValue(String v) {
        return valueOf(v);
    }

}
