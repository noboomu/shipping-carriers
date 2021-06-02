
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperationalDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SIGNATURE_RELEASE_DOCUMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationalDocumentType")
@XmlEnum
public enum OperationalDocumentType {

    SIGNATURE_RELEASE_DOCUMENT;

    public String value() {
        return name();
    }

    public static OperationalDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
