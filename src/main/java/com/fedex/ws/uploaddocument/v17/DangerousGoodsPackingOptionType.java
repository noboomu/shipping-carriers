
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousGoodsPackingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DangerousGoodsPackingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OVERPACK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodsPackingOptionType")
@XmlEnum
public enum DangerousGoodsPackingOptionType {

    OVERPACK;

    public String value() {
        return name();
    }

    public static DangerousGoodsPackingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
