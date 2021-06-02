
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalPackagingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhysicalPackagingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BAG"/&gt;
 *     &lt;enumeration value="BARREL"/&gt;
 *     &lt;enumeration value="BASKET"/&gt;
 *     &lt;enumeration value="BOX"/&gt;
 *     &lt;enumeration value="BUCKET"/&gt;
 *     &lt;enumeration value="BUNDLE"/&gt;
 *     &lt;enumeration value="CAGE"/&gt;
 *     &lt;enumeration value="CARTON"/&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="CHEST"/&gt;
 *     &lt;enumeration value="CONTAINER"/&gt;
 *     &lt;enumeration value="CRATE"/&gt;
 *     &lt;enumeration value="CYLINDER"/&gt;
 *     &lt;enumeration value="DRUM"/&gt;
 *     &lt;enumeration value="ENVELOPE"/&gt;
 *     &lt;enumeration value="HAMPER"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="PACKAGE"/&gt;
 *     &lt;enumeration value="PAIL"/&gt;
 *     &lt;enumeration value="PALLET"/&gt;
 *     &lt;enumeration value="PARCEL"/&gt;
 *     &lt;enumeration value="PIECE"/&gt;
 *     &lt;enumeration value="REEL"/&gt;
 *     &lt;enumeration value="ROLL"/&gt;
 *     &lt;enumeration value="SACK"/&gt;
 *     &lt;enumeration value="SHRINK_WRAPPED"/&gt;
 *     &lt;enumeration value="SKID"/&gt;
 *     &lt;enumeration value="TANK"/&gt;
 *     &lt;enumeration value="TOTE_BIN"/&gt;
 *     &lt;enumeration value="TUBE"/&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalPackagingType")
@XmlEnum
public enum PhysicalPackagingType {

    BAG,
    BARREL,
    BASKET,
    BOX,
    BUCKET,
    BUNDLE,
    CAGE,
    CARTON,
    CASE,
    CHEST,
    CONTAINER,
    CRATE,
    CYLINDER,
    DRUM,
    ENVELOPE,
    HAMPER,
    OTHER,
    PACKAGE,
    PAIL,
    PALLET,
    PARCEL,
    PIECE,
    REEL,
    ROLL,
    SACK,
    SHRINK_WRAPPED,
    SKID,
    TANK,
    TOTE_BIN,
    TUBE,
    UNIT;

    public String value() {
        return name();
    }

    public static PhysicalPackagingType fromValue(String v) {
        return valueOf(v);
    }

}
