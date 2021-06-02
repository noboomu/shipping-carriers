
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOpenShipmentActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreateOpenShipmentActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONFIRM"/&gt;
 *     &lt;enumeration value="CREATE_PACKAGE"/&gt;
 *     &lt;enumeration value="STRONG_VALIDATION"/&gt;
 *     &lt;enumeration value="TRANSFER"/&gt;
 *     &lt;enumeration value="WEAK_VALIDATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreateOpenShipmentActionType")
@XmlEnum
public enum CreateOpenShipmentActionType {

    CONFIRM,
    CREATE_PACKAGE,
    STRONG_VALIDATION,
    TRANSFER,
    WEAK_VALIDATION;

    public String value() {
        return name();
    }

    public static CreateOpenShipmentActionType fromValue(String v) {
        return valueOf(v);
    }

}
