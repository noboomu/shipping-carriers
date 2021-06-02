
package com.ups.schema.xpci._1_0.dps;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Response" type="{http://www.ups.com/schema/xpci/1.0/dps}ResponseTransportType"/&gt;
 *         &lt;element name="TransactionInfo" type="{http://www.ups.com/schema/xpci/1.0/dps}TransactionInfoType"/&gt;
 *         &lt;element name="GovernmentList" type="{http://www.ups.com/schema/xpci/1.0/dps}GovernmentListType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "response",
    "transactionInfo",
    "governmentList"
})
@XmlRootElement(name = "DeniedPartyScreenerResponse")
public class DeniedPartyScreenerResponse {

    @XmlElement(name = "Response", required = true)
    protected ResponseTransportType response;
    @XmlElement(name = "TransactionInfo", required = true)
    protected TransactionInfoType transactionInfo;
    @XmlElement(name = "GovernmentList")
    protected List<GovernmentListType> governmentList;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTransportType }
     *     
     */
    public ResponseTransportType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTransportType }
     *     
     */
    public void setResponse(ResponseTransportType value) {
        this.response = value;
    }

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
     * Gets the value of the governmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the governmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovernmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernmentListType }
     * 
     * 
     */
    public List<GovernmentListType> getGovernmentList() {
        if (governmentList == null) {
            governmentList = new ArrayList<GovernmentListType>();
        }
        return this.governmentList;
    }

}
