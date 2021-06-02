
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSpecifiedLabelGenerationOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerSpecifiedLabelGenerationOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTENT_ON_SHIPPING_LABEL_ONLY"/&gt;
 *     &lt;enumeration value="CONTENT_ON_SHIPPING_LABEL_PREFERRED"/&gt;
 *     &lt;enumeration value="CONTENT_ON_SUPPLEMENTAL_LABEL_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerSpecifiedLabelGenerationOptionType")
@XmlEnum
public enum CustomerSpecifiedLabelGenerationOptionType {

    CONTENT_ON_SHIPPING_LABEL_ONLY,
    CONTENT_ON_SHIPPING_LABEL_PREFERRED,
    CONTENT_ON_SUPPLEMENTAL_LABEL_ONLY;

    public String value() {
        return name();
    }

    public static CustomerSpecifiedLabelGenerationOptionType fromValue(String v) {
        return valueOf(v);
    }

}
