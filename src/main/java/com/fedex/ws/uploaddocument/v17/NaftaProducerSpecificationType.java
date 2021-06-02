
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaProducerSpecificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NaftaProducerSpecificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVAILABLE_UPON_REQUEST"/&gt;
 *     &lt;enumeration value="MULTIPLE_SPECIFIED"/&gt;
 *     &lt;enumeration value="SAME"/&gt;
 *     &lt;enumeration value="SINGLE_SPECIFIED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaftaProducerSpecificationType")
@XmlEnum
public enum NaftaProducerSpecificationType {

    AVAILABLE_UPON_REQUEST,
    MULTIPLE_SPECIFIED,
    SAME,
    SINGLE_SPECIFIED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static NaftaProducerSpecificationType fromValue(String v) {
        return valueOf(v);
    }

}
