
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies which party will be responsible for payment of any surcharges for Freight special services for which split billing is allowed.
 * 
 * <p>Java class for FreightSpecialServicePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightSpecialServicePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://fedex.com/ws/ship/v26}FreightShipmentRoleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightSpecialServicePayment", propOrder = {
    "specialService",
    "paymentType"
})
public class FreightSpecialServicePayment {

    @XmlElement(name = "SpecialService")
    protected String specialService;
    @XmlElement(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected FreightShipmentRoleType paymentType;

    /**
     * Gets the value of the specialService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialService() {
        return specialService;
    }

    /**
     * Sets the value of the specialService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialService(String value) {
        this.specialService = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link FreightShipmentRoleType }
     *     
     */
    public FreightShipmentRoleType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipmentRoleType }
     *     
     */
    public void setPaymentType(FreightShipmentRoleType value) {
        this.paymentType = value;
    }

}
