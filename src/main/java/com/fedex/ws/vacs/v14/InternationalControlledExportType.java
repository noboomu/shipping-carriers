
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalControlledExportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InternationalControlledExportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEA_036"/&gt;
 *     &lt;enumeration value="DEA_236"/&gt;
 *     &lt;enumeration value="DEA_486"/&gt;
 *     &lt;enumeration value="DSP_05"/&gt;
 *     &lt;enumeration value="DSP_61"/&gt;
 *     &lt;enumeration value="DSP_73"/&gt;
 *     &lt;enumeration value="DSP_85"/&gt;
 *     &lt;enumeration value="DSP_94"/&gt;
 *     &lt;enumeration value="DSP_LICENSE_AGREEMENT"/&gt;
 *     &lt;enumeration value="FROM_FOREIGN_TRADE_ZONE"/&gt;
 *     &lt;enumeration value="WAREHOUSE_WITHDRAWAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InternationalControlledExportType")
@XmlEnum
public enum InternationalControlledExportType {

    DEA_036,
    DEA_236,
    DEA_486,
    DSP_05,
    DSP_61,
    DSP_73,
    DSP_85,
    DSP_94,
    DSP_LICENSE_AGREEMENT,
    FROM_FOREIGN_TRADE_ZONE,
    WAREHOUSE_WITHDRAWAL;

    public String value() {
        return name();
    }

    public static InternationalControlledExportType fromValue(String v) {
        return valueOf(v);
    }

}
