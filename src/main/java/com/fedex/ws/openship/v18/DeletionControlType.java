
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeletionControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeletionControlType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELETE_ALL_PACKAGES"/&gt;
 *     &lt;enumeration value="DELETE_ENTIRE_CONSOLIDATION"/&gt;
 *     &lt;enumeration value="DELETE_ONE_PACKAGE"/&gt;
 *     &lt;enumeration value="LEGACY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeletionControlType")
@XmlEnum
public enum DeletionControlType {

    DELETE_ALL_PACKAGES,
    DELETE_ENTIRE_CONSOLIDATION,
    DELETE_ONE_PACKAGE,
    LEGACY;

    public String value() {
        return name();
    }

    public static DeletionControlType fromValue(String v) {
        return valueOf(v);
    }

}
