
package com.fedex.ws.async.v4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtifactFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ArtifactFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BINARY"/&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="EPL2"/&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="RTF"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="ZPLII"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArtifactFormatType")
@XmlEnum
public enum ArtifactFormatType {

    BINARY("BINARY"),
    DOC("DOC"),
    @XmlEnumValue("EPL2")
    EPL_2("EPL2"),
    PDF("PDF"),
    PNG("PNG"),
    RTF("RTF"),
    TEXT("TEXT"),
    XML("XML"),
    ZPLII("ZPLII");
    private final String value;

    ArtifactFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArtifactFormatType fromValue(String v) {
        for (ArtifactFormatType c: ArtifactFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
