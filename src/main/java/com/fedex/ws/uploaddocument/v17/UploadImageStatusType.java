
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadImageStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UploadImageStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UploadImageStatusType")
@XmlEnum
public enum UploadImageStatusType {

    ERROR,
    FAILURE,
    SUCCESS;

    public String value() {
        return name();
    }

    public static UploadImageStatusType fromValue(String v) {
        return valueOf(v);
    }

}
