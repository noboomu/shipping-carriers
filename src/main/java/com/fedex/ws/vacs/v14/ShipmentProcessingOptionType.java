
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentProcessingOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLOW_PREVIOUS_SHIP_DATE"/&gt;
 *     &lt;enumeration value="BYPASS_CLEARANCE_PROHIBITS"/&gt;
 *     &lt;enumeration value="CONVENIENCE_MULTIPLE_PACKAGES"/&gt;
 *     &lt;enumeration value="CUSTOM_TRANSIT_TIME"/&gt;
 *     &lt;enumeration value="FUTURE_DAY_SHIPMENT"/&gt;
 *     &lt;enumeration value="IATA_CLASS_AND_AIRCRAFT_ONLY"/&gt;
 *     &lt;enumeration value="MANUAL_AIRBILL"/&gt;
 *     &lt;enumeration value="NO_COMMITMENT_DATE_REQUESTED"/&gt;
 *     &lt;enumeration value="PACKAGE_LEVEL_COMMODITIES"/&gt;
 *     &lt;enumeration value="PRE_EIG_PROCESSING"/&gt;
 *     &lt;enumeration value="PRE_ETD_ENHANCEMENTS"/&gt;
 *     &lt;enumeration value="PRE_FXF2020_HANDLING_UNIT_DETAILS"/&gt;
 *     &lt;enumeration value="PRE_GPR"/&gt;
 *     &lt;enumeration value="PRE_GRAPE2_SHIPMENT"/&gt;
 *     &lt;enumeration value="PRE_MULTIPLIER_PROCESSING"/&gt;
 *     &lt;enumeration value="REQUEST_LEGACY_SMARTPOST_LABEL"/&gt;
 *     &lt;enumeration value="REQUIRE_PRE_EPIC_BARCODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentProcessingOptionType")
@XmlEnum
public enum ShipmentProcessingOptionType {

    ALLOW_PREVIOUS_SHIP_DATE("ALLOW_PREVIOUS_SHIP_DATE"),
    BYPASS_CLEARANCE_PROHIBITS("BYPASS_CLEARANCE_PROHIBITS"),
    CONVENIENCE_MULTIPLE_PACKAGES("CONVENIENCE_MULTIPLE_PACKAGES"),
    CUSTOM_TRANSIT_TIME("CUSTOM_TRANSIT_TIME"),
    FUTURE_DAY_SHIPMENT("FUTURE_DAY_SHIPMENT"),
    IATA_CLASS_AND_AIRCRAFT_ONLY("IATA_CLASS_AND_AIRCRAFT_ONLY"),
    MANUAL_AIRBILL("MANUAL_AIRBILL"),
    NO_COMMITMENT_DATE_REQUESTED("NO_COMMITMENT_DATE_REQUESTED"),
    PACKAGE_LEVEL_COMMODITIES("PACKAGE_LEVEL_COMMODITIES"),
    PRE_EIG_PROCESSING("PRE_EIG_PROCESSING"),
    PRE_ETD_ENHANCEMENTS("PRE_ETD_ENHANCEMENTS"),
    @XmlEnumValue("PRE_FXF2020_HANDLING_UNIT_DETAILS")
    PRE_FXF_2020_HANDLING_UNIT_DETAILS("PRE_FXF2020_HANDLING_UNIT_DETAILS"),
    PRE_GPR("PRE_GPR"),
    @XmlEnumValue("PRE_GRAPE2_SHIPMENT")
    PRE_GRAPE_2_SHIPMENT("PRE_GRAPE2_SHIPMENT"),
    PRE_MULTIPLIER_PROCESSING("PRE_MULTIPLIER_PROCESSING"),
    REQUEST_LEGACY_SMARTPOST_LABEL("REQUEST_LEGACY_SMARTPOST_LABEL"),
    REQUIRE_PRE_EPIC_BARCODE("REQUIRE_PRE_EPIC_BARCODE");
    private final String value;

    ShipmentProcessingOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShipmentProcessingOptionType fromValue(String v) {
        for (ShipmentProcessingOptionType c: ShipmentProcessingOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
