
package com.ups.xmlschema.xoltws.freightrate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payer" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}PayerType"/&gt;
 *         &lt;element name="ShipmentBillingOption" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}RateCodeDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformationType", propOrder = {
    "payer",
    "shipmentBillingOption"
})
public class PaymentInformationType {

    @XmlElement(name = "Payer", required = true)
    protected PayerType payer;
    @XmlElement(name = "ShipmentBillingOption", required = true)
    protected RateCodeDescriptionType shipmentBillingOption;

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link PayerType }
     *     
     */
    public PayerType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerType }
     *     
     */
    public void setPayer(PayerType value) {
        this.payer = value;
    }

    /**
     * Gets the value of the shipmentBillingOption property.
     * 
     * @return
     *     possible object is
     *     {@link RateCodeDescriptionType }
     *     
     */
    public RateCodeDescriptionType getShipmentBillingOption() {
        return shipmentBillingOption;
    }

    /**
     * Sets the value of the shipmentBillingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCodeDescriptionType }
     *     
     */
    public void setShipmentBillingOption(RateCodeDescriptionType value) {
        this.shipmentBillingOption = value;
    }

}
