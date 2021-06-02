
package com.ups.xmlschema.xoltws._if.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageAssociatedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageAssociatedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageAssociatedType", propOrder = {
    "packageNumber",
    "productAmount"
})
public class PackageAssociatedType {

    @XmlElement(name = "PackageNumber")
    protected String packageNumber;
    @XmlElement(name = "ProductAmount")
    protected String productAmount;

    /**
     * Gets the value of the packageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageNumber() {
        return packageNumber;
    }

    /**
     * Sets the value of the packageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageNumber(String value) {
        this.packageNumber = value;
    }

    /**
     * Gets the value of the productAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAmount() {
        return productAmount;
    }

    /**
     * Sets the value of the productAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAmount(String value) {
        this.productAmount = value;
    }

}
