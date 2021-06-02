
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InspectionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InspectionStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER_REFUSED_INSPECTION"/&gt;
 *     &lt;enumeration value="INSPECTED"/&gt;
 *     &lt;enumeration value="NOT_INSPECTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InspectionStatusType")
@XmlEnum
public enum InspectionStatusType {

    CUSTOMER_REFUSED_INSPECTION,
    INSPECTED,
    NOT_INSPECTED;

    public String value() {
        return name();
    }

    public static InspectionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
