
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnedConsolidationDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnedConsolidationDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMODITIES_BY_TRACKING_NUMBER_REPORT"/&gt;
 *     &lt;enumeration value="CONDENSED_CRN_REPORT"/&gt;
 *     &lt;enumeration value="CONSOLIDATED_COMMERCIAL_INVOICE"/&gt;
 *     &lt;enumeration value="CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT"/&gt;
 *     &lt;enumeration value="CONSOLIDATED_SOLD_TO_SUMMARY_REPORT"/&gt;
 *     &lt;enumeration value="CRN_REPORT"/&gt;
 *     &lt;enumeration value="CUSTOMS_PACKING_LIST"/&gt;
 *     &lt;enumeration value="CUSTOM_CONSOLIDATION_DOCUMENT"/&gt;
 *     &lt;enumeration value="LOW_CUSTOMS_VALUE_EXCEPTION_PARTY_REPORT"/&gt;
 *     &lt;enumeration value="STANDARD_BROKER_CLEARANCE_PARTY_REPORT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnedConsolidationDocumentType")
@XmlEnum
public enum ReturnedConsolidationDocumentType {

    COMMODITIES_BY_TRACKING_NUMBER_REPORT,
    CONDENSED_CRN_REPORT,
    CONSOLIDATED_COMMERCIAL_INVOICE,
    CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT,
    CONSOLIDATED_SOLD_TO_SUMMARY_REPORT,
    CRN_REPORT,
    CUSTOMS_PACKING_LIST,
    CUSTOM_CONSOLIDATION_DOCUMENT,
    LOW_CUSTOMS_VALUE_EXCEPTION_PARTY_REPORT,
    STANDARD_BROKER_CLEARANCE_PARTY_REPORT;

    public String value() {
        return name();
    }

    public static ReturnedConsolidationDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
