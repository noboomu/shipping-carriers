
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentGroupingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentGroupingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONSOLIDATED_BY_DOCUMENT_TYPE"/&gt;
 *     &lt;enumeration value="CONSOLIDATED_BY_IMAGE_TYPE"/&gt;
 *     &lt;enumeration value="INDIVIDUAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentGroupingType")
@XmlEnum
public enum ShippingDocumentGroupingType {

    CONSOLIDATED_BY_DOCUMENT_TYPE,
    CONSOLIDATED_BY_IMAGE_TYPE,
    INDIVIDUAL;

    public String value() {
        return name();
    }

    public static ShippingDocumentGroupingType fromValue(String v) {
        return valueOf(v);
    }

}
