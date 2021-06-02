
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationShipmentRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConsolidationShipmentRoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONSOLIDATION_DOCUMENTS_SHIPMENT"/&gt;
 *     &lt;enumeration value="CRN_SHIPMENT"/&gt;
 *     &lt;enumeration value="MASTER_AIRWAYBILL_SHIPMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsolidationShipmentRoleType")
@XmlEnum
public enum ConsolidationShipmentRoleType {

    CONSOLIDATION_DOCUMENTS_SHIPMENT,
    CRN_SHIPMENT,
    MASTER_AIRWAYBILL_SHIPMENT;

    public String value() {
        return name();
    }

    public static ConsolidationShipmentRoleType fromValue(String v) {
        return valueOf(v);
    }

}
