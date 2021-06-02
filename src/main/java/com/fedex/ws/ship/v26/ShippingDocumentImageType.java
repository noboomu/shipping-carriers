
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIB"/&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="EPL2"/&gt;
 *     &lt;enumeration value="GIF"/&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="RTF"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="ZPLII"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentImageType")
@XmlEnum
public enum ShippingDocumentImageType {

    DIB("DIB"),
    DOC("DOC"),
    @XmlEnumValue("EPL2")
    EPL_2("EPL2"),
    GIF("GIF"),
    PDF("PDF"),
    PNG("PNG"),
    RTF("RTF"),
    TEXT("TEXT"),
    ZPLII("ZPLII");
    private final String value;

    ShippingDocumentImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingDocumentImageType fromValue(String v) {
        for (ShippingDocumentImageType c: ShippingDocumentImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
