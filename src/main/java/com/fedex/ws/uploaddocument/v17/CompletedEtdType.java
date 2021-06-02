
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletedEtdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CompletedEtdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELECTRONIC_DOCUMENTS_ONLY"/&gt;
 *     &lt;enumeration value="ELECTRONIC_DOCUMENTS_WITH_ORIGINALS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompletedEtdType")
@XmlEnum
public enum CompletedEtdType {

    ELECTRONIC_DOCUMENTS_ONLY,
    ELECTRONIC_DOCUMENTS_WITH_ORIGINALS;

    public String value() {
        return name();
    }

    public static CompletedEtdType fromValue(String v) {
        return valueOf(v);
    }

}
