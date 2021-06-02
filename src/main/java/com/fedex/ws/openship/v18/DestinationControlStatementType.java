
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationControlStatementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DestinationControlStatementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEPARTMENT_OF_COMMERCE"/&gt;
 *     &lt;enumeration value="DEPARTMENT_OF_STATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DestinationControlStatementType")
@XmlEnum
public enum DestinationControlStatementType {

    DEPARTMENT_OF_COMMERCE,
    DEPARTMENT_OF_STATE;

    public String value() {
        return name();
    }

    public static DestinationControlStatementType fromValue(String v) {
        return valueOf(v);
    }

}
