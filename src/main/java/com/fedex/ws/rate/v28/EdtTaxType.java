
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EdtTaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EdtTaxType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDITIONAL_TAXES"/&gt;
 *     &lt;enumeration value="CONSULAR_INVOICE_FEE"/&gt;
 *     &lt;enumeration value="CUSTOMS_SURCHARGES"/&gt;
 *     &lt;enumeration value="DUTY"/&gt;
 *     &lt;enumeration value="EXCISE_TAX"/&gt;
 *     &lt;enumeration value="FOREIGN_EXCHANGE_TAX"/&gt;
 *     &lt;enumeration value="GENERAL_SALES_TAX"/&gt;
 *     &lt;enumeration value="IMPORT_LICENSE_FEE"/&gt;
 *     &lt;enumeration value="INTERNAL_ADDITIONAL_TAXES"/&gt;
 *     &lt;enumeration value="INTERNAL_SENSITIVE_PRODUCTS_TAX"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="SENSITIVE_PRODUCTS_TAX"/&gt;
 *     &lt;enumeration value="STAMP_TAX"/&gt;
 *     &lt;enumeration value="STATISTICAL_TAX"/&gt;
 *     &lt;enumeration value="TRANSPORT_FACILITIES_TAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EdtTaxType")
@XmlEnum
public enum EdtTaxType {

    ADDITIONAL_TAXES,
    CONSULAR_INVOICE_FEE,
    CUSTOMS_SURCHARGES,
    DUTY,
    EXCISE_TAX,
    FOREIGN_EXCHANGE_TAX,
    GENERAL_SALES_TAX,
    IMPORT_LICENSE_FEE,
    INTERNAL_ADDITIONAL_TAXES,
    INTERNAL_SENSITIVE_PRODUCTS_TAX,
    OTHER,
    SENSITIVE_PRODUCTS_TAX,
    STAMP_TAX,
    STATISTICAL_TAX,
    TRANSPORT_FACILITIES_TAX;

    public String value() {
        return name();
    }

    public static EdtTaxType fromValue(String v) {
        return valueOf(v);
    }

}
