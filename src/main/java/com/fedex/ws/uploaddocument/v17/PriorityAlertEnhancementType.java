
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityAlertEnhancementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PriorityAlertEnhancementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIORITY_ALERT_PLUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriorityAlertEnhancementType")
@XmlEnum
public enum PriorityAlertEnhancementType {

    PRIORITY_ALERT_PLUS;

    public String value() {
        return name();
    }

    public static PriorityAlertEnhancementType fromValue(String v) {
        return valueOf(v);
    }

}
