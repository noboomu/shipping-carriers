
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxesOrMiscellaneousChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaxesOrMiscellaneousChargeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMISSIONS"/&gt;
 *     &lt;enumeration value="DISCOUNTS"/&gt;
 *     &lt;enumeration value="HANDLING_FEES"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="ROYALTIES_AND_LICENSE_FEES"/&gt;
 *     &lt;enumeration value="TAXES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxesOrMiscellaneousChargeType")
@XmlEnum
public enum TaxesOrMiscellaneousChargeType {

    COMMISSIONS,
    DISCOUNTS,
    HANDLING_FEES,
    OTHER,
    ROYALTIES_AND_LICENSE_FEES,
    TAXES;

    public String value() {
        return name();
    }

    public static TaxesOrMiscellaneousChargeType fromValue(String v) {
        return valueOf(v);
    }

}
