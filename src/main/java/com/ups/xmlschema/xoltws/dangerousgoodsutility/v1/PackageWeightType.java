
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageWeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageWeightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitOfMeasurement" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}PackageWeightUOMType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageWeightType", propOrder = {
    "weight",
    "unitOfMeasurement"
})
public class PackageWeightType {

    @XmlElement(name = "Weight", required = true)
    protected String weight;
    @XmlElement(name = "UnitOfMeasurement", required = true)
    protected PackageWeightUOMType unitOfMeasurement;

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link PackageWeightUOMType }
     *     
     */
    public PackageWeightUOMType getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageWeightUOMType }
     *     
     */
    public void setUnitOfMeasurement(PackageWeightUOMType value) {
        this.unitOfMeasurement = value;
    }

}
