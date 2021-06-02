
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryFeeAndTaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AncillaryFeeAndTaxType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLEARANCE_ENTRY_FEE"/&gt;
 *     &lt;enumeration value="GOODS_AND_SERVICES_TAX"/&gt;
 *     &lt;enumeration value="HARMONIZED_SALES_TAX"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AncillaryFeeAndTaxType")
@XmlEnum
public enum AncillaryFeeAndTaxType {

    CLEARANCE_ENTRY_FEE,
    GOODS_AND_SERVICES_TAX,
    HARMONIZED_SALES_TAX,
    OTHER;

    public String value() {
        return name();
    }

    public static AncillaryFeeAndTaxType fromValue(String v) {
        return valueOf(v);
    }

}
