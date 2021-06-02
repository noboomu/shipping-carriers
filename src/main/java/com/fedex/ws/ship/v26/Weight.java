
package com.fedex.ws.ship.v26;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The descriptive data for the heaviness of an object.
 * 
 * <p>Java class for Weight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Weight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Units" type="{http://fedex.com/ws/ship/v26}WeightUnits"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weight", propOrder = {
    "units",
    "value"
})
public class Weight {

    @XmlElement(name = "Units", required = true)
    @XmlSchemaType(name = "string")
    protected WeightUnits units;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link WeightUnits }
     *     
     */
    public WeightUnits getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnits }
     *     
     */
    public void setUnits(WeightUnits value) {
        this.units = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
