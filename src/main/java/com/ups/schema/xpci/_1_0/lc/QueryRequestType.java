
package com.ups.schema.xpci._1_0.lc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Shipment" type="{http://www.ups.com/schema/xpci/1.0/lc}ShipmentType"/&gt;
 *         &lt;element name="TransactionReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
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
@XmlType(name = "QueryRequestType", propOrder = {
    "shipment",
    "transactionReferenceID",
    "suppressQuestionIndicator"
})
public class QueryRequestType {

    @XmlElement(name = "Shipment", required = true)
    protected ShipmentType shipment;
    @XmlElement(name = "TransactionReferenceID")
    protected List<String> transactionReferenceID;
    @XmlElement(name = "SuppressQuestionIndicator")
    protected String suppressQuestionIndicator;

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the transactionReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transactionReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransactionReferenceID() {
        if (transactionReferenceID == null) {
            transactionReferenceID = new ArrayList<String>();
        }
        return this.transactionReferenceID;
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
