
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies details for origin-country LTL services performed by FedEx.
 * 
 * <p>Java class for TransborderDistributionLtlDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransborderDistributionLtlDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payment" type="{http://fedex.com/ws/vacs/v14}Payment" minOccurs="0"/&gt;
 *         &lt;element name="LtlScacCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransborderDistributionLtlDetail", propOrder = {
    "payment",
    "ltlScacCode"
})
public class TransborderDistributionLtlDetail {

    @XmlElement(name = "Payment")
    protected Payment payment;
    @XmlElement(name = "LtlScacCode")
    protected String ltlScacCode;

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the ltlScacCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtlScacCode() {
        return ltlScacCode;
    }

    /**
     * Sets the value of the ltlScacCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtlScacCode(String value) {
        this.ltlScacCode = value;
    }

}
