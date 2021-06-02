
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaProducerDeterminationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NaftaProducerDeterminationCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_1"/&gt;
 *     &lt;enumeration value="NO_2"/&gt;
 *     &lt;enumeration value="NO_3"/&gt;
 *     &lt;enumeration value="YES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaftaProducerDeterminationCode")
@XmlEnum
public enum NaftaProducerDeterminationCode {

    NO_1,
    NO_2,
    NO_3,
    YES;

    public String value() {
        return name();
    }

    public static NaftaProducerDeterminationCode fromValue(String v) {
        return valueOf(v);
    }

}
