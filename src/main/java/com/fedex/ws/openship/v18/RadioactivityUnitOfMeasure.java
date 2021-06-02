
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadioactivityUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RadioactivityUnitOfMeasure"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BQ"/&gt;
 *     &lt;enumeration value="GBQ"/&gt;
 *     &lt;enumeration value="KBQ"/&gt;
 *     &lt;enumeration value="MBQ"/&gt;
 *     &lt;enumeration value="PBQ"/&gt;
 *     &lt;enumeration value="TBQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RadioactivityUnitOfMeasure")
@XmlEnum
public enum RadioactivityUnitOfMeasure {

    BQ,
    GBQ,
    KBQ,
    MBQ,
    PBQ,
    TBQ;

    public String value() {
        return name();
    }

    public static RadioactivityUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
