
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelPrintingOrientationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LabelPrintingOrientationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOTTOM_EDGE_OF_TEXT_FIRST"/&gt;
 *     &lt;enumeration value="TOP_EDGE_OF_TEXT_FIRST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelPrintingOrientationType")
@XmlEnum
public enum LabelPrintingOrientationType {

    BOTTOM_EDGE_OF_TEXT_FIRST,
    TOP_EDGE_OF_TEXT_FIRST;

    public String value() {
        return name();
    }

    public static LabelPrintingOrientationType fromValue(String v) {
        return valueOf(v);
    }

}
