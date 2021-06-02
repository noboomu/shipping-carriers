
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateRequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNT"/&gt;
 *     &lt;enumeration value="CUSTOM"/&gt;
 *     &lt;enumeration value="INCENTIVE"/&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="PREFERRED"/&gt;
 *     &lt;enumeration value="RATED"/&gt;
 *     &lt;enumeration value="RETAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateRequestType")
@XmlEnum
public enum RateRequestType {

    ACCOUNT,
    CUSTOM,
    INCENTIVE,
    LIST,
    NONE,
    PREFERRED,
    RATED,
    RETAIL;

    public String value() {
        return name();
    }

    public static RateRequestType fromValue(String v) {
        return valueOf(v);
    }

}
