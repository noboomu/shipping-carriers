
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadioactiveContainerClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RadioactiveContainerClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXCEPTED_PACKAGE"/&gt;
 *     &lt;enumeration value="INDUSTRIAL_IP1"/&gt;
 *     &lt;enumeration value="INDUSTRIAL_IP2"/&gt;
 *     &lt;enumeration value="INDUSTRIAL_IP3"/&gt;
 *     &lt;enumeration value="TYPE_A"/&gt;
 *     &lt;enumeration value="TYPE_B_M"/&gt;
 *     &lt;enumeration value="TYPE_B_U"/&gt;
 *     &lt;enumeration value="TYPE_C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RadioactiveContainerClassType")
@XmlEnum
public enum RadioactiveContainerClassType {

    EXCEPTED_PACKAGE("EXCEPTED_PACKAGE"),
    @XmlEnumValue("INDUSTRIAL_IP1")
    INDUSTRIAL_IP_1("INDUSTRIAL_IP1"),
    @XmlEnumValue("INDUSTRIAL_IP2")
    INDUSTRIAL_IP_2("INDUSTRIAL_IP2"),
    @XmlEnumValue("INDUSTRIAL_IP3")
    INDUSTRIAL_IP_3("INDUSTRIAL_IP3"),
    TYPE_A("TYPE_A"),
    TYPE_B_M("TYPE_B_M"),
    TYPE_B_U("TYPE_B_U"),
    TYPE_C("TYPE_C");
    private final String value;

    RadioactiveContainerClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RadioactiveContainerClassType fromValue(String v) {
        for (RadioactiveContainerClassType c: RadioactiveContainerClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
