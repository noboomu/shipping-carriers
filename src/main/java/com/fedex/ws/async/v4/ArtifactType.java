
package com.fedex.ws.async.v4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtifactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ArtifactType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUXILIARY_LABEL"/&gt;
 *     &lt;enumeration value="CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="COD_RETURN_LABEL"/&gt;
 *     &lt;enumeration value="COMMERCIAL_INVOICE"/&gt;
 *     &lt;enumeration value="COMMODITIES_BY_TRACKING_NUMBER_REPORT"/&gt;
 *     &lt;enumeration value="CONDENSED_CRN_REPORT"/&gt;
 *     &lt;enumeration value="CONSOLIDATED_COMMERCIAL_INVOICE"/&gt;
 *     &lt;enumeration value="CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT"/&gt;
 *     &lt;enumeration value="CONSOLIDATED_SOLD_TO_SUMMARY_REPORT"/&gt;
 *     &lt;enumeration value="CRN_REPORT"/&gt;
 *     &lt;enumeration value="CUSTOMS_PACKING_LIST"/&gt;
 *     &lt;enumeration value="CUSTOM_CONSOLIDATION_DOCUMENT"/&gt;
 *     &lt;enumeration value="CUSTOM_PACKAGE_DOCUMENT"/&gt;
 *     &lt;enumeration value="CUSTOM_SHIPMENT_DOCUMENT"/&gt;
 *     &lt;enumeration value="DANGEROUS_GOODS_SHIPPERS_DECLARATION"/&gt;
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL"/&gt;
 *     &lt;enumeration value="FREIGHT_ADDRESS_LABEL"/&gt;
 *     &lt;enumeration value="GENERAL_AGENCY_AGREEMENT"/&gt;
 *     &lt;enumeration value="LOW_CUSTOMS_VALUE_EXCEPTION_PARTY_REPORT"/&gt;
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN"/&gt;
 *     &lt;enumeration value="OP_900"/&gt;
 *     &lt;enumeration value="OUTBOUND_LABEL"/&gt;
 *     &lt;enumeration value="PRO_FORMA_INVOICE"/&gt;
 *     &lt;enumeration value="RETURN_INSTRUCTIONS"/&gt;
 *     &lt;enumeration value="SERVICE_REPLY"/&gt;
 *     &lt;enumeration value="SERVICE_REQUEST"/&gt;
 *     &lt;enumeration value="STANDARD_BROKER_CLEARANCE_PARTY_REPORT"/&gt;
 *     &lt;enumeration value="TERMS_AND_CONDITIONS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArtifactType")
@XmlEnum
public enum ArtifactType {

    AUXILIARY_LABEL,
    CERTIFICATE_OF_ORIGIN,
    COD_RETURN_LABEL,
    COMMERCIAL_INVOICE,
    COMMODITIES_BY_TRACKING_NUMBER_REPORT,
    CONDENSED_CRN_REPORT,
    CONSOLIDATED_COMMERCIAL_INVOICE,
    CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT,
    CONSOLIDATED_SOLD_TO_SUMMARY_REPORT,
    CRN_REPORT,
    CUSTOMS_PACKING_LIST,
    CUSTOM_CONSOLIDATION_DOCUMENT,
    CUSTOM_PACKAGE_DOCUMENT,
    CUSTOM_SHIPMENT_DOCUMENT,
    DANGEROUS_GOODS_SHIPPERS_DECLARATION,
    DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL,
    FREIGHT_ADDRESS_LABEL,
    GENERAL_AGENCY_AGREEMENT,
    LOW_CUSTOMS_VALUE_EXCEPTION_PARTY_REPORT,
    NAFTA_CERTIFICATE_OF_ORIGIN,
    OP_900,
    OUTBOUND_LABEL,
    PRO_FORMA_INVOICE,
    RETURN_INSTRUCTIONS,
    SERVICE_REPLY,
    SERVICE_REQUEST,
    STANDARD_BROKER_CLEARANCE_PARTY_REPORT,
    TERMS_AND_CONDITIONS;

    public String value() {
        return name();
    }

    public static ArtifactType fromValue(String v) {
        return valueOf(v);
    }

}
