
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingWeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingWeightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnitOfMeasurement" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}BillingUnitOfMeasurementType"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingWeightType", propOrder = {
    "unitOfMeasurement",
    "weight"
})
public class BillingWeightType {

    @XmlElement(name = "UnitOfMeasurement", required = true)
    protected BillingUnitOfMeasurementType unitOfMeasurement;
    @XmlElement(name = "Weight", required = true)
    protected String weight;

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BillingUnitOfMeasurementType }
     *     
     */
    public BillingUnitOfMeasurementType getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingUnitOfMeasurementType }
     *     
     */
    public void setUnitOfMeasurement(BillingUnitOfMeasurementType value) {
        this.unitOfMeasurement = value;
    }

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

}
