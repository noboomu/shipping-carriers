
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageQuantityLimitDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageQuantityLimitDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageQuantityLimitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingInstructionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageQuantityLimitDetailType", propOrder = {
    "packageQuantityLimitTypeCode",
    "quantity",
    "uom",
    "packagingInstructionCode"
})
public class PackageQuantityLimitDetailType {

    @XmlElement(name = "PackageQuantityLimitTypeCode")
    protected String packageQuantityLimitTypeCode;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UOM")
    protected String uom;
    @XmlElement(name = "PackagingInstructionCode")
    protected String packagingInstructionCode;

    /**
     * Gets the value of the packageQuantityLimitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageQuantityLimitTypeCode() {
        return packageQuantityLimitTypeCode;
    }

    /**
     * Sets the value of the packageQuantityLimitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageQuantityLimitTypeCode(String value) {
        this.packageQuantityLimitTypeCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOM(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the packagingInstructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingInstructionCode() {
        return packagingInstructionCode;
    }

    /**
     * Sets the value of the packagingInstructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingInstructionCode(String value) {
        this.packagingInstructionCode = value;
    }

}
