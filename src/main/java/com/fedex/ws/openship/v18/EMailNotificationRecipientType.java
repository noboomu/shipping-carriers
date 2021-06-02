
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailNotificationRecipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EMailNotificationRecipientType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BROKER"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="RECIPIENT"/&gt;
 *     &lt;enumeration value="SHIPPER"/&gt;
 *     &lt;enumeration value="THIRD_PARTY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationRecipientType")
@XmlEnum
public enum EMailNotificationRecipientType {

    BROKER,
    OTHER,
    RECIPIENT,
    SHIPPER,
    THIRD_PARTY;

    public String value() {
        return name();
    }

    public static EMailNotificationRecipientType fromValue(String v) {
        return valueOf(v);
    }

}
