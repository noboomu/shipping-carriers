
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionCharge"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MonetaryValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "TransactionInfoType", propOrder = {
    "date",
    "time",
    "transactionCharge"
})
public class TransactionInfoType {

    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Time", required = true)
    protected String time;
    @XmlElement(name = "TransactionCharge", required = true)
    protected TransactionInfoType.TransactionCharge transactionCharge;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the transactionCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoType.TransactionCharge }
     *     
     */
    public TransactionInfoType.TransactionCharge getTransactionCharge() {
        return transactionCharge;
    }

    /**
     * Sets the value of the transactionCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoType.TransactionCharge }
     *     
     */
    public void setTransactionCharge(TransactionInfoType.TransactionCharge value) {
        this.transactionCharge = value;
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
     *         &lt;element name="MonetaryValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "monetaryValue",
        "currencyCode"
    })
    public static class TransactionCharge {

        @XmlElement(name = "MonetaryValue", required = true)
        protected String monetaryValue;
        @XmlElement(name = "CurrencyCode", required = true)
        protected String currencyCode;

        /**
         * Gets the value of the monetaryValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMonetaryValue() {
            return monetaryValue;
        }

        /**
         * Sets the value of the monetaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMonetaryValue(String value) {
            this.monetaryValue = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

    }

}
