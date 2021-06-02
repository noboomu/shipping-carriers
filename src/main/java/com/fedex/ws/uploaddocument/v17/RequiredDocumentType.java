
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequiredDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIR_WAYBILL"/&gt;
 *     &lt;enumeration value="CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="COMMERCIAL_INVOICE"/&gt;
 *     &lt;enumeration value="COMMERCIAL_OR_PRO_FORMA_INVOICE"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="PRO_FORMA_INVOICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequiredDocumentType")
@XmlEnum
public enum RequiredDocumentType {

    AIR_WAYBILL,
    CERTIFICATE_OF_ORIGIN,
    COMMERCIAL_INVOICE,
    COMMERCIAL_OR_PRO_FORMA_INVOICE,
    NAFTA_CERTIFICATE_OF_ORIGIN,
    PRO_FORMA_INVOICE;

    public String value() {
        return name();
    }

    public static RequiredDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
