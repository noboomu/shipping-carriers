
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateConsolidationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateConsolidationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/openship/v18}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/openship/v18}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/openship/v18}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/openship/v18}VersionId"/&gt;
 *         &lt;element name="ConsolidationIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedConsolidation" type="{http://fedex.com/ws/openship/v18}RequestedConsolidation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateConsolidationRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "consolidationIndex",
    "requestedConsolidation"
})
public class CreateConsolidationRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "ConsolidationIndex")
    protected String consolidationIndex;
    @XmlElement(name = "RequestedConsolidation")
    protected RequestedConsolidation requestedConsolidation;

    /**
     * Gets the value of the webAuthenticationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }

    /**
     * Sets the value of the webAuthenticationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail value) {
        this.webAuthenticationDetail = value;
    }

    /**
     * Gets the value of the clientDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDetail }
     *     
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    /**
     * Sets the value of the clientDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetail }
     *     
     */
    public void setClientDetail(ClientDetail value) {
        this.clientDetail = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetail }
     *     
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetail }
     *     
     */
    public void setTransactionDetail(TransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionId }
     *     
     */
    public VersionId getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionId }
     *     
     */
    public void setVersion(VersionId value) {
        this.version = value;
    }

    /**
     * Gets the value of the consolidationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidationIndex() {
        return consolidationIndex;
    }

    /**
     * Sets the value of the consolidationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidationIndex(String value) {
        this.consolidationIndex = value;
    }

    /**
     * Gets the value of the requestedConsolidation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedConsolidation }
     *     
     */
    public RequestedConsolidation getRequestedConsolidation() {
        return requestedConsolidation;
    }

    /**
     * Sets the value of the requestedConsolidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedConsolidation }
     *     
     */
    public void setRequestedConsolidation(RequestedConsolidation value) {
        this.requestedConsolidation = value;
    }

}
