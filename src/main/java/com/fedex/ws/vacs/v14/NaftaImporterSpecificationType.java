
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaImporterSpecificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NaftaImporterSpecificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMPORTER_OF_RECORD"/&gt;
 *     &lt;enumeration value="RECIPIENT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="VARIOUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaftaImporterSpecificationType")
@XmlEnum
public enum NaftaImporterSpecificationType {

    IMPORTER_OF_RECORD,
    RECIPIENT,
    UNKNOWN,
    VARIOUS;

    public String value() {
        return name();
    }

    public static NaftaImporterSpecificationType fromValue(String v) {
        return valueOf(v);
    }

}
