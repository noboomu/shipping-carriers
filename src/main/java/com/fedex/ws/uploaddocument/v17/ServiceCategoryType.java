
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXPRESS_FREIGHT"/&gt;
 *     &lt;enumeration value="EXPRESS_PARCEL"/&gt;
 *     &lt;enumeration value="GROUND_HOME_DELIVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceCategoryType")
@XmlEnum
public enum ServiceCategoryType {

    EXPRESS_FREIGHT,
    EXPRESS_PARCEL,
    GROUND_HOME_DELIVERY;

    public String value() {
        return name();
    }

    public static ServiceCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
