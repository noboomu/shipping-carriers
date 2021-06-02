
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerReferenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL_OF_LADING"/&gt;
 *     &lt;enumeration value="CUSTOMER_REFERENCE"/&gt;
 *     &lt;enumeration value="DEPARTMENT_NUMBER"/&gt;
 *     &lt;enumeration value="ELECTRONIC_PRODUCT_CODE"/&gt;
 *     &lt;enumeration value="INTRACOUNTRY_REGULATORY_REFERENCE"/&gt;
 *     &lt;enumeration value="INVOICE_NUMBER"/&gt;
 *     &lt;enumeration value="PACKING_SLIP_NUMBER"/&gt;
 *     &lt;enumeration value="P_O_NUMBER"/&gt;
 *     &lt;enumeration value="RMA_ASSOCIATION"/&gt;
 *     &lt;enumeration value="SHIPMENT_INTEGRITY"/&gt;
 *     &lt;enumeration value="STORE_NUMBER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerReferenceType")
@XmlEnum
public enum CustomerReferenceType {

    BILL_OF_LADING,
    CUSTOMER_REFERENCE,
    DEPARTMENT_NUMBER,
    ELECTRONIC_PRODUCT_CODE,
    INTRACOUNTRY_REGULATORY_REFERENCE,
    INVOICE_NUMBER,
    PACKING_SLIP_NUMBER,
    P_O_NUMBER,
    RMA_ASSOCIATION,
    SHIPMENT_INTEGRITY,
    STORE_NUMBER;

    public String value() {
        return name();
    }

    public static CustomerReferenceType fromValue(String v) {
        return valueOf(v);
    }

}
