
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleMatchesActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MultipleMatchesActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RETURN_ALL"/&gt;
 *     &lt;enumeration value="RETURN_ERROR"/&gt;
 *     &lt;enumeration value="RETURN_FIRST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MultipleMatchesActionType")
@XmlEnum
public enum MultipleMatchesActionType {

    RETURN_ALL,
    RETURN_ERROR,
    RETURN_FIRST;

    public String value() {
        return name();
    }

    public static MultipleMatchesActionType fromValue(String v) {
        return valueOf(v);
    }

}
