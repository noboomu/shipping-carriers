
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UploadDocumentStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UploadDocumentStatusType")
@XmlEnum
public enum UploadDocumentStatusType {

    ERROR,
    FAILURE,
    SUCCESS;

    public String value() {
        return name();
    }

    public static UploadDocumentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
