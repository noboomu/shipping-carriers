
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Each instance of this data type represents a barcode whose content must be represented as binary data (i.e. not ASCII text).
 * 
 * <p>Java class for BinaryBarcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryBarcode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}BinaryBarcodeType" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryBarcode", propOrder = {
    "type",
    "value"
})
public class BinaryBarcode {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected BinaryBarcodeType type;
    @XmlElement(name = "Value")
    protected byte[] value;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryBarcodeType }
     *     
     */
    public BinaryBarcodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryBarcodeType }
     *     
     */
    public void setType(BinaryBarcodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

}
