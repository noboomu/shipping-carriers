
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueWithUnitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueWithUnitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitOfMeasure" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="UnitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueWithUnitsType", propOrder = {
    "value",
    "unitOfMeasure"
})
public class ValueWithUnitsType {

    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "UnitOfMeasure")
    protected ValueWithUnitsType.UnitOfMeasure unitOfMeasure;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ValueWithUnitsType.UnitOfMeasure }
     *     
     */
    public ValueWithUnitsType.UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueWithUnitsType.UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(ValueWithUnitsType.UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="UnitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unitCode",
        "unitDescription"
    })
    public static class UnitOfMeasure {

        @XmlElement(name = "UnitCode", required = true)
        protected String unitCode;
        @XmlElement(name = "UnitDescription")
        protected String unitDescription;

        /**
         * Gets the value of the unitCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitCode() {
            return unitCode;
        }

        /**
         * Sets the value of the unitCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitCode(String value) {
            this.unitCode = value;
        }

        /**
         * Gets the value of the unitDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitDescription() {
            return unitDescription;
        }

        /**
         * Sets the value of the unitDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitDescription(String value) {
            this.unitDescription = value;
        }

    }

}
