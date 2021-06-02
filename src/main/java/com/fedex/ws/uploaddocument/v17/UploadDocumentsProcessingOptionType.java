
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentsProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UploadDocumentsProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POST_SHIPMENT_UPLOAD"/&gt;
 *     &lt;enumeration value="PRE_ETD_ENHANCEMENTS"/&gt;
 *     &lt;enumeration value="VALIDATE_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UploadDocumentsProcessingOptionType")
@XmlEnum
public enum UploadDocumentsProcessingOptionType {

    POST_SHIPMENT_UPLOAD,
    PRE_ETD_ENHANCEMENTS,
    VALIDATE_ONLY;

    public String value() {
        return name();
    }

    public static UploadDocumentsProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
