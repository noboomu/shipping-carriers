
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B13AFilingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="B13AFilingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_TO_STAMP"/&gt;
 *     &lt;enumeration value="FILED_ELECTRONICALLY"/&gt;
 *     &lt;enumeration value="MANUALLY_ATTACHED"/&gt;
 *     &lt;enumeration value="NOT_REQUIRED"/&gt;
 *     &lt;enumeration value="SUMMARY_REPORTING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "B13AFilingOptionType")
@XmlEnum
public enum B13AFilingOptionType {

    FEDEX_TO_STAMP,
    FILED_ELECTRONICALLY,
    MANUALLY_ATTACHED,
    NOT_REQUIRED,
    SUMMARY_REPORTING;

    public String value() {
        return name();
    }

    public static B13AFilingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
