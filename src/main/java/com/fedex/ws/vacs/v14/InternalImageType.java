
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InternalImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LETTER_HEAD"/&gt;
 *     &lt;enumeration value="SIGNATURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InternalImageType")
@XmlEnum
public enum InternalImageType {

    LETTER_HEAD,
    SIGNATURE;

    public String value() {
        return name();
    }

    public static InternalImageType fromValue(String v) {
        return valueOf(v);
    }

}
