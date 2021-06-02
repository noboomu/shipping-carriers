
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocTabContentBarcoded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocTabContentBarcoded"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Symbology" type="{http://fedex.com/ws/vacs/v14}BarcodeSymbologyType" minOccurs="0"/&gt;
 *         &lt;element name="Specification" type="{http://fedex.com/ws/vacs/v14}DocTabZoneSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTabContentBarcoded", propOrder = {
    "symbology",
    "specification"
})
public class DocTabContentBarcoded {

    @XmlElement(name = "Symbology")
    @XmlSchemaType(name = "string")
    protected BarcodeSymbologyType symbology;
    @XmlElement(name = "Specification")
    protected DocTabZoneSpecification specification;

    /**
     * Gets the value of the symbology property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeSymbologyType }
     *     
     */
    public BarcodeSymbologyType getSymbology() {
        return symbology;
    }

    /**
     * Sets the value of the symbology property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeSymbologyType }
     *     
     */
    public void setSymbology(BarcodeSymbologyType value) {
        this.symbology = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link DocTabZoneSpecification }
     *     
     */
    public DocTabZoneSpecification getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabZoneSpecification }
     *     
     */
    public void setSpecification(DocTabZoneSpecification value) {
        this.specification = value;
    }

}
