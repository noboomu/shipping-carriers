
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightCollectTermsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightCollectTermsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NON_RECOURSE_SHIPPER_SIGNED"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightCollectTermsType")
@XmlEnum
public enum FreightCollectTermsType {

    NON_RECOURSE_SHIPPER_SIGNED,
    STANDARD;

    public String value() {
        return name();
    }

    public static FreightCollectTermsType fromValue(String v) {
        return valueOf(v);
    }

}
