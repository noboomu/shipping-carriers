
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelayLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DelayLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CITY"/&gt;
 *     &lt;enumeration value="COUNTRY"/&gt;
 *     &lt;enumeration value="LOCATION"/&gt;
 *     &lt;enumeration value="POSTAL_CODE"/&gt;
 *     &lt;enumeration value="SERVICE_AREA"/&gt;
 *     &lt;enumeration value="SERVICE_AREA_SPECIAL_SERVICE"/&gt;
 *     &lt;enumeration value="SPECIAL_SERVICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelayLevelType")
@XmlEnum
public enum DelayLevelType {

    CITY,
    COUNTRY,
    LOCATION,
    POSTAL_CODE,
    SERVICE_AREA,
    SERVICE_AREA_SPECIAL_SERVICE,
    SPECIAL_SERVICE;

    public String value() {
        return name();
    }

    public static DelayLevelType fromValue(String v) {
        return valueOf(v);
    }

}
