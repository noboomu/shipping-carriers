
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegulatoryLabelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALCOHOL_SHIPMENT_LABEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegulatoryLabelType")
@XmlEnum
public enum RegulatoryLabelType {

    ALCOHOL_SHIPMENT_LABEL;

    public String value() {
        return name();
    }

    public static RegulatoryLabelType fromValue(String v) {
        return valueOf(v);
    }

}
