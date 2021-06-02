
package com.fedex.ws.locs.v12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAttributesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationAttributesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCEPTS_CASH"/&gt;
 *     &lt;enumeration value="ALREADY_OPEN"/&gt;
 *     &lt;enumeration value="CLEARANCE_SERVICES"/&gt;
 *     &lt;enumeration value="COPY_AND_PRINT_SERVICES"/&gt;
 *     &lt;enumeration value="DANGEROUS_GOODS_SERVICES"/&gt;
 *     &lt;enumeration value="DIRECT_MAIL_SERVICES"/&gt;
 *     &lt;enumeration value="DOMESTIC_SHIPPING_SERVICES"/&gt;
 *     &lt;enumeration value="DROP_BOX"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_SHIPPING_SERVICES"/&gt;
 *     &lt;enumeration value="LOCATION_IS_IN_AIRPORT"/&gt;
 *     &lt;enumeration value="NOTARY_SERVICES"/&gt;
 *     &lt;enumeration value="OBSERVES_DAY_LIGHT_SAVING_TIMES"/&gt;
 *     &lt;enumeration value="OPEN_TWENTY_FOUR_HOURS"/&gt;
 *     &lt;enumeration value="PACKAGING_SUPPLIES"/&gt;
 *     &lt;enumeration value="PACK_AND_SHIP"/&gt;
 *     &lt;enumeration value="PASSPORT_PHOTO_SERVICES"/&gt;
 *     &lt;enumeration value="RETURNS_SERVICES"/&gt;
 *     &lt;enumeration value="SIGNS_AND_BANNERS_SERVICE"/&gt;
 *     &lt;enumeration value="SONY_PICTURE_STATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationAttributesType")
@XmlEnum
public enum LocationAttributesType {

    ACCEPTS_CASH,
    ALREADY_OPEN,
    CLEARANCE_SERVICES,
    COPY_AND_PRINT_SERVICES,
    DANGEROUS_GOODS_SERVICES,
    DIRECT_MAIL_SERVICES,
    DOMESTIC_SHIPPING_SERVICES,
    DROP_BOX,
    INTERNATIONAL_SHIPPING_SERVICES,
    LOCATION_IS_IN_AIRPORT,
    NOTARY_SERVICES,
    OBSERVES_DAY_LIGHT_SAVING_TIMES,
    OPEN_TWENTY_FOUR_HOURS,
    PACKAGING_SUPPLIES,
    PACK_AND_SHIP,
    PASSPORT_PHOTO_SERVICES,
    RETURNS_SERVICES,
    SIGNS_AND_BANNERS_SERVICE,
    SONY_PICTURE_STATION;

    public String value() {
        return name();
    }

    public static LocationAttributesType fromValue(String v) {
        return valueOf(v);
    }

}
