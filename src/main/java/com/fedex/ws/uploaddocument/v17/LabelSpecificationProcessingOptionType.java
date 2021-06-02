
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelSpecificationProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LabelSpecificationProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCLUDE_DOC_TAB_ON_ALL_LABELS"/&gt;
 *     &lt;enumeration value="PRE_EACI_LABEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelSpecificationProcessingOptionType")
@XmlEnum
public enum LabelSpecificationProcessingOptionType {

    INCLUDE_DOC_TAB_ON_ALL_LABELS,
    PRE_EACI_LABEL;

    public String value() {
        return name();
    }

    public static LabelSpecificationProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
