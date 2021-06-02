
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageId"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMAGE_1"/&gt;
 *     &lt;enumeration value="IMAGE_2"/&gt;
 *     &lt;enumeration value="IMAGE_3"/&gt;
 *     &lt;enumeration value="IMAGE_4"/&gt;
 *     &lt;enumeration value="IMAGE_5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageId")
@XmlEnum
public enum ImageId {

    IMAGE_1,
    IMAGE_2,
    IMAGE_3,
    IMAGE_4,
    IMAGE_5;

    public String value() {
        return name();
    }

    public static ImageId fromValue(String v) {
        return valueOf(v);
    }

}
