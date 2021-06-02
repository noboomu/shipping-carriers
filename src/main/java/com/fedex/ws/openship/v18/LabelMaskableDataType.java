
package com.fedex.ws.openship.v18;

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
 *     &lt;enumeration value="DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER"/&gt;
 *     &lt;enumeration value="SECONDARY_BARCODE"/&gt;
 *     &lt;enumeration value="SHIPPER_ACCOUNT_NUMBER"/&gt;
 *     &lt;enumeration value="TERMS_AND_CONDITIONS"/&gt;
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
    DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER,
    SECONDARY_BARCODE,
    SHIPPER_ACCOUNT_NUMBER,
    TERMS_AND_CONDITIONS,
    TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER;

    public String value() {
        return name();
    }

    public static LabelMaskableDataType fromValue(String v) {
        return valueOf(v);
    }

}
