
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelMaskableDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LabelMaskableDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMS_VALUE"/&gt;
 *     &lt;enumeration value="DIMENSIONS"/&gt;
 *     &lt;enumeration value="DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER"/&gt;
 *     &lt;enumeration value="FREIGHT_PAYOR_ACCOUNT_NUMBER"/&gt;
 *     &lt;enumeration value="INSURED_VALUE"/&gt;
 *     &lt;enumeration value="PACKAGE_SEQUENCE_AND_COUNT"/&gt;
 *     &lt;enumeration value="SECONDARY_BARCODE"/&gt;
 *     &lt;enumeration value="SHIPPER_ACCOUNT_NUMBER"/&gt;
 *     &lt;enumeration value="SHIPPER_INFORMATION"/&gt;
 *     &lt;enumeration value="SUPPLEMENTAL_LABEL_DOC_TAB"/&gt;
 *     &lt;enumeration value="TERMS_AND_CONDITIONS"/&gt;
 *     &lt;enumeration value="TOTAL_WEIGHT"/&gt;
 *     &lt;enumeration value="TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelMaskableDataType")
@XmlEnum
public enum LabelMaskableDataType {

    CUSTOMS_VALUE,
    DIMENSIONS,
    DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER,
    FREIGHT_PAYOR_ACCOUNT_NUMBER,
    INSURED_VALUE,
    PACKAGE_SEQUENCE_AND_COUNT,
    SECONDARY_BARCODE,
    SHIPPER_ACCOUNT_NUMBER,
    SHIPPER_INFORMATION,
    SUPPLEMENTAL_LABEL_DOC_TAB,
    TERMS_AND_CONDITIONS,
    TOTAL_WEIGHT,
    TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER;

    public String value() {
        return name();
    }

    public static LabelMaskableDataType fromValue(String v) {
        return valueOf(v);
    }

}
