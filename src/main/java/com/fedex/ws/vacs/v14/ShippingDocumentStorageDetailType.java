
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentStorageDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentStorageDetailType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASYNC_SERVICE"/&gt;
 *     &lt;enumeration value="LOCAL_FILE_SYSTEM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentStorageDetailType")
@XmlEnum
public enum ShippingDocumentStorageDetailType {

    ASYNC_SERVICE,
    LOCAL_FILE_SYSTEM;

    public String value() {
        return name();
    }

    public static ShippingDocumentStorageDetailType fromValue(String v) {
        return valueOf(v);
    }

}
