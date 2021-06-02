
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteRecordedShipmentRequestServiceLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeleteRecordedShipmentRequestServiceLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELETE_ALL_PACKAGES"/&gt;
 *     &lt;enumeration value="DELETE_ENTIRE_CONSOLIDATION"/&gt;
 *     &lt;enumeration value="DELETE_ONE_PACKAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeleteRecordedShipmentRequestServiceLevel")
@XmlEnum
public enum DeleteRecordedShipmentRequestServiceLevel {

    DELETE_ALL_PACKAGES,
    DELETE_ENTIRE_CONSOLIDATION,
    DELETE_ONE_PACKAGE;

    public String value() {
        return name();
    }

    public static DeleteRecordedShipmentRequestServiceLevel fromValue(String v) {
        return valueOf(v);
    }

}
