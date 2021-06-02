
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageQuadrantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PageQuadrantType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOTTOM_LEFT"/&gt;
 *     &lt;enumeration value="BOTTOM_RIGHT"/&gt;
 *     &lt;enumeration value="TOP_LEFT"/&gt;
 *     &lt;enumeration value="TOP_RIGHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PageQuadrantType")
@XmlEnum
public enum PageQuadrantType {

    BOTTOM_LEFT,
    BOTTOM_RIGHT,
    TOP_LEFT,
    TOP_RIGHT;

    public String value() {
        return name();
    }

    public static PageQuadrantType fromValue(String v) {
        return valueOf(v);
    }

}
