
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityPurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommodityPurposeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="CONSUMER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommodityPurposeType")
@XmlEnum
public enum CommodityPurposeType {

    BUSINESS,
    CONSUMER;

    public String value() {
        return name();
    }

    public static CommodityPurposeType fromValue(String v) {
        return valueOf(v);
    }

}
