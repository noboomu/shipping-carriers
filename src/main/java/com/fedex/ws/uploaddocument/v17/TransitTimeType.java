
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransitTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransitTimeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EIGHTEEN_DAYS"/&gt;
 *     &lt;enumeration value="EIGHT_DAYS"/&gt;
 *     &lt;enumeration value="ELEVEN_DAYS"/&gt;
 *     &lt;enumeration value="FIFTEEN_DAYS"/&gt;
 *     &lt;enumeration value="FIVE_DAYS"/&gt;
 *     &lt;enumeration value="FOURTEEN_DAYS"/&gt;
 *     &lt;enumeration value="FOUR_DAYS"/&gt;
 *     &lt;enumeration value="NINETEEN_DAYS"/&gt;
 *     &lt;enumeration value="NINE_DAYS"/&gt;
 *     &lt;enumeration value="ONE_DAY"/&gt;
 *     &lt;enumeration value="SEVENTEEN_DAYS"/&gt;
 *     &lt;enumeration value="SEVEN_DAYS"/&gt;
 *     &lt;enumeration value="SIXTEEN_DAYS"/&gt;
 *     &lt;enumeration value="SIX_DAYS"/&gt;
 *     &lt;enumeration value="TEN_DAYS"/&gt;
 *     &lt;enumeration value="THIRTEEN_DAYS"/&gt;
 *     &lt;enumeration value="THREE_DAYS"/&gt;
 *     &lt;enumeration value="TWELVE_DAYS"/&gt;
 *     &lt;enumeration value="TWENTY_DAYS"/&gt;
 *     &lt;enumeration value="TWO_DAYS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitTimeType")
@XmlEnum
public enum TransitTimeType {

    EIGHTEEN_DAYS,
    EIGHT_DAYS,
    ELEVEN_DAYS,
    FIFTEEN_DAYS,
    FIVE_DAYS,
    FOURTEEN_DAYS,
    FOUR_DAYS,
    NINETEEN_DAYS,
    NINE_DAYS,
    ONE_DAY,
    SEVENTEEN_DAYS,
    SEVEN_DAYS,
    SIXTEEN_DAYS,
    SIX_DAYS,
    TEN_DAYS,
    THIRTEEN_DAYS,
    THREE_DAYS,
    TWELVE_DAYS,
    TWENTY_DAYS,
    TWO_DAYS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static TransitTimeType fromValue(String v) {
        return valueOf(v);
    }

}
