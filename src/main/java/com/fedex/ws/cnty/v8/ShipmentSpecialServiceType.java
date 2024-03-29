
package com.fedex.ws.cnty.v8;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentSpecialServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentSpecialServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLIND_SHIPMENT"/&gt;
 *     &lt;enumeration value="BROKER_SELECT_OPTION"/&gt;
 *     &lt;enumeration value="CALL_BEFORE_DELIVERY"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="COD_REMITTANCE"/&gt;
 *     &lt;enumeration value="CUSTOM_DELIVERY_WINDOW"/&gt;
 *     &lt;enumeration value="CUT_FLOWERS"/&gt;
 *     &lt;enumeration value="DANGEROUS_GOODS"/&gt;
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE"/&gt;
 *     &lt;enumeration value="DETENTION"/&gt;
 *     &lt;enumeration value="DO_NOT_BREAK_DOWN_PALLETS"/&gt;
 *     &lt;enumeration value="DO_NOT_STACK_PALLETS"/&gt;
 *     &lt;enumeration value="DRY_ICE"/&gt;
 *     &lt;enumeration value="EAST_COAST_SPECIAL"/&gt;
 *     &lt;enumeration value="ELECTRONIC_TRADE_DOCUMENTS"/&gt;
 *     &lt;enumeration value="EVENT_NOTIFICATION"/&gt;
 *     &lt;enumeration value="EXCLUDE_FROM_CONSOLIDATION"/&gt;
 *     &lt;enumeration value="EXCLUSIVE_USE"/&gt;
 *     &lt;enumeration value="EXHIBITION_DELIVERY"/&gt;
 *     &lt;enumeration value="EXHIBITION_PICKUP"/&gt;
 *     &lt;enumeration value="EXPEDITED_ALTERNATE_DELIVERY_ROUTE"/&gt;
 *     &lt;enumeration value="EXPEDITED_ONE_DAY_EARLIER"/&gt;
 *     &lt;enumeration value="EXPEDITED_SERVICE_MONITORING_AND_DELIVERY"/&gt;
 *     &lt;enumeration value="EXPEDITED_STANDARD_DAY_EARLY_DELIVERY"/&gt;
 *     &lt;enumeration value="EXTRA_LABOR"/&gt;
 *     &lt;enumeration value="EXTREME_LENGTH"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_RATE"/&gt;
 *     &lt;enumeration value="FLATBED_TRAILER"/&gt;
 *     &lt;enumeration value="FOOD"/&gt;
 *     &lt;enumeration value="FREIGHT_GUARANTEE"/&gt;
 *     &lt;enumeration value="FREIGHT_TO_COLLECT"/&gt;
 *     &lt;enumeration value="FUTURE_DAY_SHIPMENT"/&gt;
 *     &lt;enumeration value="HOLD_AT_LOCATION"/&gt;
 *     &lt;enumeration value="HOLIDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="HOLIDAY_GUARANTEE"/&gt;
 *     &lt;enumeration value="HOME_DELIVERY_PREMIUM"/&gt;
 *     &lt;enumeration value="INSIDE_DELIVERY"/&gt;
 *     &lt;enumeration value="INSIDE_PICKUP"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_CONTROLLED_EXPORT_SERVICE"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_MAIL_SERVICE"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS"/&gt;
 *     &lt;enumeration value="LIFTGATE_DELIVERY"/&gt;
 *     &lt;enumeration value="LIFTGATE_PICKUP"/&gt;
 *     &lt;enumeration value="LIMITED_ACCESS_DELIVERY"/&gt;
 *     &lt;enumeration value="LIMITED_ACCESS_PICKUP"/&gt;
 *     &lt;enumeration value="MARKING_OR_TAGGING"/&gt;
 *     &lt;enumeration value="NON_BUSINESS_TIME"/&gt;
 *     &lt;enumeration value="OVER_LENGTH"/&gt;
 *     &lt;enumeration value="PALLETS_PROVIDED"/&gt;
 *     &lt;enumeration value="PALLET_SHRINKWRAP"/&gt;
 *     &lt;enumeration value="PALLET_WEIGHT_ALLOWANCE"/&gt;
 *     &lt;enumeration value="PENDING_COMPLETE"/&gt;
 *     &lt;enumeration value="PENDING_SHIPMENT"/&gt;
 *     &lt;enumeration value="PERMIT"/&gt;
 *     &lt;enumeration value="PHARMACY_DELIVERY"/&gt;
 *     &lt;enumeration value="POISON"/&gt;
 *     &lt;enumeration value="PORT_DELIVERY"/&gt;
 *     &lt;enumeration value="PORT_PICKUP"/&gt;
 *     &lt;enumeration value="PRE_DELIVERY_NOTIFICATION"/&gt;
 *     &lt;enumeration value="PRE_EIG_PROCESSING"/&gt;
 *     &lt;enumeration value="PRE_MULTIPLIER_PROCESSING"/&gt;
 *     &lt;enumeration value="PROTECTION_FROM_FREEZING"/&gt;
 *     &lt;enumeration value="REGIONAL_MALL_DELIVERY"/&gt;
 *     &lt;enumeration value="REGIONAL_MALL_PICKUP"/&gt;
 *     &lt;enumeration value="RETURNS_CLEARANCE"/&gt;
 *     &lt;enumeration value="RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED"/&gt;
 *     &lt;enumeration value="RETURN_SHIPMENT"/&gt;
 *     &lt;enumeration value="SATURDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="SATURDAY_PICKUP"/&gt;
 *     &lt;enumeration value="SHIPMENT_ASSEMBLY"/&gt;
 *     &lt;enumeration value="SORT_AND_SEGREGATE"/&gt;
 *     &lt;enumeration value="SPECIAL_DELIVERY"/&gt;
 *     &lt;enumeration value="SPECIAL_EQUIPMENT"/&gt;
 *     &lt;enumeration value="STORAGE"/&gt;
 *     &lt;enumeration value="SUNDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="THIRD_PARTY_CONSIGNEE"/&gt;
 *     &lt;enumeration value="TOP_LOAD"/&gt;
 *     &lt;enumeration value="USPS_DELIVERY"/&gt;
 *     &lt;enumeration value="USPS_PICKUP"/&gt;
 *     &lt;enumeration value="WEIGHING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentSpecialServiceType")
@XmlEnum
public enum ShipmentSpecialServiceType {

    BLIND_SHIPMENT,
    BROKER_SELECT_OPTION,
    CALL_BEFORE_DELIVERY,
    COD,
    COD_REMITTANCE,
    CUSTOM_DELIVERY_WINDOW,
    CUT_FLOWERS,
    DANGEROUS_GOODS,
    DELIVERY_ON_INVOICE_ACCEPTANCE,
    DETENTION,
    DO_NOT_BREAK_DOWN_PALLETS,
    DO_NOT_STACK_PALLETS,
    DRY_ICE,
    EAST_COAST_SPECIAL,
    ELECTRONIC_TRADE_DOCUMENTS,
    EVENT_NOTIFICATION,
    EXCLUDE_FROM_CONSOLIDATION,
    EXCLUSIVE_USE,
    EXHIBITION_DELIVERY,
    EXHIBITION_PICKUP,
    EXPEDITED_ALTERNATE_DELIVERY_ROUTE,
    EXPEDITED_ONE_DAY_EARLIER,
    EXPEDITED_SERVICE_MONITORING_AND_DELIVERY,
    EXPEDITED_STANDARD_DAY_EARLY_DELIVERY,
    EXTRA_LABOR,
    EXTREME_LENGTH,
    FEDEX_ONE_RATE,
    FLATBED_TRAILER,
    FOOD,
    FREIGHT_GUARANTEE,
    FREIGHT_TO_COLLECT,
    FUTURE_DAY_SHIPMENT,
    HOLD_AT_LOCATION,
    HOLIDAY_DELIVERY,
    HOLIDAY_GUARANTEE,
    HOME_DELIVERY_PREMIUM,
    INSIDE_DELIVERY,
    INSIDE_PICKUP,
    INTERNATIONAL_CONTROLLED_EXPORT_SERVICE,
    INTERNATIONAL_MAIL_SERVICE,
    INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS,
    LIFTGATE_DELIVERY,
    LIFTGATE_PICKUP,
    LIMITED_ACCESS_DELIVERY,
    LIMITED_ACCESS_PICKUP,
    MARKING_OR_TAGGING,
    NON_BUSINESS_TIME,
    OVER_LENGTH,
    PALLETS_PROVIDED,
    PALLET_SHRINKWRAP,
    PALLET_WEIGHT_ALLOWANCE,
    PENDING_COMPLETE,
    PENDING_SHIPMENT,
    PERMIT,
    PHARMACY_DELIVERY,
    POISON,
    PORT_DELIVERY,
    PORT_PICKUP,
    PRE_DELIVERY_NOTIFICATION,
    PRE_EIG_PROCESSING,
    PRE_MULTIPLIER_PROCESSING,
    PROTECTION_FROM_FREEZING,
    REGIONAL_MALL_DELIVERY,
    REGIONAL_MALL_PICKUP,
    RETURNS_CLEARANCE,
    RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED,
    RETURN_SHIPMENT,
    SATURDAY_DELIVERY,
    SATURDAY_PICKUP,
    SHIPMENT_ASSEMBLY,
    SORT_AND_SEGREGATE,
    SPECIAL_DELIVERY,
    SPECIAL_EQUIPMENT,
    STORAGE,
    SUNDAY_DELIVERY,
    THIRD_PARTY_CONSIGNEE,
    TOP_LOAD,
    USPS_DELIVERY,
    USPS_PICKUP,
    WEIGHING;

    public String value() {
        return name();
    }

    public static ShipmentSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
