
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageSizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageSizeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LARGE"/&gt;
 *     &lt;enumeration value="SMALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageSizeType")
@XmlEnum
public enum ImageSizeType {

    LARGE,
    SMALL;

    public String value() {
        return name();
    }

    public static ImageSizeType fromValue(String v) {
        return valueOf(v);
    }

}
