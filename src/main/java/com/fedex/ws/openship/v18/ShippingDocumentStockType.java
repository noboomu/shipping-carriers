
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentStockType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentStockType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OP_900_LG_B"/&gt;
 *     &lt;enumeration value="OP_900_LL_B"/&gt;
 *     &lt;enumeration value="OP_950"/&gt;
 *     &lt;enumeration value="PAPER_4X6"/&gt;
 *     &lt;enumeration value="PAPER_4_PER_PAGE_PORTRAIT"/&gt;
 *     &lt;enumeration value="PAPER_LETTER"/&gt;
 *     &lt;enumeration value="STOCK_4X6"/&gt;
 *     &lt;enumeration value="STOCK_4X6.75_LEADING_DOC_TAB"/&gt;
 *     &lt;enumeration value="STOCK_4X6.75_TRAILING_DOC_TAB"/&gt;
 *     &lt;enumeration value="STOCK_4X8"/&gt;
 *     &lt;enumeration value="STOCK_4X9_LEADING_DOC_TAB"/&gt;
 *     &lt;enumeration value="STOCK_4X9_TRAILING_DOC_TAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentStockType")
@XmlEnum
public enum ShippingDocumentStockType {

    OP_900_LG_B("OP_900_LG_B"),
    OP_900_LL_B("OP_900_LL_B"),
    OP_950("OP_950"),
    @XmlEnumValue("PAPER_4X6")
    PAPER_4_X_6("PAPER_4X6"),
    PAPER_4_PER_PAGE_PORTRAIT("PAPER_4_PER_PAGE_PORTRAIT"),
    PAPER_LETTER("PAPER_LETTER"),
    @XmlEnumValue("STOCK_4X6")
    STOCK_4_X_6("STOCK_4X6"),
    @XmlEnumValue("STOCK_4X6.75_LEADING_DOC_TAB")
    STOCK_4_X_6_75_LEADING_DOC_TAB("STOCK_4X6.75_LEADING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X6.75_TRAILING_DOC_TAB")
    STOCK_4_X_6_75_TRAILING_DOC_TAB("STOCK_4X6.75_TRAILING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X8")
    STOCK_4_X_8("STOCK_4X8"),
    @XmlEnumValue("STOCK_4X9_LEADING_DOC_TAB")
    STOCK_4_X_9_LEADING_DOC_TAB("STOCK_4X9_LEADING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X9_TRAILING_DOC_TAB")
    STOCK_4_X_9_TRAILING_DOC_TAB("STOCK_4X9_TRAILING_DOC_TAB");
    private final String value;

    ShippingDocumentStockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingDocumentStockType fromValue(String v) {
        for (ShippingDocumentStockType c: ShippingDocumentStockType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
