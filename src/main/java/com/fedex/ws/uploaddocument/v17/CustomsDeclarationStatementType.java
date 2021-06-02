
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomsDeclarationStatementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomsDeclarationStatementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NAFTA_LOW_VALUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomsDeclarationStatementType")
@XmlEnum
public enum CustomsDeclarationStatementType {

    NAFTA_LOW_VALUE;

    public String value() {
        return name();
    }

    public static CustomsDeclarationStatementType fromValue(String v) {
        return valueOf(v);
    }

}
