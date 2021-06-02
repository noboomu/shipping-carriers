
package com.fedex.ws.ship.v26;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification for services performed during non-business hours and/or days.
 * 
 * <p>Java class for NonBusinessTimeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonBusinessTimeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="PersonHours" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonBusinessTimeDetail", propOrder = {
    "personDays",
    "personHours"
})
public class NonBusinessTimeDetail {

    @XmlElement(name = "PersonDays")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personDays;
    @XmlElement(name = "PersonHours")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personHours;

    /**
     * Gets the value of the personDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonDays() {
        return personDays;
    }

    /**
     * Sets the value of the personDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonDays(BigInteger value) {
        this.personDays = value;
    }

    /**
     * Gets the value of the personHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonHours() {
        return personHours;
    }

    /**
     * Sets the value of the personHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonHours(BigInteger value) {
        this.personHours = value;
    }

}
