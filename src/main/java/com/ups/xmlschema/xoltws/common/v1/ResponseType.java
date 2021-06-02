
package com.ups.xmlschema.xoltws.common.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseStatus" type="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}CodeDescriptionType"/&gt;
 *         &lt;element name="Alert" type="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}CodeDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AlertDetail" type="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}DetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransactionReference" type="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}TransactionReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "responseStatus",
    "alert",
    "alertDetail",
    "transactionReference"
})
public class ResponseType {

    @XmlElement(name = "ResponseStatus", required = true)
    protected CodeDescriptionType responseStatus;
    @XmlElement(name = "Alert")
    protected List<CodeDescriptionType> alert;
    @XmlElement(name = "AlertDetail")
    protected List<DetailType> alertDetail;
    @XmlElement(name = "TransactionReference")
    protected TransactionReferenceType transactionReference;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setResponseStatus(CodeDescriptionType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescriptionType }
     * 
     * 
     */
    public List<CodeDescriptionType> getAlert() {
        if (alert == null) {
            alert = new ArrayList<CodeDescriptionType>();
        }
        return this.alert;
    }

    /**
     * Gets the value of the alertDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alertDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailType }
     * 
     * 
     */
    public List<DetailType> getAlertDetail() {
        if (alertDetail == null) {
            alertDetail = new ArrayList<DetailType>();
        }
        return this.alertDetail;
    }

    /**
     * Gets the value of the transactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferenceType }
     *     
     */
    public TransactionReferenceType getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferenceType }
     *     
     */
    public void setTransactionReference(TransactionReferenceType value) {
        this.transactionReference = value;
    }

}
