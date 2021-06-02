
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsynchronousProcessingResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AsynchronousProcessingResultType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASYNCHRONOUSLY_PROCESSED"/&gt;
 *     &lt;enumeration value="SYNCHRONOUSLY_PROCESSED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AsynchronousProcessingResultType")
@XmlEnum
public enum AsynchronousProcessingResultType {

    ASYNCHRONOUSLY_PROCESSED,
    SYNCHRONOUSLY_PROCESSED;

    public String value() {
        return name();
    }

    public static AsynchronousProcessingResultType fromValue(String v) {
        return valueOf(v);
    }

}
