
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousGoodsAccessibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DangerousGoodsAccessibilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCESSIBLE"/&gt;
 *     &lt;enumeration value="INACCESSIBLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodsAccessibilityType")
@XmlEnum
public enum DangerousGoodsAccessibilityType {

    ACCESSIBLE,
    INACCESSIBLE;

    public String value() {
        return name();
    }

    public static DangerousGoodsAccessibilityType fromValue(String v) {
        return valueOf(v);
    }

}
