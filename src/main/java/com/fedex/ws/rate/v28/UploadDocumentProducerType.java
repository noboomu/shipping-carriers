
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentProducerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UploadDocumentProducerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *     &lt;enumeration value="FEDEX_CAFE"/&gt;
 *     &lt;enumeration value="FEDEX_CLS"/&gt;
 *     &lt;enumeration value="FEDEX_FIDT"/&gt;
 *     &lt;enumeration value="FEDEX_FXRS"/&gt;
 *     &lt;enumeration value="FEDEX_GSMW"/&gt;
 *     &lt;enumeration value="FEDEX_GTM"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UploadDocumentProducerType")
@XmlEnum
public enum UploadDocumentProducerType {

    CUSTOMER,
    FEDEX_CAFE,
    FEDEX_CLS,
    FEDEX_FIDT,
    FEDEX_FXRS,
    FEDEX_GSMW,
    FEDEX_GTM,
    OTHER;

    public String value() {
        return name();
    }

    public static UploadDocumentProducerType fromValue(String v) {
        return valueOf(v);
    }

}
