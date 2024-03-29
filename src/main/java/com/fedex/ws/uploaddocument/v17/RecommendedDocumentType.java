
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendedDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RecommendedDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANTIQUE_STATEMENT_EUROPEAN_UNION"/&gt;
 *     &lt;enumeration value="ANTIQUE_STATEMENT_UNITED_STATES"/&gt;
 *     &lt;enumeration value="ASSEMBLER_DECLARATION"/&gt;
 *     &lt;enumeration value="BEARING_WORKSHEET"/&gt;
 *     &lt;enumeration value="CERTIFICATE_OF_SHIPMENTS_TO_SYRIA"/&gt;
 *     &lt;enumeration value="COMMERCIAL_INVOICE_FOR_THE_CARIBBEAN_COMMON_MARKET"/&gt;
 *     &lt;enumeration value="CONIFEROUS_SOLID_WOOD_PACKAGING_MATERIAL_TO_THE_PEOPLES_REPUBLIC_OF_CHINA"/&gt;
 *     &lt;enumeration value="DECLARATION_FOR_FREE_ENTRY_OF_RETURNED_AMERICAN_PRODUCTS"/&gt;
 *     &lt;enumeration value="DECLARATION_OF_BIOLOGICAL_STANDARDS"/&gt;
 *     &lt;enumeration value="DECLARATION_OF_IMPORTED_ELECTRONIC_PRODUCTS_SUBJECT_TO_RADIATION_CONTROL_STANDARD"/&gt;
 *     &lt;enumeration value="ELECTRONIC_INTEGRATED_CIRCUIT_WORKSHEET"/&gt;
 *     &lt;enumeration value="FILM_AND_VIDEO_CERTIFICATE"/&gt;
 *     &lt;enumeration value="INTERIM_FOOTWEAR_INVOICE"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN_CANADA_ENGLISH"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN_CANADA_FRENCH"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN_SPANISH"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN_UNITED_STATES"/&gt;
 *     &lt;enumeration value="PACKING_LIST"/&gt;
 *     &lt;enumeration value="PRINTED_CIRCUIT_BOARD_WORKSHEET"/&gt;
 *     &lt;enumeration value="REPAIRED_WATCH_BREAKOUT_WORKSHEET"/&gt;
 *     &lt;enumeration value="STATEMENT_REGARDING_THE_IMPORT_OF_RADIO_FREQUENCY_DEVICES"/&gt;
 *     &lt;enumeration value="TOXIC_SUBSTANCES_CONTROL_ACT"/&gt;
 *     &lt;enumeration value="UNITED_STATES_CARIBBEAN_BASIN_TRADE_PARTNERSHIP_ACT_CERTIFICATE_OF_ORIGIN_NON_TEXTILES"/&gt;
 *     &lt;enumeration value="UNITED_STATES_CARIBBEAN_BASIN_TRADE_PARTNERSHIP_ACT_CERTIFICATE_OF_ORIGIN_TEXTILES"/&gt;
 *     &lt;enumeration value="UNITED_STATES_NEW_WATCH_WORKSHEET"/&gt;
 *     &lt;enumeration value="UNITED_STATES_WATCH_REPAIR_DECLARATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecommendedDocumentType")
@XmlEnum
public enum RecommendedDocumentType {

    ANTIQUE_STATEMENT_EUROPEAN_UNION,
    ANTIQUE_STATEMENT_UNITED_STATES,
    ASSEMBLER_DECLARATION,
    BEARING_WORKSHEET,
    CERTIFICATE_OF_SHIPMENTS_TO_SYRIA,
    COMMERCIAL_INVOICE_FOR_THE_CARIBBEAN_COMMON_MARKET,
    CONIFEROUS_SOLID_WOOD_PACKAGING_MATERIAL_TO_THE_PEOPLES_REPUBLIC_OF_CHINA,
    DECLARATION_FOR_FREE_ENTRY_OF_RETURNED_AMERICAN_PRODUCTS,
    DECLARATION_OF_BIOLOGICAL_STANDARDS,
    DECLARATION_OF_IMPORTED_ELECTRONIC_PRODUCTS_SUBJECT_TO_RADIATION_CONTROL_STANDARD,
    ELECTRONIC_INTEGRATED_CIRCUIT_WORKSHEET,
    FILM_AND_VIDEO_CERTIFICATE,
    INTERIM_FOOTWEAR_INVOICE,
    NAFTA_CERTIFICATE_OF_ORIGIN_CANADA_ENGLISH,
    NAFTA_CERTIFICATE_OF_ORIGIN_CANADA_FRENCH,
    NAFTA_CERTIFICATE_OF_ORIGIN_SPANISH,
    NAFTA_CERTIFICATE_OF_ORIGIN_UNITED_STATES,
    PACKING_LIST,
    PRINTED_CIRCUIT_BOARD_WORKSHEET,
    REPAIRED_WATCH_BREAKOUT_WORKSHEET,
    STATEMENT_REGARDING_THE_IMPORT_OF_RADIO_FREQUENCY_DEVICES,
    TOXIC_SUBSTANCES_CONTROL_ACT,
    UNITED_STATES_CARIBBEAN_BASIN_TRADE_PARTNERSHIP_ACT_CERTIFICATE_OF_ORIGIN_NON_TEXTILES,
    UNITED_STATES_CARIBBEAN_BASIN_TRADE_PARTNERSHIP_ACT_CERTIFICATE_OF_ORIGIN_TEXTILES,
    UNITED_STATES_NEW_WATCH_WORKSHEET,
    UNITED_STATES_WATCH_REPAIR_DECLARATION;

    public String value() {
        return name();
    }

    public static RecommendedDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
