
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedTrackingIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssociatedTrackingIdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN"/&gt;
 *     &lt;enumeration value="COD_RETURN"/&gt;
 *     &lt;enumeration value="CONSOLIDATION_DOCUMENTS"/&gt;
 *     &lt;enumeration value="CONSOLIDATION_MASTER"/&gt;
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssociatedTrackingIdType")
@XmlEnum
public enum AssociatedTrackingIdType {

    COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN,
    COD_RETURN,
    CONSOLIDATION_DOCUMENTS,
    CONSOLIDATION_MASTER,
    DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN;

    public String value() {
        return name();
    }

    public static AssociatedTrackingIdType fromValue(String v) {
        return valueOf(v);
    }

}
