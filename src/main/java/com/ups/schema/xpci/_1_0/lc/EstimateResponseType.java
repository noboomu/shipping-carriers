
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstimateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimateResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionInfo" type="{http://www.ups.com/schema/xpci/1.0/lc}TransactionInfoType"/&gt;
 *         &lt;element name="ShipmentEstimate" type="{http://www.ups.com/schema/xpci/1.0/lc}ShipmentEstimateType"/&gt;
 *         &lt;element name="SuppressQuestionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimateResponseType", propOrder = {
    "transactionInfo",
    "shipmentEstimate",
    "suppressQuestionIndicator"
})
public class EstimateResponseType {

    @XmlElement(name = "TransactionInfo", required = true)
    protected TransactionInfoType transactionInfo;
    @XmlElement(name = "ShipmentEstimate", required = true)
    protected ShipmentEstimateType shipmentEstimate;
    @XmlElement(name = "SuppressQuestionIndicator")
    protected String suppressQuestionIndicator;

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoType }
     *     
     */
    public TransactionInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoType }
     *     
     */
    public void setTransactionInfo(TransactionInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the shipmentEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentEstimateType }
     *     
     */
    public ShipmentEstimateType getShipmentEstimate() {
        return shipmentEstimate;
    }

    /**
     * Sets the value of the shipmentEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentEstimateType }
     *     
     */
    public void setShipmentEstimate(ShipmentEstimateType value) {
        this.shipmentEstimate = value;
    }

    /**
     * Gets the value of the suppressQuestionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressQuestionIndicator() {
        return suppressQuestionIndicator;
    }

    /**
     * Sets the value of the suppressQuestionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressQuestionIndicator(String value) {
        this.suppressQuestionIndicator = value;
    }

}
