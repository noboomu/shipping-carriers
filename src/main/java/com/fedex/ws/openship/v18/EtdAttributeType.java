
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EtdAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EtdAttributeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POST_SHIPMENT_UPLOAD_REQUESTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EtdAttributeType")
@XmlEnum
public enum EtdAttributeType {

    POST_SHIPMENT_UPLOAD_REQUESTED;

    public String value() {
        return name();
    }

    public static EtdAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
