
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelStockType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LabelStockType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAPER_4X6"/&gt;
 *     &lt;enumeration value="PAPER_4X6.75"/&gt;
 *     &lt;enumeration value="PAPER_4X8"/&gt;
 *     &lt;enumeration value="PAPER_4X9"/&gt;
 *     &lt;enumeration value="PAPER_7X4.75"/&gt;
 *     &lt;enumeration value="PAPER_8.5X11_BOTTOM_HALF_LABEL"/&gt;
 *     &lt;enumeration value="PAPER_8.5X11_TOP_HALF_LABEL"/&gt;
 *     &lt;enumeration value="PAPER_LETTER"/&gt;
 *     &lt;enumeration value="STOCK_4X6"/&gt;
 *     &lt;enumeration value="STOCK_4X6.75"/&gt;
 *     &lt;enumeration value="STOCK_4X6.75_LEADING_DOC_TAB"/&gt;
 *     &lt;enumeration value="STOCK_4X6.75_TRAILING_DOC_TAB"/&gt;
 *     &lt;enumeration value="STOCK_4X8"/&gt;
 *     &lt;enumeration value="STOCK_4X9"/&gt;
 *     &lt;enumeration value="STOCK_4X9_LEADING_DOC_TAB"/&gt;
 *     &lt;enumeration value="STOCK_4X9_TRAILING_DOC_TAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelStockType")
@XmlEnum
public enum LabelStockType {

    @XmlEnumValue("PAPER_4X6")
    PAPER_4_X_6("PAPER_4X6"),
    @XmlEnumValue("PAPER_4X6.75")
    PAPER_4_X_6_75("PAPER_4X6.75"),
    @XmlEnumValue("PAPER_4X8")
    PAPER_4_X_8("PAPER_4X8"),
    @XmlEnumValue("PAPER_4X9")
    PAPER_4_X_9("PAPER_4X9"),
    @XmlEnumValue("PAPER_7X4.75")
    PAPER_7_X_4_75("PAPER_7X4.75"),
    @XmlEnumValue("PAPER_8.5X11_BOTTOM_HALF_LABEL")
    PAPER_8_5_X_11_BOTTOM_HALF_LABEL("PAPER_8.5X11_BOTTOM_HALF_LABEL"),
    @XmlEnumValue("PAPER_8.5X11_TOP_HALF_LABEL")
    PAPER_8_5_X_11_TOP_HALF_LABEL("PAPER_8.5X11_TOP_HALF_LABEL"),
    PAPER_LETTER("PAPER_LETTER"),
    @XmlEnumValue("STOCK_4X6")
    STOCK_4_X_6("STOCK_4X6"),
    @XmlEnumValue("STOCK_4X6.75")
    STOCK_4_X_6_75("STOCK_4X6.75"),
    @XmlEnumValue("STOCK_4X6.75_LEADING_DOC_TAB")
    STOCK_4_X_6_75_LEADING_DOC_TAB("STOCK_4X6.75_LEADING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X6.75_TRAILING_DOC_TAB")
    STOCK_4_X_6_75_TRAILING_DOC_TAB("STOCK_4X6.75_TRAILING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X8")
    STOCK_4_X_8("STOCK_4X8"),
    @XmlEnumValue("STOCK_4X9")
    STOCK_4_X_9("STOCK_4X9"),
    @XmlEnumValue("STOCK_4X9_LEADING_DOC_TAB")
    STOCK_4_X_9_LEADING_DOC_TAB("STOCK_4X9_LEADING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X9_TRAILING_DOC_TAB")
    STOCK_4_X_9_TRAILING_DOC_TAB("STOCK_4X9_TRAILING_DOC_TAB");
    private final String value;

    LabelStockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelStockType fromValue(String v) {
        for (LabelStockType c: LabelStockType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
