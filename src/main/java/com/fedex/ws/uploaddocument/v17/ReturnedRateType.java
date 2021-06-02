
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnedRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnedRateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCENTIVE"/&gt;
 *     &lt;enumeration value="NEGOTIATED"/&gt;
 *     &lt;enumeration value="PAYOR_ACCOUNT_PACKAGE"/&gt;
 *     &lt;enumeration value="PAYOR_ACCOUNT_SHIPMENT"/&gt;
 *     &lt;enumeration value="PAYOR_CUSTOM_PACKAGE"/&gt;
 *     &lt;enumeration value="PAYOR_CUSTOM_SHIPMENT"/&gt;
 *     &lt;enumeration value="PAYOR_LIST_PACKAGE"/&gt;
 *     &lt;enumeration value="PAYOR_LIST_SHIPMENT"/&gt;
 *     &lt;enumeration value="PAYOR_RETAIL_PACKAGE"/&gt;
 *     &lt;enumeration value="PAYOR_RETAIL_SHIPMENT"/&gt;
 *     &lt;enumeration value="PREFERRED_ACCOUNT_PACKAGE"/&gt;
 *     &lt;enumeration value="PREFERRED_ACCOUNT_SHIPMENT"/&gt;
 *     &lt;enumeration value="PREFERRED_CUSTOM_PACKAGE"/&gt;
 *     &lt;enumeration value="PREFERRED_CUSTOM_SHIPMENT"/&gt;
 *     &lt;enumeration value="PREFERRED_INCENTIVE"/&gt;
 *     &lt;enumeration value="PREFERRED_LIST_PACKAGE"/&gt;
 *     &lt;enumeration value="PREFERRED_LIST_SHIPMENT"/&gt;
 *     &lt;enumeration value="PREFERRED_NEGOTIATED"/&gt;
 *     &lt;enumeration value="PREFERRED_RETAIL_PACKAGE"/&gt;
 *     &lt;enumeration value="PREFERRED_RETAIL_SHIPMENT"/&gt;
 *     &lt;enumeration value="RATED_ACCOUNT_PACKAGE"/&gt;
 *     &lt;enumeration value="RATED_ACCOUNT_SHIPMENT"/&gt;
 *     &lt;enumeration value="RATED_CUSTOM_PACKAGE"/&gt;
 *     &lt;enumeration value="RATED_CUSTOM_SHIPMENT"/&gt;
 *     &lt;enumeration value="RATED_LIST_PACKAGE"/&gt;
 *     &lt;enumeration value="RATED_LIST_SHIPMENT"/&gt;
 *     &lt;enumeration value="RATED_RETAIL_PACKAGE"/&gt;
 *     &lt;enumeration value="RATED_RETAIL_SHIPMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnedRateType")
@XmlEnum
public enum ReturnedRateType {

    INCENTIVE,
    NEGOTIATED,
    PAYOR_ACCOUNT_PACKAGE,
    PAYOR_ACCOUNT_SHIPMENT,
    PAYOR_CUSTOM_PACKAGE,
    PAYOR_CUSTOM_SHIPMENT,
    PAYOR_LIST_PACKAGE,
    PAYOR_LIST_SHIPMENT,
    PAYOR_RETAIL_PACKAGE,
    PAYOR_RETAIL_SHIPMENT,
    PREFERRED_ACCOUNT_PACKAGE,
    PREFERRED_ACCOUNT_SHIPMENT,
    PREFERRED_CUSTOM_PACKAGE,
    PREFERRED_CUSTOM_SHIPMENT,
    PREFERRED_INCENTIVE,
    PREFERRED_LIST_PACKAGE,
    PREFERRED_LIST_SHIPMENT,
    PREFERRED_NEGOTIATED,
    PREFERRED_RETAIL_PACKAGE,
    PREFERRED_RETAIL_SHIPMENT,
    RATED_ACCOUNT_PACKAGE,
    RATED_ACCOUNT_SHIPMENT,
    RATED_CUSTOM_PACKAGE,
    RATED_CUSTOM_SHIPMENT,
    RATED_LIST_PACKAGE,
    RATED_LIST_SHIPMENT,
    RATED_RETAIL_PACKAGE,
    RATED_RETAIL_SHIPMENT;

    public String value() {
        return name();
    }

    public static ReturnedRateType fromValue(String v) {
        return valueOf(v);
    }

}
