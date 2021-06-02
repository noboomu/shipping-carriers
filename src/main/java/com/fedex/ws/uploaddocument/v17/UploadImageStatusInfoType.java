
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadImageStatusInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UploadImageStatusInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMAGE_EXCEEDS_MAX_RESOLUTION"/&gt;
 *     &lt;enumeration value="IMAGE_EXCEEDS_MAX_SIZE"/&gt;
 *     &lt;enumeration value="IMAGE_FAILED_VIRUS_CHECK"/&gt;
 *     &lt;enumeration value="IMAGE_ID_INVALID"/&gt;
 *     &lt;enumeration value="IMAGE_ID_MISSING"/&gt;
 *     &lt;enumeration value="IMAGE_MISSING"/&gt;
 *     &lt;enumeration value="IMAGE_TYPE_INVALID"/&gt;
 *     &lt;enumeration value="IMAGE_TYPE_MISSING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UploadImageStatusInfoType")
@XmlEnum
public enum UploadImageStatusInfoType {

    IMAGE_EXCEEDS_MAX_RESOLUTION,
    IMAGE_EXCEEDS_MAX_SIZE,
    IMAGE_FAILED_VIRUS_CHECK,
    IMAGE_ID_INVALID,
    IMAGE_ID_MISSING,
    IMAGE_MISSING,
    IMAGE_TYPE_INVALID,
    IMAGE_TYPE_MISSING;

    public String value() {
        return name();
    }

    public static UploadImageStatusInfoType fromValue(String v) {
        return valueOf(v);
    }

}
