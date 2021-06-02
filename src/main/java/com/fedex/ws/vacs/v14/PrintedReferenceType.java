
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintedReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PrintedReferenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL_OF_LADING"/&gt;
 *     &lt;enumeration value="CONSIGNEE_ID_NUMBER"/&gt;
 *     &lt;enumeration value="INTERLINE_PRO_NUMBER"/&gt;
 *     &lt;enumeration value="PO_NUMBER"/&gt;
 *     &lt;enumeration value="SHIPPER_ID_NUMBER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrintedReferenceType")
@XmlEnum
public enum PrintedReferenceType {

    BILL_OF_LADING,
    CONSIGNEE_ID_NUMBER,
    INTERLINE_PRO_NUMBER,
    PO_NUMBER,
    SHIPPER_ID_NUMBER;

    public String value() {
        return name();
    }

    public static PrintedReferenceType fromValue(String v) {
        return valueOf(v);
    }

}
