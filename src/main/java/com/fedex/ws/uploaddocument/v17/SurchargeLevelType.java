
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurchargeLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SurchargeLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACKAGE"/&gt;
 *     &lt;enumeration value="SHIPMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurchargeLevelType")
@XmlEnum
public enum SurchargeLevelType {

    PACKAGE,
    SHIPMENT;

    public String value() {
        return name();
    }

    public static SurchargeLevelType fromValue(String v) {
        return valueOf(v);
    }

}
