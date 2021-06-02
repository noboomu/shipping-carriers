
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedShippingDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequestedShippingDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="COMMERCIAL_INVOICE"/&gt;
 *     &lt;enumeration value="CUSTOMER_SPECIFIED_LABELS"/&gt;
 *     &lt;enumeration value="CUSTOM_PACKAGE_DOCUMENT"/&gt;
 *     &lt;enumeration value="CUSTOM_SHIPMENT_DOCUMENT"/&gt;
 *     &lt;enumeration value="DANGEROUS_GOODS_SHIPPERS_DECLARATION"/&gt;
 *     &lt;enumeration value="EXPORT_DECLARATION"/&gt;
 *     &lt;enumeration value="FEDEX_FREIGHT_STRAIGHT_BILL_OF_LADING"/&gt;
 *     &lt;enumeration value="FREIGHT_ADDRESS_LABEL"/&gt;
 *     &lt;enumeration value="GENERAL_AGENCY_AGREEMENT"/&gt;
 *     &lt;enumeration value="LABEL"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="OP_900"/&gt;
 *     &lt;enumeration value="PENDING_SHIPMENT_EMAIL_NOTIFICATION"/&gt;
 *     &lt;enumeration value="PRO_FORMA_INVOICE"/&gt;
 *     &lt;enumeration value="RETURN_INSTRUCTIONS"/&gt;
 *     &lt;enumeration value="VICS_BILL_OF_LADING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestedShippingDocumentType")
@XmlEnum
public enum RequestedShippingDocumentType {

    CERTIFICATE_OF_ORIGIN,
    COMMERCIAL_INVOICE,
    CUSTOMER_SPECIFIED_LABELS,
    CUSTOM_PACKAGE_DOCUMENT,
    CUSTOM_SHIPMENT_DOCUMENT,
    DANGEROUS_GOODS_SHIPPERS_DECLARATION,
    EXPORT_DECLARATION,
    FEDEX_FREIGHT_STRAIGHT_BILL_OF_LADING,
    FREIGHT_ADDRESS_LABEL,
    GENERAL_AGENCY_AGREEMENT,
    LABEL,
    NAFTA_CERTIFICATE_OF_ORIGIN,
    OP_900,
    PENDING_SHIPMENT_EMAIL_NOTIFICATION,
    PRO_FORMA_INVOICE,
    RETURN_INSTRUCTIONS,
    VICS_BILL_OF_LADING;

    public String value() {
        return name();
    }

    public static RequestedShippingDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
