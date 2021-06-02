
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalCommercialTermsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InternationalCommercialTermsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="DAF"/&gt;
 *     &lt;enumeration value="DAP"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="DDU"/&gt;
 *     &lt;enumeration value="DEQ"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InternationalCommercialTermsType")
@XmlEnum
public enum InternationalCommercialTermsType {

    CFR,
    CIF,
    CIP,
    CPT,
    DAF,
    DAP,
    DAT,
    DDP,
    DDU,
    DEQ,
    DES,
    EXW,
    FAS,
    FCA,
    FOB;

    public String value() {
        return name();
    }

    public static InternationalCommercialTermsType fromValue(String v) {
        return valueOf(v);
    }

}
