
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Shipment" type="{http://www.ups.com/schema/xpci/1.0/lc}ShipmentResultType"/&gt;
 *         &lt;element name="TransactionDigest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResponseType", propOrder = {
    "shipment",
    "transactionDigest"
})
public class QueryResponseType {

    @XmlElement(name = "Shipment", required = true)
    protected ShipmentResultType shipment;
    @XmlElement(name = "TransactionDigest", required = true)
    protected String transactionDigest;

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentResultType }
     *     
     */
    public ShipmentResultType getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentResultType }
     *     
     */
    public void setShipment(ShipmentResultType value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the transactionDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDigest() {
        return transactionDigest;
    }

    /**
     * Sets the value of the transactionDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDigest(String value) {
        this.transactionDigest = value;
    }

}
