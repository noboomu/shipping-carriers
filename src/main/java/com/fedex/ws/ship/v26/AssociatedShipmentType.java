
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedShipmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssociatedShipmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN"/&gt;
 *     &lt;enumeration value="COD_RETURN"/&gt;
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssociatedShipmentType")
@XmlEnum
public enum AssociatedShipmentType {

    COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN,
    COD_RETURN,
    DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN;

    public String value() {
        return name();
    }

    public static AssociatedShipmentType fromValue(String v) {
        return valueOf(v);
    }

}
