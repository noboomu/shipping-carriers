
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentStatusInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UploadDocumentStatusInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOCUMENT_CONTENT_FAILED_VIRUS_CHECK"/&gt;
 *     &lt;enumeration value="DOCUMENT_CONTENT_MISSING"/&gt;
 *     &lt;enumeration value="DOCUMENT_CONTENT_TOO_LARGE"/&gt;
 *     &lt;enumeration value="DOCUMENT_FILE_NAME_MISSING"/&gt;
 *     &lt;enumeration value="DOCUMENT_FORMAT_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="DOCUMENT_ID_INVALID"/&gt;
 *     &lt;enumeration value="DOCUMENT_ID_MISSING"/&gt;
 *     &lt;enumeration value="DOCUMENT_TYPE_INVALID"/&gt;
 *     &lt;enumeration value="DOCUMENT_TYPE_MISSING"/&gt;
 *     &lt;enumeration value="DOCUMENT_TYPE_NOT_ALLOWED_FOR_ETD"/&gt;
 *     &lt;enumeration value="ELECTRONIC_CLEARANCE_NOT_ALLOWED_AT_DESTINATION"/&gt;
 *     &lt;enumeration value="ELECTRONIC_CLEARANCE_NOT_ALLOWED_AT_ORIGIN"/&gt;
 *     &lt;enumeration value="EXPIRATION_DATE_INVALID"/&gt;
 *     &lt;enumeration value="FILENAME_TOO_LONG"/&gt;
 *     &lt;enumeration value="INELIGIBLE_FOR_UPLOAD"/&gt;
 *     &lt;enumeration value="UNABLE_TO_PROCESS_DOCUMENT"/&gt;
 *     &lt;enumeration value="UPLOAD_NOT_ATTEMPTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UploadDocumentStatusInfoType")
@XmlEnum
public enum UploadDocumentStatusInfoType {

    DOCUMENT_CONTENT_FAILED_VIRUS_CHECK,
    DOCUMENT_CONTENT_MISSING,
    DOCUMENT_CONTENT_TOO_LARGE,
    DOCUMENT_FILE_NAME_MISSING,
    DOCUMENT_FORMAT_NOT_SUPPORTED,
    DOCUMENT_ID_INVALID,
    DOCUMENT_ID_MISSING,
    DOCUMENT_TYPE_INVALID,
    DOCUMENT_TYPE_MISSING,
    DOCUMENT_TYPE_NOT_ALLOWED_FOR_ETD,
    ELECTRONIC_CLEARANCE_NOT_ALLOWED_AT_DESTINATION,
    ELECTRONIC_CLEARANCE_NOT_ALLOWED_AT_ORIGIN,
    EXPIRATION_DATE_INVALID,
    FILENAME_TOO_LONG,
    INELIGIBLE_FOR_UPLOAD,
    UNABLE_TO_PROCESS_DOCUMENT,
    UPLOAD_NOT_ATTEMPTED;

    public String value() {
        return name();
    }

    public static UploadDocumentStatusInfoType fromValue(String v) {
        return valueOf(v);
    }

}
