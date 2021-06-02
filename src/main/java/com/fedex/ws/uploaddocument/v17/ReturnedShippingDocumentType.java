
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnedShippingDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnedShippingDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUXILIARY_LABEL"/&gt;
 *     &lt;enumeration value="CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_2_D_BARCODE"/&gt;
 *     &lt;enumeration value="COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL"/&gt;
 *     &lt;enumeration value="COD_RETURN_2_D_BARCODE"/&gt;
 *     &lt;enumeration value="COD_RETURN_LABEL"/&gt;
 *     &lt;enumeration value="COMMERCIAL_INVOICE"/&gt;
 *     &lt;enumeration value="CUSTOM_PACKAGE_DOCUMENT"/&gt;
 *     &lt;enumeration value="CUSTOM_SHIPMENT_DOCUMENT"/&gt;
 *     &lt;enumeration value="DANGEROUS_GOODS_SHIPPERS_DECLARATION"/&gt;
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_2_D_BARCODE"/&gt;
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL"/&gt;
 *     &lt;enumeration value="ETD_LABEL"/&gt;
 *     &lt;enumeration value="EXPORT_DECLARATION"/&gt;
 *     &lt;enumeration value="FEDEX_FREIGHT_STRAIGHT_BILL_OF_LADING"/&gt;
 *     &lt;enumeration value="FREIGHT_ADDRESS_LABEL"/&gt;
 *     &lt;enumeration value="GENERAL_AGENCY_AGREEMENT"/&gt;
 *     &lt;enumeration value="GROUND_BARCODE"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="OP_900"/&gt;
 *     &lt;enumeration value="OUTBOUND_2_D_BARCODE"/&gt;
 *     &lt;enumeration value="OUTBOUND_LABEL"/&gt;
 *     &lt;enumeration value="PENDING_SHIPMENT_EMAIL_NOTIFICATION"/&gt;
 *     &lt;enumeration value="PRO_FORMA_INVOICE"/&gt;
 *     &lt;enumeration value="RECIPIENT_ADDRESS_BARCODE"/&gt;
 *     &lt;enumeration value="RECIPIENT_POSTAL_BARCODE"/&gt;
 *     &lt;enumeration value="RETURN_INSTRUCTIONS"/&gt;
 *     &lt;enumeration value="TERMS_AND_CONDITIONS"/&gt;
 *     &lt;enumeration value="USPS_BARCODE"/&gt;
 *     &lt;enumeration value="VICS_BILL_OF_LADING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnedShippingDocumentType")
@XmlEnum
public enum ReturnedShippingDocumentType {

    AUXILIARY_LABEL,
    CERTIFICATE_OF_ORIGIN,
    COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_2_D_BARCODE,
    COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL,
    COD_RETURN_2_D_BARCODE,
    COD_RETURN_LABEL,
    COMMERCIAL_INVOICE,
    CUSTOM_PACKAGE_DOCUMENT,
    CUSTOM_SHIPMENT_DOCUMENT,
    DANGEROUS_GOODS_SHIPPERS_DECLARATION,
    DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_2_D_BARCODE,
    DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL,
    ETD_LABEL,
    EXPORT_DECLARATION,
    FEDEX_FREIGHT_STRAIGHT_BILL_OF_LADING,
    FREIGHT_ADDRESS_LABEL,
    GENERAL_AGENCY_AGREEMENT,
    GROUND_BARCODE,
    NAFTA_CERTIFICATE_OF_ORIGIN,
    OP_900,
    OUTBOUND_2_D_BARCODE,
    OUTBOUND_LABEL,
    PENDING_SHIPMENT_EMAIL_NOTIFICATION,
    PRO_FORMA_INVOICE,
    RECIPIENT_ADDRESS_BARCODE,
    RECIPIENT_POSTAL_BARCODE,
    RETURN_INSTRUCTIONS,
    TERMS_AND_CONDITIONS,
    USPS_BARCODE,
    VICS_BILL_OF_LADING;

    public String value() {
        return name();
    }

    public static ReturnedShippingDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
