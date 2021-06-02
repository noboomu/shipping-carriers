
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSourceFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionSourceFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_CTS"/&gt;
 *     &lt;enumeration value="API_XML"/&gt;
 *     &lt;enumeration value="DIRECT"/&gt;
 *     &lt;enumeration value="DIRECT_XML"/&gt;
 *     &lt;enumeration value="FXRS_CTS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="WSI_XML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionSourceFormat")
@XmlEnum
public enum TransactionSourceFormat {

    API_CTS,
    API_XML,
    DIRECT,
    DIRECT_XML,
    FXRS_CTS,
    UNKNOWN,
    WSI_XML;

    public String value() {
        return name();
    }

    public static TransactionSourceFormat fromValue(String v) {
        return valueOf(v);
    }

}
