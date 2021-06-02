
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsynchronousProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AsynchronousProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLOW_ASYNCHRONOUS"/&gt;
 *     &lt;enumeration value="ASYNCHRONOUS_ONLY"/&gt;
 *     &lt;enumeration value="SYNCHRONOUS_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AsynchronousProcessingOptionType")
@XmlEnum
public enum AsynchronousProcessingOptionType {

    ALLOW_ASYNCHRONOUS,
    ASYNCHRONOUS_ONLY,
    SYNCHRONOUS_ONLY;

    public String value() {
        return name();
    }

    public static AsynchronousProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
