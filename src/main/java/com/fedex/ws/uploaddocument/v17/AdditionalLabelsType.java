
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalLabelsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AdditionalLabelsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BROKER"/&gt;
 *     &lt;enumeration value="CONSIGNEE"/&gt;
 *     &lt;enumeration value="CUSTOMS"/&gt;
 *     &lt;enumeration value="DESTINATION"/&gt;
 *     &lt;enumeration value="DESTINATION_CONTROL_STATEMENT"/&gt;
 *     &lt;enumeration value="FREIGHT_REFERENCE"/&gt;
 *     &lt;enumeration value="MANIFEST"/&gt;
 *     &lt;enumeration value="ORIGIN"/&gt;
 *     &lt;enumeration value="RECIPIENT"/&gt;
 *     &lt;enumeration value="SECOND_ADDRESS"/&gt;
 *     &lt;enumeration value="SHIPPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalLabelsType")
@XmlEnum
public enum AdditionalLabelsType {

    BROKER,
    CONSIGNEE,
    CUSTOMS,
    DESTINATION,
    DESTINATION_CONTROL_STATEMENT,
    FREIGHT_REFERENCE,
    MANIFEST,
    ORIGIN,
    RECIPIENT,
    SECOND_ADDRESS,
    SHIPPER;

    public String value() {
        return name();
    }

    public static AdditionalLabelsType fromValue(String v) {
        return valueOf(v);
    }

}
