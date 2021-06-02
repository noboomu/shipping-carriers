
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies printing options for a shipping document.
 * 
 * <p>Java class for ShippingDocumentPrintDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentPrintDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrinterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentPrintDetail", propOrder = {
    "printerId"
})
public class ShippingDocumentPrintDetail {

    @XmlElement(name = "PrinterId")
    protected String printerId;

    /**
     * Gets the value of the printerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterId() {
        return printerId;
    }

    /**
     * Sets the value of the printerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterId(String value) {
        this.printerId = value;
    }

}
