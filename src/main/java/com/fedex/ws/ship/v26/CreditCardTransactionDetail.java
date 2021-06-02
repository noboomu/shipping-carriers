
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This class represents data tied to the use of a credit card in a specific transaction.
 * 
 * <p>Java class for CreditCardTransactionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardTransactionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationType" type="{http://fedex.com/ws/ship/v26}CreditCardAuthorizationType" minOccurs="0"/&gt;
 *         &lt;element name="FraudDetectionDetail" type="{http://fedex.com/ws/ship/v26}CreditFraudDetectionDetail" minOccurs="0"/&gt;
 *         &lt;element name="AttributesDetail" type="{http://fedex.com/ws/ship/v26}CreditCardTransactionAttributesDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardTransactionDetail", propOrder = {
    "authorizationId",
    "authorizationType",
    "fraudDetectionDetail",
    "attributesDetail"
})
public class CreditCardTransactionDetail {

    @XmlElement(name = "AuthorizationId")
    protected String authorizationId;
    @XmlElement(name = "AuthorizationType")
    @XmlSchemaType(name = "string")
    protected CreditCardAuthorizationType authorizationType;
    @XmlElement(name = "FraudDetectionDetail")
    protected CreditFraudDetectionDetail fraudDetectionDetail;
    @XmlElement(name = "AttributesDetail")
    protected CreditCardTransactionAttributesDetail attributesDetail;

    /**
     * Gets the value of the authorizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Sets the value of the authorizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationId(String value) {
        this.authorizationId = value;
    }

    /**
     * Gets the value of the authorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardAuthorizationType }
     *     
     */
    public CreditCardAuthorizationType getAuthorizationType() {
        return authorizationType;
    }

    /**
     * Sets the value of the authorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardAuthorizationType }
     *     
     */
    public void setAuthorizationType(CreditCardAuthorizationType value) {
        this.authorizationType = value;
    }

    /**
     * Gets the value of the fraudDetectionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CreditFraudDetectionDetail }
     *     
     */
    public CreditFraudDetectionDetail getFraudDetectionDetail() {
        return fraudDetectionDetail;
    }

    /**
     * Sets the value of the fraudDetectionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditFraudDetectionDetail }
     *     
     */
    public void setFraudDetectionDetail(CreditFraudDetectionDetail value) {
        this.fraudDetectionDetail = value;
    }

    /**
     * Gets the value of the attributesDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTransactionAttributesDetail }
     *     
     */
    public CreditCardTransactionAttributesDetail getAttributesDetail() {
        return attributesDetail;
    }

    /**
     * Sets the value of the attributesDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTransactionAttributesDetail }
     *     
     */
    public void setAttributesDetail(CreditCardTransactionAttributesDetail value) {
        this.attributesDetail = value;
    }

}
